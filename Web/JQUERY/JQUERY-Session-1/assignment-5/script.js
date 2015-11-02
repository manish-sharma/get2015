$(document).ready(function(){
    $("p").on("mouseenter",findSiblingsOfp);
    
    $("h2").on("mouseenter",findSiblingsOfh2);
    
    $("h3").on("mouseenter",findSiblingsOfh3);
    
    
    $("p").on("mouseleave",revertp);
    
    $("h2").on("mouseleave",reverth2);
    
    $("h3").on("mouseleave",reverth3);
    
    
   
});

function findSiblingsOfp() {
	
	$("p").siblings() .css({"color": "red", "border": "2px solid red"});
	
	
}


function findSiblingsOfh2() {
	
	$("h2").siblings() .css({"color": "red", "border": "2px solid red"});
	
	
}


function findSiblingsOfh3() {
	
	$("h3").siblings() .css({"color": "red", "border": "2px solid red"});
	
	
}


function revertp() {
	$("p").siblings() .css({"color": "orange", "border": "2px solid gray"});
}


function reverth2() {
	$("h2").siblings() .css({"color": "orange", "border": "2px solid gray"});
}


function reverth3() {
	$("h3").siblings() .css({"color": "orange", "border": "2px solid gray"});
}