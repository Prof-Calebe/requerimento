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
import model.CursoExtra;
import model.RevisaoTGI;

/**
 *
 * @author Felipe
 */
public class Curso {
    public static int i = 1;
    private Connection conexao;
    private List<CursoExtra> cursoExtra;
    public Curso() throws ClassNotFoundException{
        System.out.println("AAAAAAAAAAAAAAA");
        conexao = new Conexao().getConexao();
        cursoExtra = new ArrayList<CursoExtra>();
    }  
    
    public void insere(String nome, String TIA, String curso, String extra) {
        String sql = "INSERT INTO curso(i,nome, TIA, curso, extra) VALUES (?,?, ?, ?, ?)";
        i++;
        System.out.println("BBBBBBBBBBBBBBBBBBB");
        try {
            System.out.println("CCCCCCCCCCCCCCCCCC");
            // prepared statement para inserção
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);    
            System.out.println("DDDDDDDDDDDDDDD");
            // seta os valores
            stmt.setString(1, nome);         //nome
            stmt.setString(2, TIA);          //id
            stmt.setString(3,  curso);       //curso
            stmt.setString(4, extra);        //extracurricular
            stmt.setString(6, "Pendente");   //status
            stmt.setString(7, "A Verificar");//parecer
            System.out.println("EEEEEEEEEEEEEEE");
            // executa
            stmt.executeUpdate();
            System.out.println("FFFFFFFFFFFFFFF");
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<CursoExtra> getLista() throws ClassNotFoundException {
        try {
            //List<ProvaSub> provas = new ArrayList<ProvaSub>();
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement("SELECT * FROM curso");
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
}
