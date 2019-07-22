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
import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.book.service.BookService;
import com.younghun.klom.model.book.vo.BookVo;
import com.younghun.klom.model.page.service.PaggingService;

@Controller
@RequestMapping("/search")
public class SearchListController {

	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private PaggingService paggingService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView serarhList(@RequestParam(value = "num", required = false, defaultValue = "1") int num) {
		ModelAndView model = new  ModelAndView();
		
		// 페이징 처리
		Pagging p = new Pagging(paggingService.book(), 2);
		List<BookVo> bookList = bookService.search(p.display(num), p.getCount());
		model.addObject("page", p.pagging());
		
		
		logger.debug("{}", bookList);
		
		
		model.addObject("bookList",bookList);
		model.setViewName("MainForSearch");
		
		return model;
	}
	
}
