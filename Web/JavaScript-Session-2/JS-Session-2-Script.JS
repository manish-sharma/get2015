var query;
function checkCondition() {
	query = document.getElementById("textbox1").value;
	if (isNaN(query)) {
		alert("not a Number");
	} else {
		result = "<table id='tableData' align='center'>";
		result +="<tr>";
		result +="<th>Name</th><th>Min</th><th>Max</th>";
		result +="</tr>";
		for (var i = 0; i < query; i++) 
		{
			result += "<tr>";
			result += "<td><input type='text'id='name" + i + "'></td>";
			result += "<td><input type='number' min=0 max=9 id='min" + i + "'></td>"; 
			result += "<td><input type='number' min=0 max=9 id='max" + i + "'></td>";
			result += "</tr>";
		}
		result += "<tr><td colspan='3' align='center'><input type='button' id='button' onClick='createTable()' value='Click Me!!'><input type='button' id='button1' onClick='checkCondition()' value='Reset'></td></tr>";
		result += "</table>";
		document.getElementById('tableData').innerHTML = result;
	}
}
function createTable() {
	var tabledata = document.getElementById("tableData");
	var string = "";
	
	for(count = 0; count < query; count++) {
		name = document.getElementById("name"+count).value;
		min = document.getElementById("min"+count).value;
		max = document.getElementById("max"+count).value;
		if(min == "" || max == "") continue;
		if(min > max) {
			alert("Row "+count+" column maximum have value less then minimum.");
			continue;
		}
		else if(min < 0 || max > 9 || min > 9 || max < 0) {
			alert("Row "+count+" !! Enter value within range..");
			continue;
		} else {
			string += "<tr ><td id='name'>"+name+"</td>";
			for(count2 = 0; count2 <= 9; count2++) {
				if(count2 < min || count2 > max) {
					string += "<td></td>";
				} else string += "<td class='data'></td>";
			}
			string += "</tr>"
		}
	}
	tabledata.innerHTML = string;
	}