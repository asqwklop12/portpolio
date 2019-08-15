package com.younghun.klom.model.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.board.dao.BoardDao;
import com.younghun.klom.model.board.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	@Override
	public void insert(BoardVo boardVo) {
		
		try {
		    boardVo.setBoardId(boardDao.countId() + 1);
		}catch (NullPointerException e) {
			boardVo.setBoardId(1);
		
		}
		
		boardDao.insert(boardVo);
	}

	@Override
	public List<BoardVo> list() {
		return boardDao.list();
	}
	
	@Override
	public void view(String email, int boardId) {
		BoardVo boardVo = new BoardVo();
		boardVo.setBoardId(boardId);
		boardVo.setUserEmail(email);
		boardDao.view(boardVo);
		
	}

	@Override
	public BoardVo read(int boardId) {
		BoardVo boardVo = new BoardVo();
		boardVo.setBoardId(boardId);
		return boardDao.read(boardVo);
	}

	@Override
	public void update(BoardVo boardVo) {
		boardDao.update(boardVo);
	}
	
	

	@Override
	public void delete(String email, int id) {
		
		BoardVo boardVo = new BoardVo();
		boardVo.setBoardId(id);
		boardVo.setUserEmail(email);
		boardDao.delete(boardVo);
		
		for (int i = id; i < boardDao.countId() + 1; i++) {
			boardDao.decrease(i);	
		}
	}

	

	

}
