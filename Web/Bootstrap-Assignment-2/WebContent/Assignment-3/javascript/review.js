$(document).ready(function() {
	addTable();	
	paging();
});

function addTable(){
	alert("1");
	var movieData={};
	movieData=[{MovieTitle: 'Goosebumps',Genre: 'Action',Director: 'DirectorA'},
	           {MovieTitle: 'Dinosaur Adventure',Genre: 'Action',Director: 'Director B'},
	           {MovieTitle: 'Wild Roller Coaster',Genre: 'Action',Director: 'Director C'},
	           {MovieTitle: 'Temple Run 7',Genre: 'Action',Director: 'Director D'},
	           {MovieTitle: 'Movie 1',Genre: 'Action',Director: 'Director E'},
	           {MovieTitle: 'Movie 2',Genre: 'Action',Director: 'Director F'},
	           {MovieTitle: 'Movie 3',Genre: 'Action',Director: 'Director G'},
	           {MovieTitle: 'Movie 4',Genre: 'Action',Director: 'Director H'},
	           {MovieTitle: 'Movie 5',Genre: 'Action',Director: 'Director I'},
	           {MovieTitle: 'Movie 6',Genre: 'Action',Director: 'Director J'},
	           {MovieTitle: 'Movie 7',Genre: 'Action',Director: 'Director K'},
	           {MovieTitle: 'Movie 8',Genre: 'Action',Director: 'Director L'},
	           {MovieTitle: 'Movie 9',Genre: 'Action',Director: 'Director M'},
	           {MovieTitle: 'Movie 10',Genre: 'Action',Director: 'Director N'},
	           {MovieTitle: 'Movie 11',Genre: 'Action',Director: 'Director O'},
	           {MovieTitle: 'Movie 12',Genre: 'Action',Director: 'Director P'},
	           {MovieTitle: 'Movie 13',Genre: 'Action',Director: 'Director Q'}];
	
	
	var table=$('#movieTable').children();
	alert("2");
	table.append('<tr><td>'+"MovieTitle"+'</td><td>'+"Genre"+
			'</td><td>'+"Director"+'</td></tr>');
	for(var i=0;i< movieData.length;i++)
		table.append('<tr><td>'+movieData[i].MovieTitle+'</td><td>'+movieData[i].Genre+
				'</td><td>'+movieData[i].Director+'</td></tr>');
}

function paging(){
    $('#movieTable').after('<div id="nav" style="float:right"></div>');
    var rowsShown = 5;
    var rowsTotal = $('#movieTable tbody tr').length;
    var numPages = rowsTotal/rowsShown;
    for(i = 0;i < numPages;i++) {
        var pageNum = i + 1;
        $('#nav').append('<div style="width:40px;border:2px solid gray;float:left;text-align:center;margin-left:5px;"><a href="#" rel="'+i+'">'+pageNum+'</a><div>');
    }
    $('#movieTable tbody tr').hide();
    $('#movieTable tbody tr').slice(0, rowsShown).show();
    $('#nav a:first').addClass('active');
    $('#nav a').bind('click', function(){

        $('#nav a').removeClass('active');
        $(this).addClass('active');
        var currPage = $(this).attr('rel');
        var startItem = currPage * rowsShown;
        var endItem = startItem + rowsShown;
        $('#movieTable tbody tr').css('opacity','0.0').hide().slice(startItem, endItem).
                css('display','table-row').animate({opacity:1}, 300);
    });
}