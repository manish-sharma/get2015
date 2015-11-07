   function create() {
	document.getElementById("table").innerHTML = "";
	document.getElementById("graph").innerHTML = "";
	var result="";
    var row;
    var col;
    var length=parseInt(document.getElementById("inputvalue").value);
    var result=result+"<table id='Tables'><tr><th>Name</th><th>Max</th><th>Min</th></tr>"
    
	for(row=0;row<length;row++)
      { 
      result=result+"<tr>";
      
	  for(col=0;col<3;col++)
        {  
         if(col==0)
	       {
             result=result+"<td ><input type='text'  id='"+row+col+"'></td>";
	        }
	     else
           {
			 result=result+"<td ><input type='number' max ='10' min ='0' id='"+row+col+"'></td>";
	
           }
        }
      result=result+"</tr>";

      }
    result=result+"</table><input value='clicks' type='button' id ='but' onclick='fill(length)'/>"
     document.getElementById("table").innerHTML=result;

   }
   
  function fill()
   { var flag=validation();
    if(flag==true)
	 {   
       var row;
      var col;
     var length=parseInt(document.getElementById("inputvalue").value);
     var result="";
	 result="<table id='graphtable' borderColor='black' width='50%'>"

	for(row=0;row<length;row++)

	   {	var name=document.getElementById(row+"0").value;
    
        result=result+"<tr borderBottomWidth='2' borderColor='black'><td width='10%' class='name'>"+name+"</td>";
   
        for(col=0;col<11;col++)
          {
			  
	       result=result+"<td cellspacing='2' style = 'border: 1px solid black'></td>";
          }
	   result=result+"</tr>";
      }
    result=result+"</table>";
    document.getElementById("graph").innerHTML=result;
	
    for(row=0;row<length;row++)
     {	
     var max=parseInt(document.getElementById(row+"1").value);
     var min=parseInt(document.getElementById(row+"2").value);
     for(col=min;col<=max;)
	    {
		col=parseInt(col)+1;
        document.getElementById("graphtable").rows[row].cells[col].bgColor="red";

	    }
     }
	}
   }
   function validation()
   {
	   var flag =true;
	   var row;
	   var length=document.getElementById("inputvalue").value;
       for(row=0;row<length;row++)
	     {
		        var max=document.getElementById(row+"1").value;
                var min=document.getElementById(row+"2").value; 
				var name=document.getElementById(row+"0").value
		       if(name=="")
			     {
				   alert("Name should not be blank");
				   flag=false;
				   break;
			     }
				else if(parseInt(min)>parseInt(max))
			     { alert("Min should not be grater than max value");
				   flag=false;
				   break;
			     }
			   else if(min<0)
				   {
				   alert("Min value should not be less than 0");
				   flag=false;
				   break;
			     }
			 else if(max>10)
				   {
				   alert("Max value should not be less than 10");
				   flag=false;
				   break;
			     }
			else if(max=="" || min=="")
			{
				   alert("Max or Min value should not be blank");
				   flag=false;
				   break;
			    
			}
			
	     }
	   return flag;
	   
	   
	   
   }