package com.younghun.klom.model.notice.dao;

import java.util.List;

import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.notice.vo.NoticeVo;

public interface NoticeDao {
	void create(NoticeVo noticeVo);
	
	List<BoardVo> list();
	
	void update(NoticeVo noticeVo);
	
	void delete(NoticeVo noticeVo);
}
