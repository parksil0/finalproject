package com.spring.withwork.vo;

import java.sql.Date;

public class GuestVO {
	
	private int g_num;
	private String id;
	private String password;
	private String g_name;
	private String address;
	private String email;
	private String phone;
	private Date regdate;
	private String authKey;
	private String authStatus;
		
	public GuestVO() {
		
	}
	
	public GuestVO(int g_num, String id, String password, String g_name, String address, String email, String phone,
			Date regdate, String authKey, String authStatus) {
		this.g_num = g_num;
		this.id = id;
		this.password = password;
		this.g_name = g_name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.regdate = regdate;
		this.authKey = authKey;
		this.authStatus = authStatus;
	}

	public int getG_num() {
		return g_num;
	}
	public void setG_num(int g_num) {
		this.g_num = g_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getAuthKey() {
		return authKey;
	}
	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}
	public String getAuthStatus() {
		return authStatus;
	}
	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	@Override
	public String toString() {
		return "GuestVO [g_num=" + g_num + ", id=" + id + ", password=" + password + ", g_name=" + g_name + ", address="
				+ address + ", email=" + email + ", phone=" + phone + ", regdate=" + regdate + ", authKey=" + authKey
				+ ", authStatus=" + authStatus + "]";
	}


	
}