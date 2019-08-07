package com.younghun.klom.controller.search.move;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.younghun.klom.model.book.service.BookService;
import com.younghun.klom.model.book.vo.BookVo;
import com.younghun.klom.model.heart.service.HeartService;
import com.younghun.klom.model.heart.vo.HeartVo;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/search")
public class MoveDetailController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private HeartService heartService;
	
	// 정보페이지에서 나가기 
	@RequestMapping(value = "/out",method = RequestMethod.GET)
	public String close() {
		return "redirect:/";
	}
	
	  
	// 정보페이지로 이동 
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String bookInfo(Model model,@RequestParam String title) throws Exception {
		
		BookVo bookVo = bookService.result(title);
		model.addAttribute("book",bookVo);
		return "BookForInfo";
	}
	

	// 정보페이지로 이동 
	@RequestMapping(value = "/sInfo", method = RequestMethod.GET)
	public String bookInfo(Model model,@RequestParam String title, HttpSession session) throws Exception {
		BookVo bookVo = bookService.result(title);
		model.addAttribute("book",bookVo);
		
		String email = ((UserVo)session.getAttribute("data")).getEmail();
		HeartVo heartVo = new HeartVo();
		heartVo.setBookTitle(title);
		heartVo.setUserEmail(email);

		
		int check = heartService.check(heartVo);
		
		if (check == 0) {
			heartService.create(heartVo);
		}
		
		int result = heartService.result(heartVo);
		

		
		log.debug("{}vbvbvbvcbvcbcvbbv", check);
		
		model.addAttribute("result",result);
		return "BookForInfo";
	}
	
}
