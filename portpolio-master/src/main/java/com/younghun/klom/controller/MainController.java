package com.younghun.klom.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.user.service.UserService;
import com.younghun.klom.model.user.vo.UserVo;

//step1
@Controller
public class MainController {

	@Autowired
	private UserService userService;

	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	// 루트값설정 (Home)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView model) {
		model.setViewName("LayoutForMain");
		return model;
	}

	// 검색결과 이동 (search)
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView search() {
		return new ModelAndView("MainForSearch");
	}

	// home으로 (Home)
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/";
	}

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
		String inputPass = userVo.getPassword();
		String pass = passwordEncoder.encode(inputPass);
		userVo.setPassword(pass);
		userService.register(userVo);
		return "redirect:/";
	}

	//TODO: 검색목록 이동 (로그인이 안되있으면 접근 불가[현재는 가능])
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(HttpSession session) {

		return new ModelAndView("MainForBookList");

	}



	// 비밀번호 찾을시
	@RequestMapping(value = "/lost", method = RequestMethod.GET)
	public ModelAndView lost() {
		return new ModelAndView("/user/searchPassword");
	}

}
