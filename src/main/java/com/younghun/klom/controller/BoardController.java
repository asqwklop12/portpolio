package com.younghun.klom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//step2

@Controller
public class BoardController {
	
	// 검색화면 이동
	@RequestMapping(value = "/board/search",method = RequestMethod.GET)
	public ModelAndView search() {
		return new ModelAndView("redirect:/search");
	}
	
	
	// home으로이동
	@RequestMapping(value = "/board/home",method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/login";
	}
	
	
	// 검색목록 이동
	@RequestMapping(value = "/board/list",method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("redirect:/list");
	}
	
	
	// 게시판으로 (연속클릭 버그 수정)
	@RequestMapping(value = "/board/board",method = RequestMethod.GET)
	public ModelAndView board() {
		return new ModelAndView("redirect:/board");
	}
	

	
	// 게시글 읽기 (본인 글이면 수정, 삭제태그 보여줌)
	@RequestMapping(value = "/board/into",method = RequestMethod.GET)
	public ModelAndView into() {
		return new ModelAndView("BoardForInfo");
	}
	

	// 작성페이지로 이동
	@RequestMapping(value = "/board/write",method = RequestMethod.GET)
	public ModelAndView write() {
		return new ModelAndView("BoardForWrite");
	}
	
	// 게시글 삭제 (본인 글이 아니면 삭제 금지)
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
