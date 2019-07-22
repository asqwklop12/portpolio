package com.younghun.klom.model.page.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaggingDaoIml implements PaggingDao {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "PaggingMapper.";
	
	
	@Override
	public int board() {
		return sqlSession.selectOne(NAMESPACE + "board");
	}


	@Override
	public int book(String keyword) {
		return sqlSession.selectOne(NAMESPACE + "book", keyword);
	}

}
