/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USERControl;

import Bean.USER;
import Helper.Help;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Badr
 */
public class search extends HttpServlet {

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
        try{
            PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
               int name = Integer.parseInt(request.getParameter("name"));
                  HttpSession sess=request.getSession(true);
               //sess.setAttribute("sname",name);
           Help em = new Help();
          List<USER> l = em.search(name);
         	
         for(USER U :l){
             	// HttpSession sess=request.getSession(true);
               sess.setAttribute("sname",U);
        
         
         //USER n =(USER) sess.getAttribute("sname");
         //if(n.getName()!=null){
             RequestDispatcher dis= request.getRequestDispatcher("serch.jsp");
					dis.include(request, response); }
         
         if(l.isEmpty()){
         
          		
			out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> <font size=\"4\" color=\"red\"> id doest exist </font>  </h1>");
            out.println("</body>");
            out.println("</html>");
                
               
              	RequestDispatcher dis= request.getRequestDispatcher("viewusers.jsp");
					dis.include(request, response);
        }
         
        }
         catch(Exception x){
			PrintWriter out=response.getWriter();
			out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> <font size=\"4\" color=\"red\"> id doest exist </font>  </h1>");
            out.println("</body>");
            out.println("</html>");
                
               
              	RequestDispatcher dis= request.getRequestDispatcher("viewusers.jsp");
					dis.include(request, response);
		
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
        processRequest(request, response);
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
        processRequest(request, response);
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
