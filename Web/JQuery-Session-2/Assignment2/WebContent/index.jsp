<%@ page import="java.sql.*"%>

<%
String s=request.getParameter("val");
if(s==null || s.trim().equals("")){
out.print("Please enter Name");
}else{
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mysql");
PreparedStatement ps=con.prepareStatement("select * from emloyee where name=?");
ps.setString(1,s);
ResultSet rs=ps.executeQuery();
while(rs.next()){
out.print("<table>");
out.print("<tr><td>Name :</td><td>"+rs.getString(1)+"</td></tr>");
out.print("<tr><td>Email :</td><td>"+rs.getString(2)+"</td></tr>");
out.print("<tr><td>DOB :</td><td>"+rs.getString(3)+"</td></tr>");
out.print("<tr><td>Address :</td><td>"+rs.getString(4)+"</td></tr>");
out.print("<table>");
}
con.close();
}catch(Exception e){e.printStackTrace();}
}
%>