package com.younghun.klom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserEditController {
	// 정보 수정에서 나왔을 때(home으로 이동)
	@RequestMapping(value = "/login/edit/close",method = RequestMethod.GET)
	public ModelAndView editclose() {
		return new ModelAndView("redirect:/login");
	}
	
}
