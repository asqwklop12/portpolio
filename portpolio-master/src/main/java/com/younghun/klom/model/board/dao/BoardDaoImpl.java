package com.younghun.klom.model.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.board.vo.BoardListVo;

@Repository
public class BoardListDaoImpl implements BoardListDao {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "BoardMapper.";
	
	
	@Override
	public List<BoardListVo> boardList() {
		
		return sqlSession.selectList(NAMESPACE + "list");
	}

}
