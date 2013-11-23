
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script>
            
            function feedback() {
                alert("O requerimento de abono de falta foi enviado para aprovação!");
            }
            
            function validateForm() {
                
                var nomeDisciplina = document.forms["abonarFalta"]["nomeDisciplina"].value;
                var curso = document.forms["abonarFalta"]["curso"].value;
                var turma = document.forms["abonarFalta"]["turma"].value;
                var motivo = document.forms["abonarFalta"]["motivo"].value;
                var data = document.forms["abonarFalta"]["data"].value;
                
                if (
                    nomeDisciplina == null || nomeDisciplina == "" || 
                    curso == null || curso == "" || 
                    turma == null || turma == "" || 
                    motivo == null || motivo == "" ||
                    data == null || data == ""
                ) {
                    alert("Nao e possivel inserir valores em branco, favor preencher os campos em branco.");
                    return false;
                
                } else {
                    feedback();
                }
            }

        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Abono de Faltas</title>
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
            
            <h1>Abono de faltas</h1>
            <form  name="abonarFalta" action = "../../AbonarFaltaServlet" method="POST" onSubmit="return validateForm()">
                <%String user = request.getParameter("user");%>
                 <table>
                     
                        <td><input type="hidden" name="user" value="<%=user%>"></td> 
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
                        <td><input type="text" name="turma" SIZE=50 MAXLENGTH=50></td>
                        </tr>
                        <tr>
                        <td>Motivo do Requerimento:</td>
                        <td><input type="text" name="motivo" SIZE=50 MAXLENGTH=50></td>
                        </tr>
                        <tr>
                        <td>Data da falta:</td>
                        <td><input type="text" name="data" SIZE=50 MAXLENGTH=50></td>
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
