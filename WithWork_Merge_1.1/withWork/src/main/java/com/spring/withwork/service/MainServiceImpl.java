package com.spring.withwork.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.withwork.dao.MainDao;
import com.spring.withwork.vo.CompanyVO;
import com.spring.withwork.vo.DepartmentVO;
import com.spring.withwork.vo.GuestVO;
import com.spring.withwork.vo.MailUtils;
import com.spring.withwork.vo.MemberVO;
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
		mainDao.register(guest);
		
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
				.append("<a href='http://localhost:8080/biz/regiConfirm.do?Email=")
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
		mainDao.updateAuthStatus(guest);
	}

	@Override
	public int checkId(String email) {
		return mainDao.checkId(email);
	}
	
	@Override
	public String findId(GuestVO guest) {
		return mainDao.findId(guest);
	}
	
	@Override
	public int chkId(GuestVO guest) {
		return mainDao.chkId(guest);
	}
	
	@Override
	public int updatePwd(GuestVO guest) {
		return mainDao.updatePwd(guest);
	}
	
	// 1009수정 (최은서)
	@Override
	public String login(GuestVO guest) {
		int authStatus =  mainDao.login(guest);
		String g_name = "";
		
		if(authStatus == 1) {
			g_name = mainDao.guestInfo(guest).getG_name();
		}
		return g_name;
	}
	
	// 1009수정 (최은서)
	@Transactional
	@Override
	public String otherLogin(GuestVO guest) {
		String authStatus = "";
		String g_name = "";
		if(guest.getAuthStatus().equals("google")) {
			authStatus = mainDao.otherLogin(guest);
			//만약 구글 아이디로 DB에 입력이 안되어 있을 시(result값이 0 인 경우) DB에 insert
			if(authStatus == null) {
				mainDao.googleRegister(guest);
				authStatus = mainDao.otherLogin(guest);
			}
		} else if(guest.getAuthStatus().equals("kakao")) {
			authStatus = mainDao.otherLogin(guest);
			//만약 카카오 아이디로 DB에 입력이 안되어 있을 시(result값이 0 인 경우) DB에 insert
			if(authStatus == "") {
				mainDao.kakaoRegister(guest);
			}
		}
		if(authStatus.equals("google") || authStatus.equals("kakao")) {
			g_name = mainDao.guestInfo(guest).getG_name();
		}
		return g_name;
	}
	
	// 1009수정 (최은서)
	@Override
	public GuestVO guestInfo(GuestVO guest) {
		return mainDao.guestInfo(guest);
	}
	
	@Transactional
	@Override
	public int insertGroup(CompanyVO company) {
		System.out.println("service company : " + company);
		
		/**/
		
		mainDao.insertGroup(company);
		System.out.println("c_num : " + company.getC_num());
		
		/**/
		
		String[] roleArr = company.getRole().split(" ");
		System.out.println(roleArr.length);
		CompanyVO[] roleObjArr = new CompanyVO[roleArr.length-1];
		System.out.println(roleObjArr.length);
		
		for(int i = 1; i < roleArr.length; i++) {
			System.out.println((i) + " : " + roleArr[i]);
			roleObjArr[i-1] = new CompanyVO(company.getC_num(), roleArr[i], company.getG_num());
			System.out.println("roleObjArr" + (i-1) + " : " + roleObjArr[i-1]);
		}

		List<CompanyVO> roleList = new ArrayList<>();
		for(int i = 0; i < roleObjArr.length; i++) {
			roleList.add(roleObjArr[i]);
		}
		int result = mainDao.insertRoles(roleList);
		System.out.println("role result : " + result);
		
		
		/**/
		
		
		String[] deptArr = company.getDepartment().split(" ");
		System.out.println(deptArr.length);
		DepartmentVO[] deptObjArr = new DepartmentVO[deptArr.length-1];
		System.out.println(deptObjArr.length);

		for(int i = 1; i < deptArr.length; i++) {
			System.out.println((i) + " : " + deptArr[i]);
			deptObjArr[i-1] = new DepartmentVO(company.getC_num(), deptArr[i]);
			System.out.println("deptObjArr" + (i-1) + " : " + deptObjArr[i-1]);
		}
		
		List<DepartmentVO> deptList = new ArrayList<>();
		for(int i = 0; i < deptObjArr.length; i++) {
			deptList.add(deptObjArr[i]);
		}
		
		result = mainDao.insertDept(deptList);
		System.out.println("dept result : " + result);
		
		/**/
		MemberVO member = new MemberVO(company.getC_num(), company.getG_num(), "관리자");
		int memberResult = mainDao.insertMember(member);
		
		return memberResult;
	}
	
	@Override
	public int googleRegister(GuestVO guest) {
		return mainDao.googleRegister(guest);
	}
	
	@Override
	public int kakaoRegister(GuestVO guest) {
		return mainDao.kakaoRegister(guest);
	}
	
	@Override
	public int updateName(GuestVO guest) {
		return mainDao.updateName(guest);
	}
	
	@Override
	public int checkPwd(GuestVO guest) {
		return mainDao.checkPwd(guest);
	}
	
	@Override
	public void withdrawal(GuestVO guest) {
		mainDao.withdrawal(guest);
	}
	
	// 1009수정 (최은서)
	@Override
	public List<GuestVO> getProjectMe(GuestVO guest) {
		return mainDao.getProjectMe(guest);
	}
}