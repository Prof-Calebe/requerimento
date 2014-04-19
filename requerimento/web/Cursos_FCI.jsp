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
        <h1>Cursos FCI</h1>
            <form action = "CursoServlet" method="POST">
                <%String user = request.getParameter("user");%>
                 <table>
                    <tr>
                        <td><input type="hidden" name="user" value="<%=user%>"></td>     
                        <tr>
                        <td>Nome da Professor:</td>
                        <td><input type="text" name="nomeProfessor" SIZE=50 MAXLENGTH=50></td>
                        </tr>
                        <tr>
                        <td>Nome da Disciplina:</td>
                        <td><input type="text" name="nomeDisciplina" SIZE=50 MAXLENGTH=50></td>
                        </tr>
                        <tr>
                        <td>Curso:</td>
                        <td><input type="text" name="curso" SIZE=50 MAXLENGTH=50></td>
                        </tr>
                        <tr>
                        <td>Turma:</td>
                        <td><input type="text" name="turma" SIZE=50 MAXLENGTH=50></td></tr>
                        <tr>
                        <td>Motivo do Requerimento:</td>
                        <td><input type="text" name="motivo" SIZE=50 MAXLENGTH=50></td>
                    </tr>
                    
                </table>
                <br>
                <br>
                </form>        
    </body>
</html>
