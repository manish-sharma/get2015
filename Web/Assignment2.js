/**
 * 
 */

function show() {
	$('span#span').show();
	$('#showhide').val('Hide');
}

function hide() {
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