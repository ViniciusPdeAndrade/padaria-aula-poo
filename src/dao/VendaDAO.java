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
import model.Venda;

/**
 *
 * @author Vinicius Andrade
 */
public class VendaDAO {
    
      public void insertVenda(Venda venda) {

        Connection con = DB.getConnection();
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement(
                    "INSERT INTO VENDA(QUANTIDADE,TOTALVENDA, ID_FUNC_CAIXA, ID_PRODDUTO) values (?,?,?,?)");
            stmt.setInt(1, venda.getQuantidade());
            stmt.setDouble(2, venda.getTotalVenda());
            stmt.setInt(3, venda.getFuncCaixa().getId());
            stmt.setInt(4, venda.getProduto().getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            System.out.println("salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
            System.out.println("Erro ao salvar" + ex);
        }
    }
      public List<Venda> listarVenda() {
          Connection con = DB.getConnection();
          PreparedStatement stmt = null;
          ResultSet rs = null;

          List<Venda> listVenda = new ArrayList<>();
          try {
              stmt = con.prepareStatement("SELECT * FROM Venda");
              rs = stmt.executeQuery();
              while (rs.next()) {

                  Venda ve = new Venda();
                  ve.setId(rs.getInt("id"));
                  ve.setQuantidade(rs.getInt("quantidade"));
                  ve.setTotalVenda(rs.getDouble("TOTALVENDA"));
                  //ve.setFuncCaixa(funcCaixa);
                  //ve.setProduto(produto);
                  listVenda.add(ve);
              }

          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro ao Listar os Venda" + ex);
          }
          return listVenda;
      }

      public void updateVenda(Venda venda) {

          Connection con = DB.getConnection();
          PreparedStatement stmt = null;
          try {

              stmt = con.prepareStatement(
                      "UPDATE Venda SET QUANTIDADE = ?,TOTALVENDA = ?, ID_FUNC_CAIXA = ?, ID_PRODDUTO = ? WHERE ID = ?");
              stmt.setInt(1, venda.getQuantidade());
              stmt.setDouble(2, venda.getTotalVenda());
              stmt.setInt(3, venda.getFuncCaixa().getId());
              stmt.setInt(4, venda.getProduto().getId());
              stmt.setInt(5, venda.getId());
              stmt.executeUpdate();

              JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
              System.out.println("Atualizado com sucesso");

          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro ao atualizar" + ex);
              System.out.println("Erro ao atualizar" + ex);
          }
      }

      public void deleteVenda(Venda venda) {

          Connection con = DB.getConnection();
          PreparedStatement stmt = null;
          try {

              stmt = con.prepareStatement(
                      "DELETE FROM Venda WHERE id = ?");
              stmt.setInt(1, venda.getId());
              stmt.executeUpdate();

              JOptionPane.showMessageDialog(null, "Excluido com sucesso");
              System.out.println("Excluir com sucesso");

          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro ao excluir" + ex);
              System.out.println("Erro ao exluir" + ex);
          }
      }
    
}
