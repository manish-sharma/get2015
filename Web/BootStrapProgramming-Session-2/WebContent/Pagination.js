$(document).ready(init);

function init() {
	$("#pg1").on('click', displayTable);
	$("#pg2").on('click', displayTable1);
	$("#pg3").on('click', displayTable2);
	$("#pg4").on('click', displayTable3);
	$("#pg5").on('click', displayTable4);
}

function displayTable() {
	var query = "<table style='border:1px solid black;'><tr><th>Movie Name</th><th>Movie Review</th></tr><tr><td>Jab We Met</td><td>4</td></tr><tr><td>3 Idiots</td><td>5</td></tr><tr><td>Shanghai</td><td>1</td></tr></table>";
	document.getElementById("details").innerHTML = query;
}

function displayTable1() {
	var query = "<table style='border:1px solid black;'><tr><th>Movie Name</th><th>Movie Review</th></tr><tr><td>Pyar ka panchnama</td><td>5</td></tr><tr><td>YJHD</td><td>4</td></tr><tr><td>Shandar</td><td>1</td></tr></table>";
	document.getElementById("details").innerHTML = query;
}

function displayTable2() {
	var query = "<table style='border:1px solid black;'><tr><th>Movie Name</th><th>Movie Review</th></tr><tr><td>Fashion</td><td>3.5</td></tr><tr><td>Manjhi</td><td>3.5</td></tr><tr><td>HAK</td><td>2</td></tr></table>";
	document.getElementById("details").innerHTML = query;
}

function displayTable3() {
	var query = "<table style='border:1px solid black;'><tr><th>Movie Name</th><th>Movie Review</th></tr><tr><td>Jannat</td><td>3</td></tr><tr><td>Cocktail</td><td>3</td></tr><tr><td>Avengers</td><td>5</td></tr></table>";
	document.getElementById("details").innerHTML = query;
}
function displayTable4() {
	var query = "<table style='border:1px solid black;'><tr><th>Movie Name</th><th>Movie Review</th></tr><tr><td>Tanu Weds Manu</td><td>4.5</td></tr><tr><td>Fast and Furious</td><td>5</td></tr><tr><td>Golmal</td><td>4</td></tr></table>";
	document.getElementById("details").innerHTML = query;
}
