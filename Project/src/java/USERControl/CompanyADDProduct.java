/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USERControl;

import Helper.Help;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Badr
 */
public class CompanyADDProduct extends HttpServlet {

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
          
      
           try{
                  String product_name=request.getParameter("product_name");
           String C_name=request.getParameter("c_name");
           String C_email=request.getParameter("c_email");
              double  product_price=Double.parseDouble(request.getParameter("price"));
         
         int product_code=Integer.parseInt(request.getParameter("product_code"));
        
            Help hp=new Help();
           boolean check=hp.ADDProduct(product_name, C_email, C_name, product_code, product_price);
           if(check==true){
       out.println("<script type=\"text/javascript\" > alert(\"Added Successful ^_^\");history.back();</script>");

           
           
           }
           if(check==false){
               
               out.println("<script type=\"text/javascript\" > alert(\"Added Failed ^_^\");history.back();</script>");

           }
           }
catch(Exception ex){
                        // out.println("<script type=\"text/javascript\" > alert(\"Added Failed ^_^\");history.back();</script>");

    out.println("<script type=\"text/javascript\" > alert(\"Please insert Double or Integer value in Price \");history.back();</script>");

}
//   out.println(product_name+"<br>"+new_product_code+"<br>"+product_price+"<br>"+current_product_code+"<br>");
        
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
