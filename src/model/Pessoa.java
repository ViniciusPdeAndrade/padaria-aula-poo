package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String sexo;
	private LocalDate nascimento;
	private String cpf;
	private Double salario;
	private String funcaoFuncionario;
	
	public Pessoa() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getFuncaoFuncionario() {
		return funcaoFuncionario;
	}

	public void setFuncaoFuncionario(String funcaoFuncionario) {
		this.funcaoFuncionario = funcaoFuncionario;
	}

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public void getCpf(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setsetInsalubridade(Double valueOf) {
		
	}
        
    public void setQuebraCaixa(Double valueOf) {
	}
}
