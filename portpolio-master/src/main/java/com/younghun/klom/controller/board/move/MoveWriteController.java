package com.younghun.klom.controller.board.move;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/board")
public class MoveWriteController {
	
	// 작성페이지로 이동
	@RequestMapping(value = "/write",method = RequestMethod.GET)
	public ModelAndView write() {
		return new ModelAndView("BoardForWrite");
	}

}
