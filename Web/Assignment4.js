//Name on change to perform function
$("#name").change(changeDivContent);
//Age on change to perform function
$("#age").change(changeDivContent);
//Address on change to perform function
$("#address").change(changeDivContent);
//Function to be called when change is occurred
function changeDivContent() 
{
	string = "Name: " + $('#name').val();
	string += " Age: " + $('#age').val();
	string += " Address: " + $('#address').val();
	// Sets the Text
	$('#emptyDiv').text(string);
	var $element = $(this), x = 500, originalColor = $element.css("background");
	$element.css("background", "#F0E68C");
	setTimeout(function() 
			{$element.css("background", originalColor);}, x);
}