
package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.AbonarFalta;

/**
 *
 * @author Carlos
 */
public class AbonarFaltaBD {
     private Connection conexao;
    private List<AbonarFalta> faltas;
    public AbonarFaltaBD() throws ClassNotFoundException{
       conexao = new ConexaoBD().getConexao();
       faltas = new ArrayList<AbonarFalta>();
    }  
    
    public void insere(String TIA, String nomeDisciplina, String curso, String turma, String motivo) {
    String sql = "INSERT INTO abonofalta(id_tia, nomeDisciplina, curso, turma, motivo, status, avaliacao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);    
            // seta os valores
            stmt.setString(1, TIA);
            stmt.setString(2, nomeDisciplina);
            stmt.setString(3, curso);
            stmt.setString(4, turma);
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
    public List<AbonarFalta> getLista() {
        try {
            //List<ProvaSub> provas = new ArrayList<ProvaSub>();
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement("SELECT * FROM abonofalta");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // criando o objeto Contato
                AbonarFalta abonoFalta = new  AbonarFalta();
                abonoFalta.setId(rs.getInt("id"));
                abonoFalta.setId_tia(rs.getString("id_tia"));
                abonoFalta.setNomeDisciplina(rs.getString("nomeDisciplina"));
                abonoFalta.setCurso(rs.getString("curso"));
                abonoFalta.setTurma(rs.getString("turma"));
                abonoFalta.setMotivo(rs.getString("motivo"));
                abonoFalta.setStatus(rs.getString("status"));
                abonoFalta.setAvaliacao(rs.getString("avaliacao"));
                faltas.add(abonoFalta);
            }
          
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return faltas;
    }
    public void altera(String tia) {
        PreparedStatement stmt = null;
        ResultSet res = null;
        try {
            String sql = "UPDATE abonofalta SET status = ?  WHERE id_tia = ?;";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "Avaliado");
            stmt.setString(2, tia);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        
        }
    }
}