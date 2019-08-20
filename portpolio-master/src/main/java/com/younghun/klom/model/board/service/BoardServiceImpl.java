package com.younghun.klom.model.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.board.dao.BoardDao;
import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.page.vo.PageVo;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	@Override
	public void insert(BoardVo boardVo) {
		boardDao.insert(boardVo);
	}

	@Override
	public List<BoardVo> list(int display, int post) {
		PageVo pageVo = new PageVo();
		pageVo.setDisplay(display);
		pageVo.setPost(post);
		return boardDao.list(pageVo);
	}

	@Override
	public BoardVo read(int boardId) {
		BoardVo boardVo = new BoardVo();
		boardVo.setBoardId(boardId);
		boardDao.view(boardId);
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
		boardDao.comment(id);
		boardDao.delete(boardVo);
		

	}
	
	

}
