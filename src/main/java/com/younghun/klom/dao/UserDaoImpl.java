package com.younghun.klom.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.younghun.klom.dao.user.mapper.LoginMapper;
import com.younghun.klom.dto.UserVo;

public class UserDaoImpl implements UserDao{
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<UserVo> userList() {
		return this.jdbcTemplate.query("SELECT USER_ID, "
				+ "                                         USER_EMAIL, "
				+ "                                         USER_PASSWORD FROM user_box;", new LoginMapper());
	}

}
