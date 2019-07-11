package com.younghun.klom.controller.userEdit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//step3

@Controller
@RequestMapping("/board/login")
public class UserBoardController {
	
	// 정보 수정
	@RequestMapping(value = "/edit",method = RequestMethod.GET)
	public ModelAndView edit() {
		return new ModelAndView("redirect:/login/edit");
	}
	
}
