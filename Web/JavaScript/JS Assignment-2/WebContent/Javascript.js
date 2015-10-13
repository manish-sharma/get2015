function createTable() {
	var str = "";
	var rowCount = document.getElementById("noofrows").value;
	str += "<table cellspacing='2' cellpadding='2'>";
	str += "<tr><th>Name</th><th>Minimum</th><th>Maximum</th></tr>";
	for (var i = 0; i < rowCount; i++) {
		str += "<tr><td><input type='text' class='Name' id='name'/></td><td><input type='text' class='Min' id='min'/></td><td><input type='text' class='Max' id='max'/></td></tr>";
	}
	str += "</table>";
	str += "<input type='button' id='OK' value='OK'onclick='validations()'/>";
	document.getElementById("table").innerHTML = str;
}

function notEmpty() {
	var name = document.getElementById("name").value;
	var rg = /^[A-Z a-z]+$/;
	if (name == "") {
		alert("Name could not be empty");
		return false
	} else if (!name.match(rg)) {
		alert("Name should contain alphabets only");
		return false
	}

	else {
		return true
	}
}

function numberCheckmin() {
	var number = document.getElementById("min").value;
	var rge = /^[0-9]+$/;
	if (number < 0 || number > 10) {
		alert("Value allowed is only between 0-10");
		return false;
	} else if (!number.match(rge)) {
		alert("This field should only contain number");
		return false;
	} else {
		return true;
	}
}

function numberCheckmax() {
	var numbermin = document.getElementById("min").value;
	var numbermax = document.getElementById("max").value;
	var rge = /^[0-9]+$/;
	if (numbermax < numbermin) {
		alert("Value of maximum should be greater than minimum");
		return false;
	} else if (!numbermax.match(rge)) {
		alert("This field should only contain number");
		return false
	} else {
		return true;
	}
}

function validations() {
	if (notEmpty() == false || numberCheckmin() == false
			|| numberCheckmax() == false) {
	} else {
		alert("Else part is called");
		var rowCount = document.getElementById("noofrows").value;
		var inputName = document.getElementsByClassName("Name");
		var inputMin = document.getElementsByClassName("Min");
		var inputMax = document.getElementsByClassName("Max");
		alert("before final function call");
		document.getElementById("table2").innerHTML = makeRangeTable(rowCount,
				inputName, inputMin, inputMax);
		alert("Final Function call");
	}
}

function makeRangeTable(rowCount, inputName, inputMin, inputMax) {
	var str;
	str = "<table width='300' cellspacing='0' cellpadding='5' align='left' class='rangeTable'>";
	for (i = 0; i < rowCount; i++) {
		str += "<tr><td id='nameCol'>" + inputName[i].value + "</td>";
		for (j = 1; j <= 11; j++) {
			if (j >= inputMin[i].value && j <= inputMax[i].value)
				str += "<td style='background-color:red;'></td>";
			else
				str += "<td></td>";
		}
		str += "</tr>";
	}
	str += "</table><br/><br/>";
	return str;
}
