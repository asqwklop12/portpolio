package com.younghun.klom.controller.board.other;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.user.vo.UserVo;

@Controller
@RequestMapping(value = "/board/into/login")
public class StraingeBoardController {
	// 로그아웃
		@GetMapping(value = "/logout")
		public String logout(HttpSession httpSession) {
			if (httpSession.getAttribute("data") == null) {
				return "/error/400";
			}
			
			httpSession.invalidate();
			return "redirect:/";
		}

		// 정보 수정
		@RequestMapping(value = "/edit", method = RequestMethod.GET)
		public String edit(HttpSession httpSession) {
			if (httpSession.getAttribute("data") == null) {
				return "/error/400";
			}
			return "redirect:/login/edit";
		}
	}
