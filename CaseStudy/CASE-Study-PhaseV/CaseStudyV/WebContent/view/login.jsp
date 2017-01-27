<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="/CaseStudyV/css/cardekho.css">
<title>Login</title>
</head>
<body>
                         
     <header class="upper">
    </header>
    <nav class="upper">
    <div id="marq">
     <p style="display:inline;margin-top: -10px;"> <marquee> <h3 style="display:inline;">UPDATES: </h3> Deepawali Exciting offer <strong> 10% </strong> 
   !!! Get Offers &amp; Discount of Skoda Rapid in Jaipur, Bangalure, Bombey !!!</marquee></p> 
   </div>
     <div id="links">
       <ul> 
          <li><a href="/CaseStudyV/view/login.jsp">LOGIN</a>
           </li>
           <li><a href="/CaseStudyV/view/search.jsp">SEARCH</a>
           </li>
           <li><a href="/CaseStudyV/index.jsp">HOME</a>
           </li>
       </ul> 
    </div>
    </nav>
    <div class="upper" id="middleContainer">
        <div id="login">
            <form action="/CaseStudyV/login" method="POST">

                <h2>Administrator Login</h2>
               
                <table>
                    <tr>
                        <td>User Id:</td>
                        <td> 
                            <input type="text" name="userid" required>
                        </td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td>
                            <input type="password" name="password" required>
                        </td>
					</tr>
					<tr>
						<th colspan=2>
						       <%                
                				Object flag = "";
                				if(request.getAttribute("flag") != null) {
                					flag = request.getAttribute("flag");
                					out.print("<lable style=\"color:red;\">"+flag+"<lable>");
                				}
                %>
						</th>
					</tr>
                </table>
                <button type="submit">LOGIN</button>
            </form>
        </div>
    </div>
    <footer class="upper">
        <p>Copyright &copy; 2001 - 2015. DM Driver Motors.
            <p>
    </footer>
</body>
</html>