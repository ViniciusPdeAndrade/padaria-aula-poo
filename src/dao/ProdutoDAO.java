/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import db.DB;
import model.Produto;
import model.Produto;

/**
 *
 * @author Vinicius Andrade
 */
public class ProdutoDAO {
    
        public void insertProduto(Produto produto) {

        Connection con = DB.getConnection();
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement(
                    "INSERT INTO PRODUTO(NOME,VALOR,QUANTIDADE, ID_FORNECEDOR) values (?,?,?,?)");
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getValor());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getFornecedor().getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            System.out.println("salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
            System.out.println("Erro ao salvar" + ex);
        }
    }

    public List<Produto> listarProduto() {
        Connection con = DB.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> listProduto = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Produto");
            rs = stmt.executeQuery();
            while (rs.next()) {

                Produto po = new Produto();
                po.setId(rs.getInt("id"));
                po.setNome(rs.getString("nome"));
                po.setValor(rs.getDouble("valor"));
                po.setQuantidade(rs.getInt("QUANTIDADE"));
                //po.setFornecedor(rs.getInt("fornecedor"));
                listProduto.add(po);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar os produto" + ex);
        }
        return listProduto;
    }

    public void updateProduto(Produto produto) {

        Connection con = DB.getConnection();
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement(
                    "UPDATE PRODUTO SET NOME = ?,VALOR = ?,QUANTIDADE = ?, ID_FORNECEDOR = ? WHERE ID = ?");
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getValor());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getFornecedor().getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
            System.out.println("Atualizado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar" + ex);
            System.out.println("Erro ao atualizar" + ex);
        }
    }

    public void deleteProduto(Produto produto) {

        Connection con = DB.getConnection();
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement(
                    "DELETE FROM Produto WHERE id = ?");
            stmt.setInt(1, produto.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            System.out.println("Excluir com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir" + ex);
            System.out.println("Erro ao exluir" + ex);
        }
    }
    
}
