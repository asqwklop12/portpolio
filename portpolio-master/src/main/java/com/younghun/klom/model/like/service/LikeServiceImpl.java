package com.younghun.klom.model.like.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.like.dao.LikeDao;
import com.younghun.klom.model.like.vo.LikeVo;

@Service
public class LikeServiceImpl implements LikeService{

	@Autowired
	private LikeDao likeDao;
	
	@Override
	public LikeVo result() {
		return likeDao.result();
	}

}
