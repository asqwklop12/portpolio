package com.younghun.klom.model.user.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
// UserInfo
public class UserVo {
	private int id;
	private String image;			//UserImage
	private String email;   		//UserEmail
	private String name;			//UserName	
	private String password;		//UserPassword
	private String introduce;		//UserIntroduce
	private Date date;				//UserDate
}
