package com.younghun.klom.model.delete.dao;

import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.comment.vo.CommentVo;
import com.younghun.klom.model.heart.vo.HeartVo;
import com.younghun.klom.model.notice.vo.NoticeVo;
import com.younghun.klom.model.search.vo.SearchListVo;

public interface DeleteDao {
	
	void comment(CommentVo commentVo);

	void notice(NoticeVo noticeVo);

	void heart(HeartVo heartVo);
	void heartDecrease(HeartVo heartVo);
	
	
	void board(BoardVo boardVo);

	void search(SearchListVo searchListVo);


}
