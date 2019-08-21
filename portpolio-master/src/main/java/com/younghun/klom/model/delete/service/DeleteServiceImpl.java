package com.younghun.klom.model.delete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.comment.vo.CommentVo;
import com.younghun.klom.model.delete.dao.DeleteDao;
import com.younghun.klom.model.heart.vo.HeartVo;
import com.younghun.klom.model.notice.vo.NoticeVo;
import com.younghun.klom.model.search.vo.SearchListVo;

@Service
public class DeleteServiceImpl implements DeleteService {

	@Autowired
	private DeleteDao deleteDao;

	@Override
	public void comment(String email) {
		CommentVo commentVo = new CommentVo();
		commentVo.setUserEmail(email);
		deleteDao.comment(commentVo);
	}

	@Override
	public void notice(String email) {
		NoticeVo noticeVo = new NoticeVo();
		noticeVo.setUserEmail(email);
		deleteDao.notice(noticeVo);
	}

	@Override
	@Transactional
	public void heart(String email) {
		HeartVo heartVo = new HeartVo();
		heartVo.setUserEmail(email);
		deleteDao.heart(heartVo);
	}

	@Override
	public void board(String email) {
		BoardVo boardVo = new BoardVo();
		boardVo.setUserEmail(email);
		deleteDao.board(boardVo);
	}

	@Override
	@Transactional
	public void search(String email) {
		SearchListVo searchListVo = new SearchListVo();
		searchListVo.setUserEmail(email);
		deleteDao.search(searchListVo);
	}

}
