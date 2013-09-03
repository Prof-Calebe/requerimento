<%-- 
    Document   : VerificarRequerimento
    Created on : 02/06/2013, 14:56:34
    Author     : Carlos
--%>

<%@page import="BancoDeDados.RevPro"%>
<%@page import="model.ProvaSub"%>
<%@page import="model.RevisaoTGI"%>
<%@page import="BancoDeDados.TGI"%>
<%@page import="model.RevisaoProva"%>
<%@page import="model.RevisaoNotaProcomp"%>
<%@page import="BancoDeDados.RevNotPro"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="BancoDeDados.ProvaBanco"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <center>
        <img src="Imagem/mackenzie1.png"/>
            <br><%--Tag para pular linha --%>
            <a href="http://www.mackenzie.br/portal/principal.php"> <img src="Imagem/home.png" width="45" height="45" /></a><%--Vai para o site do Mackenzie quando clica-se no ícone HOME --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <a href=""> <img src="Imagem/impressora.jpg" width="45" height="45"  OnClick="window.print()"/></a><%--Abre uma página de impressão quando clicamos no ícone da impressora --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <a href="http://www.mackenzie.com.br/index.php?id=8309"> <img src="Imagem/globo.jpg" width="45" height="45" /></a>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <h1>Requerimentos</h1>
        <% ProvaBanco provaSub = new ProvaBanco();
               List<ProvaSub> listaProvas  = new ArrayList<ProvaSub>(); 
               listaProvas = provaSub.getLista();
               
               RevNotPro revisaoProcomp = new RevNotPro();
               List<RevisaoNotaProcomp> listaRevisao  = new ArrayList<RevisaoNotaProcomp>(); 
               listaRevisao = revisaoProcomp.getLista();
               
               RevPro revisaoprova = new RevPro();
               List<RevisaoProva> listaRevisoes  = new ArrayList<RevisaoProva>(); 
               listaRevisoes = revisaoprova.getLista();
               
               TGI revisaoprova1 = new TGI();
               List<RevisaoTGI> listaRevisoes1  = new ArrayList<RevisaoTGI>(); 
               listaRevisoes1 = revisaoprova1.getLista();
            %>
            <table border ="1">
            <tr> 
            <br>
            <br>
                Requerimentos de Provas Susbstitutivas
                <br>
                <td>
                    TIA
                </td>
                <td>
                    Professor
                </td>
                <td>
                    Disciplina
                </td>
                <td>
                    Curso
                </td>
                <td>
                    Turma
                </td>
                <td>
                    Motivo
                </td>
                <td>
                    Status
                </td>
                <td>
                    Avaliacao
                </td>
            </tr>
            
            <% for(int i = 0; i< listaProvas.size();i++){%>
            <tr> 
                <td>
                    <% out.println(listaProvas.get(i).getId_tia()); %>
                </td>
                <td>
                    <% out.println(listaProvas.get(i).getNomeProf()); %>
                </td>
                <td>
                    <% out.println(listaProvas.get(i).getNomeDisciplina()); %>
                </td>
                <td>
                    <% out.println(listaProvas.get(i).getCurso()); %>
                </td>
                <td>
                    <% out.println(listaProvas.get(i).getTurma()); %>
                </td>
                <td>
                    <% out.println(listaProvas.get(i).getMotivo()); %>
                </td>
                <td>
                    <% out.println(listaProvas.get(i).getStatus()); %>
                </td>
                <td>
                    <% out.println(listaProvas.get(i).getAvaliacao()); %>
                </td>
            
            </tr>
            <%}%>
            <br>
        </table>
        <table border ="1">
            <br>
            <br>
            Requerimentos de Revisão de Nota do Procomp
            <br>
            <tr> 
                <td>
                    TIA
                </td>
                <td>
                    Professor
                </td>
                <td>
                    Disciplina
                </td>
                <td>
                    Curso
                </td>
                <td>
                    Turma
                </td>
                <td>
                    Motivo
                </td>
                <td>
                    Status
                </td>
                <td>
                    Avaliacao
                </td>
            </tr>
            <% for(int i = 0; i< listaRevisao.size();i++){%>
            <tr> 
                <td>
                    <% out.println(listaRevisao.get(i).getId_tia()); %>
                </td>
                <td>
                    <% out.println(listaRevisao.get(i).getNomeProf()); %>
                </td>
                <td>
                    <% out.println(listaRevisao.get(i).getNomeDisciplina()); %>
                </td>
                <td>
                    <% out.println(listaRevisao.get(i).getCurso()); %>
                </td>
                <td>
                    <% out.println(listaRevisao.get(i).getTurma()); %>
                </td>
                <td>
                    <% out.println(listaRevisao.get(i).getMotivo()); %>
                </td>
                <td>
                    <% out.println(listaRevisao.get(i).getStatus()); %>
                </td>
                <td>
                    <% out.println(listaRevisao.get(i).getAvaliacao()); %>
                </td>
            </tr>
            <br>
            <%}%>
        </table>
        
         <table border ="1">
            <tr> 
                <br>
            <br>
                Requerimentos de Rivisão de Nota de Prova
                <td>
                    TIA
                </td>
                <td>
                    Professor
                </td>
                <td>
                    Disciplina
                </td>
                <td>
                    Curso
                </td>
                <td>
                    Turma
                </td>
                <td>
                    Motivo
                </td>
                <td>
                    Status
                </td>
                <td>
                    Avaliacao
                </td>
            </tr>
            <% for(int i = 0; i< listaRevisoes.size();i++){%>
            <tr> 
                <td>
                    <% out.println(listaRevisoes.get(i).getId_tia()); %>
                </td>
                <td>
                    <% out.println(listaRevisoes.get(i).getNomeProf()); %>
                </td>
                <td>
                    <% out.println(listaRevisoes.get(i).getNomeDisciplina()); %>
                </td>
                <td>
                    <% out.println(listaRevisoes.get(i).getCurso()); %>
                </td>
                <td>
                    <% out.println(listaRevisoes.get(i).getTurma()); %>
                </td>
                <td>
                    <% out.println(listaRevisoes.get(i).getMotivo()); %>
                </td>
                <td>
                    <% out.println(listaRevisoes.get(i).getStatus()); %>
                </td>
                <td>
                    <% out.println(listaRevisoes.get(i).getAvaliacao()); %>
                </td>
            </tr>
            <br>
            
            <%}%>
        </table>
        
        <table border ="1">
            <br>
            <br>
            Requerimentos Mudanças de Dados de TGI
            <tr> 
                <td>
                    TIA
                </td>
                <td>
                    Orientador
                </td>
                
                <td>
                    Curso
                </td>
                
                <td>
                    Motivo
                </td>
                <td>
                    Status
                </td>
                <td>
                    Avaliacao
                </td>
            </tr>
            <% for(int i = 0; i< listaRevisoes1.size();i++){%>
            <tr> 
                <td>
                    <% out.println(listaRevisoes1.get(i).getId_tia()); %>
                </td>
                <td>
                    <% out.println(listaRevisoes1.get(i).getNomeOrientador()); %>
                </td>
                
                <td>
                    <% out.println(listaRevisoes1.get(i).getGrupo()); %>
                </td>
                
                <td>
                    <% out.println(listaRevisoes1.get(i).getMotivo()); %>
                </td>
                <td>
                    <% out.println(listaRevisoes1.get(i).getStatus()); %>
                </td>
                <td>
                    <% out.println(listaRevisoes1.get(i).getAvaliacao()); %>
                </td>
            <br>
            
            </tr>
            <%}%>
            
        </table>
        </center>
    </body>
</html>
