/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BancoDeDados;

import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 */
public class TestaCursoFCI {
    
    public TestaCursoFCI() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void TestarInsercaoDeUmRequerimento() throws ClassNotFoundException, SQLException{
        Curso aux = new Curso();
        boolean resposta1 = aux.podeinserir("6666666", "IOS");
        if(resposta1==true){
            aux.insere("ANA", "6666666", "CC", "sql");
        }
        boolean resposta = aux.requerimentoInserido("6666666","sql");
        assertTrue(resposta);
    }
    
    
    @Test
    public void ReprovarUmRequerimentoCurso() throws ClassNotFoundException, SQLException{
        Curso aux = new Curso();
        boolean resposta1 = aux.podeinserir("55555555", "sql");
        System.out.println(resposta1);
        if(resposta1==true){
            aux.insere("Giuliana", "55555555", "CC", "sql");
        }
        aux.atualiza("55555555", "sql", "reprovado", "aluno nao apto");
        boolean resposta;
        resposta = aux.validouRequerimento("55555555", "sql");
        assertTrue(resposta);        
    }
   
    @Test
    public void AprovarUmRequerimentoCurso() throws ClassNotFoundException, SQLException{
        Curso aux = new Curso();
        boolean resposta1 = aux.podeinserir("22222222", "sql");
        System.out.println(resposta1);
        if(resposta1==true){
            aux.insere("FELIPE", "22222222", "CC", "sql");
        }
        aux.atualiza("22222222", "sql", "aprovado", "aluno apto");
        boolean resposta;
        resposta = aux.validouRequerimento("22222222", "sql");
        assertTrue(resposta);        
    }
    
    /*
    @Test
    public void ValidarInsercaoDeUmRequerimentoFalso() throws ClassNotFoundException, SQLException{
        Curso aux = new Curso();
        boolean resposta = aux.requerimentoInserido("8888888","IOS");
        assertFalse(resposta);
    }
    
    
    
    @Test
    public void TestaInscricaoNoMesmoCurso() throws ClassNotFoundException, SQLException{
        Curso aux = new Curso();
        
        boolean resposta1 = aux.podeinserir("9999999", "sql");
        if(resposta1==true)
            aux.insere("FELIPE", "9999999", "CC", "sql");
        boolean resposta2 = aux.podeinserir("9999999", "sql");
        if(resposta2==true)
            aux.insere("FELIPE", "9999999", "CC", "sql");
        assertEquals(resposta1, resposta2);   
    }
    
    @Test
    public void TestaDadosConsistes() throws ClassNotFoundException{
        Curso aux = new Curso();
        boolean resposta = aux.dadosConsistentes("FELIPE", "9999999", "CC", "sql");
        assertTrue(resposta);
    }
    
    @Test
    public void TestaDadosNaoConsistes() throws ClassNotFoundException{
        Curso aux = new Curso();
        boolean resposta = aux.dadosConsistentes("FELIPE", "9999999", "", "");
        assertFalse(resposta);
    }    
    
    @Test
    public void TestaInscricaoMaisDeUmCurso() throws ClassNotFoundException, SQLException{
        Curso aux = new Curso();
        boolean resposta1 = aux.podeinserir("9999999", "sql");
        if(resposta1==true)
            aux.insere("FELIPE", "9999999", "CC", "sql");
        boolean resposta2 = aux.podeinserir("9999999", "IOS");
        if(resposta2==true)
            aux.insere("FELIPE", "9999999", "CC", "IOS");
        assertEquals(resposta1,resposta2); 
}
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}*/
}
