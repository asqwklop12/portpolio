package com.younghun.klom.user.service;

import java.util.Map;

import com.younghun.klom.user.dto.LoginDto;
import com.younghun.klom.user.vo.UserVo;

public interface UserService {
	
	void register (UserVo userVo);
	Map<String,String> login (LoginDto loginDto);
}
