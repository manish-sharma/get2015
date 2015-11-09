function search(val){
	if(val=="byBudget") {
		document.getElementById("budget").disabled=false;
		document.getElementById("brand").disabled=true;
	}
	else if(val=="byBrand") {
		document.getElementById("budget").disabled=true;
		document.getElementById("brand").disabled=false;
	}
}