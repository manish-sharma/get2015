/*
  Below function is to delete row in table
*/
function deleteRow() {
	if(index >1 )
	{
    document.getElementById("myTable").deleteRow(index);
	index--;
	}
	var deleteButton = document.getElementById("delete");
	if(index <= 1)
	{
		deleteButton.disabled = true;;
	}
}
var index = 1;
/*
  Below function is to Create row in table
*/
function createRow(){
	        var deleteButton = document.getElementById("delete");
			if(index >= 1)
			{
				deleteButton.disabled = false;
			}
			
            var table=document.getElementById("myTable");
            var row=table.insertRow(index+1);        //inserting row in table
            var cell1=row.insertCell(0);             //inserting column for Name
            var t1=document.createElement("input");  
			    t1.type="text";
                cell1.appendChild(t1);
            var cell2=row.insertCell(1);            //inserting column for Minimum Value
            var t2=document.createElement("input");
			    t2.type="number";
                t2.id = "txtMin"+index;
				t2.min = "1";
				t2.max = "10";
                cell2.appendChild(t2);
            var cell3=row.insertCell(2);
            var t3=document.createElement("input");  //inserting column for Maximum Value
			    t3.type="number";
                t3.id = "txtMax"+index;
				t3.min = "1";
				t3.max = "10";
                cell3.appendChild(t3);
				
		    var cell4=row.insertCell(3);            //inserting column for dispalying message for warnings
            var t4=document.createElement("p");	
			t4.id="P"+index;
			t4.innerHTML="";
			cell4.appendChild(t4);
				
		 index++;

}
/*
Below is to create dynamic table depend on value of minimum and maximum in above table
and fill color in their cells
*/
function myFunction()
{       
        var temp=true;
		for(var i = 0; i < index; i++)
		{
			var indexMin="txtMin"+i;
			var indexMax="txtMax"+i;
			var min=document.getElementById(indexMin).value;
			var max=document.getElementById(indexMax).value;
			var pid="P"+i;
			//below code is to check whether the value of minimum and maximum cell is not empty
			//if so and display warning message
			if(max=="" || min =="")
			{
				
				document.getElementById(pid).innerHTML="Value can not be empty";
				temp=false;
			}
			else
			{
				
				if(max<min)
				{
					temp=false;
					document.getElementById(pid).innerHTML="Minimun value should be less then Maximum Value";
					
				}
				else{
					document.getElementById(pid).innerHTML="";
				}
				
			}
			
		}
		var tbl=document.getElementById("dynamicTable");
		tbl.innerHTML = "";
		//below method is to create dynamic table if the above table fulfill all conditions.
		if(temp==true)
		{
			for(var i = 0; i < index; i++)
			{
				var indexMin="txtMin"+i;
				var indexMax="txtMax"+i;
				var min=document.getElementById(indexMin).value;
				var max=document.getElementById(indexMax).value;
				
				var tr = tbl.insertRow(i);
				tr.style.border="solid thin";
				for(var j = 0; j < 11; j++)
				{
					
					var td = tr.insertCell(j);
					td.style.width  = '40px';
					td.style.height  = '30px';
					
					if(j==0)
					{
						var c=i+1;
						td.appendChild(document.createTextNode('N'+c));
						td.style.border="1px solid black";
					}
				
					if(j>=min && j<=max && j>0)
					{
						td.bgColor="red";
					}
				}
			}	
			
		}
}


