/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginBD {
     
    private Connection conexao;
    public LoginBD() throws ClassNotFoundException{
        //conexao = new Conexao().getConexao();
    }  
    
    public String validarUsuario(String identificador) throws SQLException{
        String bancoLogin;
        bancoLogin = "SELECT id FROM pessoa WHERE id ='" + identificador+ "';";
        
        Statement st = conexao.createStatement();
        ResultSet rs = st.executeQuery(bancoLogin);
        
        if (rs.next())
            return rs.getString("id");   
        return null;
        
    }    
    public String validarSenha(String senha) throws SQLException{
        String bancoLogin;
        bancoLogin = "SELECT senha FROM pessoa WHERE senha ='" + senha+ "';";
        
        Statement st = conexao.createStatement();
        ResultSet rs = st.executeQuery(bancoLogin);
        
        if (rs.next())
            return rs.getString("senha");   
        return null;
    }
}
