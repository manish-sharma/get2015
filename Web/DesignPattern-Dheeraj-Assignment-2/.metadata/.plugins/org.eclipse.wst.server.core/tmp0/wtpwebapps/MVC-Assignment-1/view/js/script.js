/**
 * MVC assignment javascript source file 
 */

function editable(rowNumber) {
	document.getElementById("update"+rowNumber).disabled = false;
	document.getElementById("id"+rowNumber).readonly = false;
	document.getElementById("name"+rowNumber).readOnly = false;
	document.getElementById("email"+rowNumber).readOnly = false;
	
}