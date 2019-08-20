package com.younghun.klom.controller.user.crud;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.younghun.klom.model.user.service.UserService;
import com.younghun.klom.model.user.vo.UserVo;

@Controller
public class ResiterController {
	
	@Autowired
	private UserService userService;
	

	
	// 회원가입했을 시
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String regit(Model model,HttpSession httpSession) {
		if (httpSession.getAttribute("data") != null) {
			return "/error/400";
		}
		UserVo userVO = new UserVo();
		model.addAttribute("userVo", userVO);
		return "/user/register";
	}
	

	// 회원가입 완료
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String regitData(UserVo userVo,HttpSession httpSession) throws Exception {
		if (httpSession.getAttribute("data") != null) {
			return "/error/400";
		}
		userService.register(userVo);
		return "redirect:/";
	}

}
