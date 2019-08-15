package com.younghun.klom.model.notice.service;

import java.util.List;

import com.younghun.klom.model.board.vo.BoardVo;

public interface NoticeSecvice {

	void create(BoardVo boardVo);
	
	List<BoardVo> list();
}
