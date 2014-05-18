/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BancoDeDados.*;
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
@WebServlet(name = "CadastroServlet", urlPatterns = {"/CadastroServlet"})
public class CadastroServlet extends HttpServlet {

    
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //ProvaBanco provaRev = new ProvaBanco();
        System.out.println("entrou");
        Login aux = null;
        aux = new Login();
        
        String tia = request.getParameter("tia");
        String nome = request.getParameter("nome");
        String curso = request.getParameter("curso");
        String senha = request.getParameter("senha");
        String user = request.getParameter("user");
        String tipo;
        if(Integer.parseInt(user)> 30000000 && Integer.parseInt(user) < 39999999){
           tipo = "A";
        }else{
           tipo = "F";
        }
        
        
        try {
            System.out.println("insere");
            /* TODO output your page here. You may use following sample code. */
            //provaRev.insere(user,nomeProfessor, nomeDisciplina, curso, turma, motivo, data);
            System.out.println(tia + " - "+nome +" - " + curso +" - " + senha);
            aux.insereUsuario(tia,senha, nome, curso,tipo);
            System.out.println("inseriu");
            response.sendRedirect("index.jsp?user="+user);
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProvaSubServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProvaSubServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroServlet.class.getName()).log(Level.SEVERE, null, ex);
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