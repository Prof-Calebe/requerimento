<%-- 
    Document   : Mudanças_Dados_TGI
    Created on : 30/05/2013, 17:37:37
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title> 
        <script> 
            function feedback() {
                alert("O requerimento foi inserido no sistema!")
            }
            
            function validateForm() {
                
                var nomeOrientador = document.forms["mudancaTgi"]["nomeOrientador"].value;
                var curso = document.forms["mudancaTgi"]["curso"].value;
                var grupo = document.forms["mudancaTgi"]["grupo"].value;
                var motivo = document.forms["mudancaTgi"]["motivo"].value;
                
                if (
                    nomeOrientador == null || nomeOrientador == "" || 
                    curso == null || curso == "" || 
                    grupo == null || grupo == "" || 
                    motivo == null || motivo == "" 
                ) {
                    alert("Nao e possivel inserir valores em branco, favor preencher os campos em branco.");
                    return false;
                
                } else {
                    feedback();
                }
            }
            
         </script>
    </head>
    <body>
        <center>
            <img src="../../Imagem/mackenzie1.png"/>
            <br><%--Tag para pular linha --%>
            <a href="http://www.mackenzie.br/portal/principal.php"> <img src="../../Imagem/home.png" width="45" height="45" /></a> <%--Vai para o site do Mackenzie quando clica-se no ícone HOME --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <a href=""> <img src="../../Imagem/impressora.jpg" width="45" height="45"  OnClick="window.print()"/></a><%--Abre uma página de impressão quando clicamos no ícone da impressora --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <a href="http://www.mackenzie.com.br/index.php?id=8309"> <img src="../../Imagem/globo.jpg" width="45" height="45" /></a>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            &nbsp<%--Tag para dar espaçoes --%>
            <h1>Mudanças de Dados de TGI</h1>
            <form name="mudancaTgi" action = "../../MudancaTgiServlet" method="POST" onSubmit="return validateForm()">
                <%String user = request.getParameter("user");%>
                 <table>
                    
                        <td><input type="hidden" name="user" value="<%=user%>"></td>     
                        <tr>
                        <td>Nome da Orientador:</td>
                        <td><input type="text" name="nomeOrientador" SIZE=50 MAXLENGTH=50></td>
                        </tr>
                        <tr>
                        <td>Curso:</td>
                        <td><input type="text" name="curso" SIZE=50 MAXLENGTH=50></td>
                        </tr>
                        <tr>
                        <td>Grupo:</td>
                        <td><input type="text" name="grupo" SIZE=50 MAXLENGTH=50></td>
                        </tr>
                        <tr>
                        <td>Motivo do Requerimento:</td>
                        <td><input type="text" name="motivo" SIZE=50 MAXLENGTH=50></td>
                        </tr>
                    
                </table>
                <br>
                <br>
                
                <input type="submit" name="" value="    Enviar     ">
                &nbsp <%--Tag para dar espaçoes --%>
                &nbsp
                &nbsp
                &nbsp
                <a href="../../alunoMenu.jsp"><input name="" type="button"  value="   Cancelar    " ></a>
             </form>
        </center>
    </body>
</html>
