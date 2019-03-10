
package model.DAO;

import Conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Cliente;


public class ClienteDAO {

 public void create(Cliente c) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produto (NomeCliente, Email, CPFCliente, TelefoneCliente, "
                    + "SexoCliente, RuaCliente, NumeroCliente, BairroCliente, CidadeCliente, CEPCliente, UFCliente)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getCPF());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getSexo());
            stmt.setString(6, c.getRua());
            stmt.setInt(7, c.getNumero());
            stmt.setString(8, c.getBairro());
            stmt.setString(9, c.getCidade());
            stmt.setString(10, c.getCEP());
            stmt.setString(11, c.getUF());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!" +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
 }    
    }
