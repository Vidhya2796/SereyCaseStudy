package com.serey.login.model;

public class SereyUser {
	
	private String email;
	private String password;
	public SereyUser() {
		
	}
	public SereyUser(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SereyUser [email=" + email + ", password=" + password + "]";
	}
	

}
