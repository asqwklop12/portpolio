package com.younghun.klom.dao.user.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.younghun.klom.dto.UserVo;

public class LoginMapper implements RowMapper<UserVo> {

	@Override
	public UserVo mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserVo user = new UserVo();
		user.setId(rs.getInt("USER_ID"));
		user.setEmail(rs.getString("USER_EMAIL"));
		user.setPassword(rs.getString("USER_PASSWORD"));
		return user;
	}

}
