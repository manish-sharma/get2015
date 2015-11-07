function showHide() 
	{ 
		var hide=document.getElementById("showHideButton");
		var e = document.getElementById("Details");
		if (e.style.display == 'block' || e.style.display=='')
		{
			e.style.display = 'none';
			hide.value='SHOW';
		}
		else 
		{   
			e.style.display = 'block';
		  	hide.value= 'HIDE';
		}
	}