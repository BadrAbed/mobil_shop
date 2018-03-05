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
                
                <center>

 <%
                //HttpSession Session = request.getSession();
 USER u=null;
                   if (session.getAttribute("userObj") != null) {
       u = (USER) session.getAttribute("userObj");
    } else {
        response.sendRedirect("index.jsp");
    } 
            Help em = new Help();
          List<product> l = em.getallcompanyproduct(u.getMail());
                  



          if(l.isEmpty()||l==null){
                      out.println("<script type=\"text/javascript\" > alert(\"You don't have any product  ^_^\");history.back();</script>");

          }
        %>
        <table border="1" align="center" width="40%">
            <caption> All product</caption>
            <tr>
                <th>name</th>
                <th>c_mail</th>
                <th>c_name</th>
                <th>prod_code</th>
                <th>price</th>
                <th>Action</th>
            </tr>
            <tr>
                       <%    
for (product e : l) {

 
                %>
                <td> <%= e.getName() %> </td>
                <td><%= e.getC_mail() %></td>
                <td><%=e.getC_name()%></td>
                <td><%=e.getProduct_code()%></td>
                <td><%=e.getPrice()%> </td>
                <td> <form action="CompanyDeleteProduct">
                        <input type="hidden" name="product_code" value="<%=e.getProduct_code()%>">
                       <!-- <select name="product_code">
                            <option value=""></option>
                        </select>-->
                        <input type="submit" name="Delete" value="Delete"/>        </form>
                       <form action="EditProduct.jsp">
                        <input type="hidden" name="product_code" value="<%=e.getProduct_code()%>">
                       <!-- <select name="product_code">
                            <option value=""></option>
                        </select>-->
                        <input type="submit" name="Edit" value="Edit"/>   
                       </form>
                        
                        
 </td>
              
            </tr>
            <%
                }
            //<%session.setAttribute("productcode", e.getProduct_code());
            %>
            </table>
            </center> 
                </body>
                </html>
