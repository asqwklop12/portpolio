package com.younghun.klom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	
	// 검색목록 이동 (board -> board)
	@RequestMapping(value = "/board/search",method = RequestMethod.GET)
	public ModelAndView search2() {
		return new ModelAndView("redirect:/search");
	}
	
	
	// home으로(board->home)
	@RequestMapping(value = "/board/home",method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/login";
	}
	
	
	// 검색목록 이동 (board -> list)
	@RequestMapping(value = "/board/list",method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("redirect:/list");
	}
	
	
	// 게시판으로
	@RequestMapping(value = "/board/board",method = RequestMethod.GET)
	public ModelAndView board2() {
		return new ModelAndView("redirect:/board");
	}
	

	
	// 게시글 읽기
	@RequestMapping(value = "/board/into",method = RequestMethod.GET)
	public ModelAndView board_into() {
		return new ModelAndView("BoardForInfo");
	}
	

	// 작성페이지로 이동 (board -> write)
	@RequestMapping(value = "/board/write",method = RequestMethod.GET)
	public ModelAndView write() {
		return new ModelAndView("BoardForWrite");
	}
		
	// 게시글 삭제
	@RequestMapping(value = "/board/delete",method = RequestMethod.GET)
	public ModelAndView delete() {
		return new ModelAndView("redirect:/board");
	}
	
	// 게시글 작성
	@RequestMapping(value = "/board/confirm",method = RequestMethod.GET)
	public ModelAndView confirm() {
		return new ModelAndView("redirect:/board");
	}
	

}
