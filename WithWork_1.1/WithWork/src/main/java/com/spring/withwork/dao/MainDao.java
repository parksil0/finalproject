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
		mybatis.insert("MainMapper.register", guest);
	}

	public int checkId(String id) {
		return mybatis.selectOne("MainMapper.checkId", id);
	}

	public String findId(GuestVO guest) {
		return mybatis.selectOne("MainMapper.findId", guest);
	}

	public int chkId(GuestVO guest) {
		return mybatis.selectOne("MainMapper.chkId", guest);
	}

	public int updatePwd(GuestVO guest) {
		return mybatis.update("MainMapper.updatePwd", guest);
	}

	public void updateAuthKey(GuestVO guest) {
		mybatis.update("MainMapper.updateAuthKey", guest);
		
	}

	public void updateAuthStatus(GuestVO guest) {
		mybatis.update("MainMapper.updateAuthStatus", guest);
	}

	public String login(GuestVO guest) {
		return mybatis.selectOne("MainMapper.login", guest);
	}

	public String guestInfo(GuestVO guest) {
		return mybatis.selectOne("MainMapper.guestInfo", guest);
	}

	public int insertGroup(CompanyVO company, GuestVO guest) {
		Map<String, String> map = new HashMap<>();
		map.put("name", company.getName());
		map.put("subject", company.getSubject());
		map.put("id", guest.getId());
		return mybatis.insert("MainMapper.insertGroup", map);
	}

	public String otherLogin(GuestVO guest) {
		return mybatis.selectOne("MainMapper.otherLogin", guest);
	}

	public int googleRegister(GuestVO guest) {
		return mybatis.insert("MainMapper.googleRegister", guest);
	}

	public int kakaoRegister(GuestVO guest) {
		return mybatis.insert("MainMapper.kakaoRegister", guest);
	}

	public int updateName(GuestVO guest) {
		return mybatis.update("MainMapper.updateName", guest);
	}

	public int checkPwd(GuestVO guest) {
		return mybatis.selectOne("MainMapper.checkPwd", guest);
	}

	public void withdrawal(GuestVO guest) {
		mybatis.update("MainMapper.withdrawal", guest);
	}
}
