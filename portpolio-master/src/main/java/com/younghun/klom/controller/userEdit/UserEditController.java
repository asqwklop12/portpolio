package com.younghun.klom.controller.userEdit;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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

	@RequestMapping(value = "/close", method = RequestMethod.GET)
	public String close() {

		return "redirect:/";
	}

	// home으로 이동(로그인된 상태)(수정 가능성 있음)
	@RequestMapping(value = "/close", method = RequestMethod.POST)
	public String PostEdit(HttpSession session, @ModelAttribute UserVo userVo) {
		userService.edit(userVo);

		return "redirect:/";
	}
	
	
	// home으로 이동 유저 삭제 현재는 get이지만 post로 변경할 수 있음... 데이터니까...
	@RequestMapping(value = "/clear", method = RequestMethod.POST)
	public String KillUser(HttpSession session, @ModelAttribute UserVo userVo) {
		userService.delete(userVo);
		session.invalidate();
		return "redirect:/";
	}

}
