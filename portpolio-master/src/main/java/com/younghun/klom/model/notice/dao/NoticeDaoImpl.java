package com.younghun.klom.model.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.board.vo.BoardVo;

@Repository
public class NoticeDaoImpl implements NoticeDao{

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "NoticeMapper.";
	@Override
	public void create(BoardVo boardVo) {
		sqlSession.insert(NAMESPACE + "create", boardVo);
	}
	@Override
	public List<BoardVo> list() {
		return sqlSession.selectList(NAMESPACE + "select");
	}
	

}
