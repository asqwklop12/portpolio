package com.younghun.klom.model.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaggingDaoIml implements PaggingDao {

	@Autowired
	private SqlSession session;
	
	private static final String NAMESPACE = "PaggingMapper.";
	
	
	@Override
	public int board() {
		return session.selectOne(NAMESPACE + "board");
	}

}
