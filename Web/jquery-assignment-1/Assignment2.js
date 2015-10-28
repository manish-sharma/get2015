/**
 * 
 */

function show1() {
	$('span#span').show();
	$('#showhide').val('Hide');
}

function hide1() {
	$('span#span').hide();
	$('#showhide').val('Show');
}

function showhide() {
	if ($('span#span').is(":visible")) {
		$('span#span').hide();
		$('#showhide').val('Show');
	} else {
		$('span#span').show();
		$('#showhide').val('Hide');
	}
}