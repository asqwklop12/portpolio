package com.younghun.klom.controller.search.crud;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.younghun.klom.model.search.service.SearchService;
import com.younghun.klom.model.search.vo.SearchListVo;
import com.younghun.klom.model.user.vo.UserVo;

@Controller
public class DeleteSearchController {

	@Autowired
	private SearchService searchService;
	
	@RequestMapping(value = "/list/{id}/{group}", method = RequestMethod.GET)
	public String delete(@PathVariable int id,@PathVariable int group, HttpSession session) {
		
		String email = ((UserVo)(session.getAttribute("data"))).getEmail();
		SearchListVo searchVo = new SearchListVo();
		
		searchVo.setSearchId(id);
		searchVo.setSearchNumber(group);
		searchVo.setUserEmail(email);
		searchService.delete(searchVo);
		
		return "redirect:/list";
	}
}


