package com.younghun.klom.model.user.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.user.dto.EditDto;
import com.younghun.klom.model.user.dto.LoginDto;
import com.younghun.klom.model.user.vo.UserVo;

@Repository
public class UserDaoImpl implements UserDao{
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE ="UserMapper.";
	
	@Override
	public void register(UserVo userVo) {
		sqlSession.insert(NAMESPACE + "Register",userVo);
	}
  
	@Override
	public Map<String, String> login(LoginDto loginDto) {
		return sqlSession.selectOne(NAMESPACE + "login",loginDto); 
	}

	@Override
	public EditDto editPrepare(int id) {
		return sqlSession.selectOne(NAMESPACE + "prepareEdit",id);
	}

	

}
