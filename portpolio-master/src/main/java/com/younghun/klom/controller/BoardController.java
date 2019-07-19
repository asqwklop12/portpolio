package com.younghun.klom.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.Pagging;
import com.younghun.klom.model.board.service.BoardService;
import com.younghun.klom.model.board.service.PaggingService;
import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.user.vo.UserVo;

//step2


@Controller
@RequestMapping("/board")
public class BoardController {
	
    
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private PaggingService paggingService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	//TODO: 게시판으로 이동 (로그인이 안되 있으면 접근 불가[현재는 가능])
	@GetMapping
	public ModelAndView main(@RequestParam(value =  "num", required = false, defaultValue = "1") int num) {
		logger.debug("{}",num);
		ModelAndView model = new ModelAndView();	 
		
		// 페이징 처리
		Pagging p = new Pagging(paggingService.board(),10);
		List<BoardVo> list = boardService.list(p.display(num),p.getCount());
		model.addObject("page",p.pagging());
		
		// 게시판 리스트
		model.addObject("list", list);
		
		model.setViewName("MainForBoard");		
		return model;
	}
	
	
		
	// 게시글 읽기 (본인 글이면 수정, 삭제태그 보여줌)
		@RequestMapping(value = "/into",method = RequestMethod.GET)
		public ModelAndView into(@RequestParam(value = "no",required = false) Long no) {
			BoardVo detail = boardService.find(no);
			ModelAndView model = new ModelAndView();
			logger.debug("{}번째 들어옴", no);
			model.addObject("detail",detail);
			model.setViewName("BoardForInfo");
			return model;
		}
	
	// 검색화면 이동
	@RequestMapping(value = "/search",method = RequestMethod.GET)
	public ModelAndView search() {
		return new ModelAndView("redirect:/search");
	}
	
	
	// home으로이동
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/";
	}
	
	
	// 검색목록 이동
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("redirect:/list");
	}
	
	
	// 게시판으로 (연속클릭 버그 수정)
	@RequestMapping(value = "/board",method = RequestMethod.GET)
	public ModelAndView board() {
		return new ModelAndView("redirect:/board");
	}

	
	// 게시판닫기
	@RequestMapping(value = "/close",method = RequestMethod.GET)
	public ModelAndView close() {
		return new ModelAndView("redirect:/board");
	}

	

	// 작성페이지로 이동
	@RequestMapping(value = "/write",method = RequestMethod.GET)
	public ModelAndView write() {
		return new ModelAndView("BoardForWrite");
	}
	
	
	// 게시글 작성
	@RequestMapping(value = "/confirm",method = RequestMethod.POST)
	public String confirm(BoardVo boardVo) {
		boardService.create(boardVo);
		
		return "redirect:/board";
	}
	
	
	
	// 게시글 수정
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView edit(ModelAndView model,BoardVo boardVo) {
		logger.debug("{}",boardVo);			
		boardService.update(boardVo);
		
		model.setViewName("redirect:/board");
		return model;
	}
	
	// 게시글 삭제 (본인 글이 아니면 삭제 금지)
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	public ModelAndView delete(@RequestParam long no) {
		boardService.clear(no);
		return new ModelAndView("redirect:/board");
	}
	
	

	// 로그아웃??? 이게 뭔지
	@GetMapping(value = "/login/logout")
	public String logout(HttpSession httpSession) {
		httpSession.invalidate();
		return "redirect:/";
	}
		
	
	// 정보 수정??? 흠
	@RequestMapping(value = "/login/edit", method = RequestMethod.GET)
	public ModelAndView edit(ModelAndView model) {		
		UserVo userVo = new UserVo();
		model.addObject("editDto",userVo);
		model.setViewName("redirect:/login/edit");
		return model;
	}

}
