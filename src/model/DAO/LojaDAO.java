
package model.DAO;

import Conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Loja;

public class LojaDAO {
    
    public void create(Loja l) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO loja (nomeLoja, "
                    + "CNPJLoja, foneLoja, emailLoja, taxaDeEntregaLoja, CEPLoja"
                    + ", numeroLoja, RuaLoja, bairroLoja, CidadeLoja, UFLoja)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, l.getNome());
            stmt.setString(2, l.getCNPJ());
            stmt.setString(3, l.getTelefone());
            stmt.setString(4, l.getEmail());
            stmt.setDouble(5, l.getTaxaentrega());
            stmt.setString(6, l.getCEP());
            stmt.setInt(7, l.getNumero());
            stmt.setString(8, l.getRua());
            stmt.setString(9, l.getBairro());
            stmt.setString(10, l.getCidade());
            stmt.setString(11, l.getUF());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!" +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
 }
    
}
