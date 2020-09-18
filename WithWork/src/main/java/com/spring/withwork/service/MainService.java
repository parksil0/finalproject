package com.spring.withwork.service;

import java.util.List;
import java.util.Map;

import com.spring.withwork.vo.GuestVO;

public interface MainService {

	public void register(GuestVO guest);

	public int checkId(String id);

	public List<String> findId(Map map);

	public int checkIdPwd(Map map);

	public int updatePwd(String password);
	
}
