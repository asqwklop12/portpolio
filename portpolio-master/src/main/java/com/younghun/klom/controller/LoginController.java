package com.younghun.klom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//step2

@Controller
@RequestMapping(value = "/login")
public class LoginController {
		
	// 로그인 했을 시 (삭제 예정)
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("LayoutForMain2");
	}
	
		// 정보 수정 
		@RequestMapping(value = "/edit",method = RequestMethod.GET)
		public ModelAndView edit() {
			return new ModelAndView("/user/userEdit");
		}
		
		// 로그아웃
		@RequestMapping(value = "/logout",method = RequestMethod.GET)
		public ModelAndView logout() {
			return new ModelAndView("redirect:/");
		}
		
		
}
