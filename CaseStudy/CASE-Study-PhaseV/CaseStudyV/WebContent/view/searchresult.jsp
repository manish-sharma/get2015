<%@page import="service.CarService"%>
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
                           CarService carService = new CarService();
                           List<String> modelList= carService.getModelList(make);  
                           
                           for(String model: modelList)
                           {
                        	  
                        	   out.print("<tr>");                     	  
                        	  
                        	   out.print("<td>"+model+"</td>");
                        	  
                        	   out.print("<td><a href=\"/CaseStudyV/view/detail.jsp?model="+model+"\">click here</a></td>");
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