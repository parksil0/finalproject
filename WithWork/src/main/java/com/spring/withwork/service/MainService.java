package com.spring.withwork.service;

import java.util.List;
import java.util.Map;

import com.spring.withwork.vo.GuestVO;

public interface MainService {

	public void register(GuestVO guest) throws Exception;

	public int checkId(String id);

	public List<String> findId(Map map);

	public int chkId(GuestVO guest);

	public int updatePwd(GuestVO guest);

	public void updateAuthStatus(GuestVO guest);

	public int login(GuestVO guest);

	public GuestVO guestInfo(GuestVO guest);
	
}
