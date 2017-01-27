<%@page import="Helper.CarDbHelper"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/CaseStudyIV/css/cardekho.css">
<title>Insert title here</title>
</head>
<body>

<header class="upper">
    </header>
    <nav class="upper">
        <ul>
           <li><a href="/CaseStudyIV/logout">LOGOUT</a>
            </li>
            <li><a href="/CaseStudyIV/view/admin/adminsearch.jsp">SEARCH</a>
            </li>
            <li><a href="/CaseStudyIV/view/admin/create.jsp">CREATE</a>
            </li>
            <li><a href="/CaseStudyIV/view/admin/adminindex.jsp">HOME</a>
            </li>
        </ul>
    </nav>
    <div class="upper" id="middleContainer">
        <div id="searchresult">
            <form action="#">

                <h2>CAR DETAILS</h2>
                <table>
                    <tr>
                        <th>Make</th>
                        <th>Model</th>
                        <th>Engine In CC</th>
                        <th>Fuel Capacity(Liters)</th>
                        <th>Milage</th>
                        <th>Price</th>
                        <th>Road Tax</th>
                        <th>AC</th>
                        <th>Power Steering</th>
                        <th>Accessory Kit</th>
                        <th></th>

                    </tr>
        
                       <%
                           String make = request.getParameter("make");
                           CarDbHelper carDbHelper = new CarDbHelper();
                           List<String> modelList= carDbHelper.getModelList(make);  
                           
                           for(String model: modelList)
                           {
                        	   String[] info =  carDbHelper.getInfoByModel(model); 
                        	   out.print("<tr>");                     	  
                        	   out.print("<td>"+info[2]+"</td>");
                        	   out.print("<td>"+info[3]+"</td>");
                        	   out.print("<td>"+info[4]+"</td>");
                        	   out.print("<td>"+info[5]+"</td>");
                        	   out.print("<td>"+info[6]+"</td>");
                        	   out.print("<td>"+info[7]+"</td>");
                        	   out.print("<td>"+info[8]+"</td>");
                        	   out.print("<td>"+info[9]+"</td>");
                        	   out.print("<td>"+info[10]+"</td>");
                        	   out.print("<td>"+info[11]+"</td>");  
                        	   out.print("<td><a href=\"/CaseStudyIV/view/admin/edit.jsp?model="+info[3]+"\">EDIT</a></td>");
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