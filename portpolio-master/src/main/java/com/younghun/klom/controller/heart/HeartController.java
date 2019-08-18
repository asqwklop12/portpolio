package com.younghun.klom.controller.heart;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.younghun.klom.model.heart.service.HeartService;
import com.younghun.klom.model.heart.vo.HeartVo;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value = "/search")
public class HeartController {

	@Autowired
	private HeartService heartService;
	      
	@ResponseBody
	@RequestMapping(value = "/heart", method = RequestMethod.GET)
	public HeartVo heart(@RequestParam String title,HttpSession session
			, Model model) {
		String email = null;
		try {
			email = ((UserVo)session.getAttribute("data")).getEmail();
			
		} catch (NullPointerException e) {
		}
		
		HeartVo heartVo = new HeartVo();
		heartVo.setBookTitle(title);
		heartVo.setUserEmail(email);
		
		heartService.change(heartVo);
				
		log.debug("{}",heartService.result(heartVo));
		return heartVo;
		
	}
	
}
