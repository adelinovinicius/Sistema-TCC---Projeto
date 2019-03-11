
package model.DAO;

import Conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Produto;

public class ProdutoDAO {
   
 public void create(Produto p) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produto (nomeProduto,qtdProduto,ValorProduto)VALUES(?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQtd());
            stmt.setDouble(3, p.getValor());
            //stmt.setInt(4, p.getCodlojaproprietaria());
            //stmt.setInt(5, p.getCodfornecedorproprietario());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!" +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
 }
 
    public List<Produto> red(){
                   
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("idProduto"));
                produto.setNome(rs.getString("nomeProduto"));
                produto.setQtd(rs.getInt("qtdProduto"));
                produto.setValor(rs.getDouble("valorProduto"));
                produto.setCodlojaproprietaria(rs.getInt("idlojaproprietaria"));
                produto.setCodfornecedorproprietario(rs.getInt("idfornecedorproprietario"));
                
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produtos;
    }
