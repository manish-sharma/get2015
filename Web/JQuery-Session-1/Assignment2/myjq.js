$(document).ready( function() {
      $("#button1").click( function(){
		$("#span").show();
		$("#button2").removeAttr("disabled");
		$("#button1").attr("disabled","disabled");
	 })
     $("#button2").click( function(){
		$("#span").hide();
		$("#button1").removeAttr("disabled");
		$("#button2").attr("disabled","disabled");
	})
      $("#button3").click( function(){
		  if($("#button1").attr("disabled") == "disabled")
		  {
			  $("#button1").removeAttr("disabled");
			  $("#button2").attr("disabled","disabled");
			  $("#span").hide(); 
		  }
		  else 
		  {
			  $("#button2").removeAttr("disabled");
			  $("#button1").attr("disabled","disabled");
			  $("#span").show();
		  }
	 })
	
}
);