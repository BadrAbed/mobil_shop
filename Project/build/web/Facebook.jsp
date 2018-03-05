








<%@page import="Bean.USER"%>
<%@page import="Bean.product"%>
<%@page import="java.util.List"%>
<%@page import="Helper.Help"%>
<font size="4.5" color="red">
<%
    if(session.getAttribute("userObj")!=null){
        USER u=(USER)session.getAttribute("userObj");
     
       
            
        out.print("Welcome  , " +u.getName());
        out.println("<br><a href='logout'><font size='4' color='red'>logout</font></a>");
                   //out.println("<br><a href='myacount.jsp'><font size='4' color='red'>My Acount</font></a>");

      
    }else{
        out.println("<br><a href='index.jsp'><font size='4' color='red'>login</font></a>");
      //  response.sendRedirect("index.jsp");
    } 
%>
<br/>

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
<%if(session.getAttribute("userObj")!=null){
        USER u=(USER)session.getAttribute("userObj");
     
                  out.println(" <li><a href='myacount.jsp'>myacount</a></li>");
}
%> 
                   <% if(session.getAttribute("userObj")==null){out.println("<li><a href='Facebook.jsp'>Facebook</a></li>");}%>



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
<div id="fb-root"></div><script>(function(d, s, id) {  var js, fjs = d.getElementsByTagName(s)[0];  if (d.getElementById(id)) return;  js = d.createElement(s); js.id = id;  js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.3";  fjs.parentNode.insertBefore(js, fjs);}(document, 'script', 'facebook-jssdk'));</script><div class="fb-post" data-href="https://www.facebook.com/7ASBET/posts/455588727926034" data-width="500"><div class="fb-xfbml-parse-ignore"><blockquote cite="https://www.facebook.com/7ASBET/posts/455588727926034"><p>KarimAllah Ahmed&#x644;&#x642;&#x62f; &#x62a;&#x631;&#x627;&#x645;&#x64a; &#x625;&#x644;&#x64a; &#x633;&#x645;&#x639;&#x64a; - &#x645;&#x631;&#x647; &#x62a;&#x627;&#x646;&#x64a;&#x647; - &#x625;&#x646; &#x643;&#x644; &#x645;&#x627; &#x62a;&#x642;&#x62f;&#x64a;&#x631;&#x643; &#x627;&#x644;&#x62c;&#x627;&#x645;&#x639;&#x64a; &#x64a;&#x632;&#x64a;&#x62f; &#x643;&#x644; &#x645;&#x627; &#x641;&#x631;&#x635;&#x62a;&#x643; &#x641;&#x64a; &#x625;&#x646;&#x643; &#x62a;&#x644;&#x627;&#x642;&#x64a; &#x634;&#x63a;&#x644; &#x628;&#x62a;&#x632;&#x64a;&#x62f;!&#x634;&#x648;&#x64a;&#x647; ...</p>Posted by ‎<a href="https://www.facebook.com/7ASBET">حاسبات ومعلومات - computer and information</a>‎ on <a href="https://www.facebook.com/7ASBET/posts/455588727926034">Tuesday, March 31, 2015</a></blockquote></div></div>

<br>
<br>
<div id="fb-root"></div><script>(function(d, s, id) {  var js, fjs = d.getElementsByTagName(s)[0];  if (d.getElementById(id)) return;  js = d.createElement(s); js.id = id;  js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.3";  fjs.parentNode.insertBefore(js, fjs);}(document, 'script', 'facebook-jssdk'));</script><div class="fb-post" data-href="https://www.facebook.com/reda.madrid.359/posts/464889506981862" data-width="500"><div class="fb-xfbml-parse-ignore"><blockquote cite="https://www.facebook.com/reda.madrid.359/posts/464889506981862"><p>&#x628;&#x633;&#x645; &#x627;&#x644;&#x644;&#x647; &#x627;&#x644;&#x631;&#x62d;&#x645;&#x646; &#x627;&#x644;&#x631;&#x62d;&#x64a;&#x645;&#x642;&#x635;&#x629; ( &#x62c;&#x633;&#x631; &#x639;&#x644;&#x649; &#x641;&#x62c;&#x648;&#x647; &#x641;&#x643;&#x631;&#x64a;&#x647; )&#x627;&#x644;&#x646;&#x647;&#x627;&#x64a;&#x647; :(...&#x62a;&#x631;&#x643;&#x647;&#x627; &#x648;&#x627;&#x646;&#x635;&#x631;&#x641; . &#x62e;&#x644;&#x639; &#x642;&#x644;&#x628;&#x647; &#x642;&#x628;&#x644; &#x627;&#x646; &#x64a;&#x62e;&#x644;&#x639; &#x62f;&#x628;&#x644;&#x62a;&#x647;&#x627; . &#x645;&#x631;&#x62a; &#x633;&#x646;&#x648;&#x627;&#x62a;...</p>Posted by <a href="https://www.facebook.com/reda.madrid.359">Reda Madrid</a> on <a href="https://www.facebook.com/reda.madrid.359/posts/464889506981862">Tuesday, September 2, 2014</a></blockquote></div></div>
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

            