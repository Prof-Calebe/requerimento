/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.RevisaoTGI;

/**
 *
 * @author Carlos
 */
public class RevisaoTgiBD {
    
    private Connection conexao;
    private List<RevisaoTGI> listaTGI;
    public RevisaoTgiBD() throws ClassNotFoundException{
        conexao = new ConexaoBD().getConexao();
        listaTGI = new ArrayList<RevisaoTGI>();
    }  
    
    public void insere(String TIA, String nomeOrientador, String curso, String grupo, String motivo) {
        String sql = "INSERT INTO tgi(id_tia,nomeOrientador, curso, grupo, motivo, status, avaliacao) VALUES (?, ?, ?, ?, ?,?,?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);    
            // seta os valores
            stmt.setString(1, TIA);
            stmt.setString(2, nomeOrientador);
            stmt.setString(3,  curso);
            stmt.setString(4, grupo);
            stmt.setString(5, motivo);
            stmt.setString(6, "Nao Visto");
            stmt.setString(7, "A Verificar");
            
            // executa
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<RevisaoTGI> getLista() throws ClassNotFoundException {
        try {
            //List<ProvaSub> provas = new ArrayList<ProvaSub>();
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement("SELECT * FROM tgi");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // criando o objeto Contato
                RevisaoTGI revisao = new  RevisaoTGI();
                //revisao.setId(rs.getInt("id"));
                revisao.setId_tia(rs.getString("id_tia"));
                revisao.setNomeOrientador(rs.getString("nomeOrientador"));
                revisao.setGrupo(rs.getString("grupo"));
                revisao.setMotivo(rs.getString("motivo"));
                revisao.setStatus(rs.getString("status"));
                revisao.setAvaliacao(rs.getString("avaliacao"));
                listaTGI.add(revisao);
            }
          
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaTGI;
    }
    public void altera(String tia) {
        PreparedStatement stmt = null;
        ResultSet res = null;
        try {
            String sql = "UPDATE tgi SET status = ?  WHERE id_tia = ?;";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "Avaliado");
            stmt.setString(2, tia);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        
        }
    }
}

