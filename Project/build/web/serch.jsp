 <%@page import="Helper.Help"%>
<%@page import="javax.jms.Session"%>
 <%@page import="java.util.List"%>
<%@page import="Bean.USER"%>

<%@page import="java.util.List"%>

<%@page import="Helper.Help"%>
<%@page import="Bean.USER"%>
<font size="4.5" color="red">

<%
    if(session.getAttribute("userObj")!=null){
        USER u=(USER)session.getAttribute("userObj");
     
       
            
        out.print("Welcome Admin , " +u.getName());
        
       
      
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
<table border="1" align="center" width="100%" >
            <caption> <font size="8" color="red">All Users</caption>
            <tr>
     <th>    <font size="4.5" color="red">    ID</th>
       <th>    <font size="4.5" color="red">     Name</th>
              
       <th>    <font size="4.5" color="red">      Mail</th>
       <th>    <font size="4.5" color="red">     Mobile</th>
       
        <th>   <font size="4.5" color="red">     Type</th>
              
            </tr>
            <tr>
                <%     
               USER s =(USER)session.getAttribute("sname");
                   
                     Help em = new Help();
          List<USER> i = em.search(s.getID());
                    for (USER m : i) {
                    
                %>
                 <td> <font size="4.5" ><% out.println(m.getID()); %> </td>
                <td> <font size="4.5" ><% out.println(m.getName()); %> </td>
                
                <td><font size="4.5" ><%  out.println(m.getMail()); %></td>
                <td><font size="4.5" ><% out.println(m.getMob()); %></td>
                <td><font size="4.5" ><% out.println(m.getPassword()); %> </td>
                 <td>
                     <font size="4.5" >
                     <% 
                if(m.getType()==1){
                out.println("Admin");}
                if(m.getType()==2){
                out.println("USER");}
                if(m.getType()==3){
                out.println("Company");}
                 %>
                 </td>
                
 
                 
            </tr>
            <%
                }
            %>
 
        </table>