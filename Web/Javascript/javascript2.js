function checkInteger(){
var c=document.getElementById("item").value;
if(isNaN(c))
   alert("Enter a integer value");
else if(c=="" || c==0)
	alert("Enter a integer value");
else
{
	var str1=showdata(c);
	document.getElementById("div2").innerHTML=str1;
}
return true;
}

function showdata(c){
	var str;
	str="<table  cellspacing='2'  class='maketable'>";
	str+="<tr><th>Name</th><th>Minimum</th><th>Maximum</th></tr>";
		for(var i=0;i<c;i++)
		{
			str+="<tr><td><input type='text' class='name' placeholder='Enter name'/ ></td><td><input type='text' class='min' placeholder='Enter minimum value'/ ></td>"
			str+="<td><input type='text' class='max' placeholder='Enter maximum value'/ ></td></tr>";
		}
    str+="</table>";
	str+="<input type='button' value='OK' onclick='validate();'>";
    	return str;
}

function validate(){
	var str="";
	var name=document.getElementsByClassName("name");
	var min=document.getElementsByClassName("min");
	var max=document.getElementsByClassName("max");
	var rows=document.getElementById("item").value;
	
	for(var i=0;i<rows;i++){
		str+=checkName(name[i])+checkMin(min[i])+checkMax(max[i],min[i]);
		if(str.length>0){
			alert(str);
			return false;
		}
		else
			continue;
	}
	document.getElementById("div3").innerHTML="<h3>Coloured Table</h3>"+createTable(name,min,max,rows);
}

function createTable(name,min,max,rows){
	var str;
	str="<table class='colortable' cellspacing='0'>";
	for(var i=0;i<rows;i++)
		{
			str+="<tr ><td id='namecolumn'>"+name[i].value+"</td>";
			for(var j=0;j<11;j++){
				if(min[i].value<=j && max[i].value>=j )
					str+="<td Style='background-color:red' class='innercolumn'></td>";
				else
			       str+="<td ></td>";
			}
		}
    str+="</table>";
	return str;
}

function checkName(name){
	var letters = /^[A-Za-z]+$/; 
	if(name.value==""){
	return("Empty name value not allowed\n");
	}
	else if(!name.value.match(letters))
			return("Enter alphabets only\n");
	else
		return "";
}

function checkMin(min){
	var x=min.value;
	if(isNaN(x)){
		return("Enter a valid integer Number\n");
	}
	else if(x<=0 || x>=10) {
	return("Minimum value must be between 0 and 10\n");
	}
	else
		return "";
}

function checkMax(max,min){
	var y=max.value;
	if(isNaN(y)){
		return("Enter a valid integer Number\n");
	}
	else if(y<=0 || y>10){
		return("Maximum value must be between 0 and 10\n");
	}
    else if(y<min.value){
		return("Maximum must be greater than minimum\n");
	}
	else
		return "";
}