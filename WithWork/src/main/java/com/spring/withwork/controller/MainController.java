package com.spring.withwork.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.withwork.service.MainService;
import com.spring.withwork.vo.GuestVO;

@Controller
@RequestMapping("/main")
public class MainController {
	
	@Autowired
	private MainService service;
	
	@GetMapping("/register")
	public void register() {
		
	}
	
	@PostMapping("/register")
	public String register(GuestVO guest, RedirectAttributes rattr) {
		System.out.println("/main/register(post)로 접근");
		System.out.println("GuestVO :  " + guest);
		service.register(guest);
		
		rattr.addFlashAttribute("result", guest.getId());
		
		return "redirect:/main/mainPage";
	}
	
	@GetMapping("/mainPage")
	public void mainPage() {
		
	}
	
	@GetMapping("/checkId")
	public void checkId(String id, RedirectAttributes rattr) {
		System.out.println("/main/checkId(get)로 접근");
		System.out.println("id : " + id);
		int result = service.checkId(id);
		
		if(result == 1) {
			rattr.addFlashAttribute("result", "success");
		}
		
		System.out.println("결과값 : " + result);
		
	}
	
	@GetMapping("/findId")
	public void findId(String email, String name, RedirectAttributes rattr) {
		System.out.println("/main/findId(get)접근");
		System.out.println("email : " + email + ", name : " + name);
		
		List<String> getIdList = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		map.put("email", email);
		map.put("name", name);
		getIdList = service.findId(map);
		
		System.out.println("검색 결과 아이디 : " + getIdList);
		if(getIdList != null ) {
			rattr.addFlashAttribute("result", "success");
		}
	}
	
	@GetMapping("/findPassword")
	public void findPassword(String id, String email, RedirectAttributes rattr) {
		System.out.println("/main/findPassword(get) 접근");
		System.out.println("id : " + id + ", name" + email);
		
		Map<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("email", email);
		
		int result = service.checkIdPwd(map);
		System.out.println("결과값 result : " + result);
		if(result == 1) {
			rattr.addFlashAttribute("result", "success");
			rattr.addFlashAttribute("id", id);
		}
	}
	
	@PostMapping("/findPassword")
	public String findPassword(String password, RedirectAttributes rattr) {
		System.out.println("/main/findPassword(post) 접근");
		boolean flag = false;
		if(password != null) {
			flag = true;
		}
		System.out.println("Password is not null? : " + flag);
		int result = service.updatePwd(password);
		
		if(result == 1) {
			rattr.addFlashAttribute("result", "success");
		}
		return "redirect:/main/mainPage";
	}
	
}
