package com.spring.withwork.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.withwork.service.MainService;
import com.spring.withwork.vo.GuestVO;

@Controller
public class MainController {
	
	@Autowired
	private MainService service;
	
	@GetMapping("/register.do")
	public String register() {
		return "signup.jsp";
	}
	
	@PostMapping("/register.do")
	public String register(GuestVO guest, RedirectAttributes rattr) throws Exception {
		System.out.println("/main/register(post)로 접근");
		System.out.println("GuestVO :  " + guest);
		service.register(guest);
		
		rattr.addFlashAttribute("result", guest.getId());
		
		return "main.jsp";
	}
	
	@GetMapping("/regiConfirm.do")
	public String emailConfirm(@ModelAttribute("guest")GuestVO guest, Model model) {
		System.out.println("email " + guest.getEmail() + " : auto confirmed");
		guest.setAuthStatus(1);
		service.updateAuthStatus(guest);
		
		model.addAttribute("auto_check", 1);
		
		return "main.jsp";
	}
	
	@GetMapping("/main.do")
	public String main() {
		return "main.jsp";
	}
	
	@ResponseBody
	@GetMapping(value = "/checkId.do")
	public int checkId(@RequestParam("id")String id, RedirectAttributes rattr) {
		System.out.println("/main/checkId(get)로 접근");
		System.out.println("id : " + id);
		int result = service.checkId(id);
		
		if(result < 1) {
			rattr.addFlashAttribute("result", "success");
		}
		
		System.out.println("결과값 : " + result);
		return result;
	}
	/*
	@PostMapping("regPost")
	public String regPost(@ModelAttribute("guest")GuestVO guest) {
		System.out.println("현재 ");
	}
	*/
	@GetMapping("/findId.do")
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
	
	@GetMapping("/findPassword.do")
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
	
	@PostMapping("/findPassword.do")
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
