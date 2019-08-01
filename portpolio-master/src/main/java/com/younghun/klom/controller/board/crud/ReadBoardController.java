package com.younghun.klom.controller.board.crud;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.board.service.BoardService;
import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.like.service.LikeService;
import com.younghun.klom.model.like.vo.LikeVo;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/board/into")
@Slf4j
public class ReadBoardController {

	@Autowired
	private BoardService boardService;
	
	@Autowired
	private LikeService likeService;

	
	// 게시글 읽기 (본인 글이면 수정, 삭제태그 보여줌)
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView into(@RequestParam(value = "no",required = false) int no,
			                 HttpSession session) {
		
		BoardVo detail = boardService.find(no);
		ModelAndView model = new ModelAndView();
		
		// view 숫자 증가
		boardService.updateView(detail);
		log.debug("{}번째 들어옴", no);
		log.debug("{}",detail);
		
		String userEmail = ((UserVo)session.getAttribute("data")).getEmail();
		
		// 좋아요 증감
		LikeVo likeVo = setLike(userEmail, no);
		log.debug("{}",likeVo);
		if (likeService.duplicate(likeVo)) {
			likeService.create(likeVo);
		}
		
  		model.addObject("result",likeService.board_result(likeVo.getBoardId()));
  		model.addObject("user",likeService.result(likeVo));
		model.addObject("detail",detail);
		model.setViewName("BoardForInfo");
		return model;
	}
	
	private LikeVo setLike(String email, int id) {
		LikeVo likeVo = new LikeVo();
		likeVo.setUserEmail(email);
		likeVo.setBoardId(id);
		return likeVo;
	}
}
