package br.com.fiap.scj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@RequestMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
public class Empresa {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
    private String nome;
    private String token;
    
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
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
