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
		
		// Yes24
		Crawing yes24 = new Crawing("yes24");
		List<String> yes24List =  yes24.start(5);
		model.addObject("yes24",yes24List);

		// ypbook
		Crawing ypbook = new Crawing("ypbook");
		List<String> ypbookList =  ypbook.start(5);
		model.addObject("ypbook",ypbookList);
		
		// aladin
		Crawing aladin = new Crawing("aladin");
		List<String> aladinList =  aladin.start(5);
		model.addObject("aladin",aladinList);
		
		// kyobo
		Crawing kyobo = new Crawing("kyobo");
		List<String> kyoboList =  kyobo.start(5);
		model.addObject("kyobo",kyoboList);
		
		
		// bandi
		Crawing bandi = new Crawing("bandi");
		List<String> bandiList =  bandi.start(5);
		model.addObject("bandi",bandiList);
		
		
		
		model.setViewName("LayoutForMain");		
		return model;
	}
}
