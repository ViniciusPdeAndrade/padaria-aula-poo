package model;

public class FuncionarioPadaria extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	protected Double insalubridade;
	
	public FuncionarioPadaria() {}

        public Double getInsalubridade() {
		if(insalubridade == 0) {
			return null;
		}
		
		return insalubridade;
	}

	public void setInsalubridade() {
		this.insalubridade = insalubridade;
	}

}
