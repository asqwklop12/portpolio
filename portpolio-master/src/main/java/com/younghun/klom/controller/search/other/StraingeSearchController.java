package com.younghun.klom.controller.search.other;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.user.vo.UserVo;

@Controller
@RequestMapping(value = "/search/login")

public class StraingeSearchController {

	// 로그아웃??? 이게 뭔지
	@GetMapping(value = "/logout")
	public String logout(HttpSession httpSession) {
		httpSession.invalidate();
		return "redirect:/";
	}
	
	// 정보 수정??? 흠
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView edit(ModelAndView model) {		
		UserVo userVo = new UserVo();
		model.addObject("editDto",userVo);
		model.setViewName("redirect:/login/edit");
		return model;
	}
}
