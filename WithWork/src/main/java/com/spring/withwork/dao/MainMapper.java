package com.spring.withwork.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.withwork.vo.GuestVO;

@Repository
public class MainMapper {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insert(GuestVO guest) {
		System.out.println("MainMapper.insert() 실행");
		mybatis.insert("MainMapper.insert", guest);
	}
}
