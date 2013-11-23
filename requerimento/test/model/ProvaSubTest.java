/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class ProvaSubTest {
    
    private ProvaSub provaSub;
    
    public ProvaSubTest() {
        provaSub = new ProvaSub();
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
    
    @Test
    public void getIdTest() {
        provaSub.setId(690);
        int id = provaSub.getId();
        Assert.assertEquals(690, id);
    }

    @Test
    public void setIdTest() {
        provaSub.setId(690);
        Assert.assertEquals(690, provaSub.getId());
    }

    @Test
    public void getId_tiaTest() {
        provaSub.setId_tia("30983101");
        String id_tia = provaSub.getId_tia();
        Assert.assertEquals("30983101", id_tia);
    }

    @Test
    public void setId_tiaTest() {
        provaSub.setId_tia("30983101");
        Assert.assertEquals("30983101", provaSub.getId_tia());
    }

    @Test
    public void getNomeProfTest() {
        provaSub.setNomeProf("Calebe de Paula Bianchini");
        String nomeProf = provaSub.getNomeProf();
        Assert.assertEquals("Calebe de Paula Bianchini", nomeProf);
    }

    @Test
    public void setNomeProfTest() {
        provaSub.setNomeProf("Calebe de Paula Bianchini");
        Assert.assertEquals("Calebe de Paula Bianchini", provaSub.getNomeProf());
    }

    @Test
    public void getNomeDisciplinaTest() {
        provaSub.setNomeDisciplina("Teste de Software");
        String nomeDisciplina = provaSub.getNomeDisciplina();
        Assert.assertEquals("Teste de Software", nomeDisciplina);
    }

    @Test
    public void setNomeDisciplinaTest() {
        provaSub.setNomeDisciplina("Teste de Software");
        Assert.assertEquals("Teste de Software", provaSub.getNomeDisciplina());
    }

    @Test
    public void getCursoTest() {
        provaSub.setCurso("Ciencia da Computacao");
        String curso = provaSub.getCurso();
        Assert.assertEquals("Ciencia da Computacao", curso);
    }

    @Test
    public void setCursoTest() {
        provaSub.setCurso("Ciencia da Computacao");
        Assert.assertEquals("Ciencia da Computacao", provaSub.getCurso());
    }

    @Test
    public void getTurmaTest() {
        provaSub.setTurma("7N");
        String turma = provaSub.getTurma();
        Assert.assertEquals("7N", turma);
    }

    @Test
    public void setTurmaTest() {
        provaSub.setTurma("7N");
        Assert.assertEquals("7N", provaSub.getTurma());
    }

    @Test
    public void getMotivoTest() {
        provaSub.setMotivo("Razoes medicas");
        String motivo = provaSub.getMotivo();
        Assert.assertEquals("Razoes medicas", motivo);
    }

    @Test
    public void setMotivoTest() {
        provaSub.setMotivo("Razoes medicas");
        Assert.assertEquals("Razoes medicas", provaSub.getMotivo());
    }

    @Test
    public void getStatusTest() {
        provaSub.setStatus("Em analise");
        String status = provaSub.getStatus();
        Assert.assertEquals("Em analise", status);
    }

    @Test
    public void setStatusTest() {
        provaSub.setStatus("Em analise");
        Assert.assertEquals("Em analise", provaSub.getStatus());
    }
    
    @Test
    public void getAvaliacaoTest() {
        provaSub.setAvaliacao("sim");
        String avaliacao = provaSub.getAvaliacao();
        Assert.assertEquals("sim", avaliacao);
    }

    @Test
    public void setAvaliacaoTest() {
        provaSub.setAvaliacao("sim");
        Assert.assertEquals("sim", provaSub.getAvaliacao());
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
    }
}
