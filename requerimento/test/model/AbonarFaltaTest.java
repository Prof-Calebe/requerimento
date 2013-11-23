/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
//mport static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class AbonarFaltaTest {
    
    private AbonarFalta abonoFalta;
    
    public AbonarFaltaTest() {
        abonoFalta = new AbonarFalta();
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
        abonoFalta.setId(690);
        int id = abonoFalta.getId();
        Assert.assertEquals(690, id);
    }

    @Test
    public void setIdTest() {
        abonoFalta.setId(690);
        Assert.assertEquals(690, abonoFalta.getId());
    }

    @Test
    public void getId_tiaTest() {
        abonoFalta.setId_tia("30983101");
        String id_tia = abonoFalta.getId_tia();
        Assert.assertEquals("30983101", id_tia);
    }

    @Test
    public void setId_tiaTest() {
        abonoFalta.setId_tia("30983101");
        Assert.assertEquals("30983101", abonoFalta.getId_tia());
    }

    @Test
    public void getNomeDisciplinaTest() {
        abonoFalta.setNomeDisciplina("Teste de Software");
        String nomeDisciplina = abonoFalta.getNomeDisciplina();
        Assert.assertEquals("Teste de Software", nomeDisciplina);
    }

    @Test
    public void setNomeDisciplinaTest() {
        abonoFalta.setNomeDisciplina("Teste de Software");
        Assert.assertEquals("Teste de Software", abonoFalta.getNomeDisciplina());
    }

    @Test
    public void getCursoTest() {
        abonoFalta.setCurso("Ciencia da Computacao");
        String curso = abonoFalta.getCurso();
        Assert.assertEquals("Ciencia da Computacao", curso);
    }

    @Test
    public void setCursoTest() {
        abonoFalta.setCurso("Ciencia da Computacao");
        Assert.assertEquals("Ciencia da Computacao", abonoFalta.getCurso());
    }

    @Test
    public void getTurmaTest() {
        abonoFalta.setTurma("7N");
        String turma = abonoFalta.getTurma();
        Assert.assertEquals("7N", turma);
    }

    @Test
    public void setTurmaTest() {
        abonoFalta.setTurma("7N");
        Assert.assertEquals("7N", abonoFalta.getTurma());
    }

    @Test
    public void getMotivoTest() {
        abonoFalta.setMotivo("Razoes medicas");
        String motivo = abonoFalta.getMotivo();
        Assert.assertEquals("Razoes medicas", motivo);
    }

    @Test
    public void setMotivoTest() {
        abonoFalta.setMotivo("Razoes medicas");
        Assert.assertEquals("Razoes medicas", abonoFalta.getMotivo());
    }

    @Test
    public void getDataTest() {
        abonoFalta.setData("14/04/2013");
        String data = abonoFalta.getData();
        Assert.assertEquals("14/04/2013", data);
    }

    @Test
    public void setDataTest() {
        abonoFalta.setData("14/04/2013");
        Assert.assertEquals("14/04/2013", abonoFalta.getData());
    }
    
    @Test
    public void getStatusTest() {
        abonoFalta.setStatus("Em analise");
        String status = abonoFalta.getStatus();
        Assert.assertEquals("Em analise", status);
    }

    @Test
    public void setStatusTest() {
        abonoFalta.setStatus("Em analise");
        Assert.assertEquals("Em analise", abonoFalta.getStatus());
    }
    
    @Test
    public void getAvaliacaoTest() {
        abonoFalta.setAvaliacao("sim");
        String avaliacao = abonoFalta.getAvaliacao();
        Assert.assertEquals("sim", avaliacao);
    }

    @Test
    public void setAvaliacaoTest() {
        abonoFalta.setAvaliacao("sim");
        Assert.assertEquals("sim", abonoFalta.getAvaliacao());
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
    }
}
