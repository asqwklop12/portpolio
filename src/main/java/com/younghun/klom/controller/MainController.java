package com.younghun.klom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.dao.UserDaoImpl;
import com.younghun.klom.dto.UserVo;

@Controller
public class MainController {

	
	// 루트값설정 (Home)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView model) {

		model.setViewName("LayoutForMain");
		return model;
	}
	
	// home으로 (Home)
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/";
	}
	
	// home으로(board->home)
	@RequestMapping(value = "/board/home",method = RequestMethod.GET)
	public String redirect2() {
		return "redirect:/login";
	}
	
	
	// 검색결과 이동 (search)
	@RequestMapping(value = "/search",method = RequestMethod.GET)
	public ModelAndView search() {
		return new ModelAndView("MainForSearch");
	}
	
	// home으로(search->home)
	@RequestMapping(value = "/search/home",method = RequestMethod.GET)
	public String redirect3() {
		return "redirect:/login";
	}
	
	// home으로(list->home)
	@RequestMapping(value = "/list/home",method = RequestMethod.GET)
	public String redirect4() {
		return "redirect:/login";
	}
	
	// 상세페이지로 이동 (search)
	@RequestMapping(value = "/search/info",method = RequestMethod.GET)
	public ModelAndView bookInfo() {
		return new ModelAndView("BookForSummary");
	}
	
	
	// 검색목록 이동
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("MainForBookList");
	}
	
	// 게시판 이동
	@RequestMapping(value = "/board",method = RequestMethod.GET)
	public ModelAndView board() {
		return new ModelAndView("MainForBoard");
	}
	
	// 작성페이지로 이동 (board -> write)
	@RequestMapping(value = "/board/write",method = RequestMethod.GET)
	public ModelAndView write() {
		return new ModelAndView("BoardForWrite");
	}
	
	// 검색목록 이동 (board -> list)
	@RequestMapping(value = "/board/list",method = RequestMethod.GET)
	public ModelAndView list2() {
		return new ModelAndView("redirect:/list");
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
	
	// 상세페이지로 이동 (search -> list)
	@RequestMapping(value = "/search/list",method = RequestMethod.GET)
	public ModelAndView list3() {
		return new ModelAndView("redirect:/list");
	}
	
	

	// 검색목록 이동 (board -> board)
	@RequestMapping(value = "/board/board",method = RequestMethod.GET)
	public ModelAndView board2() {
		return new ModelAndView("redirect:/board");
	}
	
	// 검색목록 이동 (board -> board)
	@RequestMapping(value = "/board/search",method = RequestMethod.GET)
	public ModelAndView search2() {
		return new ModelAndView("redirect:/search");
	}
	
	// 상세페이지로 이동 (search -> board)
	@RequestMapping(value = "/search/board",method = RequestMethod.GET)
	public ModelAndView board3() {
		return new ModelAndView("redirect:/board");
	}
	
	// 상세페이지로 이동 (search -> search)
	@RequestMapping(value = "/search/search",method = RequestMethod.GET)
	public ModelAndView seacrh2() {
		return new ModelAndView("redirect:/search");
	}
	
	// 상세페이지로 이동 (search -> edit)
	@RequestMapping(value = "/search/login/edit",method = RequestMethod.GET)
	public ModelAndView edit2() {
		return new ModelAndView("redirect:/login/edit");
	}
	
	// 게시글 읽기
	@RequestMapping(value = "/board/into",method = RequestMethod.GET)
	public ModelAndView board_into() {
		return new ModelAndView("BoardForInfo");
	}
	
	
	// 로그인 했을 시
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("LayoutForMain2");
	}
	
	// 정보 수정 
	@RequestMapping(value = "/login/edit",method = RequestMethod.GET)
	public ModelAndView editUser() {
		return new ModelAndView("/part/user/userEdit");
	}
	

	// 정보 수정 (board로 들어왔을때)
	@RequestMapping(value = "/board/login/edit",method = RequestMethod.GET)
	public ModelAndView editUser2() {
		return new ModelAndView("redirect:/login/edit");
	}
	
	
	// 정보 수정에서 나왔을 때(home으로 이동)
	@RequestMapping(value = "/login/edit/close",method = RequestMethod.GET)
	public ModelAndView editclose() {
		return new ModelAndView("redirect:/login");
	}
	
	
	// 로그아웃
	@RequestMapping(value = "/login/logout",method = RequestMethod.GET)
	public ModelAndView close() {
		return new ModelAndView("redirect:/");
	}
	
	// 로그아웃(검색글에 들어갔을때 로그아웃)
	@RequestMapping(value = "/search/login/logout",method = RequestMethod.GET)
	public ModelAndView close2() {
		return new ModelAndView("redirect:/");
	}
	
	
	
	// 로그아웃(게시글에 들어갔을때 로그아웃)
	@RequestMapping(value = "/board/login/logout",method = RequestMethod.GET)
	public ModelAndView close3() {
		return new ModelAndView("redirect:/");
	}
	// 회원가입했을 시
	@RequestMapping(value = "/regit",method = RequestMethod.GET)
	public ModelAndView regit() {
		return new ModelAndView("/part/user/regiter");
	}
	
	
	// 비밀번호 찾을시
	@RequestMapping(value = "/lost",method = RequestMethod.GET)
	public ModelAndView lost() {
		return new ModelAndView("/part/user/searchPassword");
	}
	
}
