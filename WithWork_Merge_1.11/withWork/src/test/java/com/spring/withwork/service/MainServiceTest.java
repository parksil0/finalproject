package com.spring.withwork.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.withwork.vo.CompanyVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/applicationContext.xml")
public class MainServiceTest {
	
	@Autowired
	MainService service;
	
	@Test
	public void insertGroup() {
		CompanyVO company = new CompanyVO();
		company.setName("그룹이름");
		company.setSubject("그룹주제");
		company.setG_num(30);
		company.setRole(" 관리자 직원 전무 사장");
		company.setDepartment(" 디자인 경영 IT");
		
		service.insertGroup(company);
	}

}
