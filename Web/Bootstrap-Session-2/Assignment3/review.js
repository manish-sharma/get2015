$(document).ready(function() {
		setDataInTable();
		$('#myTable').dataTable({
			"iDisplayLength" : 5,
			"bPaginate" : true,
			"bFilter" : true,
			"bLengthChange" :false
		});
	});

function setDataInTable(){
	
var mvList=[];
var mv1 = {Title:"PIKU",Genere:"Romantic", Director:"Amiya Chakravarty", Review:"Good", Rating:"Best ever"};
var mv2 = {Title:"Badlapur",Genere:"Romantic", Director:"Prabhu Deva", Review  : "Good", Rating:"Terrible"};
var mv3 = {Title:"Brother", Genere:"Drama", Director:"Amiya Chakravarty", Review  : "Good", Rating : "Watchable"};
var mv4 = {Title:"Holiday", Genere:"Drama", Director:"Tigmanshu Dhulia", Review  : "Good", Rating : "Best ever"};
var mv5 = {Title:"Don", Genere:"Drama", Director:"Vijay Krishna Acharya", Review  : "Good", Rating : "Watchable"};
var mv6 = {Title:"POC-2", Genere:"Drama", Director:"Vijay Krishna Acharya", Review  : "Good", Rating : "Terrible"};
var mv7 = {Title:"Krish-3", Genere:"Drama", Director:"Amiya Chakravarty", Review  : "Good", Rating : "Best ever"};
var mv8 = {Title:"Detective Byomkesh Bakshy!",Genere:"Action", Director:"Tigmanshu Dhulia", Review : "Good", Rating : "Best ever"};
var mv9 = {Title:"Drishyam",Genere:"Drama", Director:" Imtiaz Ali", Review  : "Good", Rating : "Watchable"};
var mv10 = {Title:"Gabbar is Back",Genere:"Drama", Director:"Amiya Chakravarty", Review  : "Good", Rating : "Terrible"};
var mv11 = {Title:"3idiots", Genere:"Thriller", Director:"Ramesh Sippy", Review  : "Good", Rating : "Watchable"};
var mv12 = {Title:"Hamari Adhuri Kahani", Genere:"Horror", Director:"Amiya Chakravarty", Review : "Good", Rating : "Terrible"};
var mv13 = {Title:"NH10",Genere:"Romantic",Director:"Aditya Chopra", Review  : "Good", Rating : "Best ever"};
var mv14 = {Title:"Kis Kis Ko Pyar Karoon",Genere:"Romantic", Director:"Imtiaz Ali  ", Review  : "Good", Rating : "Terrible"};
var mv15 = {Title:"Happy New Year", Genere:"Drama",Director:"Imtiaz Ali ", Review  : "Good", Rating :"Best ever"};
var mv16 = {Title:"Massan", Genere:"Comedy-Action", Director:"Amiya Chakravarty", Review  : "Good", Rating : "Best ever"};
var mv17 = {Title:"Jazbaa", Genere:"Comedy", Director:"Imtiaz Ali", Review  : "Good", Rating : "Terrible"};

mvList.push(mv1);
mvList.push(mv2);
mvList.push(mv3);
mvList.push(mv4);
mvList.push(mv5);
mvList.push(mv6);
mvList.push(mv7);
mvList.push(mv8);
mvList.push(mv9);
mvList.push(mv10);
mvList.push(mv11);
mvList.push(mv12);
mvList.push(mv13);
mvList.push(mv14);
mvList.push(mv15);
mvList.push(mv16);
mvList.push(mv17);
	
var tbody = document.getElementById('mytableTbody');
	for (var i = 0; i < mvList.length; i++) {
		var row = "<tr>";
		row += "<td>" + mvList[i].Title + "</td>" + "<td>" + mvList[i].Genere + "</td>" + "<td>" + mvList[i].Director + "</td>" + "<td>" + mvList[i].Review + "</td>" + "<td>" + mvList[i].Rating + "</td>" + "</tr>";
		tbody.innerHTML += row;
	}
}