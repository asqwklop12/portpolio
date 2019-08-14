package com.younghun.klom.model.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.board.vo.BoardVo;

@Repository
public class BoardDaoImpl implements BoardDao{

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "boardMapper.";
	
	@Override
	public void insert(BoardVo boardVo) {
		sqlSession.insert(NAMESPACE + "insert",boardVo);
	}
	
	@Override
	public BoardVo read(BoardVo boardVo) {
		return sqlSession.selectOne(NAMESPACE + "board", boardVo);
	}

	@Override
	public int countId() {
		return sqlSession.selectOne(NAMESPACE + "count");
	}

	@Override
	public List<BoardVo> list() {
		return sqlSession.selectList(NAMESPACE + "list");
	}
	@Override
	public void update(BoardVo boardVo) {
		sqlSession.update(NAMESPACE + "update",boardVo);
	}
	


	@Override
	public void delete(BoardVo boardVo) {
		sqlSession.delete(NAMESPACE + "delete", boardVo);
	}

	@Override
	public void decrease(int boardId) {
		sqlSession.update(NAMESPACE + "change",boardId);
	}

	

	

}
