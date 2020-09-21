package com.spring.withwork.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.withwork.vo.GuestVO;

@Repository
public class MainDao {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insert(GuestVO guest) {
		System.out.println("MainDao.insert() 실행");
		mybatis.insert("MainMapper.insert", guest);
	}

	public int checkId(String id) {
		System.out.println("MainDao.checkId() 실행");
		return mybatis.selectOne("MainMapper.checkId", id);
	}

	public List<String> findId(Map map) {
		System.out.println("MainDao.findId() 실행");
		System.out.println("map : " + map);
		List<String> list = mybatis.selectList("MainMapper.findId", map);
		System.out.println("MAINDAO List : " + list);
		return list;
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
		return mybatis.selectOne("MainMapper.guestInfo", guest);
	}
}
