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
public class changepass extends HttpServlet {

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
            String pass=request.getParameter("pass");
           HttpSession sess=request.getSession(true);
       String us=(String) sess.getAttribute("b");         
          
     USER ne = Help.updatepass(pass,us);
       USER u=Help.isExist(us, pass);
        int t= u.getType();
          
           if(u!=null && t==1){
               
                    	out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> <font size=\"4\" color=\"red\"> your update was done </font>  </h1>");
            out.println("</body>");
            out.println("</html>");
               sess.setAttribute("userObj", u);
               String s="Admin.jsp";
               RequestDispatcher dis= request.getRequestDispatcher(s);
					dis.include(request, response);
           }
           if(u!=null && t==2){
               
              out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> <font size=\"4\" color=\"red\"> your update was done </font>  </h1>");
            out.println("</body>");
            out.println("</html>");
               sess.setAttribute("userObj", u);
               String s="User.jsp";
               RequestDispatcher dis= request.getRequestDispatcher(s);
					dis.include(request, response);
           }
             if(u!=null && t==3){
               
               out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> <font size=\"4\" color=\"red\"> your update was done </font>  </h1>");
            out.println("</body>");
            out.println("</html>");
               sess.setAttribute("userObj", u);
               String s="Company.jsp";
               RequestDispatcher dis= request.getRequestDispatcher(s);
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
            out.println("<h1> <font size=\"4\" color=\"red\"> sorry your update was faild </font>  </h1>");
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
