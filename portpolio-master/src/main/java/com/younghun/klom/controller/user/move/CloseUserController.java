package com.younghun.klom.controller.user.move;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.younghun.klom.model.user.service.UserService;
import com.younghun.klom.model.user.vo.UserVo;

@Controller
@RequestMapping(value = "/login/edit/close")
public class CloseUserController {

	@Autowired
	private UserService userService;
	@RequestMapping(method = RequestMethod.GET)
	public String close() {

		return "redirect:/";
	}

	// home으로 이동(로그인된 상태)(수정 가능성 있음)
	@RequestMapping(method = RequestMethod.POST)
	public String edit(HttpSession session, @ModelAttribute UserVo userVo) {
		userService.edit(userVo);
		return "redirect:/";
	}
}
