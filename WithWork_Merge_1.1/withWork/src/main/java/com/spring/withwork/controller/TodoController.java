package com.spring.withwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.withwork.service.TodoService;
import com.spring.withwork.vo.DepartmentVO;
import com.spring.withwork.vo.GuestVO;
import com.spring.withwork.vo.ProjectVO;
import com.spring.withwork.vo.TodoVO;

@Controller
@SessionAttributes("guest")
public class TodoController {
	@Autowired
	private TodoService todoService;
	
	@RequestMapping("/projectTodo.do")
	public String getProjectList(int p_num, Model model) {
		
		ProjectVO project = todoService.getOneProject(p_num);
		model.addAttribute("project", project);
		
		return "projectTodo.jsp";
	}
	
	@RequestMapping("/groupLogin.do") 
	public String getGuestCompany(@ModelAttribute("guest") GuestVO loginGuest, Model model) {
		
		 GuestVO guest = todoService.getGuestCompany(loginGuest);
		 System.out.println(guest);
		 model.addAttribute("guest", guest); 
		 return "todo.jsp"; 
	}
	 
	@RequestMapping("/insertTodo.do")
	public String insertTodo(@ModelAttribute("guest") GuestVO guest, TodoVO todo) {
		
		guest.setM_num(todo.getOrder_m());
		todo.setD_num(guest.getD_num()); // 임시 
		
		todoService.insertTodo(todo);
		
		return "todo.jsp";
	}
	
	@RequestMapping("/pjInsertTodo.do")
	public String pjInsertTodo(@ModelAttribute("guest") GuestVO guest, TodoVO todo) {
		
		guest.setM_num(todo.getOrder_m());
		todo.setD_num(guest.getD_num()); // 임시 
		
		todoService.insertTodo(todo);
		
		return "redirect:projectTodo.do?p_num=" + todo.getP_num();
	}
	
	@RequestMapping("/updateTodo.do")
	public String updateTodo(@ModelAttribute("guest") GuestVO guest, TodoVO todo) {
		
		todoService.updateTodo(todo);
		
		if("완료".equals(todo.getProgress())) {
			todoService.insertConfirm(todo);
		}
		
		return "todo.jsp";
	}
	
	@RequestMapping("/pjupdateTodo.do")
	public String pjupdateTodo(@ModelAttribute("guest") GuestVO guest, TodoVO todo) {
		
		todoService.updateTodo(todo);
		
		if("완료".equals(todo.getProgress())) {
			todoService.insertConfirm(todo);
		}
		
		return "redirect:projectTodo.do?p_num=" + todo.getP_num();
	}
	
	@RequestMapping("/dragTodoUpdate.do")
	@ResponseBody
	public int dragTodoUpdate(@ModelAttribute("guest") GuestVO guest, TodoVO todo) {
		
		int result = todoService.dragTodoUpdate(todo);
		
		return result;
	}
	
	
	@RequestMapping("/getAllTodo.do")
	@ResponseBody
	public List<TodoVO> getAllTodo(@ModelAttribute("guest") GuestVO guest, TodoVO todo) {
		
		List<TodoVO> todoList = todoService.getAllTodo(todo);
		
		return todoList;
	}
	
	@RequestMapping("/getTodoDetail.do")
	@ResponseBody
	public List<TodoVO> getTeamTodo(@ModelAttribute("guest") GuestVO guest) {
		
		List<TodoVO> todoDetail = todoService.getTodoDetail();
		
		return todoDetail;
	}
	
	@RequestMapping("/getAllDepart.do")
	@ResponseBody
	public List<DepartmentVO> getAllDepart(@ModelAttribute("guest") GuestVO guest, DepartmentVO depart) {
		
		depart.setD_num(guest.getD_num()); // 임시 
		List<DepartmentVO> departList = todoService.getAllDepart(depart);
		
		return departList;
	}
	
	@RequestMapping("/getAllProject.do")
	@ResponseBody
	public List<ProjectVO> getAllProject(@ModelAttribute("guest") GuestVO guest, int m_num) {
		
		List<ProjectVO> projectList = todoService.getAllProject(m_num);
		
		return projectList;
	}
	
	@RequestMapping("/getProjectJoiner.do")
	@ResponseBody
	public List<GuestVO> getProjectJoiner(int p_num) {
		
		List<GuestVO> pjList = todoService.getProjectJoiner(p_num);
		
		return pjList;
	}
	
	@RequestMapping("/getProjectTodo.do")
	@ResponseBody
	public List<TodoVO> getProjectTodo(TodoVO todo) {
		
		List<TodoVO> proejctTodoList = todoService.getProjectTodo(todo);
		
		return proejctTodoList;
	}
	
}
