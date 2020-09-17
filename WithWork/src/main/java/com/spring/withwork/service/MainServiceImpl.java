package com.spring.withwork.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.withwork.dao.MainMapper;
import com.spring.withwork.vo.GuestVO;

@Service
public class MainServiceImpl implements MainService{

	@Autowired
	private MainMapper mapper;
	
	@Override
	public void register(GuestVO guest) {
		System.out.println("MainServiceImpl.register() 실행");
		mapper.insert(guest);
	}
}
