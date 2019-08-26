package com.younghun.klom.model.comment.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.comment.vo.CommentVo;

@Repository
public class CommentDaoImpl implements CommentDao{

	@Autowired
	private SqlSession sqlSession;
	
	
	private static final String NAMESPACE = "CommentMapper.";
	
	@Override
	public void insert(CommentVo commentVo) {
		sqlSession.insert(NAMESPACE + "insert",commentVo); 
	}

	@Override
	public List<CommentVo> list(int boardId) {
		return sqlSession.selectList(NAMESPACE + "list",boardId);
	}

	@Override
	public void delete(int commentId) {
		sqlSession.delete(NAMESPACE + "remove",commentId);
	}


}
