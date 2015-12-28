package br.com.cademeuplantao.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="tb_login")
public class Login implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_login")
	private Long idLogin;
	
	@Column(name="ativo")
	private Boolean ativo;
	
	@NotEmpty(message="{msg.campo.obrigatorio}")
	@Column(name="senha")
	private String senha;
	
	@NotEmpty(message="{msg.campo.obrigatorio}")
	@Column(name="usuario")
	private String usuario;
	
	public Login(){
		
	}

	public Long getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(Long idLogin) {
		this.idLogin = idLogin;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idLogin == null) ? 0 : idLogin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		if (idLogin == null) {
			if (other.idLogin != null)
				return false;
		} else if (!idLogin.equals(other.idLogin))
			return false;
		return true;
	}

}
