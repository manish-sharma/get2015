
$(document).ready(function()
{
		$('input#name').change(changeName);
		$('input#age').change(changeAge);
		$('input#address').change(changeAddress);
		
	
});

function changeName()
{
	$('#name').css('background', 'yellow'); 
	setTimeout(function () {
        $('#name').css('background', 'white').focus(); 
    }, 500);
	document.getElementById("output").innerHTML = "<br/> Name:  "+$('input#name').val()+"<br/>";
	
}

function changeAge()
{
	$('#age').css('background', 'yellow'); 
	setTimeout(function () {
        $('#age').css('background', 'white').focus(); 
    }, 500);
	document.getElementById("output").innerHTML = "<br/> Age:  "+$('input#age').val()+"<br/>";
	
}

function changeAddress()
{
	$('#address').css('background', 'yellow'); 
	setTimeout(function () {
        $('#address').css('background', 'white').focus(); 
    }, 500);
	document.getElementById("output").innerHTML = "<br/> Address:  "+$('input#address').val()+"<br/>";
	
}

