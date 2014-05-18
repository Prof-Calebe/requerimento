<%-- 
    Document   : Cursos_FCI
    Created on : Apr 19, 2014, 5:30:39 PM
    Author     : Felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Faculdade de Computação e Informática - MACKENZIE</title>
    </head>
    <body>
        <center>
            <img src="../../Imagem/mackenzie1.png"/>
            <br><%--Tag para pular linha --%>
            <a href="http://www.mackenzie.br/portal/principal.php"> <img src="../../Imagem/home.png" width="45" height="45" /></a><%--Vai para o site do Mackenzie quando clica-se no ícone HOME --%>
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
        <h1>Cursos ExtraCurriculares</h1>
            <form action = "cursoservlet" method="POST" >
                <%String user = request.getParameter("user");%>
                
                 <table>
                    <tr>
                        <td><input type="hidden" name="user" value="<%=user%>"></td>     
                        <tr>
                        <td>Nome:</td>
                        <td><input type="text" name="nome" SIZE=50 MAXLENGTH=50></td>
                        </tr>
                        <tr>
                        <td>TIA:</td>
                        <td><input type="text" name="tia" value="<%=user%>"></td>
                        </tr>
                        <tr>
                        <td>Curso:</td>
                        <td><input type="radio" name="curso" VALUE="cc">Ciência da Computação
                        <br><input type="radio" name="curso" VALUE="si">Sistemas da Informação
                        <br><input type="radio" name="curso" VALUE="mat">Matemática</td>
                        </tr>
                        <tr>
                        <td>Curso Extracurricular:</td>
                        <td><input type="radio" name="extra" VALUE="sql">Linguagem SQL
                        <br><input type="radio" name="extra" VALUE="curso">Desenvolvimento IOS
                        <br><input type="radio" name="extra" VALUE="palestra">Desenvolvimento Android</td>
                        </tr>
                 </table>
                <input type="submit" value="Enviar" />
                </form>
                
        </center>
        <center> 
           <form action ="requerimento.jsp" method="POST">
                  <input type="submit" value="Cancelar"/>
           </form>
        </center> 
    </body>
</html>
