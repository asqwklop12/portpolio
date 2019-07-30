package com.younghun.klom.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.younghun.klom.model.crawling.Crawing;

@Controller
@RequestMapping(value = "/")
public class RootController {
	// 루트값설정 (Home)
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView home(ModelAndView model) throws IOException {

		String[] bookstore = {"yes24","ypbook","aladin","kyobo","bandi"};
		// 온라인 서점 크롤링
		for (int i = 0; i < bookstore.length; i++) {
			try {
				Crawing yes24 = new Crawing(bookstore[i]);
				List<String> yes24List = yes24.start(5);
				model.addObject("yes24", yes24List);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		model.setViewName("LayoutForMain");
		return model;
	}
}
