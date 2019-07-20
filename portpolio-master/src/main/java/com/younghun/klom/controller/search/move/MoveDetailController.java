package com.younghun.klom.controller.search.move;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/search/info")
public class MoveDetailController {

	// 정보페이지로 이동 
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView bookInfo() {
		return new ModelAndView("BookForInfo");
	}
}
