package com.younghun.klom.controller.board.crud;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.younghun.klom.model.board.service.BoardService;
import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.notice.service.NoticeSecvice;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(value = "/board/confirm")
public class CreateBoardController {

	@Autowired
	private BoardService boardService;
	
	@Autowired
	private NoticeSecvice noticeSecvice;

	// 게시글 작성
	@RequestMapping(method = RequestMethod.POST)
	public String confirm(@ModelAttribute BoardVo boardVo, HttpSession session) {
		UserVo userVo = (UserVo) session.getAttribute("data");
		String email = userVo.getEmail();
		String name = userVo.getName();
		String profile = userVo.getImage();
		
		
		
		boardVo.setUserEmail(email);
		boardVo.setBoardWriter(name);
		boardVo.setBoardProfile(profile);
  
		
		
		if (boardVo.getBoardTitle()!= "") {
			boardService.insert(boardVo);
		}
		
		if (userVo.getGrade().equals("admin")) {
			noticeSecvice.create(boardVo.getBoardId(),email,boardVo.getBoardTitle());
		}

		return "redirect:/board";
	}
}
