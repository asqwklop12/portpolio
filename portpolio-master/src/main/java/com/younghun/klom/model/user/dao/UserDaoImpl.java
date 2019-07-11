package com.younghun.klom.model.user.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.user.dto.LoginDto;
import com.younghun.klom.model.user.vo.UserVo;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE ="UserMapper.";
	
	@Override
	public void register(UserVo userVo) {
		sqlSession.insert(NAMESPACE + "Register",userVo);
	}
  
	@Override
	public Map<String, String> login(LoginDto loginDto) {
//		System.out.println(loginDto.getPassword()); 
		return sqlSession.selectOne(NAMESPACE + "login",loginDto); 
	}

}
