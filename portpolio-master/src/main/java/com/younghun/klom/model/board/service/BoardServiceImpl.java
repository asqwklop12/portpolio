package com.younghun.klom.model.board.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.board.dao.BoardDao;
import com.younghun.klom.model.board.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private  BoardDao boardDao;
	
	// 리스트
	@Override
	public List<BoardVo> boardList() {
		return boardDao.boardList();
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
		logger.debug("{}", boardVo);
		boardDao.update(boardVo);
		
	}

	@Override
	public void clear(long no) {
		boardDao.clear(no);
	}

}
