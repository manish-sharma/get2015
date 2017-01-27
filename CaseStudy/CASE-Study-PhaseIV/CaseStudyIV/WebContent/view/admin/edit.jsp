<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="Helper.CarDbHelper"%>
<%@page import="java.util.List"%>
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
        <div id="update">
            <h2>Update Car</h2>
             <form action="/CaseStudyIV/edit" method="POST">
                <table>
                    <tr>
                        <th>Property</th>
                        <th>Value</th>
                    </tr>
                    
                     <%
                           String model = request.getParameter("model");
                           CarDbHelper carDbHelper = new CarDbHelper();
                          
                        	   String[] info =  carDbHelper.getInfoByModel(model);     	  
               
                          
                       %>
                    
                    <tr>
                        <td>Make Name</td>
                        <td>
                            <input type="text" name="make" value="<% out.print(info[2]);%>" readonly required>
                        </td>
                    </tr>
                    <tr>
                        <td>Model Name</td>
                        <td>
                            <input type="text" name="model"  value="<% out.print(info[3]);%>" readonly required>
                        </td>
                    </tr>
                    <tr>
                        <td>Engine In CC</td>
                        <td>
                            <input type="number" min="0" name="engincc" value="<% out.print(info[4]);%>"  required>
                        </td>
                    </tr>
                    <tr>
                        <td>Fuel Capacity(Liters)</td>
                        <td>
                            <input type="number" min="0" max="5000" name="capacity"  value="<% out.print(info[5]);%>"  required>
                        </td>
                    </tr>
                    <tr>
                        <td>Milage</td>
                        <td>
                            <input type="number" min="0" max="5000" name="milage"  value="<% out.print(info[6]);%>" required>
                        </td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td>
                            <input type="number" min="0" name="price"  value="<% out.print(info[7]);%>" required>
                        </td>
                    </tr>
                    <tr>
                        <td>Road Tax</td>
                        <td>
                            <input type="number" min="0" name="roadtax" value="<% out.print(info[8]);%>"  required>
                        </td>
                    </tr>
                    <tr>
                        <td>AC</td>
                        <td>
                            <select name="ac">
                                
                                <option <% if(info[9].equals("YES"))out.print("selected");%> value="YES">YES</option>
                                <option <% if(info[9].equals("NO"))out.print("selected");%> value="NO">NO</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Accessory Kit</td>
                        <td>
                            <select name="accesorykit">
                                
                               <option <% if(info[11].equals("YES"))out.print("selected");%> value="YES">YES</option>
                                <option <% if(info[11].equals("NO"))out.print("selected");%> value="NO">NO</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Power Steering</td>
                        <td>
                            <select name="powersteering">
                                <option <% if(info[10].equals("YES"))out.print("selected");%> value="YES">YES</option>
                                <option <% if(info[10].equals("NO"))out.print("selected");%> value="NO">NO</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
						<th colspan=2>
						       <%                
                				Object flag = "";
                				if(request.getAttribute("message") != null) {
                					flag = request.getAttribute("message");
                					out.print("<lable style=\"color:red;\">"+flag+"<lable>");
                				}
                              %>
						</th>
					</tr>
					<tr>
					  <th colspan=2> <button type="submit">EDIT</button> </th>
					</tr>
                </table>
            </form>
        </div>
    </div>
    <footer class="upper">
        <p>Copyright &copy; 2001 - 2015. DM Driver Motors.
            <p>
    </footer>

</body>
</html>