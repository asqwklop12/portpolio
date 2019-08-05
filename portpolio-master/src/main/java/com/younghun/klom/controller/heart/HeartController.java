package com.younghun.klom.controller.heart;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.younghun.klom.model.heart.service.heartService;
import com.younghun.klom.model.heart.vo.HeartVo;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value = "/search")
public class HeartController {

	@Autowired
	private heartService likeService;
	      
	@ResponseBody
	@RequestMapping(value = "/heart", method = RequestMethod.GET)
	public HeartVo heart(@RequestParam String title,HttpSession session) {
		String email = ((UserVo)session.getAttribute("data")).getEmail();
		
		HeartVo likeVo = new HeartVo();
		likeVo.setBookTitle(title);
		likeVo.setUserEmail(email);
		
		// 좋아요 숫자
		int like = likeService.result(likeVo);
		
		log.debug("{}asasaasasassasasa",like);
		return likeVo;
		
	}
	
}
