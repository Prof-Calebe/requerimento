
package model;


public class Pessoa {
    private String endereco;
    private int cep;
    private int telefone;
    
    public void Pessoal(){
        this.cep = 0;
        this.endereco ="";
        this.telefone = 0;
    }
        
    public void setEndereco(String n){
        this.endereco = n;
    }
    
    public void setCep(int n){
        this.cep = n;
    }
    
    public void setTel(int n){
        this.telefone = n;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public int getCep(){
        return this.cep;
    }
    
    public int getTel(){
        return this.telefone;
    }
}
