package com.younghun.klom.controller.user.move;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserMoveController {

	

	// home으로 (Home)
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/";
	}
	
	//TODO: 검색목록 이동 (로그인이 안되있으면 접근 불가[현재는 가능])
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(HttpSession session) {

		return new ModelAndView("MainForBookList");

	}

}
