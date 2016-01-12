<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="service.CarService"%>
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
        <div id="detail">
           
                <table>
                    <%
                           String model = request.getParameter("model");
                    CarService carService = new CarService();
                          
                        	String[] info =  carService.getInfoByModel(model);     	  
               
                          
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
    <footer class="upper">
        <p>Copyright &copy; 2001 - 2015. DM Driver Motors.
            <p>
    </footer>
</body>
</html>