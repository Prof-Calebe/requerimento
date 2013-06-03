<%-- 
    Document   : UpdateProvaSub
    Created on : 02/06/2013, 17:17:52
    Author     : Carlos
--%>

<%@page import="java.sql.Connection"%>
<%@page import="BancoDeDados.Conexao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="model.ProvaSub"%>
<%@page import="BancoDeDados.ProvaBanco"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  ProvaBanco provaSub = new ProvaBanco();
          
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
