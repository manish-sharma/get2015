$(document).ready(init);

function init(){
   $('#spanbutton').click(function(){
       $('span.message').toggle();
   });
   
   $('#divbutton').click(function(){
	   alert(div);
	   $( $('div')[0] ).first().toggle();
   });
}