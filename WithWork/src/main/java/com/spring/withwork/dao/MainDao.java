package com.spring.withwork.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.withwork.vo.CompanyVO;
import com.spring.withwork.vo.GuestVO;

@Repository
public class MainDao {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void register(GuestVO guest) {
		System.out.println("MainDao.insert() 실행");
		mybatis.insert("MainMapper.register", guest);
	}

	public int checkId(String id) {
		System.out.println("MainDao.checkId() 실행");
		return mybatis.selectOne("MainMapper.checkId", id);
	}

	public String findId(GuestVO guest) {
		System.out.println("MainDao.findId() 실행");
		System.out.println("guest : " + guest);
		String id = mybatis.selectOne("MainMapper.findId", guest);
		return id;
	}

	public int chkId(GuestVO guest) {
		System.out.println("MainDao.chkId() 실행");
		System.out.println("guest : " + guest);
		int result = mybatis.selectOne("MainMapper.chkId", guest);
		return result;
	}

	public int updatePwd(GuestVO guest) {
		System.out.println("MainDao.updatePwd() 실행");
		return mybatis.update("MainMapper.updatePwd", guest);
	}

	public void updateAuthKey(GuestVO guest) {
		System.out.println("MainDao.updateAuthKey() 실행");
		mybatis.update("MainMapper.updateAuthKey", guest);
		
	}

	public void updateAuthStatus(GuestVO guest) {
		System.out.println("MainDao.updateAuthStatus() 실행");
		mybatis.update("MainMapper.updateAuthStatus", guest);
	}

	public int login(GuestVO guest) {
		System.out.println("MainDao.login() 실행");
		return mybatis.selectOne("MainMapper.login", guest);
	}

	public GuestVO guestInfo(GuestVO guest) {
		System.out.println("MainDao.guestInfo() 실행");
		System.out.println("guest 정보 : " + guest);
		return mybatis.selectOne("MainMapper.guestInfo", guest);
	}

	public int insertGroup(CompanyVO company, GuestVO guest) {
		System.out.println("MainDao.insertGroup() 실행");
		Map<String, String> map = new HashMap<>();
		map.put("name", company.getName());
		map.put("subject", company.getSubject());
		map.put("id", guest.getId());
		System.out.println("map : " + map);
		return mybatis.insert("MainMapper.insertGroup", map);
	}

	public int googleLogin(GuestVO guest) {
		System.out.println("MainDao.googleLogin() 실행");
		return mybatis.selectOne("MainMapper.googleLogin", guest);
	}

	public int googleRegister(GuestVO guest) {
		System.out.println("MainDao.googleRegister() 실행");
		return mybatis.insert("MainMapper.googleRegister", guest);
	}
}
