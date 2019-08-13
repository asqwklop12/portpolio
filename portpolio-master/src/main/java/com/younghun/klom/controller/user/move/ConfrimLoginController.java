package com.younghun.klom.controller.user.move;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.younghun.klom.model.user.service.UserService;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ConfrimLoginController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "check")
	public String confirmCheck(@RequestParam String uid,
			                   @RequestParam String email, 
			                   @RequestParam String authKey,
			                   Model model) {

		UserVo login = userService.authorization(email);
	
		log.debug("{}",login);
		model.addAttribute("name",uid);
		if (login.getAuthorization().equals(authKey) && !login.getAuthorization().toUpperCase().equals("Y")) {
			String key = "Y";
			userService.yesAuth(email, key);
			return "/user/confirm";	
		}
		
		return "/error/400";
	}

}
