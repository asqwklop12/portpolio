package com.younghun.klom.controller.board.move;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/board/close")
public class CloseBoardController {

	// 게시판닫기
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView close() {
		return new ModelAndView("redirect:/board");
	}
}
