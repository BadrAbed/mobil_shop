<%-- 
    Document   : view my profile
    Created on : May 9, 2015, 5:26:04 PM
    Author     : Badr
--%> <font size="4" color="red">
<%
    if(session.getAttribute("userObj")!=null){
        USER u=(USER)session.getAttribute("userObj");
            if(u.getType()==2){
            
        out.print("Welcome, USER " + u.getName());
        }
          if(u.getType()==1){
            
        out.print("Welcome,Admin " +u.getName());
        
        }
            if(u.getType()==3){
            
        out.print("Welcome,company " +u.getName());
        }
        //out.println("<a href='logout'>   logout </a>");
    }else{
        response.sendRedirect("index.jsp");
    } 
%>
<br/>
<a href='logout'> <font size="4" color="red">  logout </a>
<%@page import="Bean.USER"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="styles.css" rel="stylesheet" type="text/css" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
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
        <div class="rightSidebar">
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
            <% 
                         USER u=(USER)session.getAttribute("userObj");
                           // out.print(u.getName());
                    %>
        <p><b>  <font size="6" > your data is : </font></b></p>
        <td>  <font size="6" > email : </td>
           <font size="5" color="red" >
           
                           <% 
                        // USER u=(USER)session.getAttribute("userObj");
                            out.print(u.getMail());
                    %>
            <table>
                <tr>
                    <td> 
                        <font size="6" > 
                        Name :</td>
                    <td>
                        <font size="6" color="red">
                        <% 
                         //USER u=(USER)session.getAttribute("userObj");
                            out.print(u.getName());
                    %></td>
                    </font>
                </tr>
               
                <tr>
                    <td>  <font size="6" > Password:</td>
                    <td>
                         <font size="6" color="red">
                        <% 
                        // USER u=(USER)session.getAttribute("userObj");
                            out.print(u.getPassword());
                    %>
                    </td>
                </tr>
                <tr>
                    
                    <td>
                     
                    
                    </td>
                </tr>
                <tr>
                    <td>  <font size="6"> mobile:</td>
                    <td> 
                         <font size="5" color="red">
                       <% 
                        // USER u=(USER)session.getAttribute("userObj");
                            out.print(u.getMob());
                    %></td>
                </tr>
                  <tr>
                    <td>  <font size="6"> UserType:</td>
                    <td> 
                         <font size="5" color="red">
                       <% 
                        // USER u=(USER)session.getAttribute("userObj");
                          if(  u.getType()==1){
                              out.println("Admin");
                          }
                          if(  u.getType()==2){
                              out.println("USER");
                          }
                          if(  u.getType()==3){
                              out.println("Company");
                          }
                    %></td>
                </tr>
                <tr>
                    <td>
                        
                
                    </td>
                </tr>
            </table>
        <br/>
        <center>  <a href="update data.jsp"> <font size="5" color="red"> update data </a>   </center>
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
