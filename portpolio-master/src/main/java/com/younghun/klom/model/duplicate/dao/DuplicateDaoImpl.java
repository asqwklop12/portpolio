package com.younghun.klom.model.duplicate.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.duplicate.dto.DuplicateDto;

@Repository
public class DuplicateDaoImpl implements DuplicateDao{

	@Autowired
	private SqlSession session;
	
	private static final String NAMESPACE ="duplicateMapper.";
	  
	@Override
	public int nameCheck(DuplicateDto duplicateDto) {
		return session.selectOne(NAMESPACE + "nickname",duplicateDto);
	}

}
