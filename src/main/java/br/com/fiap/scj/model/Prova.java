package br.com.fiap.scj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Prova {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
    private String descricao;
    private String prova;
    private String resposta;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private Vaga vaga;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getProva() {
		return prova;
	}
	public void setProva(String prova) {
		this.prova = prova;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Vaga getVaga() {
		return vaga;
	}
	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}

}
