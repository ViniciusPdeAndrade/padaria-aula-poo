package model;

public class FuncionarioCaixa extends Pessoa {

    private static final long serialVersionUID = 1L;

    private Double quebraCaixa;

    public FuncionarioCaixa() {
    }

    public Double getQuebraCaixa() {
        return quebraCaixa;
    }

    public void setQuebraCaixa(Double quebraCaixa) {
        this.quebraCaixa = quebraCaixa;
    }

}
