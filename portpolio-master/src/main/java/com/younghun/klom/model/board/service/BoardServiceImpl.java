package com.younghun.klom.model.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.board.dao.BoardDao;
import com.younghun.klom.model.board.vo.BoardVo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BoardServiceImpl implements BoardService {

	
	@Autowired
	private  BoardDao boardDao;
	
	// 리스트
	@Override
	public List<BoardVo> list(int display, int post) {
		return boardDao.list(display,post);
	}

	// 읽기
	@Override
	public BoardVo find(long no) {
		return boardDao.find(no);
	}

	// 생성
	@Override
	public void create(BoardVo boardVo) {
		boardDao.create(boardVo);
		
	}

	// 업데이트
	@Override
	public void update(BoardVo boardVo) {
		log.debug("{}", boardVo);
		boardDao.update(boardVo);
		
	}

	// 삭제
	@Override
	public void clear(long no) {
		boardDao.clear(no);
	}

	@Override
	public void updateView(int no) {
		boardDao.updateView(no);
	}


}
