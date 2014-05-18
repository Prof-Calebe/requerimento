<%-- 
    Document   : VisualizarProvaSubstitutiva
    Created on : 02/06/2013, 05:32:50
    Author     : Carlos
--%>

<%@page import="model.CursoExtra"%>
<%@page import="BancoDeDados.Curso"%>
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
        <form action = "../../../cursoservlet" method="POST" >    
            <% //ProvaSubBD provaSub = new ProvaSubBD();
               Curso aux = new Curso(); 
               List<CursoExtra> listaCursos  = new ArrayList<CursoExtra>(); 
               listaCursos = aux.getLista();
            %>
        
                
        <table border ="1">
            <tr> 
                <td>
                    Código
                </td>
                <td>
                    TIA
                </td>
                <td>
                    Nome
                </td>
                <td>
                    Curso
                </td>
                <td>
                    Extra 
                </td>
                <td>
                    Status
                </td>
                <td>
                    Parecer
                </td>
                <td>
                    Status
                </td>
                <td>
                    Justificativa
                </td>
            </tr>
            <% for(int i = 0; i< listaCursos.size();i++){%>
            <tr> 
                <td>
                    <% out.println(i); %>
                </td>
                <td>
                    <input name ="tia" value ="<% out.println(listaCursos.get(i).getTia()); %>">
                </td>
                <td>
                    <% out.println(listaCursos.get(i).getNome()); %>
                </td>
                <td>
                    <% out.println(listaCursos.get(i).getCurso()); %>
                </td>
                <td>
                    <input name ="extra" value ="<% out.println(listaCursos.get(i).getExtra()); %>">
                    
                </td>
                <td>
                    <% out.println(listaCursos.get(i).getStatus()); %>
                </td>
                <td>
                    <% out.println(listaCursos.get(i).getParecer()); %>
                </td>
                <td>
                    <select name = "status">
                        <option value="dafault"  ></option>
                        <option value="aprovado" >Aprovado</option>
                        <option value="reprovado">Reprovado</option>
                    </select>
                </td>
                <td>
                    <input type="text" name="justif">
                </td>
            </tr>
            <% }%>
        </table>
        <br>
        <br>
        <input type="submit" value="    Ok      ">    
        </form>   
     </center>
    </body>
</html>
