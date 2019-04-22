
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
import model.bean.Loja;

public class LojaDAO {
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
    public void create(Loja l) {

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
    public List<Loja> read() {

        ResultSet rs = null;

        List<Loja> Lojas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM loja");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Loja loja = new Loja();

                loja.setId(rs.getInt("idLoja"));
                loja.setNome(rs.getString("nomeLoja"));
                loja.setCNPJ(rs.getString("CNPJLoja"));
                loja.setTelefone(rs.getString("foneLoja"));
                loja.setEmail(rs.getString("emailLoja"));
                loja.setTaxaentrega(rs.getDouble("taxaDeEntregaLoja"));
                loja.setCEP(rs.getString("CEPLoja"));
                loja.setNumero(rs.getInt("numeroLoja"));
                loja.setRua(rs.getString("RuaLoja"));
                loja.setBairro(rs.getString("bairroLoja"));
                loja.setCidade(rs.getString("CidadeLoja"));
                loja.setUF(rs.getString("UFLoja"));

                Lojas.add(loja);

            }

        } catch (SQLException ex) {
            Logger.getLogger(LojaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return Lojas;

    }
    
    public void update(Loja l) {

        try {
            stmt = con.prepareStatement("UPDATE loja SET nomeLoja = ?,"
                    + "CNPJLoja = ?, foneLoja = ?, emailLoja = ?, "
                    + "taxaDeEntregaLoja = ?, CEPLoja = ?" + ", numeroLoja = ?,"
                    + "RuaLoja = ?, bairroLoja = ?, CidadeLoja = ?, UFLoja = ?"
                    + "WHERE idLoja = ?");

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
            stmt.setInt(12, l.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Loja l) {

        try {
            stmt = con.prepareStatement("DELETE FROM loja WHERE idLoja = ?");
            stmt.setInt(1, l.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Removido com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Remover, Esta Tabela "
                    + "esta sendo Usada!");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Loja> buscar(String nome) {

        ResultSet rs = null;

        List<Loja> lojas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM loja WHERE nomeLoja LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Loja loja = new Loja();

                loja.setId(rs.getInt("idLoja"));
                loja.setNome(rs.getString("nomeLoja"));
                loja.setCNPJ(rs.getString("CNPJLoja"));
                loja.setTelefone(rs.getString("foneLoja"));
                loja.setEmail(rs.getString("emailLoja"));
                loja.setTaxaentrega(rs.getDouble("taxaDeEntregaLoja"));
                loja.setCEP(rs.getString("CEPLoja"));
                loja.setNumero(rs.getInt("numeroLoja"));
                loja.setRua(rs.getString("RuaLoja"));
                loja.setBairro(rs.getString("bairroLoja"));
                loja.setCidade(rs.getString("CidadeLoja"));
                loja.setUF(rs.getString("UFLoja"));

                lojas.add(loja);

            }

        } catch (SQLException ex) {
            Logger.getLogger(LojaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return lojas;

    }
}
