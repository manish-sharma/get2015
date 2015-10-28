/*Selection the document element*/
$(document).ready(function()
{
    $("#btn2").on('click',showTxt);
	
	$("#btn1").on('click',hideTxt);
	
	$("#btn").on('click',toggleButten);
		
});
/*function to show text if file is hidden*/
function showTxt()
{
	$("#spn").show();
	$("#btn").html("HIDE");
}
/*Function to hide text if shown*/
function hideTxt()
{
	$("#spn").hide();
	$("#btn").html("SHOW");
}
/*Function to show text if hidden else hide if shown*/
function toggleButten()
{
	if($("#spn").css("display") == "block")
	{  $("#spn").hide();
		$("#btn").html("SHOW");
	}
	else
	{
		$("#spn").show();
		$("#btn").html("HIDE");
	}
}