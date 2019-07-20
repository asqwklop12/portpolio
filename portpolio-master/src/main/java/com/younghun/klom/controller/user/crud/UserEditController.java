package com.younghun.klom.controller.user.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.user.service.UserService;
import com.younghun.klom.model.user.vo.UserVo;

@Controller
@RequestMapping(value = "/login/edit")
public class UserEditController {

	@Autowired
	private UserService userService;
	
	// 정보 수정
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView edit(ModelAndView model) {		
		UserVo userVo = new UserVo();
		model.addObject("editDto",userVo);
		model.setViewName("/user/userEdit");
		return model;
	}
	

	
}
