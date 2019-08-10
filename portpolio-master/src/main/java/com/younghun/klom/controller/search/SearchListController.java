package com.younghun.klom.controller.search;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.Pagging;
import com.younghun.klom.model.book.service.BookService;
import com.younghun.klom.model.book.vo.BookVo;
import com.younghun.klom.model.page.service.PaggingService;
import com.younghun.klom.model.page.vo.SearchVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/search")
public class SearchListController {

	    
	@Autowired
	private BookService bookService;
	
	@Autowired
	private PaggingService paggingService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView serarhList(	  @RequestParam(value = "num", required = false ,defaultValue = "1") int num
									, @RequestParam(value = "keyword", required = false) String keyword) throws Exception {
		ModelAndView model = new  ModelAndView();
		
		
		// 페이징 처리 (전체페이지, 화면에 보여지는 게시글수)
		Pagging p = new Pagging(paggingService.book(keyword), 2);
		List<BookVo> bookList = bookService.search(p.display(num), p.getCount(),keyword);
		
		model.addObject("page", p.pagging());
		// 키워드
		model.addObject("keyword", keyword); 
		
		model.addObject("bookList",bookList);
		
		model.setViewName("MainForSearch");
		
		return model;
	}
	
}
