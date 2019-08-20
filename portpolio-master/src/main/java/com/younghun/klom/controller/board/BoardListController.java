package com.younghun.klom.controller.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.younghun.klom.model.Pagging;
import com.younghun.klom.model.board.service.BoardService;
import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.page.service.PaggingService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(value = "board")
public class BoardListController {
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private PaggingService paggingService;
	
	
	@RequestMapping
	public String main(@RequestParam(value = "num", required = false ,defaultValue = "1") int num,
			           Model model,HttpSession httpSession) {
		if (httpSession.getAttribute("data") == null) {
			return "/error/400";
		}
		
		try {
			httpSession.getAttribute("data");
		}catch (NullPointerException e) {
			return "redirect:/";
		}
		
		Pagging p = new Pagging(paggingService.board(), 10);
		List<BoardVo> list = boardService.list(p.display(num), p.getCount());
		
		model.addAttribute("list",list);
		model.addAttribute("page", p.pagging());
		return "MainForBoard";
	}
}
