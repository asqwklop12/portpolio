package com.younghun.klom.model.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.board.dao.BoardListDao;
import com.younghun.klom.model.board.vo.BoardListVo;

@Service
public class BoardListServiceImpl implements BoardListService {

	
	@Autowired
	private  BoardListDao boardListDao;
	
	@Override
	public List<BoardListVo> boardList() {
		return boardListDao.boardList();
	}

}
