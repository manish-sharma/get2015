$(document).ready(function(){
      $('#input').focus(function() {
           $(this).addClass("focus").delay(100).queue(function(){ $(this).removeClass("focus") });  
      });
	  $('input,textarea').focus(function() {
			 var trans = $(this).addClass("focus");
			 setTimeout(function() {
				  trans.removeClass("focus");
			 }, 100);
	    });
		
		$('input,textarea').keypress(function() {
			 var entered = $(this).val();
			 $("#result").text(entered);
			 
	    });
	  		 
     	  
});