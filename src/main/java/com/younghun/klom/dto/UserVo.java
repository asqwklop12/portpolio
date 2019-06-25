package com.younghun.klom.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserVo {
	private int id;
	private String profile;
	private String email;
	private String name;
	private String password;
	private String grade;
}