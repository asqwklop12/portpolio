package com.younghun.klom.model.notice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.notice.dao.NoticeDao;
import com.younghun.klom.model.notice.vo.NoticeVo;

@Service
public class NoticeServiceImpl implements NoticeSecvice{

	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public void create(int boardId,String email, String title) {
		NoticeVo noticeVo = new NoticeVo();
		noticeVo.setBoardId(boardId);
		noticeVo.setUserEmail(email);
		noticeVo.setBoardTitle(title);
		noticeDao.create(noticeVo);
	}

	@Override
	public List<BoardVo> list() {
		return noticeDao.list();
	}

	@Override
	public void update(String title,String email ,int boardId) {
		NoticeVo noticeVo = new NoticeVo();
		noticeVo.setBoardTitle(title);
		noticeVo.setUserEmail(email);
		noticeVo.setBoardId(boardId);
		noticeDao.update(noticeVo);
	}

	@Override
	public void delete(String email, int boardId) {
		NoticeVo noticeVo = new NoticeVo();
		noticeVo.setUserEmail(email);
		noticeVo.setBoardId(boardId);
		noticeDao.delete(noticeVo);
	}

}
