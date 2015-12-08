
	function addTable() {
		
		var movieData = {};
		movieData = [{MovieTitle: 'Goosebumps', Genre: 'Action', Director: 'director A'},
			{MovieTitle: 'Dinosaur Adventure', Genre: 'Action', Director: 'director B'},
			{MovieTitle: 'Wild Roller Coaster', Genre: 'Action', Director: 'director C'},
			{MovieTitle: 'Temple Run 70', Genre: 'Action', Director: 'director D'},
			{MovieTitle: 'Titli', Genre: 'Drama', Director: 'director B'},
			{MovieTitle: 'Fast 7', Genre: 'action', Director: 'director C'},
			{MovieTitle: 'Avengers', Genre: 'Action', Director: 'director D'},
			{MovieTitle: 'Gravity', Genre: 'Scifi', Director: 'director B'},
			{MovieTitle: 'The Runner Maze', Genre: 'Action', Director: 'director C'},
			{MovieTitle: 'Talwar', Genre: 'Drama', Director: 'director D'},
			{MovieTitle: 'Jazbaa', Genre: 'Drama', Director: 'director B'},
			{MovieTitle: 'Intrestallar', Genre: 'Scifi', Director: 'director C'},
			{MovieTitle: 'The Last Samurai', Genre: 'Action', Director: 'director D'},
			{MovieTitle: 'Seven Pounds', Genre: 'Documentry', Director: 'director B'},
			{MovieTitle: 'Payar ka Punchnama', Genre: 'Drama', Director: 'director C'},
			{MovieTitle: 'Fast Five', Genre: 'Action', Director: 'director D'}];
			drawPagination(movieData,4);
			
			//$('#movieTable tr').remove();
			
			var table = $('#movieTable').children();
			
			table.append('<tr><td>' + "Movie Title" + '</td><td>' + 'Genre' + '</td><td>'
				 + 'Director' + '</td></tr>');
			
			for(var i = 0; i<movieData.length; i++)
				table.append('<tr><td>' + movieData[i].MovieTitle + '</td><td>' + movieData[i].Genre + '</td><td>'
				 + movieData[i].Director + '</td></tr>');
	}
	
	function drawPagination(movieData, rowLength) {
		var dataLength = movieData.length/rowLength;
		alert(dataLength);
	}
