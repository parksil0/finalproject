package com.spring.withwork.service;

import com.spring.withwork.vo.CompanyVO;
import com.spring.withwork.vo.GuestVO;

public interface MainService {

	public void register(GuestVO guest) throws Exception;

	public int checkId(String id);

	public String findId(GuestVO guest);

	public int chkId(GuestVO guest);

	public int updatePwd(GuestVO guest);

	public void updateAuthStatus(GuestVO guest);

	public String otherLogin(GuestVO guest);

	public String guestInfo(GuestVO guest);

	public int insertGroup(CompanyVO company, GuestVO guest);

	public int googleRegister(GuestVO guest);

	public int kakaoRegister(GuestVO guest);

	public int updateName(GuestVO guest);

	public int checkPwd(GuestVO guest);

	public void withdrawal(GuestVO guest);

	public String login(GuestVO guest);
	
}
