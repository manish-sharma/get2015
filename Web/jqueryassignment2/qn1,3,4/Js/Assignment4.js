$("#name").change(changeDivContent);
$("#age").change(changeDivContent);
$("#address").change(changeDivContent);
function changeDivContent() 
{
	string = "Name: " + $('#name').val();
	string += " Age: " + $('#age').val();
	string += " Address: " + $('#address').val();
	$('#emptyDiv').text(string);
	var $element = $(this), x = 500, originalColor = $element.css("background");
	$element.css("background", "#F0E68C");
	setTimeout(function() 
	{$element.css("background", originalColor);}, x);
}