$("#name").change(changeDivContent);
$("#age").change(changeDivContent);
$("#address").change(changeDivContent);

function changeDivContent() {
	string = "Name: "+$('#name').val();
	string += " Age: "+$('#age').val();
	string += " Address: "+$('#address').val();
	
	$('#emptyDiv').text(string);
	var $el = $(this),
    x = 500,
    originalColor = $el.css("background");

	$el.css("background", "#F0E68C");
	setTimeout(function(){
		$el.css("background", originalColor);
	}, x);
}

