	package com.younghun.klom.controller.profile;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.younghun.klom.model.profile.service.ProfileService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "profile")
@Slf4j
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	 
	@ResponseBody
	@RequestMapping(value = "/insert")
	private String profileGet() {
		Random random = new Random();
		int count = random.nextInt(profileService.count()) + 1;
		log.debug("{}",count);
		return profileService.getProfile(count);
	}
}  
