package com.marco.opendevup.web;

import lombok.Data;

@Data
public class RegisterForm {

	private String username;
	private String password;
	private String repassword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	@Override
	public String toString() {
		return "RegisterForm [username=" + username + ", password=" + password + ", repassword=" + repassword + "]";
	}
	public RegisterForm(String username, String password, String repassword) {
		super();
		this.username = username;
		this.password = password;
		this.repassword = repassword;
	}
	
	
}
