package com.younghun.klom.model.board.service;

import java.util.List;

import com.younghun.klom.model.board.vo.BoardVo;

public interface BoardService {
	// 작성
	void insert(BoardVo boardVo);
	
	// 전체 읽기
	List<BoardVo> list();
	
	// 하나만 읽기
	BoardVo read(int boardId);
	// 수정
	void update(BoardVo boardVo);
	
	
	// 삭제
	void delete(String email, int id);
}
