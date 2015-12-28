package br.com.cademeuplantao.facade;

import java.util.List;

import javax.ejb.Local;

import br.com.cademeuplantao.entidade.Login;

@Local
public interface LoginFacade {
	
    public abstract void save(Login login);
    
    public abstract Login update(Login login);
 
    public abstract void delete(Login login);
 
    public abstract Login find(int entityID);
 
    public abstract List<Login> findAll();
}