package com.spring.withwork.vo;

import java.sql.Date;

public class CompanyVO {
	private int c_num;
	private String name;
	private Date regdate;
	private String subject;
	private String role;
	private String department;
	private int g_num;
	
	public CompanyVO() {
		
	}
	
	public CompanyVO(int c_num, String role, int g_num) {
		this.c_num = c_num;
		this.role = role;
		this.g_num = g_num;
	}

	public CompanyVO(int c_num, String name, Date regdate, String subject, String role,
			String department, int g_num) {
		this.c_num = c_num;
		this.name = name;
		this.regdate = regdate;
		this.subject = subject;
		this.role = role;
		this.department = department;
		this.g_num = g_num;
	}

	public int getC_num() {
		return c_num;
	}

	public void setC_num(int c_num) {
		this.c_num = c_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getG_num() {
		return g_num;
	}

	public void setG_num(int g_num) {
		this.g_num = g_num;
	}

	@Override
	public String toString() {
		return "CompanyVO [c_num=" + c_num + ", name=" + name + ", regdate=" + regdate + ", subject=" + subject
				+ ", role=" + role + ", department=" + department + ", g_num=" + g_num + "]";
	}

	
}
