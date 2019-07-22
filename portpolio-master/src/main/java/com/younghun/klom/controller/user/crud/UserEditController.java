package com.younghun.klom.controller.user.crud;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	

	
	@RequestMapping(value = "/close", method = RequestMethod.GET)
	public String close() {

		return "redirect:/";
	}

	
	// home으로 이동(로그인된 상태)(수정 가능성 있음)
	@RequestMapping(value = "/close", method = RequestMethod.POST)
	public String edit(HttpSession session, @ModelAttribute UserVo userVo) {
		userService.edit(userVo);
		return "redirect:/";
	}
	
	// 정보 수정
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView edit(ModelAndView model ) {			
		UserVo userVo = new UserVo();
		model.addObject("editDto",userVo);
		model.setViewName("/user/userEdit");
		return model;
	}
	

	
}
