<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <link rel="StyleSheet" href="StyleSheet.css" />
	<script type="text/javascript" src="script.js"></script>
	<title>Registration</title>
	
</head>
<body>
<form action="RegistrationForm" method="get">
		<div class="container">
			<div class="header">Registration</div>
			<div class="content">
				<table cellspacing="15">
					<tr align="right">
						<td>*First Name :</td>
						<td><input type="text" id="firstName" name="firstName"
							placeholder="Enter First Name"></td>
					</tr>
					<tr align="right">
						<td>*Last Name :</td>
						<td><input type="text" id="lastName" name="lastName" placeholder="Enter Last Name"></td>
					</tr>
					<tr align="right">
						<td>*Password :</td>
						<td><input type="password" id="password" name="password" placeholder="Enter password"></td>
					</tr>
					<tr align="right">
						<td>*Re-enter Password :</td>
						<td><input type="password" id="confirmPassword" name="confirmPassword" placeholder="Re-Enter password"></td>
					</tr>
					
					<tr align="right">
						<td>*Select Your State :</td>
						<td><select style="width: 175px" onchange="setCities()" id="state" name="state">
								<option>Select State</option>
								<option value="Rajasthan">Rajasthan</option>
								<option value="MP">Madhya Pradesh</option>
								<option value="UP">Uttar Pradesh</option>
								<option value="Maharastra">Maharastra</option>
						</select></td>
					</tr>
					<tr align="right" >
						<td>*Choose Your City : </td>
						<td>
								<select style="width: 175px" id="cities" name="cities">
								<option>Select City</option>
								</select>
						</td>
					</tr>
					<tr align="right">
						<td>Age :</td>
						<td><input type="number" id="age" name="age" placeholder="Enter Your Age"></td>
					</tr>
					<tr align="right">
						<td>Address Line 1 : </td>
						<td><textarea id="address" name="address" rows="3" cols="22" placeholder="Enter Address Here"></textarea></td>
					</tr>
					<tr align="center">
						<td colspan="2"><input type="checkbox" onchange="enable()" id="cb">I accept all terms and condition</td>
					</tr>
					<tr align="center">
						<td colspan="2"><input type="submit" disabled=true  id="submit" value="Click To Submit Form"></button></td>
					</tr>
				</table>
			</div>
		</div>
	</form>
</body>
</html>