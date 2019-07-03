package com.younghun.klom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
		
		// 정보 수정 
		@RequestMapping(value = "/login/edit",method = RequestMethod.GET)
		public ModelAndView editUser() {
			return new ModelAndView("/part/user/userEdit");
		}
		
		// 로그아웃
		@RequestMapping(value = "/login/logout",method = RequestMethod.GET)
		public ModelAndView close() {
			return new ModelAndView("redirect:/");
		}
		
		

		
}
