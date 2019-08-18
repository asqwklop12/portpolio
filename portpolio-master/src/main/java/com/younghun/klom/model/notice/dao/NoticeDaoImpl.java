package com.younghun.klom.model.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.notice.vo.NoticeVo;

@Repository
public class NoticeDaoImpl implements NoticeDao{

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "NoticeMapper.";
	@Override
	public void create(NoticeVo noticeVo) {
		sqlSession.insert(NAMESPACE + "create", noticeVo);
	}
	@Override
	public List<BoardVo> list() {
		return sqlSession.selectList(NAMESPACE + "select");
	}
	@Override
	public void update(NoticeVo noticeVo) {		
		sqlSession.update(NAMESPACE + "update",noticeVo); 
	}
	@Override
	public void delete(NoticeVo noticeVo) {
		sqlSession.delete(NAMESPACE + "delete",noticeVo);
	}
	

}
