function show(){
document.getElementById('demo').innerHTML = 'Hello There!'

}

function hide(){
document.getElementById('demo').innerHTML = ''

}

function changeText(id) {
	if(document.getElementById('demo').innerHTML == ''){
		id.innerHTML = "Hide!";
		show();
	}
	else{
		id.innerHTML = "Show!";
		hide();
	}
    
}