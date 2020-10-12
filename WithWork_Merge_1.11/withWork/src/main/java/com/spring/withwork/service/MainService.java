package com.spring.withwork.service;

import java.util.List;

import com.spring.withwork.vo.CompanyVO;
import com.spring.withwork.vo.GuestVO;

public interface MainService {

	public void register(GuestVO guest) throws Exception;

	// 1012수정 (박실)
	public int checkId(String email);

	public String findId(GuestVO guest);

	public int chkId(GuestVO guest);

	public int updatePwd(GuestVO guest);

	public void updateAuthStatus(GuestVO guest);

	public String otherLogin(GuestVO guest);
	
	// 1009수정 (최은서)
	public GuestVO guestInfo(GuestVO guest);

	// 1012수정 (박실)
	public int insertGroup(CompanyVO company);

	public int googleRegister(GuestVO guest);

	public int kakaoRegister(GuestVO guest);

	public int updateName(GuestVO guest);

	public int checkPwd(GuestVO guest);

	public void withdrawal(GuestVO guest);

	public String login(GuestVO guest);

	// 1009수정 (최은서)
	public List<GuestVO> getProjectMe(GuestVO guest);
	
}
