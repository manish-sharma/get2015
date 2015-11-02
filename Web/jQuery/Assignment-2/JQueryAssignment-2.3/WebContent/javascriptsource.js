/**
 * 
 */
$(document).ready(function(){
	$("#start_button").click(function(){
		$("#test_div").animate({left:'1000px'},6000);
	});
	
	$("#stop_button").click(function(){
		$("#test_div").stop();});
	
	$("#back_button").click(function(){
		$("#test_div").animate({left:'-1000px'},6000);
	});
	
	$("#left_button").click(function(){
		$("#test_div").animate({left:'50px'},6000);
	});
	
	$("#right_button").click(function(){
		$("#test_div").animate({right:'50px'},6000);
	});
	
	$("#up_button").click(function(){
		$("#test_div").animate({top:'50px'},6000);
	});

	$("#down_button").click(function(){
		$("#test_div").animate({bottom:'50px'},6000);
	});
});
