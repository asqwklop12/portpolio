package com.younghun.klom.model.user.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserVo {
	private String image;
	private String email;
	private String name;
	private String password;
	private String introduce;
	private Date date;
}
