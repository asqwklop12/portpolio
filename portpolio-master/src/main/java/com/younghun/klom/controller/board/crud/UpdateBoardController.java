package com.younghun.klom.controller.board.crud;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.younghun.klom.model.board.service.BoardService;
import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j  
@RequestMapping(value = "/board/into/edit/{id}")
public class UpdateBoardController {
	@Autowired
	private BoardService boardService;
	
	// 게시글 수정
		@RequestMapping(method = RequestMethod.POST)
		public String edit(BoardVo boardVo,HttpSession httpSession ,@PathVariable int id) {
			if (httpSession.getAttribute("data") == null) {
				return "/error/400";
			}
			UserVo userVo = null;
			try {
				userVo = (UserVo) httpSession.getAttribute("data");
				
			} catch (NullPointerException e) {
				return "redirect:/";
			}
			boardVo.setUserEmail(userVo.getEmail());
			boardVo.setBoardWriter(userVo.getName());
			boardVo.setBoardProfile(userVo.getImage());
			boardVo.setBoardId(id);
			
			
			boardService.update(boardVo);
			
			
			
			return "redirect:/board";
		}
	}

