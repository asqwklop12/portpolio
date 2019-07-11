package com.younghun.klom.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.user.dto.LoginDto;
import com.younghun.klom.model.user.service.UserService;

//step2

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	private UserService userService;
	
	// 정보 수정
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView edit() {
		return new ModelAndView("/user/userEdit");
	}
	
	// 로그인 했을 시
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView login(LoginDto loginDto, HttpSession httpSession) throws Exception {
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/");

		Map<String, String> login = userService.login(loginDto);
		if (login != null) {
			httpSession.setAttribute("userLogin", login);
		}
		
		return model;
	}

	// 로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpSession httpSession) {
		
		if (httpSession != null) {
		httpSession.invalidate();
		}
		return new ModelAndView("redirect:/");
	}

}
