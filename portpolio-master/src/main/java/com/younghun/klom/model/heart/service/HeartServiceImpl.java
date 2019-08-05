package com.younghun.klom.model.heart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.heart.dao.HeartDao;
import com.younghun.klom.model.heart.vo.HeartVo;

@Service
public class HeartServiceImpl implements heartService{

	@Autowired
	private HeartDao heartDao;
	
	@Override
	public int result(HeartVo heartVo) {
		int heartCount = heartDao.result(heartVo);
		
		
		return heartCount;
	}

}
