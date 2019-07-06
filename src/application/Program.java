package application;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.FuncionarioDAO;
import db.DB;
import model.FuncionarioCaixa;
import model.FuncionarioPadaria;
import model.Pessoa;

public class Program {

	public static void main(String[] args) throws ParseException {

		Connection conn = null;			
		conn = DB.getConnection();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");	
		 
		Date data = sdf.parse("1988/11/10") ;
		
		//FuncionarioPadaria fpadaria = new FuncionarioPadaria("Vinicius", Sexo.MASCULINO, data , "01988915040", 1700.00,"padeiro", 170.00);
	//	FuncionarioCaixa fcaixa = new FuncionarioCaixa("Maria", Sexo.FEMININO, data, "01988915040", 1500.00, "caixa", 100.00);
		Pessoa p = new Pessoa();
		FuncionarioCaixa fcaixa= new FuncionarioCaixa();
		FuncionarioPadaria fpadaria = new FuncionarioPadaria();
		FuncionarioDAO funcDAO = new FuncionarioDAO();
		if(fpadaria.getInsalubridade() != null) {}
		p.setNome("Maria");
	//	p.setNascimento(data);
		p.setCpf("01988915040");
		p.setSalario(1500.00);
		fcaixa.setFuncaoFuncionario("caixa");
	//	fcaixa.setQuebraCaixa(100.00);
		fpadaria.setInsalubridade();
	//	funcDAO.insertFuncPadaria(fpadaria);
	   /// funcDAO.insertFuncPadaria(fcaixa);
		
	    
	}
}
