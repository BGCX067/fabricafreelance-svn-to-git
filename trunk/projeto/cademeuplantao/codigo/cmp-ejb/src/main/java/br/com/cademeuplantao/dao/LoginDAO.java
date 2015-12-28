package br.com.cademeuplantao.dao;

import javax.ejb.Stateless;

import br.com.cademeuplantao.entidade.Login;

@Stateless
public class LoginDAO extends GenericDAO<Login> {

	public LoginDAO() {
		super(Login.class);
	}
	

}
