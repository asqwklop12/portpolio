package com.younghun.klom.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.book.service.BookService;
import com.younghun.klom.model.book.vo.BookVo;
import com.younghun.klom.model.crawling.Crawing;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/")
public class RootController {
	
	@Autowired
	private BookService bookService;
	// 루트값설정 (Home)
	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) throws Exception  {

		String[] bookstore = {"bandi","kyobo","aladin","ypbook","yes24"};
		// 온라인 서점 크롤링
		for (int i = 0; i < bookstore.length; i++) {
			try {
				Crawing bookStore = new Crawing(bookstore[i]);
				List<String> bookStoreList = bookStore.start(5);
				model.addAttribute(bookstore[i], bookStoreList);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		  
		List<BookVo> rank = bookService.rank();
		
		model.addAttribute("rank",rank);
		return "LayoutForMain";
	}
}
