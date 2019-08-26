package com.younghun.klom.model.comment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.comment.dao.CommentDao;
import com.younghun.klom.model.comment.vo.CommentVo;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentDao commentDao;
	
	@Override
	public void insert(int boardId, String email, String writer, String profile, String content) {
		CommentVo commentVo = new CommentVo();
		commentVo.setBoardId(boardId);
		commentVo.setUserEmail(email);
		commentVo.setCommentWriter(writer);
		commentVo.setCommentProfile(profile);
		commentVo.setCommentContent(content);
		commentDao.insert(commentVo);
		
	}

	@Override
	public List<CommentVo> list(int boardId) {
		return commentDao.list(boardId);
	}

	@Override
	public void delete(int commentId) {
		
		commentDao.delete(commentId);
	}

	

}
