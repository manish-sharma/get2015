$(document).ready(function()
{
    $("#btn").on('click',fillColor);
});
/*Function to fill color on the click of button*/
function fillColor()
{
	$("tr:even").css("background-color","rgb(216, 121, 121)");
	$("tr:odd").css("background-color","rgb(59, 173, 188)");
}