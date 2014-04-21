/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import BancoDeDados.Curso;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Felipe
 */
@WebServlet(name = "CursoServlet2", urlPatterns = {"/cursoservlet"})
public class CursoServlet2 extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Curso aux;
        aux = new Curso();
        String tia = request.getParameter("tia");
        String nome = request.getParameter("nome");
        String curso = request.getParameter("curso");
        String extra = request.getParameter("extra");
        Integer num = Integer.parseInt(tia);
        
        try {
            /* TODO output your page here. You may use following sample code. */
            aux.insere(nome,tia,curso, extra);
            response.sendRedirect("requerimento.jsp?user="+tia);
            
        } finally {            
            out.close();
        }
    }
}
