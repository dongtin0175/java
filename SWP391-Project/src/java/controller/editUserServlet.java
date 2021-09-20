/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author MY LAPTOP
 */
@WebServlet(name = "editUserServlet", urlPatterns = {"/edituser"})
public class editUserServlet extends HttpServlet {

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
            out.println("<title>Servlet editUserServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet editUserServlet at " + request.getContextPath() + "</h1>");
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
        String raw_id= request.getParameter("id");
        int id= Integer.parseInt(raw_id);
        DAO db= new DAO();
        Account a= db.getByID(id);
        String role;
        if(a.isIsAdmin()) {
            request.setAttribute("role", "Admin");
        }
        if(a.isIsBooker()) {
            request.setAttribute("role", "Booker");
        }
        if(a.isIsOwner()) {
            request.setAttribute("role", "Owner");
        }
        request.setAttribute("user", a);
        request.getRequestDispatcher("editUser.jsp").forward(request, response);
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
        String raw_id= request.getParameter("id");
        int id= Integer.parseInt(raw_id);
        DAO db= new DAO();
        Account a= db.getByID(id);
        request.setAttribute("user", a);
        String submit= request.getParameter("submit");
        if(submit.equalsIgnoreCase("Cancel")){
        request.getRequestDispatcher("profile.jsp").forward(request, response);
        } else{
            String pass=request.getParameter("pass");
            String uname= request.getParameter("uname");
            String fname= request.getParameter("fname");
            String lname= request.getParameter("lname");
            String email= request.getParameter("email");
            String phone= request.getParameter("phone");
            String role= request.getParameter("role");
            if(db.editAdmin(id,uname, pass, fname, lname, phone, role)!=0){
                request.setAttribute("error", "Update suscessfully!");
                response.sendRedirect("edit_user?id="+id);
            } else{
                request.setAttribute("error", "Update false!");
                response.sendRedirect("edit_user?id="+id);
            }
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
