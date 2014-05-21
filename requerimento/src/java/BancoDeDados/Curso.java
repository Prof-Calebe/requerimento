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
    private Object String;
    public Curso() throws ClassNotFoundException{
        System.out.println("AAAAAAAAAAAAAAA");
        conexao = new ConexaoBD().getConexao();
        System.out.println("22222222222222");
        cursoExtra = new ArrayList<CursoExtra>();
        System.out.println("3434343434343434343");
    }  
   
 
   public void insere(String nome, String TIA, String curso, String extra) {
        i++;
        String sql = "INSERT INTO curso(codigo,nome, TIA, curso, extra, status, parecer) VALUES (" + i + ",?, ?, ?, ?,?,?)";
        //i++;
        //String aux = (String).valueOf(i);
        try {
            // prepared statement para inserção
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);    
            // seta os valores
            //stmt.setString(1, i++);          //codigo
            stmt.setString(1, nome);         //nome
            stmt.setString(2, TIA);          //id
            stmt.setString(3,  curso);       //curso
            stmt.setString(4, extra);        //extracurricular
            stmt.setString(5, "Pendente");   //status
            stmt.setString(6, "A Verificar");//parecer
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
    
    public boolean podeinserir(String string, String sql) throws SQLException {
        PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement("SELECT * FROM curso where tia <> ? and extra <> ?;");
        stmt.setString(1, string);
        stmt.setString(2, sql);
        System.out.println(stmt);
        ResultSet rs = stmt.executeQuery();
        System.out.println("Resultado =" + rs);
        int i = 0;
        while(rs.next()){
            i++;
        }
        if (i == 0){
            System.out.println("TRUE");
            return true;
        }
        else{
            System.out.println("FALSE");
            return false;  
        }
    
    }

    public boolean validouRequerimento(String string, String sql) throws SQLException {
        PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement("SELECT status FROM curso where tia = ? and extra = ?;");
        stmt.setString(1, string);
        stmt.setString(2, sql);
        System.out.println(stmt);
        ResultSet rs = stmt.executeQuery();
        String resposta = null;
        int i = 0;
        if(rs.next()){
            resposta = rs.getString("status");
        }
        System.out.println("Resposta = " +resposta);
        if(resposta.equals("aprovado") || resposta.equals("reprovado")){
            return true;
        }
        return false;
    }

    boolean dadosConsistentes(String felipe, String string, String cc, String sql) {
        if((felipe.equals("")) || (string.equals("")) || (cc.equals("")) || (sql.equals("")))
             return false;
        return true;   
    }

    boolean requerimentoInserido(String string, String sql) throws SQLException {
        PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement("SELECT status FROM curso where tia = ? and extra = ?;");
        stmt.setString(1, string);
        stmt.setString(2, sql);
        System.out.println(stmt);
        ResultSet rs = stmt.executeQuery();
        String resposta = null;
        int i = 0;
        while(rs.next()){
            i++;
        }
        System.out.println(i);
        if (i >= 1){
            System.out.println("TRUE");
            return true;
        }
        else{
            System.out.println("FALSE");
            return false;  
        }
    }
}
