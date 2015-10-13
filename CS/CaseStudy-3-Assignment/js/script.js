function showLogin() {
	document.getElementById("mainArticle").style.visibility = "Hidden";
	document.getElementById("loginBackground").style.visibility = "visible";
}
function showSignup() {
	document.getElementById("mainArticle").style.visibility = "Hidden";
	document.getElementById("signupBackground").style.visibility = "visible";
}

function hide() {
	document.getElementById("mainArticle").style.visibility = "Visible";
	document.getElementById("loginBackground").style.visibility = "hidden";
	document.getElementById("signupBackground").style.visibility = "hidden";
	
}
function createVehicle() {
	document.getElementById("createVehicle").style.visibility = "Visible";
}

function createTable() {
	var table = document.getElementById("dataTable");
	dataArray= [['1','2009','Amaze','1400','21','20','450000','12.5'],
				['2','2010','City','2100','22','21','1200000','12.5'],
				['3','2011','Swift Dezire','1400','23','21.6','700000','12.5'],
				['4','2015','Polo','5000','18','29','2200000','12.5'],
				['5','2012','Esteem','1500','20.5','21.6','525000','12.5'],
				['6','2011','WagonR','2110','21.9','21.6','450000','12.5'],
				['7','2014','Alto','1980','18','21.6','300000','12.5']];
	var string = "<tr><th>Vehicle Id</th><th>Make Year</th><th>Model</th><th>Engine Capacity</th><th>Fuel Capacity</th><th>Milage</th><th>Price</th><th>Road Tax</th><th>Edit</th><th>Delete</th><th>Update</th></tr>";
	for(count = 0; count <= 6; count++) {
		string += "<tr><td>"+dataArray[count][0]+"</td>";
		string += "<td><input type='number' id='make"+count+"'value='"+dataArray[count][1]+"'readonly></td>";
		string += "<td><input type='text' id='model"+count+"'value='"+dataArray[count][2]+"'readonly></td>";
		string += "<td><input type='number' step='any'id='engineCapacity"+count+"'value='"+dataArray[count][3]+"'readonly></td>";
		string += "<td><input type='number' step='any'id='fuelCapacity"+count+"'value='"+dataArray[count][4]+"'readonly></td>";
		string += "<td><input type='number' step='any'id='milage"+count+"'value='"+dataArray[count][5]+"'readonly></td>";
		string += "<td><input type='number' id='price"+count+"'value='"+dataArray[count][6]+"'readonly></td>";
		string += "<td><input type='number' step='any' id='roadTax"+count+"'value='"+dataArray[count][7]+"'readonly></td>";
		string += "<td><input type='button' id='edit"+count+"'value='Edit' onclick='editable("+count+")'></td>";
		string += "<td><input type='button' id='delete'"+count+" onClick='' value='Delete'></td>";
		string += "<td><input type='button' id='update"+count+"' onClick='' value='Update' disabled></td>";
		string += "</tr>";
	}
	table.style.visibility = "visible";
	table.innerHTML = string;
	return false;
}

function editable(rowNumber) {
	document.getElementById("update"+rowNumber).disabled = false;
	document.getElementById("make"+rowNumber).readOnly = false;
	document.getElementById("model"+rowNumber).readOnly = false;
	document.getElementById("engineCapacity"+rowNumber).readOnly = false;
	document.getElementById("fuelCapacity"+rowNumber).readOnly = false;
	document.getElementById("milage"+rowNumber).readOnly = false;
	document.getElementById("price"+rowNumber).readOnly = false;
	document.getElementById("roadTax"+rowNumber).readOnly = false;
}