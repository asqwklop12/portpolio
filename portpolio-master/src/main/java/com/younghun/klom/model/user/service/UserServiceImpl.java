package com.younghun.klom.model.user.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.younghun.klom.model.user.MailUtils;
import com.younghun.klom.model.user.TempKey;
import com.younghun.klom.model.user.dao.UserDao;
import com.younghun.klom.model.user.vo.AuthorizationVo;
import com.younghun.klom.model.user.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	public PasswordEncoder passwordEncoder;

	@Autowired
	private JavaMailSender mailSender;

	@Override
	@Transactional
	public void register(UserVo userVo) throws Exception {
		log.info("start");
		
		userVo.setPassword(passwordEncoder.encode(userVo.getPassword()));
		userDao.register(userVo);
		// 인증 보내기 메서드
		String authKey = new TempKey().getKey(50, false);
		userVo.setAuthorization(authKey);
		
		AuthorizationVo authorizationVo = new AuthorizationVo();
		authorizationVo.setEmail(userVo.getEmail());
		authorizationVo.setKey(authKey);
		userDao.getKey(authorizationVo);
		  
		MailUtils sendMail = new MailUtils(mailSender);		
		sendMail.setSubject("회원가입 인증메일!!");
		sendMail.setText(new StringBuffer().append("<h1>이메일 인증</h1>")
				       .append("<p>아래 링크를 클릭하시면 이메일 인증이 완료됩니다.</p>")
				       .append("<a href='http://localhost:8080/check?uid=")
				       .append(userVo.getName())
				       .append("&email=")  
				       .append(userVo.getEmail())
				       .append("&authKey=")
				       .append(authKey)
				       .append(" ' target='_blenk'>이메일 인증 확인</a>")
				       .toString());
		sendMail.setFrom("divdragon93@gmail.com", "관리자");
		sendMail.setTo(userVo.getEmail());
		sendMail.send();

		log.debug("{}", passwordEncoder.encode(userVo.getPassword()));
  
	}
	
	@Override
	@Transactional
	public void searchPassword(String email) throws MessagingException, UnsupportedEncodingException {
		String authKey = new TempKey().getKey(10, false);	
		MailUtils sendMail = new MailUtils(mailSender);		
		sendMail.setSubject("임시 비밀번호입니다.");
		sendMail.setText(new StringBuffer().append("<h1>비밀번호 찾기</h1>")
				       .append("<p>임시번호를 발송합니다.</p>")
				       .append(authKey)
				       .toString());
		sendMail.setFrom("divdragon93@gmail.com", "관리자");
		sendMail.setTo(email);
		sendMail.send();
		
		UserVo userVo = new UserVo();
		userVo.setEmail(email);
		userVo.setPassword(passwordEncoder.encode(authKey));
		userDao.edit2(userVo);
	}

	@Override
	public UserVo login(UserVo userVo) {
		UserVo login = userDao.login(userVo);
		log.debug("{}", login.getAuthorization());

		return login;
	}
	
	@Override
	public void yesAuth(String email,String key) {
		AuthorizationVo vo = new AuthorizationVo();
		vo.setEmail(email);
		vo.setKey(key);
		userDao.yesAuth(vo);
	}

	@Override
	public void edit(UserVo userVo) {
		log.debug("{} enter..into", userVo);
		userDao.edit(userVo);

	}

	@Override
	public void edit2(UserVo userVo) {
		userVo.setPassword(passwordEncoder.encode(userVo.getPassword()));
		userDao.edit2(userVo);
	}

	@Override
	public void delete(UserVo userVo) {
		userDao.delete(userVo);

	}

	@Override
	public boolean match(String row, String encode) {
		return passwordEncoder.matches(row, encode);
	}

	@Override
	public UserVo authorization(String email) {
		UserVo userVo = new UserVo();
		userVo.setEmail(email);
		return userDao.authorization(userVo);
	}

	

	

}
