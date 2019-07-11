package com.younghun.klom.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.user.dao.UserDaoImpl;
import com.younghun.klom.user.dto.LoginDto;
import com.younghun.klom.user.service.UserService;
import com.younghun.klom.user.vo.UserVo;




//step1

@Controller
public class MainController {

	@Autowired
	private UserService userService;
	
	// 루트값설정 (Home)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView model) {
		model.setViewName("LayoutForMain");
		return model;
	}
	
	
	// 로그인 했을 시 
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login( LoginDto loginDto, HttpSession httpSession) throws Exception {
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/");
				 
		Map<String, String> login = userService.login(loginDto);  
		System.out.println(login);
		if (login != null) {
			
			httpSession.setAttribute("userLogin", login);
		}
		 
		return model;
	}
	
	
	// 검색결과 이동 (search)
	@RequestMapping(value = "/search",method = RequestMethod.GET)
	public ModelAndView search() {
		return new ModelAndView("MainForSearch");
	}
	
	// home으로 (Home)
	@RequestMapping(value = "/home",method = RequestMethod.GET )
	public String redirect() {
		return "redirect:/";
	}
	
	// 회원가입했을 시
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public ModelAndView regit(ModelAndView modelAndView) {
		UserVo userVO = new UserVo();
		modelAndView.addObject("userVo",userVO);
		modelAndView.setViewName("/user/register");
		return modelAndView;
	}
	
	//회원가입 완료
	@RequestMapping(value = "/home",method = RequestMethod.POST )
	public String regitData(UserVo userVo) {

		userService.register(userVo);
		return "redirect:/";
	}
	

	// 검색목록 이동 (로그인이 안되있으면 접근 불가)
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("MainForBookList");
	}
	
	// 게시판으로 이동 (로그인이 안되 있으면 접근 불가)
	@RequestMapping(value = "/board",method = RequestMethod.GET)
	public ModelAndView board() {
		return new ModelAndView("MainForBoard");
	}
	
	// 비밀번호 찾을시
	@RequestMapping(value = "/lost",method = RequestMethod.GET)
	public ModelAndView lost() {
		return new ModelAndView("/user/searchPassword");
	}
	 	

	
}
