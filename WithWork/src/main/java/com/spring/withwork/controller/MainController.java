package com.spring.withwork.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.withwork.service.MainService;
import com.spring.withwork.vo.CompanyVO;
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
	public int login(GuestVO guest, HttpSession session) {
		System.out.println("/login(), post 접근");
		int result = service.login(guest);
		
		if(result == 1) {
			session.setAttribute("id", guest.getId());
		}
		
		return result;
	}
	
	@PostMapping("loginSuccess.do")
	public String loginSuccess(GuestVO guest, HttpSession session) {
		System.out.println("/loginSuccess(), post 접근");
		guest = service.guestInfo(guest);
		session.setAttribute("g_name", guest.getG_name());
		return "main.jsp";
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

	@ResponseBody
	@PostMapping("/findId.do")
	public String findId(GuestVO guest, Model model) {
		System.out.println("/findId(), get 접근");
		System.out.println("guest : " + guest);
		
		String id = service.findId(guest);
		
		System.out.println("검색 결과 아이디 : " + id);
		return id;
	}
	
	@ResponseBody
	@PostMapping("/findPassword.do")
	public int findPassword(GuestVO guest, HttpSession session) {
		System.out.println("/findPassword(), post 접근");
		System.out.println("회원 정보 : " + guest);
		
		int result = service.chkId(guest);
		
		if(result > 0) {
			session.setAttribute("resultId", guest.getId());
			System.out.println("guest id : " + guest.getId());
		}
		
		System.out.println("결과값 result : " + result);
		return result;
	}
	
	@ResponseBody
	@PostMapping("/updatePassword.do")
	public int updatePassword(GuestVO guest) {
		System.out.println("/updatePassword(), post 접근");
		System.out.println("정보 : " + guest);
		int result = service.updatePwd(guest);
		System.out.println("result : " + result);
		return result;
	}
	
	@GetMapping("insertGroup.do")
	public String insertGroup() {
		return "group.jsp";
	}
	
	@PostMapping("insertGroup.do")
	public String insertGroup(CompanyVO company, GuestVO guest) {
		System.out.println("/insertGroup(), post 접근");
		System.out.println("company 정보 : " + company);
		System.out.println("guest 정보 : " + guest);
		int result = service.insertGroup(company, guest);
		return "todo.jsp";
	}
	
	@GetMapping("/myPage.do")
	public String myPage() {
		return "myPage.jsp";
	}
	
}
