
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


public class Control extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try  {
         //  PrintWriter out = response.getWriter()
            String us=request.getParameter("mail");
           String pass=request.getParameter("pass");
          // int logtype=Integer.parseInt(request.getParameter("login type"));
       
          USER u=Help.isExist(us, pass);
        int t= u.getType();
          
           if(u!=null && t==1){
               
               HttpSession sess=request.getSession(true);
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
           }
           
         /*  else{
             PrintWriter out=response.getWriter();
                     out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> <font size=\"4\" color=\"red\"> password or username error </font>  </h1>");
            out.println("</body>");
            out.println("</html>");
                
               
              	RequestDispatcher dis= request.getRequestDispatcher("index.jsp.html");
					dis.include(request, response);
                                      //  response.sendRedirect("index.html");
         
             
               */
        }
        catch(Exception x){
			PrintWriter out=response.getWriter();
			out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> <font size=\"4\" color=\"red\"> password or username error </font>  </h1>");
            out.println("</body>");
            out.println("</html>");
                
               
              	RequestDispatcher dis= request.getRequestDispatcher("index.jsp");
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
