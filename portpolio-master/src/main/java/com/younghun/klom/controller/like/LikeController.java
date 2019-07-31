package com.younghun.klom.controller.like;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.younghun.klom.model.like.service.LikeService;
import com.younghun.klom.model.like.vo.LikeVo;
import com.younghun.klom.model.user.vo.UserVo;

@RestController
@RequestMapping(value = "/board")
public class LikeController {

	@Autowired
	private LikeService likeService;
	  
	@ResponseBody
	@RequestMapping(value = "/like", method = RequestMethod.POST)
	public String heart(@RequestParam(value = "no",required = false) int no,
            HttpSession session) {
		String email = ((UserVo)session.getAttribute("data")).getEmail();
		LikeVo likeVo = new LikeVo();
		likeVo.setBoardId(no);
		likeVo.setUserEmail(email);
		
		int result = likeService.result(likeVo);
		
		
		if (result == 0) {
			likeService.increase(likeVo);
		}
		
		else {
			likeService.decrease(likeVo);
		}
		
		
		return new Gson().toJson(likeVo);
	}
	
}
