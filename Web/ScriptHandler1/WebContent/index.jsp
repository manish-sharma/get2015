<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!-- The HTML 4.01 Transitional DOCTYPE declaration-->
<!-- above set at the top of the file will set     -->
<!-- the browser's rendering engine into           -->
<!-- "Quirks Mode". Replacing this declaration     -->
<!-- with a "Standards Mode" doctype is supported, -->
<!-- but may lead to some differences in layout.   -->

<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>Hello </title>
</head>

<body>
	<form action="CrossSideScriptHandler">

		<textarea rows="2" cols="6" name="input"
			style="border: 1px solid black;"></textarea>
		<input type="submit" value="submit" />
	</form>
	<label>Output =<%=request.getParameter("output") %></label>
</body>
</html>
