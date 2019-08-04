package com.younghun.klom.model.like.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.like.vo.LikeVo;

@Repository
public class LikeDaoImpl implements LikeDao{

	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "HeartMapper.";
	@Override
	public LikeVo result() {
		return sqlSession.selectOne(NAMESPACE + "result");
	}

}
