package com.younghun.klom.controller.user.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.younghun.klom.model.duplicate.dao.DuplicateDao;
import com.younghun.klom.model.duplicate.dto.DuplicateDto;

@RestController
@RequestMapping(value = "/duplicate")
public class DuplicateController {

	  
	@Autowired
	private DuplicateDao duplicateDao;
	
	@ResponseBody
	@RequestMapping(value = "/name" ,method = RequestMethod.POST)
	public int chekingName(String name) {
		DuplicateDto dto = new DuplicateDto();
		dto.setName(name);
		return duplicateDao.nameCheck(dto);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/email" ,method = RequestMethod.POST)
	public int chekingEmail(String email) {
		DuplicateDto dto = new DuplicateDto();
		dto.setEmail(email);
		return duplicateDao.emailCheck(dto);
	}
  	   	
}
