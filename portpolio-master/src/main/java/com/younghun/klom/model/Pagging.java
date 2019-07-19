package com.younghun.klom.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pagging {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private int total;
	private int count;
	
	// 전체 페이지
	public Pagging(int total,int count) {
		this.total = total;
		this.count = count;
	}
	
	// 화면에 보여질 최대 갯수
	public int getCount() {
		return count;
	}
	
	
	// 페이지 갯수
	public int pagging() {
		
		logger.debug("게시물의 총 갯수: {}" ,total);
		
		int size = total / count;
		
		if (total % count > 0) {
			size++;
		}
		
		logger.debug("지금 페이징되는 페이지 갯수 : {}", size);
		return size;
	}
	
	// 출력할 게시물
	public int display(int num) {
		return (num - 1)*count;
	}
	
	
	
}
