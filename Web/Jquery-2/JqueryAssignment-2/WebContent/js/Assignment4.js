$(document).ready(init);

function init() {
	$('#name').change(nameChange);
	$('#age').change(ageChange);
	$('#address').change(addressChange);
}

/* this function will show effects after change in name field */
function nameChange() {
	
	// changing the contents of div 
	$('#demoDiv').html("");
	$('#demoDiv').html("Name: "+$('#name').val());
	
	// setting background color for 3 seconds 
	$('#name').css('background', 'yellow');
        setTimeout(function () {
            $('#name').css('background', 'white').blur();
        }, 3000);
}

/* this function will show effects after change in age field */
function ageChange() {
	
	// changing the contents of div 
	$('#demoDiv').html("");
	$('#demoDiv').html("Age: "+$('#age').val());
	
	// setting background color for 3 seconds 
	$('#age').css('background', 'yellow');
        setTimeout(function () {
            $('#age').css('background', 'white').blur();
        }, 3000);
}

/* this function will show effects after change in address field */
function addressChange() {
	
	// changing the contents of div 
	$('#demoDiv').html("");
	$('#demoDiv').html("Address: "+$('#address').val());
	
	// setting background color for 3 seconds 
	$('#address').css('background', 'yellow');
        setTimeout(function () {
            $('#address').css('background', 'white').blur();
        }, 3000);
}