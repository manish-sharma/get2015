var row;
function drowTable1() {
	row = document.getElementById("numberOfRows").value;
	var string = "";
	var table1 = document.getElementById("first");
	if(row == "")
		alert("please enter some integer value");
	else if(row < 0 || row > 100)
		alert("please enter some integer value less then equal to 100");
	else {
		string += "<tr><th>Name</th><th>Minimum</th><th>Maximum</th></tr>";
		for(i=0;i<row;i++) {
			string += "<tr><td><input type='text' id='name"+i+"'></td><td><input type='number' style='width: 60px' id='min"+i+"'></td><td><input type='number' style='width: 60px' id='max"+i+"'></td></tr>";
		}
		string += "<tr><td colspan='3' align='justify'><input type='button' value='Draw table' onclick='drowTable2()'></td></tr>";
		table1.innerHTML = string;
	}
}
function drowTable2() {
	var string = "";
	var table2 = document.getElementById("second");
	for(var i=0;i<row;i++) {
		var min = document.getElementById("min"+i).value;
		var max = document.getElementById("max"+i).value;
		var name = document.getElementById("name"+i).value;
		if((min>=max) || (min == "") || (max == "") || (name=="")||(max > 10)){
			continue;
		} 
		else{
			string += "<tr><td style='border-right: 2px solid black;'>"+name+"</td>";
			for(var j=0;j<10;j++) {
				if(j>=min && j<=max && max < 10)
				string += "<td class ='color'></td>";
				else
					string += "<td class = 'notColor'></td>";
			}
			string += "</tr>";
			table2.innerHTML = string;
		}
	}
	if(string == "")
		alert("Please enter some correct values");
}