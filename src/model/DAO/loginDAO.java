
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
import model.bean.Login;
import model.bean.TipoUsuario;

public class loginDAO { 
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null; 
    
public void create(Login l) {

        try {
            stmt = con.prepareStatement("INSERT INTO usuario (usuario, "
                    + "senhaUsuario,tipoUsuario)VALUES(?,?,?)");

            stmt.setString(1, l.getUsuario());
            stmt.setString(2, l.getSenha());
            stmt.setInt(3,l.getTipo().getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar!  " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean checkLogin(String usuario, String senha){
  
        boolean check = false;
        
     try {
         
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE usuario = ? "
                    + "and senha = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            //stmt.setInt(3, tipoUsuario);

            rs = stmt.executeQuery();
         
         if(rs.next()){
             
          check = true;
   
         }
         
     } catch (SQLException ex) {
         Logger.getLogger(loginDAO.class.getName()).log(Level.SEVERE, null, ex);
     }finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check;
    
        }
    
    public List<Login> read() {

        List<Login> Logins = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Login login2 = new Login();

                login2.setId(rs.getInt("idUsuario"));
                login2.setUsuario(rs.getString("usuario"));
                login2.setSenha(rs.getString("senha"));
                login2.setTipo((TipoUsuario) rs.getObject("tpoUsuario"));
                
                Logins.add(login2);

            }

        } catch (SQLException ex) {
            Logger.getLogger(LojaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return Logins;

    }
    
    public List<Login> buscar(String nome) {

        List<Login> logins = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE usuario LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Login login1 = new Login();

                login1.setId(rs.getInt("idUsuario"));
                login1.setUsuario(rs.getString("usuario"));
                login1.setSenha(rs.getString("senha"));
                login1.setTipo((TipoUsuario) rs.getObject("tipoUsuario"));
                
                logins.add(login1);

            }

        } catch (SQLException ex) {
            Logger.getLogger(LojaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return logins;

    }
    
    public void delete(Login l) {

        try {
            stmt = con.prepareStatement("DELETE FROM usuario WHERE idUsuario = ?");
            stmt.setInt(1, l.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Removido com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Remover!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}