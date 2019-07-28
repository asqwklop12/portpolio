package com.younghun.klom.controller.user.crud;

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

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/login")
@Slf4j
public class LoginController {

	@Autowired
	private UserService userService;
	
	
	// 로그인 했을 시
		@RequestMapping(method = RequestMethod.POST)
		public ModelAndView login(UserVo  userVo, HttpSession httpSession) throws Exception {
			
			
			ModelAndView model = new ModelAndView();
			model.setViewName("redirect:/");
			UserVo data = null;
			try {
				data = userService.login(userVo);
					
			} catch (Exception e) {
				log.error("{}",e);
			}
			
			
			if (data != null) {
				log.debug("{},{}",data.getName());	
				httpSession.setAttribute("data", data);				
			}
					
			return model;
		}
}
