package com.younghun.klom.controller.board.crud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.board.service.BoardService;
import com.younghun.klom.model.board.vo.BoardVo;

@Controller
@RequestMapping(value = "/board/into")
public class ReadBoardController {

	@Autowired
	private BoardService boardService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	// 게시글 읽기 (본인 글이면 수정, 삭제태그 보여줌)
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView into(@RequestParam(value = "no",required = false) Long no) {
		BoardVo detail = boardService.find(no);
		ModelAndView model = new ModelAndView();
		logger.debug("{}번째 들어옴", no);
		model.addObject("detail",detail);
		model.setViewName("BoardForInfo");
		return model;
	}
}
