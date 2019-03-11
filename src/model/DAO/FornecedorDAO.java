
package model.DAO;

import Conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Fornecedor;

public class FornecedorDAO {
    
        public void create(Fornecedor f) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
           stmt = con.prepareStatement("INSERT INTO fornecedor (nomeFornecedor,"
                    + "emailFornecedor, telefoneFornecedor, CEPFornecedor, "
                   + "numeroFornecedor, ruaFornecedor,bairroFornecedor, "
                   + "cidadeFornecedor,UFFornecedor,)"
                   + "VALUES(?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getEmail());
            stmt.setString(3, f.getTelefone());
            stmt.setString(4, f.getCEP());
            stmt.setInt(5, f.getNumero());
            stmt.setString(6, f.getRua());
            stmt.setString(7, f.getBairro());
            stmt.setString(8, f.getCidade());
            stmt.setString(9, f.getEmail());
            stmt.setString(10, f.getUF());
                       
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!" 
                    +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
 }
    
    
}
