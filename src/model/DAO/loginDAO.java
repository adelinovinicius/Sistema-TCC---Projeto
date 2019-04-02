
package model.DAO;

import Conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Login;

public class loginDAO { 
    
public void create(Login l) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuario (usuario, "
                    + "senha)VALUES(?,?)");

            stmt.setString(1, l.getUsuario());
            stmt.setString(2, l.getSenha());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar!  " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean checkLogin(String usuario, String senha){
            
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;   
        ResultSet rs = null; 
        boolean check = false;
        
     try {
         
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE usuario = ? and senha = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);

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
}