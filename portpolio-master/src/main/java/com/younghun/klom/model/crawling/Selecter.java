package com.younghun.klom.model.crawling;

import java.util.HashMap;
import java.util.Map;

public class Selecter {

	private final static String YES24 = ".goodsImgW a img";
	private final static String YPBOOK = "dl dt a img";
	private final static String ALADIN = "a img.i_cover";	
	
	// 크롤링 거부 사이트
	private final static String KYOBOBOOK = ".cover a img";
	private final static String BANDILUNIS = ".prod_thumb_img a img";
	
	
	
	// 맵에 주소 저장
	public Map<String,String> selectMap() {

		Map<String, String> select = new HashMap<String, String>();
		
		select.put("yes24", YES24);
		select.put("ypbook", YPBOOK);
		select.put("aladin", ALADIN);
		select.put("kyobo", KYOBOBOOK);
		select.put("bandi", BANDILUNIS);
		
		return select;
	}
}
