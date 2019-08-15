package com.younghun.klom.controller.board.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.younghun.klom.model.board.service.BoardService;
import com.younghun.klom.model.board.vo.BoardVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/board/into")
@Slf4j
public class ReadBoardController {
	@Autowired
	private BoardService boardService;

	// 게시글 읽기 (본인 글이면 수정, 삭제태그 보여줌)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String into(@PathVariable int id, Model model) {
		BoardVo detail = boardService.read(id);
 
		model.addAttribute("detail", detail);

		return "BoardForInfo";
	}

}
