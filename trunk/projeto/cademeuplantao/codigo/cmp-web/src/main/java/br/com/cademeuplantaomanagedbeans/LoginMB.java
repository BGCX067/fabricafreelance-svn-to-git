package br.com.cademeuplantaomanagedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import br.com.cademeuplantao.facade.LoginFacade;
import br.com.cademeuplantao.form.LoginForm;

@ManagedBean(name="loginMB")
@ViewScoped
public class LoginMB implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject
	private LoginFacade facade;
	
	private LoginForm form;
	
	public LoginMB(){
		form = new LoginForm();
	}
	
	public void salvar(){
		facade.save(form.getLogin());
	}

	public LoginForm getForm() {
		return form;
	}

	public void setForm(LoginForm form) {
		this.form = form;
	}

}
