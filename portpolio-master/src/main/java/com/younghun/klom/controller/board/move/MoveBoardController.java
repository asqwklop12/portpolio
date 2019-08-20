package com.younghun.klom.controller.board.move;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/board")
public class MoveBoardController {
	// 검색화면 이동
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(HttpSession httpSession) {
		if (httpSession.getAttribute("data") == null) {
			return "/error/400";
		}
		return "redirect:/search";
	}

	// home으로이동
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String redirect(HttpSession httpSession) {
		if (httpSession.getAttribute("data") == null) {
			return "/error/400";
		}
		return "redirect:/";
	}

	// 검색목록 이동
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(HttpSession httpSession) {
		if (httpSession.getAttribute("data") == null) {
			return "/error/400";
		}
		return "redirect:/list";
	}

	// 게시판으로 (연속클릭 버그 수정)
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String board(HttpSession httpSession) {
		if (httpSession.getAttribute("data") == null) {
			return "/error/400";
		}
		return "redirect:/board";
	}

}
