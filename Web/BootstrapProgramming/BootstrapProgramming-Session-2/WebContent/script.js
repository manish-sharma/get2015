$(document).ready(init);

function init() {
	addTable(1);
	document.getElementById("pg1").focus();
	$('#searchButton').on('click',search);
	
}

function search() {
	var Title = document.getElementById('search').value;
	//alert($('#search').text());
	if(Title == ""){
		alert("Please enter some movie name");
		return;
	} 
	else {
		for ( i = 0; i < movieData.length ; i++) {
			if(Title == movieData[i].MovieTitle){
				$('#movieTable tbody').children().remove();
				var table = $('#movieTable tbody');
				table.append('<tr><td>' + movieData[i].MovieTitle + '</td><td>'
					+ movieData[i].Genre + '</td><td>' + movieData[i].Director
					+ '</td></tr>');
				return;
			}
		}
		if(i==15){
			alert("Movie Not Found");
		}
	}

}
function addTable(size) {

	movieData = [ {
		MovieTitle : 'Goosebumps',
		Genre : 'Action',
		Director : 'DirectorA'
	}, {
		MovieTitle : 'Dinosaur Adventure',
		Genre : 'Action',
		Director : 'Director B'
	}, {
		MovieTitle : 'Wild Roller Coaster',
		Genre : 'Action',
		Director : 'Director C'
	}, {
		MovieTitle : 'Temple Run 7',
		Genre : 'Action',
		Director : 'Director D'
	}, {
		MovieTitle : 'Jab We Met',
		Genre : 'Action',
		Director : 'Director E'
	}, {
		MovieTitle : 'Pyar ka panchnama',
		Genre : 'Action',
		Director : 'Director F'
	}, {
		MovieTitle : 'Fashion',
		Genre : 'Action',
		Director : 'Director G'
	}, {
		MovieTitle : '3 Idiots',
		Genre : 'Action',
		Director : 'Director H'
	}, {
		MovieTitle : 'Shanghai',
		Genre : 'Action',
		Director : 'Director I'
	}, {
		MovieTitle : 'Shandar',
		Genre : 'Action',
		Director : 'Director J'
	}, {
		MovieTitle : 'Manjhi',
		Genre : 'Action',
		Director : 'Director K'
	}, {
		MovieTitle : 'HAK',
		Genre : 'Action',
		Director : 'Director L'
	}, {
		MovieTitle : 'YJHD',
		Genre : 'Action',
		Director : 'Director M'
	}, {
		MovieTitle : 'Pyar ka panchnama-2',
		Genre : 'Action',
		Director : 'Director N'
	}, {
		MovieTitle : 'Dhoom',
		Genre : 'Action',
		Director : 'Director O'
	} ];

	$('#movieTable tbody').children().remove();
	var table = $('#movieTable tbody');
	for (var i = (size * 3 - 3); i < size * 3; i++) {
		table.append('<tr><td>' + movieData[i].MovieTitle + '</td><td>'
				+ movieData[i].Genre + '</td><td>' + movieData[i].Director
				+ '</td></tr>');
	}

}
