package com.younghun.klom.model.like.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.like.dao.LikeDao;
import com.younghun.klom.model.like.vo.LikeVo;

@Service
public class LikeServiceImpl implements LikeService {

	@Autowired
	private LikeDao likeDao;

	@Override
	public void create(LikeVo likeVo) {
		likeDao.create(likeVo);
	}

	@Override
	public boolean duplicate(LikeVo likeVo) {
		if (likeDao.duplicate(likeVo) == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int result(LikeVo likeVo) {
		return likeDao.result(likeVo);
	}

	@Override
	public void increase(LikeVo likeVo) {
		likeDao.increase(likeVo);
		likeDao.heart(likeVo.getBoardId());
	}

	@Override
	public void decrease(LikeVo likeVo) {
		likeDao.decrease(likeVo);
		likeDao.breakHeart(likeVo.getBoardId());
	}

	@Override
	public int board_result(int no) {
		return likeDao.board_result(no);
	}
}
