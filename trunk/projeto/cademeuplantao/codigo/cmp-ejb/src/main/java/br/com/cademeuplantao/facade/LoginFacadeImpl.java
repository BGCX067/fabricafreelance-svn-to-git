package br.com.cademeuplantao.facade;

import java.util.List;

import javax.ejb.EJB;

import br.com.cademeuplantao.dao.LoginDAO;
import br.com.cademeuplantao.entidade.Login;

public class LoginFacadeImpl implements LoginFacade{
	
	@EJB
	private LoginDAO dao;

	@Override
	public void save(Login login) {
		dao.save(login);
	}

	@Override
	public Login update(Login login) {
		return dao.update(login);
	}


	@Override
	public Login find(int entityID) {
		return dao.find(entityID);
	}

	@Override
	public List<Login> findAll() {
		return dao.findAll();
	}

	@Override
	public void delete(Login login) {
		dao.delete(login.getIdLogin(), Login.class);
	}

}
