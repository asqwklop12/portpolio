package com.younghun.klom.controller.user.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.user.service.UserService;
import com.younghun.klom.model.user.vo.UserVo;

@Controller
public class ResiterController {
	
	@Autowired
	private UserService userService;
	

	
	// 회원가입했을 시
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView regit(ModelAndView model) {
		UserVo userVO = new UserVo();
		model.addObject("userVo", userVO);
		model.setViewName("/user/register");
		return model;
	}
	

	// 회원가입 완료
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String regitData(UserVo userVo) {
		userService.register(userVo);
		return "redirect:/";
	}

}
