package com.younghun.klom.controller.board.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.board.service.BoardService;

@Controller
@RequestMapping(value = "/board/delete")
public class DeleteBoardController {

	@Autowired
	private BoardService boardService;
	// 게시글 삭제 (본인 글이 아니면 삭제 금지)
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView delete(@RequestParam long no) {
		boardService.clear(no);
		return new ModelAndView("redirect:/board");
	}
}
