package com.younghun.klom.model.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.page.vo.PageVo;

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
	public void view(int boardId) {
		sqlSession.update(NAMESPACE + "view",boardId);
	}

	@Override
	public List<BoardVo> list(PageVo pageVo) {
		return sqlSession.selectList(NAMESPACE + "list",pageVo);
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
	public void comment(int boardId) {
		sqlSession.delete(NAMESPACE + "comment",boardId);
	}
}