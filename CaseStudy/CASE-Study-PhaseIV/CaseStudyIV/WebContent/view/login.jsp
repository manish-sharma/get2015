<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="/CaseStudyIV/css/cardekho.css">
<title>Login</title>
</head>
<body>
                         
     <header class="upper">
    </header>
    <nav class="upper">
        <ul>
            <li><a href="/CaseStudyIV/index.jsp">HOME</a>
            </li>
        </ul>
    </nav>
    <div class="upper" id="middleContainer">
        <div id="login">
            <form action="/CaseStudyIV/login" method="POST">

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