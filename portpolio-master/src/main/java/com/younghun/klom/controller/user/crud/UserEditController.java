package com.younghun.klom.controller.user.crud;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.user.service.UserService;
import com.younghun.klom.model.user.vo.UserVo;

@Controller
@RequestMapping(value = "/login/edit")
public class UserEditController {

	@Autowired
	private UserService userService;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/close", method = RequestMethod.GET)
	public String close(HttpSession httpSession) {
		if (httpSession.getAttribute("data") == null) {
			return "/error/400";
		}
		
		return "redirect:/";
	}

	// home으로 이동(로그인된 상태)
	@RequestMapping(value = "/close", method = RequestMethod.POST)
	public String edit(HttpSession httpSession, @ModelAttribute UserVo userVo) {

		if (httpSession.getAttribute("data") == null) {
			return "/error/400";
		}
		
		userService.edit(userVo);
		httpSession.setAttribute("data", userVo);
		logger.debug("{}", userVo);
		return "redirect:/";
	}
	      
	@ResponseBody
	@RequestMapping(value = "/password", method = RequestMethod.POST)
	public UserVo password(@ModelAttribute UserVo userVo) {
		
		userService.edit2(userVo);
		logger.debug("{}",userVo);
		return userVo;
	}

	// 정보 수정
	@RequestMapping(method = RequestMethod.GET)
	public String edit(HttpSession httpSession) {
		if (httpSession.getAttribute("data") == null) {
			return "/error/400";
		}
		
		return "/user/userEdit";
	}

}
