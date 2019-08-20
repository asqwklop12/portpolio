package com.younghun.klom.controller.board.move;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MoveColoseController {
	
	@RequestMapping(value = "/board/close")
	public String close(HttpSession httpSession) {
		if (httpSession.getAttribute("data") == null) {
			return "/error/400";
		}
		return "redirect:/board";
	}
}
