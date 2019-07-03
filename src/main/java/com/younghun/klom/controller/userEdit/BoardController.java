package com.younghun.klom.controller.userEdit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	// 정보 수정 (board로 들어왔을때)
	@RequestMapping(value = "/board/login/edit",method = RequestMethod.GET)
	public ModelAndView editUser2() {
		return new ModelAndView("redirect:/login/edit");
	}
	
	// 로그아웃(게시글에 들어갔을때 로그아웃)
	@RequestMapping(value = "/board/login/logout",method = RequestMethod.GET)
	public ModelAndView close2() {
		return new ModelAndView("redirect:/");
	}
}
