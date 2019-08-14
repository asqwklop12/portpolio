package com.younghun.klom.controller.board.crud;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.younghun.klom.model.board.service.BoardService;
import com.younghun.klom.model.user.vo.UserVo;

@Controller
@RequestMapping(value = "/board/into/delete/{id}")
public class DeleteBoardController {
	@Autowired
	private BoardService boardService;
	@RequestMapping(method = RequestMethod.GET)
	public String delete(@PathVariable int id, HttpSession session) {
		UserVo userVo = (UserVo) session.getAttribute("data");
		String email = userVo.getEmail();
		boardService.delete(email, id);
		return "redirect:/board";
	}
}
