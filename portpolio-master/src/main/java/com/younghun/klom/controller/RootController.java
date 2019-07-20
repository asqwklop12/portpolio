package com.younghun.klom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class RootController {
	// 루트값설정 (Home)
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView home(ModelAndView model) {
		model.setViewName("LayoutForMain");		
		return model;
	}
}
