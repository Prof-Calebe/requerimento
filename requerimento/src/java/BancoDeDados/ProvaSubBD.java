
package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ProvaSub;

/**
 *
 * @author Carlos
 */
public class ProvaSubBD {
     private Connection conexao;
    private List<ProvaSub> provas;
    public ProvaSubBD() throws ClassNotFoundException{
       conexao = new ConexaoBD().getConexao();
       provas = new ArrayList<ProvaSub>();
    }  
    
    public void insere(String TIA, String nomeProfessor, String nomeDisciplina, String curso, String turma, String motivo, String data) {
    String sql = "INSERT INTO provasub(id_tia,nomeProf, nomeDisciplina, curso, turma, motivo, data, status, avaliacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
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
            stmt.setString(7, data);
            stmt.setString(8, "Nao Visto");
            stmt.setString(9, "A Verificar");
            
            // executa
            stmt.executeUpdate();
            stmt.close();               
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<ProvaSub> getLista() {
        try {
            //List<ProvaSub> provas = new ArrayList<ProvaSub>();
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement("SELECT * FROM provasub");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // criando o objeto Contato
                ProvaSub provasub = new  ProvaSub();
                provasub.setId(rs.getInt("id"));
                provasub.setId_tia(rs.getString("id_tia"));
                provasub.setNomeProf(rs.getString("NomeProf"));
                provasub.setNomeDisciplina(rs.getString("nomeDisciplina"));
                provasub.setCurso(rs.getString("curso"));
                provasub.setTurma(rs.getString("turma"));
                provasub.setMotivo(rs.getString("motivo"));
                provasub.setData(rs.getString("data"));
                provasub.setStatus(rs.getString("status"));
                provasub.setAvaliacao(rs.getString("avaliacao"));
                provas.add(provasub);
            }
          
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return provas;
    }
    public void altera(String tia) {
        PreparedStatement stmt = null;
        ResultSet res = null;
        try {
            String sql = "UPDATE provasub SET status = ?  WHERE id_tia = ?;";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "Avaliado");
            stmt.setString(2, tia);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        
        }
    }
}