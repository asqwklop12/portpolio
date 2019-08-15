package com.younghun.klom.model.comment.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentVo {
	 private int commentId;
	 private int boardId;
	 private String userEmail;
	 private String commentWriter;
	 private String commentProfile;
	 private String commentContent;	 
}
