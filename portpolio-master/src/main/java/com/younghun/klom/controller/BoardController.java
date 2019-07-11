package com.younghun.klom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.board.service.BoardListService;
import com.younghun.klom.model.board.vo.BoardListVo;

import lombok.extern.slf4j.Slf4j;

//step2

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	

	@Autowired
	private BoardListService boardListService;
	
	//TODO: 게시판으로 이동 (로그인이 안되 있으면 접근 불가[현재는 가능])
	@GetMapping
	public ModelAndView main(ModelAndView model) {
		List<BoardListVo> boardList = boardListService.boardList();
		model.addObject("boardList", boardList);
		model.setViewName("MainForBoard");
		return model;
	}
	
	// 검색화면 이동
	@RequestMapping(value = "/search",method = RequestMethod.GET)
	public ModelAndView search() {
		return new ModelAndView("redirect:/search");
	}
	
	
	// home으로이동
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/login";
	}
	
	
	// 검색목록 이동
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("redirect:/list");
	}
	
	
	// 게시판으로 (연속클릭 버그 수정)
	@RequestMapping(value = "/board",method = RequestMethod.GET)
	public ModelAndView board() {
		return new ModelAndView("redirect:/board");
	}
	

	
	// 게시글 읽기 (본인 글이면 수정, 삭제태그 보여줌)
	@RequestMapping(value = "/into",method = RequestMethod.GET)
	public ModelAndView into() {
		return new ModelAndView("BoardForInfo");
	}
	
	

	

	// 작성페이지로 이동
	@RequestMapping(value = "/write",method = RequestMethod.GET)
	public ModelAndView write() {
		return new ModelAndView("BoardForWrite");
	}
	
	// 게시글 삭제 (본인 글이 아니면 삭제 금지)
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	public ModelAndView delete() {
		return new ModelAndView("redirect:/board");
	}
	
	
	// 게시글 작성
	@RequestMapping(value = "/confirm",method = RequestMethod.GET)
	public ModelAndView confirm() {
		return new ModelAndView("redirect:/board");
	}
	

}
