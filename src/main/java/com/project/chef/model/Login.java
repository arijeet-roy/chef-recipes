package com.project.chef.model;

public class Login {

	private String userName;
	private String password;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + "]";
	}

	
}
