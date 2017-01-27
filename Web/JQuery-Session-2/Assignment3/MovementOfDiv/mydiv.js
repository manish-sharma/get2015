$(document).ready(function(){
                  $("#start").click(function(){
					   $("#mobile").stop();
	                  $("#mobile").animate( { marginLeft:'1200px' },5000 );
                  });
			     $("#stop").click(function(){
					 
                       $("#mobile").stop();
                  });
				  $("#back").click(function(){
					   $("#mobile").stop();
	                  $("#mobile").animate( { marginLeft:'0px' },3000 );
                  });
				  
				  $("#bottom").click(function(){
				      $("#mobile").stop();
	                  $("#mobile").animate( { marginTop:'+=50px' },1000 );
                  });
				  $("#top").click(function(){
				      $("#mobile").stop();
	                  $("#mobile").animate( { marginTop:'-=50px' },1000 );
                  });
				  
				  $("#right").click(function(){
				      $("#mobile").stop();
	                  $("#mobile").animate( { marginLeft:'+=50px' },1000 );
                  });
				  $("#left").click(function(){
				      $("#mobile").stop();
	                  $("#mobile").animate( { marginLeft:'-=50px' },1000 );
                  });
				  
				  
});