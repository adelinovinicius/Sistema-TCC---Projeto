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

    public void create(Entregador f) {

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
                    + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Entregador> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

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

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

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

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

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