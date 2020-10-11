package com.spring.withwork.vo;

public class MemberVO {
	private int m_num;
	private int c_num;
	private int d_num;
	private int g_num;
	private int r_num;
	private String authority;
	
	public MemberVO() {
		
	}
	
	public MemberVO(int c_num, int g_num, String authority) {
		this.c_num = c_num;
		this.g_num = g_num;
		this.authority = authority;
	}

	public MemberVO(int m_num, int c_num, int d_num, int g_num, int r_num, String authority) {
		this.m_num = m_num;
		this.c_num = c_num;
		this.d_num = d_num;
		this.g_num = g_num;
		this.r_num = r_num;
		this.authority = authority;
	}
	
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public int getC_num() {
		return c_num;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public int getD_num() {
		return d_num;
	}
	public void setD_num(int d_num) {
		this.d_num = d_num;
	}
	public int getG_num() {
		return g_num;
	}
	public void setG_num(int g_num) {
		this.g_num = g_num;
	}
	public int getR_num() {
		return r_num;
	}
	public void setR_num(int r_num) {
		this.r_num = r_num;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	@Override
	public String toString() {
		return "MemberVO [m_num=" + m_num + ", c_num=" + c_num + ", d_num=" + d_num + ", g_num=" + g_num + ", r_num="
				+ r_num + ", authority=" + authority + "]";
	}
	
	
}
