package com.younghun.klom.controller.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login/logout")
public class LogoutController {

	// 로그아웃
	@RequestMapping(method = RequestMethod.GET)
	public String logout(HttpSession httpSession) {
		if (httpSession.getAttribute("data") == null) {
			return "/error/400";
		}
		
		httpSession.invalidate();
		return "redirect:/";
	}
	
}
