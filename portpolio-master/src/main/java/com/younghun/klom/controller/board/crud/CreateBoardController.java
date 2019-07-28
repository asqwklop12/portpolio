package com.younghun.klom.controller.board.crud;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.board.service.BoardService;
import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/board/confirm")
@Slf4j
public class CreateBoardController {
 
	@Autowired
	private BoardService boardService;
	
	// 게시글 작성
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView confirm(BoardVo boardVo, HttpSession httpSession) {
		boardService.create(boardVo);
		ModelAndView model = new ModelAndView();
		
		// 세션에서 받아서 저장하기
		UserVo data =  (UserVo) httpSession.getAttribute("data");
		log.debug("{}", data);
		
		model.addObject("email",data.getEmail());
		model.addObject("name",data.getName());
		
		log.debug("{}abcd,{}", data.getEmail(),data.getName());
		boardVo.setUserEmail(data.getEmail());
		boardVo.setWriter(data.getName());
		
		model.addObject("board",boardVo);
		model.setViewName("redirect:/board");
		log.debug("{}", boardVo); 

		return model;
	}
}
