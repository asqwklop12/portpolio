package com.younghun.klom.controller.board.move;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/board")
public class MoveWrteController {
	// 작성페이지로 이동
	@RequestMapping(value = "/write",method = RequestMethod.GET)
	public String write() {
		return "BoardForWrite";
	}

}
