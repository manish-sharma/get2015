$(document).ready(function(){
    
	$('#one').click(selectOne);
	
	$('#two').click(selectTwo);
	
	$('#three').click(selectThree);
	
	$('#four').click(selectFour);
	
	$('#five').click(selectFive);
	
	$('#six').click(selectSix);
	
	$('#seven').click(selectSeven);
	
	$('#eight').click(selectEight);
	
	$('#nine').click(selectNine);
	
	$('#ten').click(selectTen);
    
    
});


/*
 * Selects all SPAN with class name: "message"
 */
function selectOne() {
	$('span.message').css('background-color','pink');
}

/*
 * Selects first DIV in a document that has class: "box"
 */
function selectTwo() {
	 $( 'div.box:first' ).css('background-color','pink');
}

/*
 * Selects all BUTTONS in a document
 */
function selectThree() {
	$('button').css('background-color','pink');
}

/*
 * Selects all IMAGES having alternate text as: "hello"
 */
function selectFour() {
	 $('input[type="image"][alt="hello"]').css('background-color','pink');
}

/*
 * Selects all TEXT BOXES under a div having Id = "myDiv"
 */
function selectFive() {
	$( '#myDiv' ).find('input[type="text"]').css('background-color','pink');
}

/*
 * Selects all TEXT BOXES with name starting by: "txt"
 */
function selectSix() {
	$( 'input[type="text"][name^="txt"]' ).css('background-color','pink');
}

/*
 * Selects all PARAGRAPHS element, not having class "box"
 */
function selectSeven() {
	$( 'p:not(".box")' ).css('background-color','pink');
}

/*
 * Selects all the DIVS having either "box" or "error" class
 */
function selectEight() {
	 $( 'div.box, div.error' ).css('background-color','pink');
}

/*
 * Selects all the DIVS having both "box" and "error" class
 */
function selectNine() {
	$( 'div.box.error' ).css('background-color','pink');
}

/*
 * Find all the SPAN having "info" class in a DIV with id = "myDiv"
 */
function selectTen() {
	$( '#myDiv' ).find('span.info').css('background-color','pink');
}


