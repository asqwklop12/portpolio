package com.younghun.klom.controller.user.crud;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.user.service.UserService;
import com.younghun.klom.model.user.vo.UserVo;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	private UserService userService;
	
	// 로그인 했을 시
		@RequestMapping(method = RequestMethod.POST)
		public ModelAndView login(UserVo  userVo, HttpSession httpSession) throws Exception {
			
			
			ModelAndView model = new ModelAndView();
			model.setViewName("redirect:/");
			UserVo data = userService.login(userVo);
			
			model.addObject("userId",data.getId());
			model.addObject("userName",data.getName());
			
//			logger.debug("{},{}",data.getId(),data.getName());
			if (data != null) {
				
				httpSession.setAttribute("userLogin", data);
				
			}
					
			return model;
		}
}
