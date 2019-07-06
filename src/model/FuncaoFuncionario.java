package model;

import java.io.Serializable;

public class FuncaoFuncionario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nomeFuncao;
	
	private FuncaoFuncionario() {}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeFuncao() {
		return nomeFuncao;
	}

	public void setNomeFuncao(String nomeFuncao) {
		this.nomeFuncao = nomeFuncao;
	}

}
