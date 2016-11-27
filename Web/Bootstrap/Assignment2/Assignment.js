
function init(noOfpages)
{    var movieData=cache();
     $("#head").html("Movie Review");
     var totalPages = movieData.length/noOfpages;
      var value="<li onclick='previous("+noOfpages+")'><a href='#' class='prev_link'><<</a></li>";
	  var table="<tr><th>Movie Title</th><th>Genre </th><th>Director</th></tr>";
	  
	 for(page=0;page<totalPages;page++)
	 { 
         value+="<li id='list"+(page+1)+"' onclick='createTable("+noOfpages+","+(page+1)+")'><a href='#'  id='"+(page+1)+"'>"+(page+1)+"</a></li>";
		
	 }
	  value+="<li onclick='next("+noOfpages+","+movieData.length+")'><a href='#' class='next_link'>>></a></li>";
	 for(page=0;page<noOfpages;page++)
	 {
		 table+="<tr><td>"+movieData[page].movieTitle+"</td><td>"+movieData[page].genre+"</td><td>"+movieData[page].Director+"</td></tr>";
	 }
	
    $(".pagination").html(value);
	$("#movietable").html(table);
	 $("#list1").addClass("active");
	$("#paging").show();
}
function next(noOfpages,len)
{  
   var id=$("ul").find(".active").children().attr('id');
   id=parseInt(id);
   if((id*noOfpages)<len && id!='undefined')
   {
    createTable(noOfpages,id+1);
   }
}
function previous(noOfpages)
{   
    var id=$("ul").find(".active").children().attr('id');
    if(id!='1' && id!='undefined')
     {	
	id=parseInt(id)-1;
	createTable(noOfpages,id);
     }
}


function createTable(noOfpages,id)
{    $("#paging").show();
     $("li").removeClass("active");
	 $("#list"+id).addClass("active");

     var movieData=cache();
     var start=(id*noOfpages)-noOfpages;
     var end=id*noOfpages;
     var table="<tr><th>Movie Title</th><th>Genre </th><th>Director</th></tr>";
     for(page=start;page<end && page<movieData.length;page++)
	 {
		 table+="<tr><td>"+movieData[page].movieTitle+"</td><td>"+movieData[page].genre+"</td><td>"+movieData[page].Director+"</td></tr>";
		 
	 }		 
	$("#movietable").html(table);
	
	
}

function Search()
{ $("#paging").hide();
  var value=$("#searchAction").val();  
  var movieData=cache();
  var result="";
  var length=movieData.length;
  var traverse;
  for(traverse=0;traverse<length;traverse++)
  {
    if(value==movieData[traverse].movieTitle || value==movieData[traverse].genre || value==movieData[traverse].Director)
    {
    	result+="<tr><td>"+movieData[traverse].movieTitle+"</td><td>"+movieData[traverse].genre+"</td><td>"+movieData[traverse].Director+"</td></tr>";
	
    }
  } 
 if(result=="")
  { 
  result+="<tr><td colspan='3' class='danger'> Sorry No Result Found</td></tr>";
	
  } 
$("#movietable").html(result);
}

function pager()
{
 init(1);
}
function cache()
{	var movieData = [{movieTitle:"Goosebumps",genre:"Comedy",Director:"Rob Letterman "},
	                 {movieTitle:"Spectre",genre:"Adventure",Director:"Sam Mendes"},
				     {movieTitle:"The Martian",genre:"Comedy",Director:"Ridley Scott"},
				     {movieTitle:"Crimson Peak",genre:"Horror",Director:"Guillermo del Toro"},
					 {movieTitle:"The Last Witch Hunter",genre:"Action",Director:"Breck Eisner"},
					 {movieTitle:"The Gift",genre:"Mystery",Director:"Joel Edgerton"},
					 {movieTitle:"Jurassic World",genre:"Adventure",Director:"Colin Trevorrow"},
					 {movieTitle:"Fantastic Four ",genre:"Adventure",Director:"Josh Trank"},
                     {movieTitle:"San Andreas ",genre:"Action",Director:"Brad Peyton"}	,
                     {movieTitle:"Avengers Age of Ultron",genre:"Adventure",Director:"Joss Whedon"}	] ;
   return movieData;
}