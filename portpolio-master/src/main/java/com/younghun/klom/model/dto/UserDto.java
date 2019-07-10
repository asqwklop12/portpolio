package com.younghun.klom.model.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
	private String image;
	private String email;
	private String name;
	private String password;
	private String introduce;
	private Date date;
}
