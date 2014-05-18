<%-- 
    Document   : cadastro
    Created on : May 18, 2014, 12:06:32 PM
    Author     : Felipe
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script>
            function feedback() {
                alert("Cadastro Concluido no sistema!");
            }
            
            function validateForm() {
                
                var tia= document.forms["cadastro"]["tia"].value;
                var nome = document.forms["cadastro"]["nome"].value;
                var curso = document.forms["cadastro"]["curso"].value;
                var senha = document.forms["cadastro"]["senha"].value;
                
                if (
                    tia == null || tia == "" || 
                    nome == null || nome == "" || 
                    curso == null || curso == "" || 
                    senha == null || senha == "" || 
                ) {
                    alert("Nao e possivel inserir valores em branco, favor preencher os campos em branco.");
                    return false;
                
                } else {
                    feedback();
                }
            }
            
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
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
            <h1>Cadastro</h1>
            <form action = "CadastroServlet" method="POST" nSubmit="return validateForm()">
                <%String user = request.getParameter("user");%>
                 <table>
                    
                        <td><input type="hidden" name="user" value="<%=user%>"></td>     
                        <tr>
                        <td>TIA:</td>
                        <td><input type="text" name="tia" SIZE=50 MAXLENGTH=50></td>
                        </tr>
                        <tr>
                        <td>Nome:</td>
                        <td><input type="text" name="nome" SIZE=50 MAXLENGTH=50></td>
                        </tr>
                        <tr>
                        <td>Curso:</td>
                        <td><input type="text" name="curso" SIZE=50 MAXLENGTH=50></td>
                        </tr>
                        <tr>
                        <td>Senha:</td>
                        <td><input type="text" name="senha" SIZE=50 MAXLENGTH=50></td></tr>
                        <tr>  
                </table>
                <br>
                <br>
                
                <input type="submit" name="" value="    Enviar     ">
                &nbsp <%--Tag para dar espaçoes --%>
                &nbsp
                &nbsp
                &nbsp
                <a href="../../index.jsp"><input name="" type="button"  value="   Cancelar    " ></a>
             </form>
        </center>
    </body>
</html>