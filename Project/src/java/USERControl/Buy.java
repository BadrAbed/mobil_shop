/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USERControl;

//import Bean.product;
import DatabaseConnection.DatabaseConnection;
import Helper.Help;
//import Helper.Help;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import static org.eclipse.jdt.internal.compiler.parser.Parser.name;

/**
 *
 * @author ahmed
 */
public class Buy extends HttpServlet {

    static Connection con;
    static PreparedStatement preStmt;
    static ResultSet result;

     /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
                {
            /* TODO output your page here. You may use following sample code. */
           String productName = request.getParameter("productName");
            String companyMail = request.getParameter("companyMail");
            String companyName = request.getParameter("companyName");
           String productCode = request.getParameter("productCode");
            String productPrice =request.getParameter("productPrice");
            String customermail= request.getParameter("customermail");
            Help hp=new Help();
            boolean check= hp.add_customer_product(productCode, customermail, productName, companyName, companyMail, productPrice);
            if(check==true){
       out.println("<script type=\"text/javascript\" > alert(\"Added Successful ^_^\");history.back();</script>");

           
           
           }
           else{
               
               out.println("<script type=\"text/javascript\" > alert(\"Added Failed ^_^\");history.back();</script>");

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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Buy.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Buy.class.getName()).log(Level.SEVERE, null, ex);
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