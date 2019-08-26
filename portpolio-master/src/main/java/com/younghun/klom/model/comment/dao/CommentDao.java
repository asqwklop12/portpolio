package com.younghun.klom.model.comment.dao;

import java.util.List;

import com.younghun.klom.model.comment.vo.CommentVo;

public interface CommentDao {
	
	void  insert(CommentVo commentVo);

	
	List<CommentVo> list(int boardId);
	
	void delete(int commentId);
}
