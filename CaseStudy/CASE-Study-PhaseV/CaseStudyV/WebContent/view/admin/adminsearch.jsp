<%@page import="service.CarService"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/CaseStudyV/css/cardekho.css">
<script src="/CaseStudyV/js/cardekho.js"> </script>
<title>Admin Search</title>
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
           <li><a href="/CaseStudyV/logout">LOGOUT</a>
            </li>
            <li><a href="/CaseStudyV/view/admin/adminsearch.jsp">SEARCH</a>
            </li>
            <li><a href="/CaseStudyV/view/admin/create.jsp">CREATE</a>
            </li>
            <li><a href="/CaseStudyV/view/admin/adminindex.jsp">HOME</a>
            </li>
       </ul> 
    </div>
    </nav>
    <div class="upper" id="middleContainer">
        <div id="search">
            <form action="/CaseStudyV/view/admin/adminsearchresult.jsp">
                <h2>SEARCH CAR</h2> Make:
                <select id="make" name="make" onchange="enableSearch()">
                    <option value="" selected disabled>select</option>
                    <% 
                    CarService carService = new CarService();
                      List<String> makes = carService.distinctMake();
                      for(String make: makes)
                      {
                    	  out.print("   <option value=\""+make+"\">"+make+"</option> ")
;                      }
                    %>
                </select>
           
                <button id="searchbutton" type="submit" disabled>SEARCH</button>
            </form>
        </div>
    </div>
    <footer class="upper">
        <p>Copyright &copy; 2001 - 2015. DM Driver Motors.
            <p>
    </footer>

</body>
</html>