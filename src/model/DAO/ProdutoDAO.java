
package model.DAO;

import Conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
