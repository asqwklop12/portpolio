package com.younghun.klom.model.user.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
// UserInfo
public class UserVo {
	private String image;			//profileImage
	private String email;   		//UserEmail(p)
	private String name;			//UserName	
	private String password;		//UserPassword
	private String introduce;		//UserIntroduce
	private String authorization;	//userAuthoration
	private Date date;				//UserDate
	private String grade;
	
	private String key;
}