package com.younghun.klom.controller.search;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.book.service.BookService;
import com.younghun.klom.model.book.vo.BookVo;

@Controller
@RequestMapping("/search")
public class SearchListController {

	
	@Autowired
	private BookService bookService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView serarhList() {
		ModelAndView model = new  ModelAndView();
		
		List<BookVo> bookList = bookService.search();
		
		logger.debug("{}", bookList);
		
		
		model.addObject("bookList",bookList);
		model.setViewName("MainForSearch");
		
		return model;
	}
	
}
