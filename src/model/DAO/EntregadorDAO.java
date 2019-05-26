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
import model.bean.Entregador;

public class EntregadorDAO {
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public void create(Entregador f) {

        try {
            stmt = con.prepareStatement("INSERT INTO entregador (nomeEntregador,"
                    + "emailEntregador, telefoneEntregador, CNHEntregador, "
                    + "cidadeEntregador, UFEntregador,cepEntregador, "
                    + "ruaEntregador,bairroEntregador,numeroEntregador)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?)");

            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getEmail());
            stmt.setString(3, f.getTelefone());
            stmt.setString(4, f.getCNH());
            stmt.setString(5, f.getCidade());
            stmt.setString(6, f.getUF());
            stmt.setString(7, f.getCEP());
            stmt.setString(8, f.getRua());
            stmt.setString(9, f.getBairro());
            stmt.setInt(10, f.getNumero());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!"
                    + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void update(Entregador f) {

        try {
            stmt = con.prepareStatement("UPDATE entregador SET nomeEntregador = ?, "
            + "emailEntregador = ?, telefoneEntregador = ?, CNHEntregador = ?, "
            + "cidadeEntregador = ?, UFEntregador = ?, cepEntregador = ?, "
            + "ruaEntregador = ?, bairroEntregador = ?, numeroEntregador = ? "
            + "WHERE identregador = ?");
            
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getEmail());
            stmt.setString(3, f.getTelefone());
            stmt.setString(4, f.getCNH());
            stmt.setString(5, f.getCidade());
            stmt.setString(6, f.getUF());
            stmt.setString(7, f.getCEP());
            stmt.setString(8, f.getRua());
            stmt.setString(9, f.getBairro());
            stmt.setInt(10, f.getNumero());
            stmt.setInt(11, f.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar! " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Entregador> read() {

        List<Entregador> entregadores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM entregador");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Entregador entregador = new Entregador();

                entregador.setId(rs.getInt("identregador"));
                entregador.setNome(rs.getString("nomeEntregador"));
                entregador.setEmail(rs.getString("emailEntregador"));
                entregador.setTelefone(rs.getString("telefoneEntregador"));
                entregador.setCNH(rs.getString("CNHEntregador"));
                entregador.setCidade(rs.getString("cidadeEntregador"));
                entregador.setUF(rs.getString("UFEntregador"));
                entregador.setCEP(rs.getString("cepEntregador"));
                entregador.setRua(rs.getString("ruaEntregador"));
                entregador.setBairro(rs.getString("bairroEntregador"));
                entregador.setNumero(rs.getInt("numeroEntregador"));

                entregadores.add(entregador);

            }

        } catch (SQLException ex) {
            Logger.getLogger(EntregadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return entregadores;

    }
    
    public void delete(Entregador e) {

        try {
            stmt = con.prepareStatement("DELETE FROM entregador WHERE identregador = ?");
            stmt.setInt(1, e.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Removido com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Remover!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Entregador> buscar(String nome) {

        List<Entregador> entregadores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM entregador WHERE nomeEntregador LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Entregador entregador = new Entregador();

                entregador.setId(rs.getInt("identregador"));
                entregador.setNome(rs.getString("NomeEntregador"));
                entregador.setEmail(rs.getString("emailEntregador"));
                entregador.setTelefone(rs.getString("telefoneEntregador"));
                entregador.setCNH(rs.getString("CNHEntregador"));
                entregador.setCidade(rs.getString("cidadeEntregador"));
                entregador.setUF(rs.getString("UFEntregador"));
                entregador.setCEP(rs.getString("cepEntregador"));
                entregador.setRua(rs.getString("ruaEntregador"));
                entregador.setNumero(rs.getInt("numeroEntregador"));
               
                entregadores.add(entregador);

            }

        } catch (SQLException ex) {
            Logger.getLogger(EntregadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return entregadores;

    }
}