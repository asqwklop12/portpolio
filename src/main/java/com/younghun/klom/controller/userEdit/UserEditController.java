package com.younghun.klom.controller.userEdit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//step3

@Controller
public class UserEditController {
	
	// home으로 이동(로그인된 상태)(수정 가능성 있음) 
	@RequestMapping(value = "/login/edit/close",method = RequestMethod.GET)
	public ModelAndView close() {
		return new ModelAndView("redirect:/login");
	}
}
