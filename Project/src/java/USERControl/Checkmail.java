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
public class Checkmail extends HttpServlet {

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
        try  {
            /* TODO output your page here. You may use following sample code. */
            PrintWriter out = response.getWriter();
            String ma=request.getParameter("mail");
          USER u=Help.newasdd(ma);
           int t= u.getType();
              HttpSession sess=request.getSession(true);
               sess.setAttribute("userObj", u);
               sess.setAttribute("b",u.getMail());
               if(u!=null){
                   String s="newpass.jsp";
               response.sendRedirect(response.encodeURL(s));
               }
         /*  if(u!=null && t==1){
               
               //HttpSession sess=request.getSession(true);
               sess.setAttribute("userObj", u);
               String s="Admin.jsp";
               response.sendRedirect(response.encodeURL(s));
           }
           if(u!=null && t==2){
               
               HttpSession sess=request.getSession(true);
               sess.setAttribute("userObj", u);
               String s="User.jsp";
               response.sendRedirect(response.encodeURL(s));
           }
             if(u!=null && t==3){
               
               HttpSession sess=request.getSession(true);
               sess.setAttribute("userObj", u);
               String s="Company.jsp";
               response.sendRedirect(response.encodeURL(s));
           }*/
                
        
             
        }
          catch(Exception x){
			PrintWriter out=response.getWriter();
			out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> <font size=\"4\" color=\"red\"> sorry your data doesnot exist </font>  </h1>");
            out.println("</body>");
            out.println("</html>");
                
               
              	RequestDispatcher dis= request.getRequestDispatcher("forogetusername.jsp");
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
