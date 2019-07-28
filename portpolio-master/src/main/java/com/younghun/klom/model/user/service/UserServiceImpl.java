package com.younghun.klom.model.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younghun.klom.model.Encryption;
import com.younghun.klom.model.user.dao.UserDao;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	public Encryption encryption;
		

	@Override
	public void register(UserVo userVo) {
		log.info("start");

		userVo.setPassword(encryption.encrypt(userVo.getPassword()));
		userDao.register(userVo);

		log.debug("{}", encryption.encrypt(userVo.getPassword()));
		
	}

	@Override
	public UserVo login(UserVo userVo) {

		UserVo data = userDao.login(userVo);

//		log.debug("{} and {}", userVo.getPassword(),data.getPassword());
		
		userVo.setPassword(encryption.encrypt(userVo.getPassword()));
		
		//TODO 수정 필요 현재 이메일만 입력해도 로그인되는 현상이 있음
//		if (encryption.matches(userVo.getPassword(), data.getPassword())) {
//			
//			return data;
//		}
		
		return data;
	}

	@Override
	public void edit(UserVo userVo) {
		log.debug("{} enter..into",userVo);
		userVo.setPassword(encryption.encrypt(userVo.getPassword()));
		userDao.edit(userVo);
		
	}

	@Override
	public void delete(UserVo userVo) {
		userDao.delete(userVo);
	
	}


}
  