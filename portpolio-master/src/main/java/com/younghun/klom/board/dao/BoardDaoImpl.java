package com.younghun.klom.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.board.vo.BoardVo;

@Repository
public class BoardDaoImpl implements BoardDao{

	@Autowired
	private SqlSession sqlSession;
	
	private final static String NAMESPACE = "BoardMapper.";
	@Override
	public List<BoardVo> boardList() {
		return sqlSession.selectList(NAMESPACE + "board");
	}

}
