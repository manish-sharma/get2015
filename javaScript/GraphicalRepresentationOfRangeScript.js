//global variable number
var number;

/**
 * var linkElement; var titleElement;
 */

/*
 * function to create table ;in which no. of rows are based on input text box
 * value
 */
function createTable() {
	number = document.getElementById("number").value;

	/**
	 * titleElement=document.getElementById("title").innerHTML;
	 * linkElement=document.getElementById("link").href; document.write(); var
	 * head= document.createElement("head"); var link=
	 * document.createElement("link"); var
	 * title=document.createElement("title"); link.rel = 'stylesheet'; link.href =
	 * linkElement; link.type="text/css";
	 * document.getElementsByTagName("title").innerHTML=titleElement; alert(
	 * document.getElementsByTagName("head")[0]);
	 */

	// if text box empty then return false
	if (number == "") {
		alert("text box should not be empty");
		return false;
	}

	// if text box value is -ve then return false
	else if (number < 0) {
		alert("data should be positive integer value");
		return false;
	}

	// if text box value is an integer then create a new table and return true
	else if (number == parseInt(number, 10)) {
		// create a new table based on input text box value
		document
				.write("<table  id='myTable' style='border:1px solid black;margin-left:400px;margin-top:100px;  width:50%;'>");
		document
				.write("<tr><td style='text-align:center;'>Name</td><td style='text-align:center;'>Min</td><td style='text-align:center;'>Max</td></tr>");

		for (var i = 0; i < number; i++) {
			document.write("<tr>");
			document
					.write("<td style='text-align:center;'><input type='text' style='width:100%;'></td>");
			for (var j = 1; j < 3; j++) {
				document
						.write("<td style='text-align:center;'><input type='number'  style='width:50%;'></td>");
			}
			document.write("</tr>");
		}
		document
				.write("<tr><td colspan='3' align='right'><input type='submit' onClick='return validate() ' value='Ok'></td></tr>");
		document.write("</table>");
		return true;
	}

	// if data is not an integer then return false
	else {
		alert("data is not an integer");
		return false;
	}
}

/*
 *  it validate the values of all columns in a table and if all are correct then
 *  create a table to show range format and return true,otherwise return false
 */
function validate() {
	var min = [];
	var max = [];
	var name = [];
	var isValid = true;
	var table = document.getElementById("myTable");
	var length = table.rows.length;

	// get min, max and name columns' values from previous table
	for (var i = 1; i < length - 1; i++) {
		var tr = table.rows[i];

		var td = tr.cells[1];
		min.push(parseInt(td.firstChild.value, 10));

		td = tr.cells[2];
		max.push(parseInt(td.firstChild.value, 10));

		td = tr.cells[0];
		name.push(td.firstChild.value);
	}

	// validate all values which are accessed from previous table
	for (var i = 0; i < number; i++) {
		if (min[i] == "" || max[i] == "" || name[i] == "") {
			alert("name,min and max should not be empty");
			isValid = false;

		} else if (min[i] < 0 || min[i] > 10 || max[i] < 0 || max[i] > 10) {
			alert("min and max should be greater than or equal 0 and less than or equal to 10");
			isValid = false;

		}

		else if (min[i] > max[i]) {
			alert("min should be less than or equal to max");
			isValid = false;
		} else if (min[i] != parseInt(min[i], 10)
				|| max[i] != parseInt(max[i], 10)) {
			alert("min & max should be integers");
			isValid = false;
		} else {
		}
	}
	/*
	 *  if all values that are fetched are valid then create a table to show
	 *   range format and return true
	 */
	if (isValid == true) {
		createRangeTable();
		return isValid;
	}

	// if all values that are fetched are not valid then return false
	else {
		return isValid;
	}
}

// create a table to show range format
function createRangeTable() {
	var min = [];
	var max = [];
	var name = [];
	var table = document.getElementById("myTable");
	var length = table.rows.length;
	for (var i = 1; i < length - 1; i++) {
		var tr = table.rows[i];

		var td = tr.cells[1];
		min.push(td.firstChild.value);

		td = tr.cells[2];
		max.push(td.firstChild.value);

		td = tr.cells[0];
		name.push(td.firstChild.value);
	}
	// clear document body
	document.body.innerHTML = "";
	// crate new table to show range format
	document
			.write("<table id='myRangeTable' style='border:1px solid black; border-collapse: collapse; margin-left:400px;margin-top:100px; width:50%;'>");
	for (var i = 0; i < number; i++) {
		document.write("<tr  style='border:1px solid black; solid black;'>");
		document
				.write("<td style='text-align:center;border:1px solid black ;  '>"
						+ name[i] + "</td>");
		for (var j = 1; j < 11; j++) {
			if (j >= min[i] && j <= max[i]) {
				document.write("<td style='background:red; '>" + j + "</td>");
			} else {
				document.write("<td>" + j + "</td>");
			}
		}
		document.write("</tr>");
	}

	document.write("</table>");
	return;
}