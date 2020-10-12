package com.spring.withwork.vo;

public class DepartmentVO {
	private int m_num;
	private int d_num;
	private int c_num;
	private String g_name;
	private String role;
	private String depart;
	
	public DepartmentVO() {
		
	}
	
	public DepartmentVO(int c_num, String depart) {
		this.c_num = c_num;
		this.depart = depart;
	}

	public DepartmentVO(int m_num, int d_num, int c_num, String g_name, String role, String depart) {
		this.m_num = m_num;
		this.d_num = d_num;
		this.c_num = c_num;
		this.g_name = g_name;
		this.role = role;
		this.depart = depart;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public int getD_num() {
		return d_num;
	}

	public void setD_num(int d_num) {
		this.d_num = d_num;
	}

	public String getG_name() {
		return g_name;
	}

	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public int getC_num() {
		return c_num;
	}

	public void setC_num(int c_num) {
		this.c_num = c_num;
	}

	@Override
	public String toString() {
		return "DepartmentVO [m_num=" + m_num + ", d_num=" + d_num + ", c_num=" + c_num + ", g_name=" + g_name
				+ ", role=" + role + ", depart=" + depart + "]";
	}

}
