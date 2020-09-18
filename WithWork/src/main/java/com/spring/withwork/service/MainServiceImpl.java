package com.spring.withwork.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.withwork.dao.MainDao;
import com.spring.withwork.vo.GuestVO;

@Service
public class MainServiceImpl implements MainService{

	@Autowired
	private MainDao mainDao;
	
	@Override
	public void register(GuestVO guest) {
		System.out.println("MainServiceImpl.register() 실행");
		mainDao.insert(guest);
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
}
