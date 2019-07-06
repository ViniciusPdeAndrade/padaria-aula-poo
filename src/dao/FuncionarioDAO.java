package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import db.DB;
import javax.swing.JOptionPane;
import model.FuncionarioCaixa;
import model.FuncionarioPadaria;
import model.Pessoa;


public class FuncionarioDAO {

	
	public void insertFuncPadaria(Pessoa pessoa) {
             
            java.util.Date date = java.sql.Date.valueOf(pessoa.getNascimento());
	
		Connection con = DB.getConnection();
		PreparedStatement stmt = null;
		try {

			stmt = con.prepareStatement(
					"INSERT INTO FUNCIONARIO(NOME,SEXO,DATA_NASCIMENTO,CPF,SALARIO,FUNCAO,QUEBRA_CAIXA,INSALUBRIDADE) values (?,?,?,?,?,?,null,null)");
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, String.valueOf(pessoa.getSexo()));
			stmt.setDate(3,new java.sql.Date(date.getTime()));
			stmt.setString(4, pessoa.getCpf());
			stmt.setDouble(5, pessoa.getSalario());
			stmt.setString(6, pessoa.getFuncaoFuncionario());
			//stmt.setDouble(7, (((FuncionarioCaixa) pessoa).getQuebraCaixa()));
			//stmt.setDouble(8, ((FuncionarioPadaria) pessoa).getInsalubridade());
		
			stmt.executeUpdate();

			JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			System.out.println("salvo com sucesso");

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
			System.out.println("Erro ao salvar" + ex);
		} finally {
			DB.closeConnection();
		}
	}
}
