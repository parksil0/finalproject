package com.spring.withwork.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
// test for controller
@WebAppConfiguration
@ContextConfiguration({"file:src/main/resources/applicationContext.xml",
"file:src/main/webapp/WEB-INF/config/presentation-layer.xml"})
public class MainControllerTests {
	
	@Autowired
	private WebApplicationContext ctx;

	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	
	/*
	 * 회원가입이 정상작동하는지에 대한 테스트
	 * 
	@Test
	public void testRegister() throws Exception {
		
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/main/register")
				.param("id", "test_ID")
				.param("password", "test_PWD")
				.param("g_name", "test_NAME")
				.param("address", "test_ADDR")
				.param("email", "test_EMAIL")
				.param("phone", "test_PHONE")
				).andReturn().getModelAndView().getViewName();
		
		System.out.println("테스트 insert 결과 resultPage : " + resultPage);
	}
	*/
	
	/*
	 * 회원가입 시 아이디 중복을 방지하기 위한 테스트
	 * 
	@Test
	public void testCheckId() throws Exception {
		System.out.println(mockMvc.perform(MockMvcRequestBuilders
				.get("/main/checkId")
				.param("id", "test_ID"))
				.andReturn().getModelAndView().getModelMap());
	}
	*/
	
	/*
	 * 아이디 찾기
	 * 
	@Test
	public void testFindId() throws Exception {
		System.out.println(mockMvc.perform(MockMvcRequestBuilders.get("/main/findId")
				.param("name", "test")
				.param("email", "test@test.com"))
				.andReturn().getModelAndView().getModelMap());
	}
	*/
	
	@Test
	public void testCheckIdPwd() throws Exception {
		System.out.println(mockMvc.perform(MockMvcRequestBuilders.get("/main/findPassword")
				.param("id", "test")
				.param("email", "test@test.com"))
				.andReturn().getModelAndView().getModelMap());
	}
}
