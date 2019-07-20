package com.younghun.klom.controller.user.move;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/lost")
public class FindPasswordController {

	// 비밀번호 찾을시
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView lost() {
		return new ModelAndView("/user/searchPassword");
	}
}
