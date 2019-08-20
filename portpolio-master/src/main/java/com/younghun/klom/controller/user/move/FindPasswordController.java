package com.younghun.klom.controller.user.move;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.user.service.UserService;

@Controller
@RequestMapping(value = "/lost")
public class FindPasswordController {

	@Autowired
	private UserService userService;

	// 비밀번호 찾을시
	@RequestMapping(method = RequestMethod.GET)
	public String lost(HttpSession httpSession) throws Exception {
		if (httpSession.getAttribute("data") != null) {
			return "/error/400";
		}
	    return "/user/searchPassword";
	}
	
	//완료
	@RequestMapping(value = "/action",method = RequestMethod.GET)
	public String confirm(@RequestParam String email,HttpSession httpSession) throws Exception {
		if (httpSession.getAttribute("data") != null) {
			return "/error/400";
		}
		
		userService.searchPassword(email);
	    return "redirect:/";
	}
}
