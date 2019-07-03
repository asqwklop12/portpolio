package com.younghun.klom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {

	
	// 루트값설정 (Home)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView model) {

		model.setViewName("LayoutForMain");
		return model;
	}
	
	// 검색결과 이동 (search)
	@RequestMapping(value = "/search",method = RequestMethod.GET)
	public ModelAndView search() {
		return new ModelAndView("MainForSearch");
	}
	
	// home으로 (Home)
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/";
	}
	
	// 검색목록 이동
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("MainForBookList");
	}
	
	// 게시판으로 이동
	@RequestMapping(value = "/board",method = RequestMethod.GET)
	public ModelAndView board() {
		return new ModelAndView("MainForBoard");
	}
	
	// 비밀번호 찾을시
	@RequestMapping(value = "/lost",method = RequestMethod.GET)
	public ModelAndView lost() {
		return new ModelAndView("/part/user/searchPassword");
	}
	
	// 로그인 했을 시 (삭제 예정)
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("LayoutForMain2");
	}
	
	// 회원가입했을 시
	@RequestMapping(value = "/regit",method = RequestMethod.GET)
	public ModelAndView regit() {
		return new ModelAndView("/part/user/regiter");
	}
	
}
