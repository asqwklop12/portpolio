package com.younghun.klom.controller.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.Pagging;
import com.younghun.klom.model.board.service.BoardService;
import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.like.service.LikeService;
import com.younghun.klom.model.page.service.PaggingService;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/board")
@Slf4j
public class BoardListController {
    
	@Autowired
	private BoardService boardService;

	@Autowired
	private PaggingService paggingService;


	// TODO: 게시판으로 이동 (로그인이 안되 있으면 접근 불가[현재는 가능])
	@RequestMapping
	public ModelAndView main(@RequestParam(value = "num", required = false, defaultValue = "1") int num
			                 ,HttpSession httpSession) {
		ModelAndView model = new ModelAndView();
		
		log.debug("{}", num);

		// 페이징 처리
		Pagging p = new Pagging(paggingService.board(), 10);
		List<BoardVo> list = boardService.list(p.display(num), p.getCount());
		model.addObject("page", p.pagging());
		
		// 게시판 리스트
		model.addObject("list", list);
		
		model.setViewName("MainForBoard");
		return model;
	}
}
