<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action='TemperatureConverterUse'>
		<table>
		  <tr>
		    <td>Fahrenheit to Celsius:</td>
		    <td>
		    <input class="frmInput" type="number" size="30" name="Fahrenheit" step="any"/>
		    </td>
		    <td>${result}</td>
		  </tr>
		</table>

<table>
  <tr>
    <td>Celsius to Fahrenheit:</td>
    <td>
    <input class="frmInput" type="number" size="30" name="Celsius"step="any"/> 
    </td>
    <td>${result1}</td>
  </tr>
  <tr>
    <td></td>
    <td align="right">
    <input type="submit" value="Submit" class="button">
    </td>
  </tr>
</table>
</form>
</body>
</html>