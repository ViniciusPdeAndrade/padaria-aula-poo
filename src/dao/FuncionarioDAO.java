package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import db.DB;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.FuncionarioCaixa;
import model.FuncionarioPadaria;
import model.Pessoa;


public class FuncionarioDAO {

	
	public void insertFuncionario(Pessoa pessoa) {
             
            java.util.Date date = java.sql.Date.valueOf(pessoa.getNascimento());
	
		Connection con = DB.getConnection();
		PreparedStatement stmt = null;
		try {

			stmt = con.prepareStatement(
					"INSERT INTO FUNCIONARIO(NOME,SEXO,DATA_NASCIMENTO,CPF,SALARIO,FUNCAO,QUEBRA_CAIXA,INSALUBRIDADE) values (?,?,?,?,?,?,?,?)");
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, String.valueOf(pessoa.getSexo()));
			stmt.setDate(3,new java.sql.Date(date.getTime()));
			stmt.setString(4, pessoa.getCpf());
			stmt.setDouble(5, pessoa.getSalario());
			stmt.setString(6, pessoa.getFuncaoFuncionario());
			stmt.setDouble(7,  pessoa.getQuebraCaixa());
			stmt.setDouble(8, pessoa.getInsalubridade());
		
			stmt.executeUpdate();

			JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			System.out.println("salvo com sucesso");

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
			System.out.println("Erro ao salvar" + ex);
		}
	}
        
        public List<Pessoa> listarFuncionarios(){
            
       Connection con = DB.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Pessoa> listPessoa = new ArrayList<>();
         try {
                stmt = con.prepareStatement("SELECT * FROM funcionario");
                rs = stmt.executeQuery();
                while(rs.next()){
                    
                    Pessoa pessoa = new Pessoa();
                    pessoa.setId(rs.getInt("id"));
                    pessoa.setNome(rs.getString("nome"));
                    pessoa.setFuncaoFuncionario(rs.getString("funcao"));
                    listPessoa.add(pessoa);
                }           
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Listar os produtos" + ex);
                
            }
        
        return listPessoa;
        }
        
        	public void update(Pessoa pessoa) {
             
            java.util.Date date = java.sql.Date.valueOf(pessoa.getNascimento());
	
		Connection con = DB.getConnection();
		PreparedStatement stmt = null;
		try {

			stmt = con.prepareStatement(
					"UPDATE funcionario  SET NOME = ?, SEXO = ?,DATA_NASCIMENTO = ?,CPF = ?,SALARIO = ?,FUNCAO = ?,QUEBRA_CAIXA = ?,INSALUBRIDADE = ? WHERE id = ?");
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, String.valueOf(pessoa.getSexo()));
			stmt.setDate(3,new java.sql.Date(date.getTime()));
			stmt.setString(4, pessoa.getCpf());
			stmt.setDouble(5, pessoa.getSalario());
			stmt.setString(6, pessoa.getFuncaoFuncionario());
			stmt.setDouble(7,  pessoa.getQuebraCaixa());
			stmt.setDouble(8, pessoa.getInsalubridade());
                        stmt.setInt(9, pessoa.getId());
		
			stmt.executeUpdate();

			JOptionPane.showMessageDialog(null, "Atualizo com sucesso");
			System.out.println("salvo com sucesso");

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao atualziar" + ex);
			System.out.println("Erro ao salvar" + ex);
		}
	}
        
}
