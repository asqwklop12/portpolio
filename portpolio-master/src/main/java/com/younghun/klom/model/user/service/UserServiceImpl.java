package com.younghun.klom.model.user.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.Encryption;
import com.younghun.klom.model.user.dao.UserDao;
import com.younghun.klom.model.user.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	public Encryption encryption;
		
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void register(UserVo userVo) {
		logger.info("start");
		
		userVo.setPassword(encryption.encrypt(userVo.getPassword()));
		userDao.register(userVo);

		logger.debug("{}", encryption.encrypt(userVo.getPassword()));
		
	}

	@Override
	public Map<String, String> login(UserVo userVo) {

		Map<String, String> data = userDao.login(userVo);

		logger.debug("{} and {}", userVo.getPassword(),data.get("password"));
		
		
		//TODO 수정 필요 현재 이메일만 입력해도 로그인되는 현상이 있음
		if (encryption.matches(userVo.getPassword(), data.get("password"))) {
			
			return data;
		}
		
		return data;
	}

	@Override
	public void edit(UserVo userVo) {
		logger.debug("{} enter..into",userVo);
		userVo.setPassword(encryption.encrypt(userVo.getPassword()));
		userDao.edit(userVo);
		
	}

	@Override
	public void delete(UserVo userVo) {
		userDao.delete(userVo);
	
	}

	

}
  