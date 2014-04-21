
package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conexao {
    private final String URL = "jdbc:mysql://127.0.0.1:3306/test";
    private final String USER = "root";
    //private final String PASS = "1234";
    private final String PASS = "fh3085628";
    
    public Connection getConexao() throws ClassNotFoundException {
        System.out.println("Conectando com o banco de dados...");
        try {
            Class.forName("com.mysql.jdbc.Driver");            
            System.out.println("1111111...");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("2222222...");
            throw new RuntimeException(e);
        }
    }
    
    public void fechaConexao(Connection con, PreparedStatement stmt, ResultSet set) {
        System.out.println("Fechando conexao com o banco de dados...");
        try {
            System.out.println("333333...");
            if (set != null)
                set.close();
            if (stmt != null)
                stmt.close();
            if (con != null)
                con.close();
        } catch (SQLException e) {
            System.out.println("444444...");
            throw new RuntimeException(e);
        }
    }
}
