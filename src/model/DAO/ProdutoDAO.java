
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
import model.bean.Loja;
import model.bean.Produto;

public class ProdutoDAO {
    
        Connection con = Conection.ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
    public void create(Produto p) {
       
        try {
            stmt = con.prepareStatement("INSERT INTO produto (nomeProduto,qtdProduto,"
                    + "valorProduto, idlojaproprietaria)VALUES(?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQtd());
            stmt.setDouble(3, p.getValor());
            stmt.setInt(4, p.getCodlojaproprietaria().getId());
           
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                        
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
   
 
}
    
    public List<Produto> read() {

        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto p2 = new Produto();

                p2.setId(rs.getInt("idProduto"));
                p2.setNome(rs.getString("nomeProduto"));
                p2.setQtd(rs.getInt("qtdProduto"));
                p2.setValor(rs.getDouble("valorProduto"));
                p2.setCodlojaproprietaria((Loja) rs.getObject("codLojaProprietaria"));
                               
                produtos.add(p2);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conection.ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
    
    public void update(Produto p) {

        try {
            stmt = con.prepareStatement("UPDATE produto SET nomeProduto = ? ,qtdProduto = ?,"
                    + "valorProduto = ? , idlojaproprietaria = ? WHERE idProduto = ?");

            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQtd());
            stmt.setDouble(3, p.getValor());
            stmt.setInt(4, p.getCodlojaproprietaria().getId());
            stmt.setInt(5, p.getId());
                       
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Produto p) {

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE idProduto = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Removido com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Remover!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    } 
    
    public List<Produto> buscar(String nome) {

        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE nomeProduto LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto P = new Produto();

                P.setId(rs.getInt("idProduto"));
                P.setNome(rs.getString("nomeProduto"));
                P.setQtd(rs.getInt("qtdProduto"));
                P.setValor(rs.getDouble("valorProduto"));
                P.setCodlojaproprietaria((Loja)rs.getObject("codLojaProprietaria"));
                

                produtos.add(P);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
}