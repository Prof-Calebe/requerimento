<%-- 
    Document   : VisualizarProvaSubstitutiva
    Created on : 02/06/2013, 05:32:50
    Author     : Carlos
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.ProvaSub"%>
<%@page import="BancoDeDados.ProvaSubBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <img src="../../../Imagem/mackenzie1.png"/>
            <br><%--Tag para pular linha --%>
            <a href="http://www.mackenzie.br/portal/principal.php"> <img src="../../../Imagem/home.png" width="45" height="45" /></a><%--Vai para o site do Mackenzie quando clica-se no ícone HOME --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <a href=""> <img src="../../../Imagem/impressora.jpg" width="45" height="45"  OnClick="window.print()"/></a><%--Abre uma página de impressão quando clicamos no ícone da impressora --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <a href="http://www.mackenzie.com.br/index.php?id=8309"> <img src="../../../Imagem/globo.jpg" width="45" height="45" /></a>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <h1>Requerimentos</h1>
            <br>
            <br>
            
            <% //ProvaSubBD provaSub = new ProvaSubBD();
               List<ProvaSub> listaProvas  = new ArrayList<ProvaSub>(); 
               //listaProvas = provaSub.getLista();
            %>
            <form action = "UpdateProvaSub.jsp" method="POST"> 
                
        <table border ="1">
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
                    <input type="text" name="status">
                </td>
                <td>
                    <input type="text" name="avaliacao">
                </td>
            </tr>
            <%}%>
        </table>
        <br>
        <br>
        <input type="submit" value="    Ok      ">    
        </form>   
     </center>
    </body>
</html>
