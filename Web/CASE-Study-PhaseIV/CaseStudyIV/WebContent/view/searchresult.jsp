<%@page import="Helper.CarDbHelper"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/cardekho.css">
<title>Insert title here</title>
</head>
<body>
    <header class="upper">
    </header>
    <nav class="upper">
        <ul>
             <li><a href="/CaseStudyIV/view/login.jsp">LOGIN</a>
            </li>
            <li><a href="/CaseStudyIV/view/search.jsp">SEARCH</a>
            </li>
            <li><a href="/CaseStudyIV/index.jsp">HOME</a>
            </li>
        </ul>
    </nav>
    <div class="upper" id="middleContainer">
        <div id="searchresult">
            <form action="#">

                <h2>CAR DETAILS</h2>
                   <table>
                    <tr>
                        <th>Model</th>
                        <th>Details</th>
                        

                    </tr>
        
                       <%
                           String make = request.getParameter("make");
                           CarDbHelper carDbHelper = new CarDbHelper();
                           List<String> modelList= carDbHelper.getModelList(make);  
                           
                           for(String model: modelList)
                           {
                        	  
                        	   out.print("<tr>");                     	  
                        	  
                        	   out.print("<td>"+model+"</td>");
                        	  
                        	   out.print("<td><a href=\"/CaseStudyIV/view/detail.jsp?model="+model+"\">click here</a></td>");
                               out.print("</tr>");
                           }
                       %>
                </table>

            </form>
            </table>
        </div>
    </div>
    <footer class="upper">
        <p>Copyright &copy; 2001 - 2015. DM Driver Motors.
            <p>
    </footer>
</body>
</html>