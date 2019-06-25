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
		model.setViewName("home");
		
		return model;
	}
}
