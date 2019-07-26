package com.younghun.klom.model.crawling;

import java.util.HashMap;
import java.util.Map;

public class Url {

	private final static String YES24 = "https://www.yes24.com/24/category/bestseller?CategoryNumber=001&sumgb=08";
	private final static String YPBOOK = "https://www.ypbooks.co.kr/book_arrange.yp?targetpage=book_week_best&pagetype=5&depth=1";
	private final static String ALADIN = "https://www.aladin.co.kr/shop/common/wbest.aspx?BranchType=1?CID=0&start=we";
	
	// 크롤링 거부 사이트
	private final static String KYOBOBOOK = "https://www.kyobobook.co.kr/bestSellerNew/bestseller.laf?orderClick=d79";
	private final static String BANDILUNIS = "https://www.bandinlunis.com/front/display/listBest.do";
	
	
	
	// 맵에 주소 저장
	public Map<String,String> addressMap() {

		Map<String, String> address = new HashMap<String, String>();
		
		address.put("yes24", YES24);
		address.put("ypbook", YPBOOK);
		address.put("aladin", ALADIN);
		address.put("kyobo", KYOBOBOOK);
		address.put("bandi", BANDILUNIS);
		
		return address;
	}
}
