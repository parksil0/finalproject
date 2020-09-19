package com.spring.withwork.service;

import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.withwork.dao.MainDao;
import com.spring.withwork.vo.GuestVO;
import com.spring.withwork.vo.MailUtils;
import com.spring.withwork.vo.TempKey;

@Service
public class MainServiceImpl implements MainService{

	@Autowired
	private MainDao mainDao;
	
	// 인증 메일 보내기 위한 필드 변수 선언
	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	@Transactional
	public void register(GuestVO guest) throws Exception {
		System.out.println("MainServiceImpl.register() 실행");
		mainDao.insert(guest);
		
		// 임의의 authkey 생성
		String authkey = new TempKey().getKey(50, false);
		
		guest.setAuthKey(authkey);
		mainDao.updateAuthKey(guest);
		
		// mail 작성 관련 
		MailUtils sendMail = new MailUtils(mailSender);
		
		// mail 작성 관련 

		sendMail.setSubject("WithWork 회원가입 이메일 인증");
		sendMail.setText(new StringBuffer().append("<h1>[이메일 인증]</h1>")
				.append("<p>아래 링크를 클릭하시면 이메일 인증이 완료됩니다.</p>")
				.append("<a href='http://localhost:8070/regiConfirm.do?id=")
				.append(guest.getId())
				.append("&email=")
				.append(guest.getEmail())
				.append("&authkey=")
				.append(authkey)
				.append("' target='_blenk'>이메일 인증 확인</a>")
				.toString());
		sendMail.setFrom("WithWork", "WithWork");
		sendMail.setTo(guest.getEmail());
		sendMail.send();
	}
	
	@Override
	public void updateAuthStatus(GuestVO guest) {
		System.out.println("MainServiceImpl.updateAuthStatus() 실행");
		mainDao.updateAuthStatus(guest);
	}

	@Override
	public int checkId(String id) {
		System.out.println("MainServiceImpl.checkId() 실행");
		int result = mainDao.checkId(id);
		
		return result;
	}
	
	@Override
	public List<String> findId(Map map) {
		System.out.println("MainServiceImpl.findId() 실행");
		System.out.println("map : " + map);
		return mainDao.findId(map);
	}
	
	@Override
	public int checkIdPwd(Map map) {
		System.out.println("MainServiceImpl.checkIdPwd() 실행");
		System.out.println("map : " + map);
		return mainDao.checkIdPwd(map);
	}
	
	@Override
	public int updatePwd(String password) {
		System.out.println("MainServiceImpl.updatePwd() 실행");
		return mainDao.updatePwd(password);
	}
	
	@Override
	public int login(GuestVO guest) {
		System.out.println("MainServiceImpl.login() 실행");
		return mainDao.login(guest);
	}
}
