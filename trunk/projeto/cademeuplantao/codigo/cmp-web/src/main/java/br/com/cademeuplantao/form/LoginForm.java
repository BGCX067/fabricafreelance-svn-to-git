package br.com.cademeuplantao.form;

import br.com.cademeuplantao.entidade.Login;

public class LoginForm {

	private Login login;
	
	public LoginForm(){
		login = new Login();
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
}
