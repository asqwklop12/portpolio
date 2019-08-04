package com.younghun.klom.controller.like;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.younghun.klom.model.like.service.LikeService;
import com.younghun.klom.model.like.vo.LikeVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value = "search")
public class LikeController {

	@Autowired
	private LikeService likeService;
	      
	@ResponseBody
	@RequestMapping(value = "/like", method = RequestMethod.GET)
	public LikeVo heart() {
//		log.debug("{}asasas", session);
//		String email = ((UserVo)session.getAttribute("data")).getEmail();
		LikeVo likeVo = likeService.result();
		log.debug("{}",likeVo);
		return likeVo;
		
	}
	
}
