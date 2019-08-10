package com.younghun.klom.controller.user.move;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserMoveController {

	

	// home으로 (Home)
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/";
	}
	

}
