package com.younghun.klom.model.like.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class LikeVo {
 private int likeId;
 private int boardId;
 private String userEmail;
 private int boardLike;
}
