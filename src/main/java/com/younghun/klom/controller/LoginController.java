package com.younghun.klom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//step2

@Controller
public class LoginController {
		
		// 정보 수정 
		@RequestMapping(value = "/login/edit",method = RequestMethod.GET)
		public ModelAndView edit() {
			return new ModelAndView("/user/userEdit");
		}
		
		// 로그아웃
		@RequestMapping(value = "/login/logout",method = RequestMethod.GET)
		public ModelAndView logout() {
			return new ModelAndView("redirect:/");
		}
		
		
}
