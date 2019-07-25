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

@Controller
@RequestMapping(value = "/board/confirm")
public class CreateBoardController {
 
	@Autowired
	private BoardService boardService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// 게시글 작성
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView confirm(BoardVo boardVo, HttpSession httpSession) {
		boardService.create(boardVo);
		ModelAndView model = new ModelAndView();
		
		// 세션에서 받아서 저장하기
		UserVo data =  (UserVo) httpSession.getAttribute("data");
		logger.debug("{}", data);
		
		model.addObject("id",data.getId());
		model.addObject("name",data.getName());
		
		logger.debug("{}abcd,{}", data.getId(),data.getName());
		boardVo.setUserId(data.getId());
		boardVo.setWriter(data.getName());
		
		model.addObject("board",boardVo);
		model.setViewName("redirect:/board");
		logger.debug("{}", boardVo); 

		return model;
	}
}
