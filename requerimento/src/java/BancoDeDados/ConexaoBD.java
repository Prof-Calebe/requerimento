
package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConexaoBD {
    private final String URL = "jdbc:mysql://127.0.0.1:3306/test";
    private final String USER = "root";
    //private final String PASS = "1234";
   // private final String PASS = "fh3085628";
    private final String PASS = "administrador";
    public Connection getConexao() throws ClassNotFoundException {
        //System.out.println("Conectando com o banco de dados...");
        try {
            Class.forName("com.mysql.jdbc.Driver");            
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void fechaConexao(Connection con, PreparedStatement stmt, ResultSet set) {
        //System.out.println("Fechando conexao com o banco de dados...");
        try {
            if (set != null)
                set.close();
            if (stmt != null)
                stmt.close();
            if (con != null)
                con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
