package com.younghun.klom.model.delete.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.comment.vo.CommentVo;
import com.younghun.klom.model.heart.vo.HeartVo;
import com.younghun.klom.model.search.vo.SearchListVo;

@Repository
public class DeleteDaoImpl implements DeleteDao{

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPCE = "DeleteMapper.";
	
	@Override
	public void comment(CommentVo commentVo) {
		sqlSession.delete(NAMESPCE + "comment",commentVo);
	}

	@Override
	public void notice(BoardVo boardVo) {
		sqlSession.delete(NAMESPCE + "notice",boardVo); 
	}

	@Override
	public void heart(HeartVo heartVo) {
		sqlSession.delete(NAMESPCE + "heart",heartVo);
		 
	}

	

	@Override
	public void heartDecrease(HeartVo heartVo) {
		sqlSession.update(NAMESPCE + "heartDecrease",heartVo);
	}
	@Override
	public void board(BoardVo boardVo) {
		sqlSession.delete(NAMESPCE + "board",boardVo); 
	}



	@Override
	public void search(SearchListVo searchListVo) {
		sqlSession.delete(NAMESPCE + "search",searchListVo); 
	}

	


	
}
