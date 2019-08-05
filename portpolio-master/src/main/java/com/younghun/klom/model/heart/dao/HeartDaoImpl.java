package com.younghun.klom.model.heart.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.heart.vo.HeartVo;

@Repository
public class HeartDaoImpl implements HeartDao{

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "HeartMapper.";
	@Override
	public int result(HeartVo heartVo) {
		return sqlSession.selectOne(NAMESPACE + "result",heartVo);
	}
	@Override
	public void increse(HeartVo heartVo) {
		sqlSession.update(NAMESPACE + "increase",heartVo);
		
	}
	@Override
	public void decrese(HeartVo heartVo) {
		sqlSession.update(NAMESPACE + "decrese", heartVo);
	}

}
