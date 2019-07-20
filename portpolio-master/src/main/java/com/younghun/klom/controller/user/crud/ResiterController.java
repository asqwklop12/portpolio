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
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	// 회원가입했을 시
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView regit(ModelAndView modelAndView) {
		UserVo userVO = new UserVo();
		modelAndView.addObject("userVo", userVO);
		modelAndView.setViewName("/user/register");
		return modelAndView;
	}
	

	// 회원가입 완료
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String regitData(UserVo userVo) {
//		String inputPass = userVo.getPassword();
//		String pass = passwordEncoder.encode(inputPass);
//		userVo.setPassword(pass);
		userService.register(userVo);
		return "redirect:/";
	}

}
