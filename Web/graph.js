

	function addRow() {
	var table;
	 table = document.getElementById("table");
	var len = table.rows.length;
	var row = table.insertRow(table.rows.length);
	var column1 = row.insertCell(0);
	var column2 = row.insertCell(1);
	var column3 = row.insertCell(2);
	column1.innerHTML = "<input type = \"text\" name = \"name\" id = \""+ len +"0\">";
	column2.innerHTML = "<input type = \"number\" name = \"min\" id = \""+ len +"1\" >";
	column3.innerHTML = "<input type = \"number\" name = \"max\" id = \""+ len +"2\">";
	}
	function isValidate(){
	
	var table = document.getElementById("table");
	var flag = false;
	for(var key =1;key<table.rows.length;key++){
	var row=table.rows[key];
	var name = document.getElementById(""+key +"0").value;
	var min = document.getElementById(""+key +"1").value;
	var max = document.getElementById(""+key +"2").value;
	if(name == ""){
	alert("Enter name");
	}
  else if(min == "") {
		alert("Enter min value ");
	}	else if(min < 0 || min > 10) {
		alert("Enter min value 0 to 10 only");
	}else if(max == "") {
		alert("Enter max value ");
	}	
	else if(max < 0 || max > 10) {
		alert("Enter max value 0 to 10 only");
	}
	else if(max < min) {
		alert("Enter max value greater then minimum value");
	}
	else {
		flag = true;
	}
	}
	if(flag) {
		alert("Success");
		draw();
	}
		
	
	
	}
	function draw(){
		var table = document.getElementById("table");
		var graph = document.getElementById("graph");
		graph.innerHTML = "";
		
		
		
		var len = table.rows.length;
	for(var key =1;key<len;key++){
		var name = document.getElementById(""+key +"0").value;
		var min = document.getElementById(""+key +"1").value;
		var max = document.getElementById(""+key +"2").value;
		var add=1;
		var min1= Number(add) + Number(min);
		var max1= Number(add) + Number(max);
		var diff= Number(max1) - Number(min1) +Number(add);
		var diff1= Number(key) - Number(add) ;
		var wid=Number(diff)*Number(100);	
		var row = graph.insertRow(diff1);
		graph.rows[diff1].style.height="60px";			
			for(var col =0;col<12;col++){
				if(col == 0){
					var column1 = row.insertCell(col);
						column1.innerHTML = ""+name+"";
						row.cells[col].style.width="100px";
						row.cells[col].style.borderRight="1px solid black";
						row.cells[col].style.borderTop="1px solid black";
						

				}
				else if (col == min1){
					var column2 = row.insertCell(col);
					row.cells[col].colSpan=""+diff+"";
						row.cells[col].bgColor="red";
						row.cells[col].style.width=""+wid+"px";
						row.cells[col].style.borderTop="1px solid black";
						
						
				}
				 
				else{
					var column3 = row.insertCell(col);
					row.cells[col].style.width="100px";
					row.cells[col].style.borderTop="1px solid black";
				}
			
			}
	}
			

	graph.style.visibility = "visible";
	}
