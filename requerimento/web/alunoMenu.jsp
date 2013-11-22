<%-- 
    Document   : requerimento
    Created on : 30/05/2013, 17:31:00
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tipos de Requerimentos</title>
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
            <br>
            <br>
            <%String nome = request.getParameter("user");%>
                <img src="Imagem/icon.png" width="35" height="35" />
                <a href="View/Aluno/AbonarFalta.jsp?user=<%=nome%>">Abonar Faltas</a>
            <br>
            <br>
                <img src="Imagem/icon.png" width="35" height="35" />
                <a href="View/Aluno/ProvaSubstitutiva.jsp?user=<%=nome%>">Prova Substitutiva</a>
            <br>
            <br>
                <img src="Imagem/icon.png" width="35" height="35" />
                <a href="View/Aluno/RevisaoProva.jsp?user=<%=nome%>">Revisão da Nota de Prova</a>
            <br>
            <br>
                <img src="Imagem/icon.png" width="35" height="35" />
                <a href="View/Aluno/RevisaoProcomp.jsp?user=<%=nome%>">Revisão da Nota de PROCOMP</a>
            <br>
            <br>
                <img src="Imagem/icon.png" width="35" height="35" />
                <a href="View/Aluno/MudancaTgi.jsp?user=<%=nome%>">Mudanças de Dados de TGI</a>
            <br>
            <br>
                <img src="Imagem/icon.png" width="35" height="35" />
                <a href="View/Aluno/VerificarRequerimento.jsp?user=<%=nome%>">Verificar Requerimento</a>
                
        </center>
    </body>
</html>
