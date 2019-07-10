package com.younghun.klom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//step2

@Controller
@RequestMapping("/search")
public class SearchController {
	
	
	// 검색화면으로 이동
	@RequestMapping(value = "/search",method = RequestMethod.GET)
	public ModelAndView seacrh() {
		return new ModelAndView("redirect:/search");
	}
	
	// home으로 이동
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/login";
	}
	
	// 검색목록으로 이동
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("redirect:/list");
	}
	
	// 게시판으로 이동
	@RequestMapping(value = "/board",method = RequestMethod.GET)
	public ModelAndView board() {
		return new ModelAndView("redirect:/board");
	}
	
	
	// 정보페이지로 이동 
	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public ModelAndView bookInfo() {
		return new ModelAndView("BookForInfo");
	}
	
	
}
