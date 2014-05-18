/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;


/**
 *
 * @author Felipe
 */
public class Curso {
    public static int i = 0;
    private Connection conexao;
    private List<CursoExtra> cursoExtra;
    public Curso() throws ClassNotFoundException{
        System.out.println("AAAAAAAAAAAAAAA");
        conexao = new ConexaoBD().getConexao();
        System.out.println("22222222222222");
        cursoExtra = new ArrayList<CursoExtra>();
        System.out.println("3434343434343434343");
    }  
   
 
   public void insere(String nome, String TIA, String curso, String extra) {
        String sql = "INSERT INTO curso(codigo,nome, TIA, curso, extra, status, parecer) VALUES (?,?, ?, ?, ?,?,?)";
        i++;
        String aux = String.valueOf(i);
        try {
            // prepared statement para inserção
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);    
            // seta os valores
            stmt.setString(1, aux);          //codigo
            stmt.setString(2, nome);         //nome
            stmt.setString(3, TIA);          //id
            stmt.setString(4,  curso);       //curso
            stmt.setString(5, extra);        //extracurricular
            stmt.setString(6, "Pendente");   //status
            stmt.setString(7, "A Verificar");//parecer
            // executa
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<CursoExtra> getLista() throws ClassNotFoundException {
        try {
            //List<ProvaSub> provas = new ArrayList<ProvaSub>();
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement("SELECT * FROM curso where status <> 'aprovado' and status <> 'reprovado'");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // criando o objeto Contato
                CursoExtra revisao = new CursoExtra();
                //revisao.setId(rs.getInt("id"));
                revisao.setNome(rs.getString("nome"));
                revisao.setTia(rs.getString("tia"));
                revisao.setCurso(rs.getString("curso"));
                revisao.setExtra(rs.getString("extra"));
                revisao.setStatus(rs.getString("status"));
                revisao.setParecer(rs.getString("parecer"));
                cursoExtra.add(revisao);
            }
          
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cursoExtra;
    }
    public void altera(String tia) {
        PreparedStatement stmt = null;
        ResultSet res = null;
        try {
            String sql = "UPDATE curso SET status = ?  WHERE tia = ?;";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "Avaliado");
            stmt.setString(2, tia);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        
        }
    }

    public void atualiza(String tia, String extra, String status,String justi) {
        PreparedStatement stmt = null;
        ResultSet res = null;
        try {
            String sql = "UPDATE curso SET status = ? , parecer = ? WHERE tia = ? and extra = ?;";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, status);
            stmt.setString(2, justi);
            stmt.setString(3, tia);
            stmt.setString(4, extra);   
            System.out.println(sql);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        
        }
    }


}
