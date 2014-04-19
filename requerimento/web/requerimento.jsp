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
                <a href="ProvaSubstitutiva.jsp?user=<%=nome%>">Prova Substitutiva</a>
            <br>
            <br>
                <img src="Imagem/icon.png" width="35" height="35" />
                <a href="Revisao_Nota_Prova.jsp?user=<%=nome%>">Revisão da Nota de Prova</a>
            <br>
            <br>
                <img src="Imagem/icon.png" width="35" height="35" />
                <a href="Horas_Estagio_Obrigatorio.jsp?user=<%=nome%>">Horas de Estagio Obrigatorio</a>
            <br>
            <br>
                <img src="Imagem/icon.png" width="35" height="35" />
                <a href="Cursos_FCI.jsp?user=<%=nome%>">Inscrever em Cursos</a>
            <br>
            <br>
                <img src="Imagem/icon.png" width="35" height="35" />
                <a href="ESCP.jsp?user=<%=nome%>">Estagio Supervisionado</a>
            <br>            
            <br>
                <img src="Imagem/icon.png" width="35" height="35" />
                <a href="Revisao_Nota_Procomp.jsp?user=<%=nome%>">Revisão da Nota do PROCOMP</a>
            <br>
            <br>
                <img src="Imagem/icon.png" width="35" height="35" />
                <a href="Mudanças_Dados_TGI.jsp?user=<%=nome%>">Mudanças de Dados de TGI</a>
                
        </center>
    </body>
</html>
