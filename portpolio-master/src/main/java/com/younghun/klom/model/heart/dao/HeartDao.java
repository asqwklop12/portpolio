package com.younghun.klom.model.heart.dao;

import com.younghun.klom.model.book.vo.BookVo;
import com.younghun.klom.model.heart.vo.HeartVo;

public interface HeartDao {

	void heart_increse(BookVo bookVo);
	void heart_decrease(BookVo bookVo);
	
	
	int result(HeartVo heartVo);
	int heartResult(HeartVo heartVo);
	int check(HeartVo heartVo);
	void create(HeartVo heartVo);

	// 증가
	void increse(HeartVo heartVo);

	// 감소
	void decrese(HeartVo heartVo);
}
