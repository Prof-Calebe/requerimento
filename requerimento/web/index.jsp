<%-- 
    Document   : index
    Created on : 30/05/2013, 16:57:27
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script>
             function validateForm() {
                
                var user = document.forms["indexForm"]["user"].value;
                var pass = document.forms["indexForm"]["pass"].value;
                
                
                if ( user == null || user == "" || pass == null || pass == "" ) {
                    alert("Nao e possivel inserir valores em branco, favor preencher os campos em branco.");
                    return false;
                }
                    return true;
            }
        </script>
    </head>
    
    
    <body>
   
        <center>
            <img src="Imagem/mackenzie1.png"/>
            <br><%--Tag para pular linha --%>
            <a href="http://www.mackenzie.br/portal/principal.php"> <img src="Imagem/home.png" width="45" height="45" /></a><%--Vai para o site do Mackenzie quando clica-se no ícone HOME --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <a href=""> <img src="Imagem/impressora.jpg" width="45" height="45"  OnClick="window.print()"/></a><%--Abre uma página de impressão quando clicamos no ícone da impressora --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <a href="https://www.google.com.br/"> <img src="Imagem/pesquisa.jpg" width="45" height="45" /></a><%--Vai para o site do Google quando clica-se no ícone PESQUISA --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <a href="http://www.mackenzie.com.br/index.php?id=8309"> <img src="Imagem/globo.jpg" width="45" height="45" /></a>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <a href="http://ead.mackenzie.br/moodle/"> <img src="Imagem/moodle.png" width="45" height="45" /></a>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <h1><font color="#8B0000">SISTEMA DE REQUERIMENTO</font></h1>
            
            <form name="indexForm" action="LoginServlet" method="POST" onSubmit="return validateForm()">
                <table>
                    <tr>
                        <td>T.I.A/D.R.T:</td>
                        <td><input type="text" name="user"></td>
                    </tr>
                    <tr>
                        <td>Senha:</td>
                        <td><input type="password" name="pass"></td>
                    </tr>
                </table>
                <br>
                <input type="submit" name="logar"  value="     Entrar      ">
                
                &nbsp<%--Tag para dar espaçoes --%>
               
                <input name="" type="reset"  value="   Cancelar    ">
                </form>      
            
        </center>
    </body>
     
</html>
