package com.younghun.klom.model.board.dao;

import java.util.List;

import com.younghun.klom.model.board.vo.BoardVo;

public interface BoardDao {
	int countId ();
	// 작성
	void insert(BoardVo boardVo);
	
	
	// 읽기
	BoardVo read(BoardVo boardVo);
	List<BoardVo> list();
	
	void view(BoardVo boardVo);
	
	// 수정
	void update(BoardVo boardVo);
	
	// 삭제
	void delete(BoardVo boardVo);
	
	// 번호감소
	void decrease(int boardId);
}
