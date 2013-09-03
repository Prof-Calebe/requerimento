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
import model.RevisaoNotaProcomp;
import model.RevisaoProva;

/**
 *
 * @author Carlos
 */
public class RevNotPro {
    private Connection conexao;
    private List<RevisaoNotaProcomp> listaProcomp;
    public RevNotPro() throws ClassNotFoundException{
        conexao = new Conexao().getConexao();
        listaProcomp = new ArrayList<RevisaoNotaProcomp>();
    }  
    public void insere(String TIA, String nomeProfessor, String nomeDisciplina, String curso, String turma, String motivo) {
    String sql = "INSERT INTO revnotpro(id_tia,nomeProf, nomeDisciplina, curso, turma, motivo, status, avaliacao) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);    
            // seta os valores
            stmt.setString(1, TIA);
            stmt.setString(2, nomeProfessor);
            stmt.setString(3, nomeDisciplina);
            stmt.setString(4,  curso);
            stmt.setString(5, turma);
            stmt.setString(6, motivo);
            stmt.setString(7, "Nao Visto");
            stmt.setString(8, "A Verificar");
            
            // execute
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<RevisaoNotaProcomp> getLista() throws ClassNotFoundException {
        try {
            //List<ProvaSub> provas = new ArrayList<ProvaSub>();
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement("SELECT * FROM revnotpro");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // criando o objeto Contato
                RevisaoNotaProcomp revisao = new  RevisaoNotaProcomp();
                revisao.setId(rs.getInt("id"));
                revisao.setId_tia(rs.getString("id_tia"));
                revisao.setNomeProf(rs.getString("NomeProf"));
                revisao.setNomeDisciplina(rs.getString("nomeDisciplina"));
                revisao.setCurso(rs.getString("curso"));
                revisao.setTurma(rs.getString("turma"));
                revisao.setMotivo(rs.getString("motivo"));
                revisao.setStatus(rs.getString("status"));
                revisao.setAvaliacao(rs.getString("avaliacao"));
                listaProcomp.add(revisao);
            }
          
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaProcomp;
    }
    public void altera(String tia) {
        PreparedStatement stmt = null;
        ResultSet res = null;
        try {
            String sql = "UPDATE revnotpro SET status = ?  WHERE id_tia = ?;";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "Avaliado");
            stmt.setString(2, tia);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        
        }
    }
}
