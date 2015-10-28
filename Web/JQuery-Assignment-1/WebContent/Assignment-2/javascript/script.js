$(document).ready(function(){
	$("#button").click(function(){
    	buttonAction();
    });
    	
});

function  buttonAction() {
	if($("#button").val()=="HIDE")
		{
			document.getElementById("button").value="SHOW";
			 $("span").hide();
		}
	else if ($("#button").val()=="SHOW") {
			document.getElementById("button").value="HIDE";
			 $("span").show();
	}
} 