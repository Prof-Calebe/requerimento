
<%@page import="model.RevisaoTGI"%>
<%@page import="BancoDeDados.RevisaoTgiBD"%>
<%@page import="model.RevisaoProva"%>
<%@page import="BancoDeDados.RevisaoProvaBD"%>
<%@page import="model.RevisaoProcomp"%>
<%@page import="BancoDeDados.RevisaoProcompBD"%>
<%@page import="model.ProvaSub"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
            
            <%String nome = request.getParameter("user");%>
                <img src="../../../Imagem/icon.png" width="35" height="35" />
                <a href="VisualizarProvaSubstitutiva.jsp">Visualizar Prova Substitutiva</a>
            <br>
            <br>
                <img src="../../../Imagem/icon.png" width="35" height="35" />
                <a href="VisualizarRevisaoProva.jsp">Visualizar Revisão de Prova</a>
            <br>
            <br>
                <img src="../../../Imagem/icon.png" width="35" height="35" />
                <a href="VisualizarRevisaoProcomp.jsp">Visualizar Revisão de PROCOMP</a>
            <br>
            <br>
                <img src="../../../Imagem/icon.png" width="35" height="35" />
                <a href="VisualizarRevisaoTgi.jsp">Visualizar Mudanças de Dados de TGI</a>
           <br>
           <br>
                <img src="../../../Imagem/icon.png" width="35" height="35" />
                <a href="VisualizarInscricoesFCI.jsp">Visualizar Inscrições de Cursos FCI</a>
           <br>
           <br>
                <a href="../../../funcionarioMenu.jsp">Voltar</a>   
        </center>    
                
            
    </body>
        
     
</html>
