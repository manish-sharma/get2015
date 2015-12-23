<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="Helper.CarDbHelper"%>
<%@page import="java.util.List"%>
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
        <div id="detail">
            <div id="detaildiv1">
                <img src="/CaseStudyIV/images/detail1.jpg" alt="image of car">
            </div>
            <div id="detaildiv2">
                <table>
                    <%
                           String model = request.getParameter("model");
                           CarDbHelper carDbHelper = new CarDbHelper();
                          
                        	String[] info =  carDbHelper.getInfoByModel(model);     	  
               
                          
                       %>
                
                    <tr>
                        <td class="firsttd">Make:</td>
                        <td><% out.print(info[2]);%></td>
                    </tr>
                    <tr>
                        <td class="firsttd">Model:</td>
                        <td><% out.print(info[3]);%></td>
                    </tr>
                    <tr>
                        <td class="firsttd">Engine In CC:</td>
                        <td><% out.print(info[4]);%></td>
                    </tr>
                    <tr>
                        <td class="firsttd">Fuel Capacity(Liters):</td>
                        <td><% out.print(info[5]);%></td>
                    </tr>
                    <tr>
                        <td class="firsttd">Milage:</td>
                        <td><% out.print(info[6]);%></td>
                    </tr>
                    <tr>
                        <td class="firsttd">Price:</td>
                        <td><% out.print(info[7]);%></td>
                    </tr>
                    <tr>
                        <td class="firsttd">Road Tax:</td>
                        <td><% out.print(info[8]);%></td>
                    </tr>
                    <tr>
                        <td class="firsttd">AC:</td>
                        <td><% out.print(info[9]);%></td>
                    </tr>
                    <tr>
                        <td class="firsttd">Accessory Kit:</td>
                        <td><% out.print(info[11]);%></td>
                    </tr>
                    <tr>
                        <td class="firsttd">Power Steering:</td>
                        <td><% out.print(info[10]);%></td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
    <footer class="upper">
        <p>Copyright &copy; 2001 - 2015. DM Driver Motors.
            <p>
    </footer>
</body>
</html>