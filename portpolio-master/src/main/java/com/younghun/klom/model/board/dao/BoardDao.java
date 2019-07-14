package com.younghun.klom.model.board.dao;

import java.util.List;
import java.util.Map;

import com.younghun.klom.model.board.dto.DetailDto;
import com.younghun.klom.model.board.vo.BoardVo;

public interface BoardDao {
	// read
	List<BoardVo> boardList(); 
	DetailDto find(long no);
}
