/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Fornecedor;

/**
 *
 * @author Vinicius Andrade
 */
public class FornecedorDAO {

    public void insertFornecedor(Fornecedor fornecedor) {

        Connection con = DB.getConnection();
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement(
                    "INSERT INTO FORNECEDOR(NOME,CNPJ,ENDERECO) values (?,?,?)");
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getEndereco());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            System.out.println("salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
            System.out.println("Erro ao salvar" + ex);
        }
    }

    public List<Fornecedor> listarForcedor() {
        Connection con = DB.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Fornecedor> listFornecedor = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM FORNECEDOR");
            rs = stmt.executeQuery();
            while (rs.next()) {

                Fornecedor fo = new Fornecedor();
                fo.setId(rs.getInt("id"));
                fo.setNome(rs.getString("nome"));
                fo.setCnpj(rs.getString("CNPJ"));
                fo.setEndereco(rs.getNString("endereco"));
                listFornecedor.add(fo);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar os produtos" + ex);
        }
        return listFornecedor;
    }

    public void updateFornecedor(Fornecedor fornecedor) {

        Connection con = DB.getConnection();
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement(
                    "UPDATE fornecedor SET NOME = ?,CNPJ = ?,ENDERECO = ? WHERE ID = ?");
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getEndereco());
            stmt.setInt(4, fornecedor.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
            System.out.println("Atualizado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar" + ex);
            System.out.println("Erro ao atualizar" + ex);
        }
    }

    public void deletefornecedor(Fornecedor fornecedor) {

        Connection con = DB.getConnection();
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement(
                    "DELETE FROM FORNECEDOR WHERE id = ?");
            stmt.setInt(1, fornecedor.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            System.out.println("Excluir com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir" + ex);
            System.out.println("Erro ao exluir" + ex);
        }
    }
}
