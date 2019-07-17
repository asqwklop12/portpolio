package com.younghun.klom.model.board.dao;

import java.util.List;

import com.younghun.klom.model.board.vo.BoardVo;
import com.younghun.klom.model.user.vo.UserVo;

public interface BoardDao {
	
	//create
	void create(BoardVo boardVo);
	
	
	// read
	List<BoardVo> boardList(); 
	BoardVo find(long no);
	
	
}
