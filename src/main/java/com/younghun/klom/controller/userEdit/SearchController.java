package com.younghun.klom.controller.userEdit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	// 상세페이지로 이동
	@RequestMapping(value = "/search/login/edit",method = RequestMethod.GET)
	public ModelAndView edit() {
		return new ModelAndView("redirect:/login/edit");
	}
	
	// 로그아웃
	@RequestMapping(value = "/search/login/logout",method = RequestMethod.GET)
	public ModelAndView close() {
		return new ModelAndView("redirect:/");
	}
}
