package com.younghun.klom.controller.search.crud;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.Pagging;
import com.younghun.klom.model.book.vo.BookVo;
import com.younghun.klom.model.page.service.PaggingService;
import com.younghun.klom.model.search.dao.SearchDao;
import com.younghun.klom.model.search.service.SearchService;
import com.younghun.klom.model.search.vo.SearchListVo;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ReadSearchController {

	@Autowired
	private SearchService searchService;

	@Autowired
	private PaggingService paggingService;
	// TODO: 검색목록 이동
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(@RequestParam(value = "num", required = false, defaultValue = "1") int num, HttpSession session,
			Model model) {
		String email = null;
		
		try {
			email = ((UserVo) session.getAttribute("data")).getEmail();
			
		}catch (NullPointerException e) {
			return "redirect:/";
		}
		
		// 페이징 처리 (전체페이지, 화면에 보여지는 게시글수)
		Pagging p = null;
		List<SearchListVo> list = null;
		try {
			p = new Pagging(paggingService.search(email), 10);
			list = searchService.list(p.display(num), p.getCount(), email);
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.debug("{}", list);
		model.addAttribute("list", list);
		model.addAttribute("page", p.pagging());
		
		return "MainForBookList";

	}
}
