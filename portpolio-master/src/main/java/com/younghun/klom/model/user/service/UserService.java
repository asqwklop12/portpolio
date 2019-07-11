package com.younghun.klom.model.user.service;

import java.util.Map;

import com.younghun.klom.model.user.dto.LoginDto;
import com.younghun.klom.model.user.vo.UserVo;

public interface UserService {
	
	void register (UserVo userVo);
	Map<String,String> login (LoginDto loginDto);
}
