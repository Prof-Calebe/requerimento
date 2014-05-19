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
    public void TestaInscricaoMaisDeUmCurso() throws ClassNotFoundException, SQLException{
        Curso aux = new Curso();
        boolean resposta1 = aux.podeinserir("9999999", "sql");
        if(resposta1==true)
            aux.insere("FELIPE", "9999999", "CC", "sql");
        boolean resposta2 = aux.podeinserir("9999999", "sql");
        if(resposta2==true)
            aux.insere("FELIPE", "9999999", "CC", "IOS");
        assertEquals(resposta1,resposta2); 
}
    
    public void AvaliarUmCurso(){
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
