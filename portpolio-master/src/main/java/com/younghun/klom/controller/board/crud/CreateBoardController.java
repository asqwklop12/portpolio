package com.younghun.klom.controller.board.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.younghun.klom.model.board.service.BoardService;
import com.younghun.klom.model.board.vo.BoardVo;

@Controller
@RequestMapping(value = "/board/confirm")
public class CreateBoardController {

	@Autowired
	private BoardService boardService;
	// 게시글 작성
	@RequestMapping(method = RequestMethod.POST)
	public String confirm(BoardVo boardVo) {
		boardService.create(boardVo);
		
		return "redirect:/board";
	}
}
