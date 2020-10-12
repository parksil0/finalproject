package com.spring.withwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.withwork.service.RoadmapService;
import com.spring.withwork.vo.GuestVO;
import com.spring.withwork.vo.ProjectVO;
import com.spring.withwork.vo.SearchProject;

@Controller
@SessionAttributes("guest")
public class RoadmapController {

	@Autowired
	private RoadmapService service;
	
	@GetMapping("/")
	public String main() {
		return "index.jsp";
	}
	
	
	/*1010 수정(최은서)*/
	@GetMapping("/roadmap.do")
	public String roadmap(@ModelAttribute("guest") GuestVO guest, Model model) {
		/*
		 * 임시 로그인 처리
		 */
		
		String auth = guest.getAuthority();
		
		System.out.println("auth : " + auth);
		if(auth.equals("관리자")) {
			System.out.println("manager login");
			model.addAttribute("auth", "관리자");
		} else if(auth.equals("멤버")) {
			System.out.println("member login");
			model.addAttribute("auth", "멤버");
		}
		
		/* 
		model.addAttribute("id", "gos@test.com");
		model.addAttribute("g_name", "고수");
		model.addAttribute("c_num", 2);
		*/
		return "roadmap.jsp";
	}
	
	@ResponseBody
	@GetMapping("/prjList.do")
	public List<ProjectVO> prjList() {
		List<ProjectVO> prjList = service.prjList();
		return prjList;
	}
	
	@ResponseBody
	@GetMapping("/searchProject.do")
	public List<ProjectVO> prjListSearch(SearchProject sp) {
		List<ProjectVO> searchProject = service.searchProject(sp);
		System.out.println("searchProject : " + searchProject);
		return searchProject;
	}
	
	@ResponseBody
	@GetMapping("/getPrj.do")
	public ProjectVO getPrj(String p_num) {
		System.out.println("p_num : " + p_num);
		ProjectVO getPrj = service.getPrj(p_num);
		System.out.println(getPrj);
		return getPrj;
	}
	
	@ResponseBody
	@PostMapping("/insertProject.do")
	public String insertProject(ProjectVO prj) {
		System.out.println("prj : " + prj);
		String result;
		int insertResult = service.insertProject(prj);

		if(insertResult == 1) {
			result = "success";
		} else {
			result = "fail";
		}
		System.out.println("result : " + result);
		return result;
	}
	
	@ResponseBody
	@GetMapping("/managerList.do")
	public List<ProjectVO> managerList(int c_num) {
		System.out.println("c_num : " + c_num);
		List<ProjectVO> managerList = service.managerList(c_num);
		return managerList;
	}
	
	@ResponseBody
	@PostMapping("/updatePrjoect.do")
	public String updatePrjoect(ProjectVO prj) {
		System.out.println("update prj : " + prj);
		String result;
		int updateResult = service.updateProject(prj);
		
		if(updateResult == 1) {
			result = "success";
		} else {
			result = "fail";
		}
		System.out.println("result : " + result);
		return result;
	}
}
