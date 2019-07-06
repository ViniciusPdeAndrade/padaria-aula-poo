package model;

import java.io.Serializable;

public class Venda implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer quantidade;
	private Double totalVenda;
	private FuncionarioCaixa funcCaixa;
	private Produto produto;
	
	private Venda() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(Double totalVenda) {
		this.totalVenda = totalVenda;
	}

	public FuncionarioCaixa getFuncCaixa() {
		return funcCaixa;
	}

	public void setFuncCaixa(FuncionarioCaixa funcCaixa) {
		this.funcCaixa = funcCaixa;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}	

}
