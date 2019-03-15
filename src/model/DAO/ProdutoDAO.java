
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
            stmt = con.prepareStatement("INSERT INTO produto (nomeProduto,qtdProduto,"
                    + "valorProduto, idlojaproprietaria, idfornecedorproprietarioa)VALUES(?,?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQtd());
            stmt.setDouble(3, p.getValor());
            stmt.setInt(4, p.getCodlojaproprietaria());
            stmt.setInt(5, p.getCodfornecedorproprietario());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                        
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
   
 
}
    
    public List<Produto> read() {

        Connection con = Conection.ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto2 = new Produto();

                produto2.setId(rs.getInt("idProduto"));
                produto2.setNome(rs.getString("nomeProduto"));
                produto2.setQtd(rs.getInt("qtdProduto"));
                produto2.setValor(rs.getDouble("valorProduto"));
                produto2.setCodlojaproprietaria(rs.getInt("idlojaproprietaria"));
                produto2.setCodfornecedorproprietario(rs.getInt("idfornecedorproprietario"));
                
                produtos.add(produto2);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conection.ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
}