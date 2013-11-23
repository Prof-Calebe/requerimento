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


/**
 *
 * @author Lucas
 */
public class RevisaoTGITest {
    
    private RevisaoTGI revisaoTGI;
    
    public RevisaoTGITest() {
        revisaoTGI = new RevisaoTGI();
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
    public void getId_tiaTest() {
        revisaoTGI.setId_tia("30983101");
        String id_tia = revisaoTGI.getId_tia();
        Assert.assertEquals("30983101", id_tia);
    }

    @Test
    public void setId_tiaTest() {
        revisaoTGI.setId_tia("30983101");
        Assert.assertEquals("30983101", revisaoTGI.getId_tia());
    }

    @Test
    public void getNomeOrientadorTest() {
        revisaoTGI.setNomeOrientador("Calebe de Paula Bianchini");
        String nomeProf = revisaoTGI.getNomeOrientador();
        Assert.assertEquals("Calebe de Paula Bianchini", nomeProf);
    }

    @Test
    public void setNomeOrientadorTest() {
        revisaoTGI.setNomeOrientador("Calebe de Paula Bianchini");
        Assert.assertEquals("Calebe de Paula Bianchini", revisaoTGI.getNomeOrientador());
    }

    @Test
    public void getGrupoTest() {
        revisaoTGI.setGrupo("Reconhecimento de Padroes Naturais");
        String grupo = revisaoTGI.getGrupo();
        Assert.assertEquals("Reconhecimento de Padroes Naturais", grupo);
    }
    
    @Test
    public void setGrupoTest() {
        revisaoTGI.setGrupo("Reconhecimento de Padroes Naturais");
        Assert.assertEquals("Reconhecimento de Padroes Naturais", revisaoTGI.getGrupo());
    }

    @Test
    public void getMotivoTest() {
        revisaoTGI.setMotivo("Razoes medicas");
        String motivo = revisaoTGI.getMotivo();
        Assert.assertEquals("Razoes medicas", motivo);
    }

    @Test
    public void setMotivoTest() {
        revisaoTGI.setMotivo("Razoes medicas");
        Assert.assertEquals("Razoes medicas", revisaoTGI.getMotivo());
    }

    @Test
    public void getStatusTest() {
        revisaoTGI.setStatus("Em analise");
        String status = revisaoTGI.getStatus();
        Assert.assertEquals("Em analise", status);
    }

    @Test
    public void setStatusTest() {
        revisaoTGI.setStatus("Em analise");
        Assert.assertEquals("Em analise", revisaoTGI.getStatus());
    }
    
    @Test
    public void getAvaliacaoTest() {
        revisaoTGI.setAvaliacao("sim");
        String avaliacao = revisaoTGI.getAvaliacao();
        Assert.assertEquals("sim", avaliacao);
    }

    @Test
    public void setAvaliacaoTest() {
        revisaoTGI.setAvaliacao("sim");
        Assert.assertEquals("sim", revisaoTGI.getAvaliacao());
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
    }
}
