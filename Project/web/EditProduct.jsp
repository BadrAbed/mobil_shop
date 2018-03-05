<%@page import="java.util.List"%>
<%@page import="Bean.product"%>
<%@page import="Helper.Help"%>
<%@page import="Bean.USER"%>


<font size="4.5" color="red">
<%
    if(session.getAttribute("userObj")!=null){
        USER u=(USER)session.getAttribute("userObj");
     
            
        out.print("Welcome Company , " +u.getName());
        
        
      
    }else{
        response.sendRedirect("index.jsp");
    } 
%>
<br/>
<a href='logout'>  <font size="4" color="red"> logout </a>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Free Website Template 12</title>
        <link href="styles.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <!-- begin #container -->
        <div id="container">
            <!-- begin #header -->
            <div id="header">
                <div class="mainLogo">
                    <div class="logo">Mobile <span>Store</span></div>
                    <div class="author">design by <a href="http://www.free-flash-websites.com">Free-Flash-Websites.com</a></div>
                </div>
                <div class="icons">
                    <a href=""><img src="images/facebook_32.png" alt="" /></a>&nbsp;<a href=""><img src="images/twitter_32.png" alt="" /></a>
                </div>
                <div id="navcontainer">
                    <ul id="navlist">
                        <li id="active"><a href="welcome.jsp">HOME</a></li>
                        <li class="menuSeparator"><img src="images/menuSeparator.png" alt="" /></li>
                        <li><a href="About.jsp">ABOUT</a></li>
                        <li class="menuSeparator"><img src="images/menuSeparator.png" alt="" /></li>
                        <li><a href="Companies.jsp">Company</a></li>


                        <li class="menuSeparator"><img src="images/menuSeparator.png" alt="" /></li>

                        <li><a href="Product.jsp">Product</a></li>
                       <li class="menuSeparator"><img src="images/menuSeparator.png" alt="" /></li>

                        <li><a href="myacount.jsp">myacount</a></li>


                    </ul>
                </div>
            </div>
            <!-- end #header -->
            <div class="mainContent">
                <div class="leftSidebar">
                    <div class="titleBlock">Mobile Types</div>
                    <div class="blockList">
                        <ul>
                            <li><a href="">Nokia</a></li>
                            <li><a href="">Samsung</a></li>
                            <li><a href="">LG</a></li>
                            <li><a href="">Sony Ericsson</a></li>
                            <li><a href="">Motorola</a></li>
                            <li><a href="">Toshiba</a></li>
                            <li><a href="">Fly</a></li>
                        </ul>
                    </div>
                    <br />
                    <div class="titleBlock">iPhone 3G</div>
                    <div class="blockList">
                        <ul>
                            <li><a href="">Nokia</a></li>
                            <li><a href="">Samsung</a></li>
                            <li><a href="">LG</a></li>
                            <li><a href="">Sony Ericsson</a></li>
                            <li><a href="">Motorola</a></li>
                            <li><a href="">Toshiba</a></li>
                            <li><a href="">Fly</a></li>
                        </ul>
                    </div>
                    <br />
                    <div class="titleBlock">Nokia</div>
                    <div class="blockList">
                        <ul>
                            <li><a href="">Nokia</a></li>
                            <li><a href="">Samsung</a></li>
                            <li><a href="">LG</a></li>
                            <li><a href="">Sony Ericsson</a></li>
                            <li><a href="">Motorola</a></li>
                            <li><a href="">Toshiba</a></li>
                            <li><a href="">Fly</a></li>
                        </ul>
                        <img src="images/phone.jpg" alt="" />
                    </div>
                </div>
              
                 </div>
                 <div class="bodySidebar">
        	
 <%
                //HttpSession Session = request.getSession();

                
            Help em = new Help();
          List<product> l = em.getallproduct();
         

        %>
        <center>
           <%
           String product_code= request.getParameter("product_code");
          // out.println(""+product_code);
        
        
        %>
        <form action="CompanyEditProduct">
            Product Name:  <input type="text" name="product_name" value="" required><br>
              Price:<input type="text" name="price" value="" required><br>
           Product Code:<input type="text" name="Edit_product_code" value="<%= product_code %>" required onkeypress='return event.charCode >= 48 && event.charCode <= 57'><br>
           <input type="hidden" name="product_code" value="<%=product_code%>">
               <input type="submit" value="Update">
                   </form>

        </center>
        </div>
    </div>
    <br class="clearfloat" />
    <!-- begin #footer -->
    <div id="footer">
        <p>
            Terms of Use |
            <a title="This page validates as XHTML 1.0 Strict" href="http://validator.w3.org/check/referer" class="footerLink"><abbr title="eXtensible HyperText Markup Language">XHTML</abbr></a> | 
            <a title="This page validates as CSS" href="http://jigsaw.w3.org/css-validator/check/referer" class="footerLink"><abbr title="Cascading Style Sheets">CSS</abbr></a><br />
            Copyright &copy; Mobile Store. Designed by <a href="http://www.free-flash-websites.com" title="Free Flash Websites">Free Flash Websites</a>
        </p>
    </div>
    <!-- end #footer -->
</div>
                

                </body>
                </html>

        

                  