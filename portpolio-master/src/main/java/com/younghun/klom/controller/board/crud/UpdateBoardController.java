package com.younghun.klom.controller.board.crud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.board.service.BoardService;
import com.younghun.klom.model.board.vo.BoardVo;

@Controller

@RequestMapping(value = "/board/edit")
public class UpdateBoardController {

	@Autowired
	private BoardService boardService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	// 게시글 수정
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView edit(ModelAndView model,BoardVo boardVo) {
		logger.debug("{}",boardVo);			
		boardService.update(boardVo);
		
		model.setViewName("redirect:/board");
		return model;
	}
}
