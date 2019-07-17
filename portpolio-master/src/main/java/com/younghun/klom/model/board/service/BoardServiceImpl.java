package com.younghun.klom.model.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.board.dao.BoardDao;
import com.younghun.klom.model.board.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService {

	
	@Autowired
	private  BoardDao boardListDao;
	
	@Override
	public List<BoardVo> boardList() {
		return boardListDao.boardList();
	}

	@Override
	public BoardVo find(long no) {
		return boardListDao.find(no);
	}

	@Override
	public void create(BoardVo boardVo) {
		boardListDao.create(boardVo);
		
	}

}
