var index = 5;
function createRow(){
	
            var table=document.getElementById("table1");
            var row=table.insertRow(table.rows.length);
			
            var cell1=row.insertCell(0);
            var t1=document.createElement("input");
			    t1.type="name";
                t1.id = "txtName"+index;
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
function removeRow(){
	if(index > 0)
	{
    document.getElementById("table1").deleteRow(index);
	index--;
	}
	else{
		alert("Table is empty");
	}
}

function createGraph(){
	
	var tb = document.getElementById("newTable");
	if(index > 1)
	{
		for(var i=1; i<=index; i++)
		{
			var row=tb.insertRow(0);
			
			var cell1=row.insertCell(0);
            var t1=document.createElement("input");
			    t1.type="name";
                t1.value = document.getElementById("name" + i).value;
                cell1.appendChild(t1);
				for(var i=1; i<=10; i++)
				{
					 var cell=row.insertCell(i);
					var t2=document.createElement("input").value;
					t2.type="number";
					t2.value = document.getElementById("min"+i).value;
					cell2.appendChild(t2);
				}
		}
	}
	else
	{
		alert("Cant create graph as table is empty");
	}	
}