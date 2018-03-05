
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
public class Addnewuser extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try  {
            PrintWriter out = response.getWriter();
            
            String name =request.getParameter("name");
               String pass =request.getParameter("pass");
                  String mail =request.getParameter("em");
                     String tell =request.getParameter("mn");
                        int type =Integer.parseInt(request.getParameter("login type"));
                         USER u=Help.newasdd(mail);
                   
                
                  
           
                  
       // int t=  u.getType();
          
           if(u==null){
              Help.add(name,tell , mail, pass, type);
                  
                       	out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> <font size=\"4\" color=\"red\"> your add was done </font>  </h1>");
            out.println("</body>");
            out.println("</html>");
                
                 	RequestDispatcher dis= request.getRequestDispatcher("Admin.jsp");
					dis.include(request, response);
               
           }
           else{
                 // PrintWriter out = response.getWriter();
             //   String s="addadmin.jsp";
                    	out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> <font size=\"4\" color=\"red\"> your add was falid </font>  </h1>");
            out.println("</body>");
            out.println("</html>");
                
              	RequestDispatcher dis= request.getRequestDispatcher("addadmin.jsp");
					dis.include(request, response);
           }
                 
        
        }
         catch(Exception x){
               PrintWriter out = response.getWriter();
             //   String s="addadmin.jsp";
                       
              	RequestDispatcher dis= request.getRequestDispatcher("addadmin.jsp");
					dis.include(request, response);
                                        out.println("Your add faild");
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
