package com.delivarius.delivarius_api.dto;

public class Login implements DataTranferObject {
	
	private static final long serialVersionUID = 1L;

	private String login;
	
	private String password;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}