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
	@Autowired
	private UserDaoImpl userDao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView model) {
		List<UserVo> users = userDao.userList();
		model.addObject("users",users);
		model.setViewName("LayoutForMain");
		return model;
	}
	
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/";
	}
	
	@RequestMapping(value = "/search",method = RequestMethod.GET)
	public ModelAndView search() {
		return new ModelAndView("MainForSearch");
	}
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("MainForBookList");
	}
	
	@RequestMapping(value = "/board",method = RequestMethod.GET)
	public ModelAndView board() {
		return new ModelAndView("MainForList");
	}
	
	
	// 로그인 했을 시
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("LayoutForMain2");
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
