package com.younghun.klom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.dao.UserDao;
import com.younghun.klom.model.dao.UserDaoImpl;
import com.younghun.klom.model.vo.UserVo;


//step1

@Controller
public class MainController {

	@Autowired
	private UserDaoImpl userDao;
	
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
	@RequestMapping(value = "/home",method = RequestMethod.GET )
	public String redirect() {
		return "redirect:/";
	}
	
	//회원가입 완료
	@RequestMapping(value = "/home",method = RequestMethod.POST )
	public String regitData(@RequestParam UserVo userVo) {
		userDao.regit(userVo);
		return "redirect:/";
	}
	
	// 검색목록 이동 (로그인이 안되있으면 접근 불가)
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("MainForBookList");
	}
	
	// 게시판으로 이동 (로그인이 안되 있으면 접근 불가)
	@RequestMapping(value = "/board",method = RequestMethod.GET)
	public ModelAndView board() {
		return new ModelAndView("MainForBoard");
	}
	
	// 비밀번호 찾을시
	@RequestMapping(value = "/lost",method = RequestMethod.GET)
	public ModelAndView lost() {
		return new ModelAndView("/user/searchPassword");
	}
	
	// 로그인 했을 시 (삭제 예정)
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("LayoutForMain2");
	}
	
	// 회원가입했을 시
	@RequestMapping(value = "/regit",method = RequestMethod.GET)
	public ModelAndView regit() {
		return new ModelAndView("/user/regiter");
	}
	
}
