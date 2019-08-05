package com.younghun.klom.model.heart.service;

import com.younghun.klom.model.heart.vo.HeartVo;

public interface HeartService {

	int result(HeartVo heartVo);
	
	int change(HeartVo heartVo);
	
	int check(HeartVo heartVo);
	
	void create (HeartVo heartVo);
}
