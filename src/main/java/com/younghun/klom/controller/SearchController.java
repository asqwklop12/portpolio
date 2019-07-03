package com.younghun.klom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	
	
	// 상세페이지로 이동 (search -> search)
	@RequestMapping(value = "/search/search",method = RequestMethod.GET)
	public ModelAndView seacrh() {
		return new ModelAndView("redirect:/search");
	}
	
	// home으로 이동
	@RequestMapping(value = "/search/home",method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/login";
	}
	
	// 검색목록으로 이동
	@RequestMapping(value = "/search/list",method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("redirect:/list");
	}
	
	// 상세페이지로 이동 (search -> board)
	@RequestMapping(value = "/search/board",method = RequestMethod.GET)
	public ModelAndView board() {
		return new ModelAndView("redirect:/board");
	}
	
	
	// 상세페이지로 이동 (search)
	@RequestMapping(value = "/search/info",method = RequestMethod.GET)
	public ModelAndView bookInfo() {
		return new ModelAndView("BookForSummary");
	}
	

	
	
}
