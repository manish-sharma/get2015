function show() {
	$('span#name').show();
	$('#showHideButton').val('Hide');
}

function hide() {
	$('span#name').hide();
	$('#showHideButton').val('Show');
}

function showHide() {
	if ($('span#name').is(":visible")) {
		$('span#name').hide();
		$('#showHideButton').val('Show');
	} else {
		$('span#name').show();
		$('#showHideButton').val('Hide');
	}
}