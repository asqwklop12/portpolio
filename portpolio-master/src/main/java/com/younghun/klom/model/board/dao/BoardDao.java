package com.younghun.klom.model.board.dao;

import java.util.List;

import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.user.vo.UserVo;

public interface BoardDao {
	
	//create
	void create(BoardVo boardVo);
	
	// read
	List<BoardVo> list(int display, int post); 
	BoardVo find(long no);
	
	
	//update
	void update(BoardVo boardVo);
	
	
	// delete
	void clear(long no);
	
	
}
