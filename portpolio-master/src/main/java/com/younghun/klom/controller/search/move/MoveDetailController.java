package com.younghun.klom.controller.search.move;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.book.service.BookService;
import com.younghun.klom.model.book.vo.BookVo;

@Controller
@RequestMapping(value = "/search")
public class MoveDetailController {

	@Autowired
	private BookService bookService;
	  
	// 정보페이지에서 나가기 
	@RequestMapping(value = "/out",method = RequestMethod.GET)
	public String close() {
		return "redirect:/";
	}
	
	
	// 정보페이지로 이동 
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String bookInfo(Model model,@RequestParam String title) {
		
		BookVo bookVo = bookService.result(title);
		
		model.addAttribute("book",bookVo);
		
		return "BookForInfo";
	}
}
