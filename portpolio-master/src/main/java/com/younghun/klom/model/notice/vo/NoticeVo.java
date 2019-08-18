package com.younghun.klom.model.notice.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeVo {
	private int noticeId;
	private int boardId;
	private String userEmail;
	private String boardTitle;
}
