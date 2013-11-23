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
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class RevisaoProvaTest {
    
    private RevisaoProva revisaoProva;
    
    public RevisaoProvaTest() {
        revisaoProva = new RevisaoProva();
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
        revisaoProva.setId(690);
        int id = revisaoProva.getId();
        Assert.assertEquals(690, id);
    }

    @Test
    public void setIdTest() {
        revisaoProva.setId(690);
        Assert.assertEquals(690, revisaoProva.getId());
    }

    @Test
    public void getId_tiaTest() {
        revisaoProva.setId_tia("30983101");
        String id_tia = revisaoProva.getId_tia();
        Assert.assertEquals("30983101", id_tia);
    }

    @Test
    public void setId_tiaTest() {
        revisaoProva.setId_tia("30983101");
        Assert.assertEquals("30983101", revisaoProva.getId_tia());
    }

    @Test
    public void getNomeProfTest() {
        revisaoProva.setNomeProf("Calebe de Paula Bianchini");
        String nomeProf = revisaoProva.getNomeProf();
        Assert.assertEquals("Calebe de Paula Bianchini", nomeProf);
    }

    @Test
    public void setNomeProfTest() {
        revisaoProva.setNomeProf("Calebe de Paula Bianchini");
        Assert.assertEquals("Calebe de Paula Bianchini", revisaoProva.getNomeProf());
    }

    @Test
    public void getNomeDisciplinaTest() {
        revisaoProva.setNomeDisciplina("Teste de Software");
        String nomeDisciplina = revisaoProva.getNomeDisciplina();
        Assert.assertEquals("Teste de Software", nomeDisciplina);
    }

    @Test
    public void setNomeDisciplinaTest() {
        revisaoProva.setNomeDisciplina("Teste de Software");
        Assert.assertEquals("Teste de Software", revisaoProva.getNomeDisciplina());
    }

    @Test
    public void getCursoTest() {
        revisaoProva.setCurso("Ciencia da Computacao");
        String curso = revisaoProva.getCurso();
        Assert.assertEquals("Ciencia da Computacao", curso);
    }

    @Test
    public void setCursoTest() {
        revisaoProva.setCurso("Ciencia da Computacao");
        Assert.assertEquals("Ciencia da Computacao", revisaoProva.getCurso());
    }

    @Test
    public void getTurmaTest() {
        revisaoProva.setTurma("7N");
        String turma = revisaoProva.getTurma();
        Assert.assertEquals("7N", turma);
    }

    @Test
    public void setTurmaTest() {
        revisaoProva.setTurma("7N");
        Assert.assertEquals("7N", revisaoProva.getTurma());
    }

    @Test
    public void getMotivoTest() {
        revisaoProva.setMotivo("Razoes medicas");
        String motivo = revisaoProva.getMotivo();
        Assert.assertEquals("Razoes medicas", motivo);
    }

    @Test
    public void setMotivoTest() {
        revisaoProva.setMotivo("Razoes medicas");
        Assert.assertEquals("Razoes medicas", revisaoProva.getMotivo());
    }

    @Test
    public void getDataTest() {
        revisaoProva.setData("14/04/2013");
        String data = revisaoProva.getData();
        Assert.assertEquals("14/04/2013", data);
    }

    @Test
    public void setDataTest() {
        revisaoProva.setData("14/04/2013");
        Assert.assertEquals("14/04/2013", revisaoProva.getData());
    }
    
    @Test
    public void getStatusTest() {
        revisaoProva.setStatus("Em analise");
        String status = revisaoProva.getStatus();
        Assert.assertEquals("Em analise", status);
    }

    @Test
    public void setStatusTest() {
        revisaoProva.setStatus("Em analise");
        Assert.assertEquals("Em analise", revisaoProva.getStatus());
    }
    
    @Test
    public void getAvaliacaoTest() {
        revisaoProva.setAvaliacao("sim");
        String avaliacao = revisaoProva.getAvaliacao();
        Assert.assertEquals("sim", avaliacao);
    }

    @Test
    public void setAvaliacaoTest() {
        revisaoProva.setAvaliacao("sim");
        Assert.assertEquals("sim", revisaoProva.getAvaliacao());
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
    }
}
