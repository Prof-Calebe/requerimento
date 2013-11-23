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
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class RevisaoProcompTest {
    
    private RevisaoProcomp revisaoProcomp;
    
    public RevisaoProcompTest() {
        revisaoProcomp = new RevisaoProcomp();
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
        revisaoProcomp.setId(690);
        int id = revisaoProcomp.getId();
        Assert.assertEquals(690, id);
    }

    @Test
    public void setIdTest() {
        revisaoProcomp.setId(690);
        Assert.assertEquals(690, revisaoProcomp.getId());
    }

    @Test
    public void getId_tiaTest() {
        revisaoProcomp.setId_tia("30983101");
        String id_tia = revisaoProcomp.getId_tia();
        Assert.assertEquals("30983101", id_tia);
    }

    @Test
    public void setId_tiaTest() {
        revisaoProcomp.setId_tia("30983101");
        Assert.assertEquals("30983101", revisaoProcomp.getId_tia());
    }

    @Test
    public void getNomeProfTest() {
        revisaoProcomp.setNomeProf("Calebe de Paula Bianchini");
        String nomeProf = revisaoProcomp.getNomeProf();
        Assert.assertEquals("Calebe de Paula Bianchini", nomeProf);
    }

    @Test
    public void setNomeProfTest() {
        revisaoProcomp.setNomeProf("Calebe de Paula Bianchini");
        Assert.assertEquals("Calebe de Paula Bianchini", revisaoProcomp.getNomeProf());
    }

    @Test
    public void getNomeDisciplinaTest() {
        revisaoProcomp.setNomeDisciplina("Teste de Software");
        String nomeDisciplina = revisaoProcomp.getNomeDisciplina();
        Assert.assertEquals("Teste de Software", nomeDisciplina);
    }

    @Test
    public void setNomeDisciplinaTest() {
        revisaoProcomp.setNomeDisciplina("Teste de Software");
        Assert.assertEquals("Teste de Software", revisaoProcomp.getNomeDisciplina());
    }

    @Test
    public void getCursoTest() {
        revisaoProcomp.setCurso("Ciencia da Computacao");
        String curso = revisaoProcomp.getCurso();
        Assert.assertEquals("Ciencia da Computacao", curso);
    }

    @Test
    public void setCursoTest() {
        revisaoProcomp.setCurso("Ciencia da Computacao");
        Assert.assertEquals("Ciencia da Computacao", revisaoProcomp.getCurso());
    }

    @Test
    public void getTurmaTest() {
        revisaoProcomp.setTurma("7N");
        String turma = revisaoProcomp.getTurma();
        Assert.assertEquals("7N", turma);
    }

    @Test
    public void setTurmaTest() {
        revisaoProcomp.setTurma("7N");
        Assert.assertEquals("7N", revisaoProcomp.getTurma());
    }

    @Test
    public void getMotivoTest() {
        revisaoProcomp.setMotivo("Razoes medicas");
        String motivo = revisaoProcomp.getMotivo();
        Assert.assertEquals("Razoes medicas", motivo);
    }

    @Test
    public void setMotivoTest() {
        revisaoProcomp.setMotivo("Razoes medicas");
        Assert.assertEquals("Razoes medicas", revisaoProcomp.getMotivo());
    }

    @Test
    public void getDataTest() {
        revisaoProcomp.setData("14/04/2013");
        String data = revisaoProcomp.getData();
        Assert.assertEquals("14/04/2013", data);
    }

    @Test
    public void setDataTest() {
        revisaoProcomp.setData("14/04/2013");
        Assert.assertEquals("14/04/2013", revisaoProcomp.getData());
    }
    
    @Test
    public void getStatusTest() {
        revisaoProcomp.setStatus("Em analise");
        String status = revisaoProcomp.getStatus();
        Assert.assertEquals("Em analise", status);
    }

    @Test
    public void setStatusTest() {
        revisaoProcomp.setStatus("Em analise");
        Assert.assertEquals("Em analise", revisaoProcomp.getStatus());
    }
    
    @Test
    public void getAvaliacaoTest() {
        revisaoProcomp.setAvaliacao("sim");
        String avaliacao = revisaoProcomp.getAvaliacao();
        Assert.assertEquals("sim", avaliacao);
    }

    @Test
    public void setAvaliacaoTest() {
        revisaoProcomp.setAvaliacao("sim");
        Assert.assertEquals("sim", revisaoProcomp.getAvaliacao());
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
    }
}
