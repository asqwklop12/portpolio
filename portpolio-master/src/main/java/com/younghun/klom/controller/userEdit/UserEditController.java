package com.younghun.klom.controller.userEdit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.younghun.klom.model.user.service.UserService;
import com.younghun.klom.model.user.vo.UserVo;

//step3

@Controller
@RequestMapping("/login/edit")
public class UserEditController {
	
	@Autowired
	private UserService userService;
	
	// home으로 이동(로그인된 상태)(수정 가능성 있음) 
	@RequestMapping(value = "/close",method = RequestMethod.POST)
	public String close(UserVo userVo) {
		userService.edit(userVo);
		return "redirect:/";
	}
	

}
