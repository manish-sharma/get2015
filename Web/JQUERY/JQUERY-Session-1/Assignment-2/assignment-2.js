
$(document).ready(function(){
    
	$('#show').click(fnShow);
    
	
	$('#hide').click(fnHide);
    
    
    
    $('#toggle').click(fnToggle);
    
});

function fnShow() {
	 $("#text").show();
     $('#toggle').attr("value","HIDE");
}


function fnHide() {
	$("#text").hide();
    $('#toggle').attr("value","SHOW");
}


function fnToggle() {
	if($('#toggle').attr("value") == "HIDE") {
 	   $("#text").hide();
        $('#toggle').attr("value","SHOW");
    }
    else if($('#toggle').attr("value") == "SHOW") {
 	   $("#text").show();
        $('#toggle').attr("value","HIDE");
    }
}