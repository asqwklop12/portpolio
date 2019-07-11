package com.younghun.klom.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.dto.UserDto;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE ="UserMapper.";
	
	@Override
	public void register(UserDto userDto) {
	
		sqlSession.insert(NAMESPACE + "Register",userDto);
		
	}


}