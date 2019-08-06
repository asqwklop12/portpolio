package com.younghun.klom.model.profile.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileDaoImpl implements ProfileDao{

	@Autowired
	private SqlSession sqlSession;
	
	private final static String NAMESPCE = "profileMapper.";
	
	@Override
	public String getProfile(int id) {
		return sqlSession.selectOne(NAMESPCE + "select", id);
	}

	@Override
	public int count() {
		return sqlSession.selectOne(NAMESPCE + "count");
	}

}
