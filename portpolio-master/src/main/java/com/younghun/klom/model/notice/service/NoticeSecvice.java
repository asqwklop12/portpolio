package com.younghun.klom.model.notice.service;

import java.util.List;

import com.younghun.klom.model.board.vo.BoardVo;

public interface NoticeSecvice {

	void create(int boardId,String email, String title);
	
	List<BoardVo> list();
	
	void update(String title,String email ,int boardId);
	
	void delete(String email, int boardId);
}
