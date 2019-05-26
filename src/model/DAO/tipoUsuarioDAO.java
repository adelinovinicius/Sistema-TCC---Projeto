
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
import model.bean.TipoUsuario;


public class tipoUsuarioDAO {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    public List<TipoUsuario> read() {

        List<TipoUsuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tipousuario");
            rs = stmt.executeQuery();

            while (rs.next()) {

                TipoUsuario u2 = new TipoUsuario();

                u2.setId(rs.getInt("IDtipoUsuario"));
                u2.setNome(rs.getString("tipoUsuario"));
                                               
                usuarios.add(u2);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conection.ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;

    }
}
