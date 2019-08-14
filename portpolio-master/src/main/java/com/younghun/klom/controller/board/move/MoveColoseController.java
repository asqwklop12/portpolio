package com.younghun.klom.controller.board.move;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MoveColoseController {
	
	@RequestMapping(value = "/board/close")
	public String close() {
		return "redirect:/board";
	}
}
