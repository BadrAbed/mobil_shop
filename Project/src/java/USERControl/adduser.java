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
public class adduser extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String name = request.getParameter("name");
            String pass = request.getParameter("pass");
            String mail = request.getParameter("em");
            String tell = request.getParameter("mn");
            int type = Integer.parseInt(request.getParameter("login type"));
            USER n = Help.newasdd(mail);
            if (n == null) {
                Help.add(name, tell, mail, pass, type);

                USER u = Help.isExist(mail, pass);
       // int t=  u.getType();

                if (u != null && type == 1) {

                    HttpSession sess = request.getSession(true);
                    sess.setAttribute("userObj", u);
                    String s = "Admin.jsp";
                    response.sendRedirect(response.encodeURL(s));
                }
                if (u != null && type == 2) {

                    HttpSession sess = request.getSession(true);
                    sess.setAttribute("userObj", u);
                    String s = "User.jsp";
                    response.sendRedirect(response.encodeURL(s));
                }
                if (u != null && type == 3) {

                    HttpSession sess = request.getSession(true);
                    sess.setAttribute("userObj", u);
                    String s = "Company.jsp";
                    response.sendRedirect(response.encodeURL(s));
                }
            } else {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet NewServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> <font size=\"4\" color=\"red\"> plz enter another emali </font>  </h1>");
                out.println("</body>");
                out.println("</html>");

                RequestDispatcher dis = request.getRequestDispatcher("signin.jsp");
                dis.include(request, response);
                                       // response.sendRedirect("index.html");

            }

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
