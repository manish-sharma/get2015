function setModel(){
		    var makes = new Array();
	        makes['m1'] = new Array('model1','model2','model3');
	       makes['m2'] = new Array('model1','model2');
	       makes['m3'] = new Array('model1');
	      var element = document.getElementById("make");
		  var make = element.options[element.selectedIndex].value;
		  document.getElementById("model");
		  var htmlStatement;
		  for(var i=0; i< makes[make].length; i++) 
		  {  var md = makes[make][i]; 
		      htmlStatement = htmlStatement+"<option value='"+md+"'>"+md+"</option> ";
		  }
		  document.getElementById("model").innerHTML = htmlStatement;
          document.getElementById("model").disabled = false;		  
	   }
	 
	  