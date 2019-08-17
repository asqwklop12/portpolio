package com.younghun.klom.model.comment.service;

import java.util.List;

import com.younghun.klom.model.comment.vo.CommentVo;

public interface CommentService {
	  
	void insert(int boardId,String email, String writer, String profile, String content);
	
	
	List<CommentVo> list(int boardId);
	
	void delete(String email);

}
