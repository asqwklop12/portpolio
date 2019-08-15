package com.younghun.klom.model.notice.dao;

import java.util.List;

import com.younghun.klom.model.board.vo.BoardVo;

public interface NoticeDao {
	void create(BoardVo boardVo);
	
	List<BoardVo> list();
}
