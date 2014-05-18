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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Felipe
 */
@WebServlet(name = "CursoServlet", urlPatterns = {"/cursoservlet"})
public class CursoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        String status = request.getParameter("status");
        String justif = request.getParameter("justif");
        try{
                if(status.equals("aprovado") || status.equals("reprovado")) {
                /* TODO output your page here. You may use following sample code. */
                aux.atualiza(tia,extra,status,justif);
                response.sendRedirect("funcionarioMenu.jsp?user="+tia);
                } else {
                /* TODO output your page here. You may use following sample code. */
                aux.insere(nome,tia,curso, extra);
                response.sendRedirect("alunoMenu.jsp?user="+tia);

                }
        }
    finally {
                out.close();
            }    
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     try {
         processRequest(request, response);
     } catch (SQLException ex) {
         Logger.getLogger(CursoServlet.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(CursoServlet.class.getName()).log(Level.SEVERE, null, ex);
     }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     try {
         processRequest(request, response);
     } catch (SQLException ex) {
         Logger.getLogger(CursoServlet.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(CursoServlet.class.getName()).log(Level.SEVERE, null, ex);
     }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
