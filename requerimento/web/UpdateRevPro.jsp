<%-- 
    Document   : UpdateRevPro
    Created on : 02/06/2013, 19:37:28
    Author     : Carlos
--%>

<%@page import="BancoDeDados.RevPro"%>
<%@page import="BancoDeDados.RevNotPro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% RevPro provaSub = new RevPro();
         
            provaSub.altera("31031161");
            provaSub.altera("31047262");
            provaSub.altera("31089062");
            provaSub.altera("31021158");
            provaSub.altera("30655749");
            
            %>
    <center>
        <br>
            Requerimento Avaliado com Sucesso
        <br>
        <a href="Cordenador.jsp"> Voltar</a>
    </center>
    </body>
</html>
