package com.spring.withwork.controller;

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
		System.out.println("main/register(post)로 접근");
		System.out.println("GuestVO :  " + guest);
		service.register(guest);
		
		
		rattr.addFlashAttribute("result", guest.getId());
		
		return "redirect:/main/mainPage";
		
	}
	
	@GetMapping("/mainPage")
	public void mainPage() {
		
	}
	
}
