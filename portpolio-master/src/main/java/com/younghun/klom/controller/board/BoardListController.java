package com.younghun.klom.controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.younghun.klom.model.board.service.BoardService;
import com.younghun.klom.model.board.vo.BoardVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(value = "board")
public class BoardListController {
	
	@Autowired
	private BoardService boardService;
	@RequestMapping
	public String main(Model model) {
		
		List<BoardVo> list = boardService.list();
		model.addAttribute("list",list);
		return "MainForBoard";
	}
}
