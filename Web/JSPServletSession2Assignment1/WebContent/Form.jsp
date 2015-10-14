<!-- Assignment-1 -->
<!DOCTYPE>
<html>
<head>
<title>Registration Form</title>

<link rel="stylesheet" href="StyleSheet.css" />
<script type="text/javascript" src="JavaScript.js"></script>
</head>
<body>
  	<p align="center" style="color: red;">${result}</p>
	<form action="RegistrationForm" class="register">
		<h1>Registration</h1>
		<fieldset class="row1">
			<legend>Personal Details </legend>
		
			<p>
				<label>User Name * </label> <input id="userName" name="userName"
					type="text" placeholder="User Name" /> <span id="fName"></span> 
			</p>
			<p>
				<label>Email-Id * </label> <input id="email" name="email"
					type="email" placeholder="email" /> <span id="email"></span>
			</p>
			<p>
				<label>Password* </label> <input id="password" name="password"
					type="password" placeholder="Enter password here" /> <span
					id="passwordValue"></span>
			</p>
			<p>
				<label>Repeat Password* </label> <input id="confirmPassword"
					name="confirmPassword" type="password"
					placeholder="Re-type password" /> <span id="cPasswordValue"></span>
			</p>
			<p>
				<label>Age* </label> <input id="age" name="age" type="number"
					min="12" max="75" step="any" /> <span id="ageValue"></span>
			</p>
			<p>
				<label>State * </label> <input id="states" name="states" type="text"
					list="countries" onchange="createCity()" />
				<datalist id="countries">
					<option value="Rajasthan">
					<option value="Gujrat">
					<option value="Uttar Pradesh">
					<option value="Uttarakhand">
					<option value="Punjab">
				</datalist>
				<span id="stateValue"></span>
			</p>
			<p>
				<label>City * </label> <input type="text" id="cities" name="cities"
					list="city">
				<datalist id="city"></datalist>
				<span id="cityValue"></span>
			</p>
			<p>
				<label> Address * </label>
				<textarea id="address" name="address" rows="5" cols="20"></textarea>
				<span id="addressValue"></span>
			</p>
		</fieldset>
		<fieldset class="row2">
			<legend>Terms and Mailing </legend>
			<p class="agreement">
				<input type="checkbox" id="acceptCondition"
					onChange="activateSubmit()" /> <label>* I accept the <a
					href="#">Terms and Conditions</a></label>
			</p>
			<p class="agreement">
				<input type="checkbox" value="" /> <label>I want to receive
					personalized offers by your site</label>
			</p>
			<p class="agreement">
				<input type="checkbox" value="" /> <label>Allow partners to
					send me personalized offers and related services</label>
			</p>
		</fieldset>
		<div>
			<input type="submit" id="button" class="button" value="register"
				disabled>
		</div>
	</form>
</body>
</html>





