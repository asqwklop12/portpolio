package com.younghun.klom.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.board.dao.BoardDao;
import com.younghun.klom.board.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDao boardDao;
	
	@Override
	public List<BoardVo> boardList() {
		return boardDao.boardList();
	}
	
}
