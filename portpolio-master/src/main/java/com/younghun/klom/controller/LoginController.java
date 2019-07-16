package com.younghun.klom.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.user.service.UserService;
import com.younghun.klom.model.user.vo.UserVo;

//step2

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	private UserService userService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	

	
	// 로그인 했을 시
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView login(UserVo  userVo, HttpSession httpSession) throws Exception {
		ModelAndView model = new ModelAndView();
		
 
		Map<String, String> data = userService.login(userVo);
		model.setViewName("redirect:/");
		
		
		if (data != null) {
			
			httpSession.setAttribute("userLogin", data);
			logger.debug("{}",data);
		}
				
		return model;
	}
	
	
	// 정보 수정
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView edit(ModelAndView model) {		
		UserVo userVo = new UserVo();
		model.addObject("editDto",userVo);
		model.setViewName("/user/userEdit");
		return model;
	}
	
	

	// 로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpSession httpSession) {
		
		if (httpSession != null) {
		httpSession.invalidate();
		}
		return new ModelAndView("redirect:/");
	}

}
