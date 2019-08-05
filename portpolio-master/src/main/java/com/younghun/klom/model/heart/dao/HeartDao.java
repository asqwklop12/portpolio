package com.younghun.klom.model.heart.dao;

import com.younghun.klom.model.heart.vo.HeartVo;

public interface HeartDao {

	int result(HeartVo heartVo);
	
	// 증가
	void increse(HeartVo heartVo);
	
	// 감소
	void decrese(HeartVo heartVo);
}
