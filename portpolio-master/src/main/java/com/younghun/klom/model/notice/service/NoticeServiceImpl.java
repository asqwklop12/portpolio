package com.younghun.klom.model.notice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.notice.dao.NoticeDao;

@Service
public class NoticeServiceImpl implements NoticeSecvice{

	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public void create(BoardVo boardVo) {

		noticeDao.create(boardVo);
	}

	@Override
	public List<BoardVo> list() {
		return noticeDao.list();
	}

}
