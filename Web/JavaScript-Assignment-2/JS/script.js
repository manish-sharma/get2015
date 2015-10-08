var index =3;
function createRow(){
	
			
			
            var table=document.getElementById("table1");
            var row=table.insertRow(table.rows.length);
			
            var cell1=row.insertCell(0);
            var t1=document.createElement("input");
			    t1.type="name";
                t1.id = "name"+ index;
                cell1.appendChild(t1);
				
            var cell2=row.insertCell(1);
            var t2=document.createElement("input");
			    t2.type="number";
                t2.id = "min"+index;
				t2.min = "1";
				t2.max = "10";
                cell2.appendChild(t2);
				
            var cell3=row.insertCell(2);
            var t3=document.createElement("input");
			    t3.type="number";
                t3.id = "max"+index;
				t3.min = "1";
				t3.max = "10";
                cell3.appendChild(t3);
		index++;
}

 function rangeGraph()
    {
		var newtable1=document.getElementById("newtable");
		
	
		if(index>0)
		{
			for(var i=1;i<=index;i++)
			{
				
				var min = document.getElementById("min"+i).value;
				var max = document.getElementById("max"+i).value;
				
				var row=newtable1.insertRow(-1);
				
				var cell1=row.insertCell(0);
				var t1=document.createElement("input")
				t1.name="name";
				t1.value = document.getElementById("name" + i).value;
				 cell1.appendChild(t1);
				 
				 for(var count=1; count<=10; count++)
				{
					var cell2=row.insertCell(count);
					
					cell2.value = count;
					cell2.style.textAlign="center";
					cell2.style.width="25px";
					cell2.style.border="none";
					
					if(count>=min && count<=max)
					{
						cell2.style.backgroundColor="RED";
					}
				}
			}
			document.getElementById("button1").disabled = true;
		}
		else{
			alert("Table required atmost one row");
		}
		
		
    }
	
	
    