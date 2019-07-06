package model;

public class FuncionarioPadaria extends Pessoa {

    private static final long serialVersionUID = 1L;

    private Double insalubridade;

    public FuncionarioPadaria() {
    }
    
    public Double getInsalubridade() {
        return insalubridade;
    }

    public void setInsalubridade(Double insalubridade) {
        this.insalubridade = insalubridade;
    }

}
