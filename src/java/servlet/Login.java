package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import others.DatabaseConnector;

/**
 *
 * @author omri
 */
@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        if(request.getSession().getAttribute("user") == null){
            request.getRequestDispatcher("/view/login.jsp").forward(request, response);
        }
        else{
            response.sendRedirect("/");
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
        String url = "jdbc:mysql://localhost:3306/webdatabase" , username = "root" , password = "root";
        DatabaseConnector databaseConnector = new DatabaseConnector(url, username, password);
        //make select query
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        String query;
        query = "SELECT username FROM users WHERE username='" + user + "'" +
                "AND " + "password='" + pass + "'";
        if(databaseConnector.isUserExists(query) == 1){
            //delete the old session
            HttpSession oldSession = request.getSession(false);
            if(oldSession != null){
                oldSession.invalidate();
            }
            //create new session
            HttpSession newSession = request.getSession(true);
            if(request.getParameter("remember_me") != null){//user hit remember me
                newSession.setMaxInactiveInterval(60*60*24);//session for 1 day
            }
            else{
                newSession.setMaxInactiveInterval(30*60);//half an hour
            }
            newSession.setAttribute("user", user);
            response.sendRedirect("/");
        }
        else{
            //set error to the user
            request.setAttribute("userMessage", "invalid password or username");
            doGet(request, response);
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
