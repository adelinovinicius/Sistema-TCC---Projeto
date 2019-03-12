
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
import model.bean.Cliente;


public class ClienteDAO {

 public void create(Cliente c) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cliente (NomeCliente, "
                    + "Email, CPFCliente, TelefoneCliente, SexoCliente, "
                    + "RuaCliente, NumeroCliente, BairroCliente, CidadeCliente,"
                    + "CEPCliente, UFCliente)VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            
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
        
        public List<Cliente> read(){
            
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;   
        ResultSet rs = null; 
        
        List<Cliente> clientes = new ArrayList<>( );
        
     try {
         stmt = con.prepareStatement("SELECT * FROM cliente");
         rs = stmt.executeQuery();
         
         while(rs.next()){
             
          Cliente cliente = new Cliente();
          
          cliente.setId(rs.getInt("idcliente"));
          cliente.setNome(rs.getString("NomeCliente"));
          cliente.setEmail(rs.getString("Email"));
          cliente.setCPF(rs.getString("CPFCliente"));
          cliente.setTelefone(rs.getString("TelefoneCliente"));
          //cliente.setSexo(rs.getString("SexoCliente"));
          cliente.setRua(rs.getString("RuaCliente"));
          cliente.setNumero(rs.getInt("NumeroCliente"));
          cliente.setBairro(rs.getString("BairroCliente"));
          cliente.setCidade(rs.getString("CidadeCliente"));
          cliente.setCEP(rs.getString("CEPCliente"));
          //cliente.setUF(rs.getString("UFCliente"));
          
          clientes.add(cliente);
          
    
         }
         
     } catch (SQLException ex) {
         Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
     }finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return clientes;
    
        }

        public void update (Cliente c) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET NomeCliente = ?, "
                    + "Email = ?, CPFCliente = ?, TelefoneCliente = ?, SexoCliente = ?, "
                    + "RuaCliente = ?, NumeroCliente = ?, BairroCliente = ?, CidadeCliente = ?,"
                    + "CEPCliente = ?, UFCliente = ? WHERE idCliente = ?");
            
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
            stmt.setInt(12, c.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!" +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
  }
       }
        
        public void delete (Cliente c) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE idCliente = ?");
            stmt.setInt(1, c.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Removido com Sucesso!");
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Remover!" +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
  }
       }
 }