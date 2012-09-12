package br.com.caelum.goodbuy.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

import br.com.caelum.goodbuy.enums.TipoUsuarioEnum;

@Entity
public class Usuario {

	@Id
	private String login;

	private String senha;

	private String nome;

	private TipoUsuarioEnum tipoUsuario;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoUsuarioEnum getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuarioEnum tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}