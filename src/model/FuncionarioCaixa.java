package model;

public class FuncionarioCaixa extends Pessoa {

    private static final long serialVersionUID = 1L;

    private Double quebraCaixa;

    public FuncionarioCaixa() {
        super();
        getQuebraCaixa();
 
    }

    public Double getQuebraCaixa() {
        return quebraCaixa;
    }

    public void setQuebraCaixa(Double quebraCaixa) {
        this.quebraCaixa = quebraCaixa;
    }

}
