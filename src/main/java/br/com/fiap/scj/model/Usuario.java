package br.com.fiap.scj.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private String login;
	private String email;
	private String senha;
	@Enumerated(EnumType.STRING)
	private EnumTipoUsuario tipoUsuario;
    @ManyToOne
	private Empresa empresa;
	
	public EnumTipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(EnumTipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
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
}
