function fillcolor() {
   for( var i=1 ; i< 6; i++ )
   {
	   var name = document.getElementById("inputtableTd"+(i+1)+"1").value;
	   document.getElementById("outputtableTd"+(i)+"1").innerHTML=name;
	   
	   var lower = document.getElementById("inputtableTd"+(i+1)+"2").value;
	   var upper = document.getElementById("inputtableTd"+(i+1)+"3").value;
	   
	   for(var j= lower; j <= upper; j++)
	   {
		   var jj=Number(j)+2;
		   var id = "outputtableTd"+i+jj;
		   document.getElementById(id).style.backgroundColor ="red";
		  
		                                                  
	   }		   
   }	   
	
}