/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Felipe
 */
public class CursoExtra {

    private String nome;
    private String tia;
    private String curso;
    private String extra;
    private String status;
    private String parecer;
    
    public CursoExtra(){
        
    }

    public CursoExtra(String nome, String tia, String curso, String extra) {
        this.nome = nome;
        this.tia = tia;
        this.curso = curso;
        this.extra = extra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTia() {
        return tia;
    }

    public void setTia(String tia) {
        this.tia = tia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getParecer() {
        return parecer;
    }

    public void setParecer(String parecer) {
        this.parecer = parecer;
    }

}
