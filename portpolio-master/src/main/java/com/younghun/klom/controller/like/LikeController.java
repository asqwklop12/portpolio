package com.younghun.klom.controller.like;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/search")
public class LikeController {

	      
	@ResponseBody
	@RequestMapping(value = "/like", method = RequestMethod.GET)
	public String heart() {
		return "hello";
		
	}
	
}
