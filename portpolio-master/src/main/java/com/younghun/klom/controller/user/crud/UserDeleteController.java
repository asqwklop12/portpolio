package com.younghun.klom.controller.user.crud;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.younghun.klom.model.user.service.UserService;
import com.younghun.klom.model.user.vo.UserVo;

@Controller
@RequestMapping(value = "/login/edit/clear")
public class UserDeleteController {
	
	@Autowired
	private UserService userService;
	
	// home으로 이동  // 유저 삭제 
	@RequestMapping(method = RequestMethod.POST)
	public String kill(HttpSession httpSession, @ModelAttribute UserVo userVo) {
		
		userService.delete(userVo);
		httpSession.invalidate();
		return "redirect:/";
	}
}