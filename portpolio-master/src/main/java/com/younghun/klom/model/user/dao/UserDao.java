package com.younghun.klom.model.user.dao;

import java.util.Map;

import com.younghun.klom.model.user.dto.EditDto;
import com.younghun.klom.model.user.dto.LoginDto;
import com.younghun.klom.model.user.vo.UserVo;

public interface UserDao {
	void register (UserVo userVo);
	Map<String,String> login (LoginDto loginDto);
	void edit (EditDto editDto);

	
 }
