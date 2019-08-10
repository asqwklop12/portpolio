package com.younghun.klom.controller.search.crud;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.younghun.klom.model.search.dao.SearchDao;
import com.younghun.klom.model.search.dao.SearchService;
import com.younghun.klom.model.search.vo.SearchVo;
import com.younghun.klom.model.user.vo.UserVo;

@Controller
public class DeleteSearchController {

	@Autowired
	private SearchService searchService;
	
	@RequestMapping(value = "/list/{id}/{group}", method = RequestMethod.GET)
	public String delete(@PathVariable int id,@PathVariable int group, HttpSession session) {
		
		String email = ((UserVo)(session.getAttribute("data"))).getEmail();
		SearchVo searchVo = new SearchVo();
		
		searchVo.setSearchId(id);
		searchVo.setSearchNumber(group);
		searchVo.setUserEmail(email);
		searchService.delete(searchVo);
		
		return "redirect:/list";
	}
}


