package com.spring.withwork.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	// 1009수정 (최은서)
	@ResponseBody
	@PostMapping("/login.do")
	public int login(GuestVO guest, HttpSession session) {
		int result = 0;
		String g_name = service.login(guest);
		GuestVO loginGuest = service.guestInfo(guest);
		
		if(g_name != "") {
			result = 1;
			session.setAttribute("id", guest.getId());
			session.setAttribute("authstatus", "withwork");
			session.setAttribute("g_name", g_name);
			session.setAttribute("guest", loginGuest);
		}
		return result;
	}
	
	// 1009수정 (최은서)
	@ResponseBody
	@PostMapping("/otherLogin.do")
	public String otherLogin(GuestVO guest, HttpSession session) {
		String result = "";
		String g_name = service.otherLogin(guest);
		GuestVO loginGuest = service.guestInfo(guest);
		
		
		if(g_name != "") {
			session.setAttribute("id", guest.getId());
			session.setAttribute("authstatus", "google");
			session.setAttribute("g_name", g_name);
			session.setAttribute("guest", loginGuest);
			
			result = "success";
		} else {
			result = "fail";
		}
		return result;
	}

	@GetMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "main.do";
	}
	
	@PostMapping("/register.do")
	public String register(GuestVO guest, Model model) throws Exception {
		service.register(guest);
		
		model.addAttribute("regResult", 2);
		return "main.jsp";
	}
	
	@GetMapping("/regiConfirm.do")
	public String emailConfirm(@ModelAttribute("guest")GuestVO guest, Model model) {
		guest.setAuthStatus("withwork");
		service.updateAuthStatus(guest);
		
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
		return service.checkId(id);
	}

	@ResponseBody
	@PostMapping("/findId.do")
	public String findId(GuestVO guest, Model model) {
		return service.findId(guest);
	}
	
	@ResponseBody
	@PostMapping("/findPassword.do")
	public int findPassword(GuestVO guest, HttpSession session) {
		int result = service.chkId(guest);
		
		if(result > 0) {
			session.setAttribute("resultId", guest.getId());
		}
		return result;
	}
	
	@ResponseBody
	@PostMapping("/updatePassword.do")
	public int updatePassword(GuestVO guest) {
		return service.updatePwd(guest);
	}
	
	@GetMapping("/insertGroup.do")
	public String insertGroup() {
		return "group.jsp";
	}
	
	@PostMapping("/insertGroup.do")
	public String insertGroup(CompanyVO company, GuestVO guest) {
		service.insertGroup(company, guest);
		return "todo.jsp";
	}
	
	@GetMapping("/myPage.do")
	public String myPage() {
		return "myPage.jsp";
	}
	
	@PostMapping("/updateName.do")
	public String updateName(GuestVO guest) {
		service.updateName(guest);
		return "myPage.jsp";
	}
	
	@ResponseBody
	@PostMapping("/checkPwd.do")
	public int checkPwd(GuestVO guest) {
		return service.checkPwd(guest);
	}
	
	@PostMapping("/withdrawal.do")
	public String withdrawal(GuestVO guest, HttpSession session) {
		service.withdrawal(guest);
		session.setAttribute("authstatus", "withdrawal");
		return "main.jsp";
	}
	
	@RequestMapping("/getProjectMe.do")
	@ResponseBody
	public List<GuestVO> getProjectMe(GuestVO guest) {
		return service.getProjectMe(guest);
	}
	
}