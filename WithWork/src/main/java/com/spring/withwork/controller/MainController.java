package com.spring.withwork.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	
	@GetMapping("/join.do")
	public String join() {
		return "join.jsp";
	}
	
	@GetMapping("/register.do")
	public String register() {
		return "signup.jsp";
	}
	
	@ResponseBody
	@PostMapping("/login.do")
	public int login(GuestVO guest, HttpServletRequest request) {
		System.out.println("/login(), get 접근");
		int result = service.login(guest);
		
		HttpSession session = request.getSession();
		
		if(result == 1) {
			session.setAttribute("id", guest.getId());
		}
		
		return result;
	}
	
	@GetMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("/logout(), get접근");
		System.out.println("session값 초기화, 로그아웃");
		session.invalidate();
		return "main.jsp";
	}
	
	@PostMapping("/register.do")
	public String register(GuestVO guest, Model model) throws Exception {
		System.out.println("/register(), post 접근");
		System.out.println("GuestVO :  " + guest);
		service.register(guest);
		
		model.addAttribute("regResult", 2);
		return "main.jsp";
	}
	
	@GetMapping("/regiConfirm.do")
	public String emailConfirm(@ModelAttribute("guest")GuestVO guest, Model model) {
		System.out.println("email " + guest.getEmail() + " : auto confirmed");
		guest.setAuthStatus(1);
		service.updateAuthStatus(guest);
		System.out.println("전달받은 guest 값 : " + guest);
		
		model.addAttribute("regResult", 1);
		return "main.jsp";
	}
	
	@GetMapping("/main.do")
	public String main() {
		return "main.jsp";
	}
	
	@ResponseBody
	@GetMapping(value = "/checkId.do")
	public int checkId(@RequestParam("id")String id) {
		System.out.println("/checkId(), get 접근");
		System.out.println("id : " + id);
		int result = service.checkId(id);
		
		System.out.println("결과값 : " + result);
		return result;
	}

	
	@GetMapping("/findId.do")
	public void findId(String email, String name, RedirectAttributes rattr) {
		System.out.println("/findId(), get 접근");
		System.out.println("email : " + email + ", name : " + name);
		
		List<String> getIdList = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		map.put("email", email);
		map.put("name", name);
		getIdList = service.findId(map);
		
		System.out.println("검색 결과 아이디 : " + getIdList);

	}
	
	@GetMapping("/findPassword.do")
	public void findPassword(String id, String email, RedirectAttributes rattr) {
		System.out.println("/findPassword(), get 접근");
		System.out.println("id : " + id + ", name" + email);
		
		Map<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("email", email);
		
		int result = service.checkIdPwd(map);
		System.out.println("결과값 result : " + result);
		
	}
	
	@PostMapping("/findPassword.do")
	public String findPassword(String password, RedirectAttributes rattr) {
		System.out.println("/findPassword(), post 접근");
		boolean flag = false;
		if(password != null) {
			flag = true;
		}
		System.out.println("Password is not null? : " + flag);
		int result = service.updatePwd(password);
		
		return "redirect:/main/mainPage";
	}
	
}
