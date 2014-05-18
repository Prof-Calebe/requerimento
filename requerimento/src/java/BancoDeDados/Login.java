/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class Login {
    public static int i = 1;
    private Connection conexao;
    private String tia;
    private String senha;
    private String nome;
    private String Curso;
    public Login() throws ClassNotFoundException{
        System.out.println("AAAAAAAAAAAAAAA");
        conexao = new ConexaoBD().getConexao();
    }  
    public void insereUsuario(String TIA, String senha, String nome, String curso, String tipo)throws SQLException{
        String bancoLogin;
        bancoLogin = "INSERT INTO pessoa(id,senha,nome,curso,tipo) VALUES (?, ?, ?, ?,?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(bancoLogin);    
            // seta os valores
            stmt.setString(1, TIA);
            stmt.setString(2, senha);
            stmt.setString(3, nome);
            stmt.setString(4,  curso);            
            stmt.setString(5,  tipo);
            // executa
            System.out.println(bancoLogin);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }    

    
}
