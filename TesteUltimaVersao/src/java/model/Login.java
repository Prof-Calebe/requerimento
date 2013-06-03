package model;

import BancoDeDados.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {
    private int idFuncionario;
    private String login;
    private String senha;
    
    Login(){
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
    
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getSenha() {
        return senha;
    }   
}

