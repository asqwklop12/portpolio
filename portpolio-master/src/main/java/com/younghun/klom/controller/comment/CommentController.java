package com.younghun.klom.controller.comment;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.younghun.klom.model.comment.service.CommentService;
import com.younghun.klom.model.comment.vo.CommentVo;
import com.younghun.klom.model.user.vo.UserVo;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public void insert(@RequestParam int bno, @RequestParam String content,HttpSession session) {
		
		UserVo userVo = (UserVo) session.getAttribute("data");
		commentService.insert(bno, userVo.getEmail(), userVo.getName(), userVo.getImage(), content);
		
	}
	

	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody  
	public List<CommentVo> list (@RequestParam int bno) {
		return commentService.list(bno);
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	@ResponseBody
	public void remove(@RequestParam String email) {
		
		commentService.delete(email);
	}
}
