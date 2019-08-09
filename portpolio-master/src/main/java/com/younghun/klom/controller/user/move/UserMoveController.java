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
	

}
