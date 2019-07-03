package com.younghun.klom.controller.userEdit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//step3

@Controller
public class UserSearchController {
	
	// 정보수정
	@RequestMapping(value = "/search/login/edit",method = RequestMethod.GET)
	public ModelAndView edit() {
		return new ModelAndView("redirect:/login/edit");
	}
	
	// 로그아웃
	@RequestMapping(value = "/search/login/logout",method = RequestMethod.GET)
	public ModelAndView logout() {
		return new ModelAndView("redirect:/");
	}
}
