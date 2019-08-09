package com.younghun.klom.controller.search.crud;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.search.dao.SearchDao;
import com.younghun.klom.model.search.vo.SearchVo;
import com.younghun.klom.model.user.vo.UserVo;

@Controller
public class ReadSearchController {

	@Autowired
	private SearchDao searchDao;

	// TODO: 검색목록 이동 
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(HttpSession session, Model model) {
		String email = ((UserVo) session.getAttribute("data")).getEmail();
		List<SearchVo> list = null;
		try {
			list = searchDao.list(email);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("list", list);
		return "MainForBookList";

	}
}
