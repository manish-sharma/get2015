/*Function to show or hide the text depending upon the type of state if hidden the show and if shown then hide*/
function toggle()
{
	var s = document.getElementById('spn');
	var dis = s.style.display;
	var btnclick = document.getElementById('btn');
	if(dis == 'block')
	{
		s.style.display = 'none';
		btnclick.innerHTML = 'SHOW';
	}
	else
	{
		s.style.display = 'block';
		btnclick.innerHTML = 'HIDE';
	}
}
/*Function to hide the text*/
function button2Action()
{
	var s = document.getElementById('spn');
	var dis = s.style.display;
	var btnclick = document.getElementById('btn');
	if(dis == 'none')
	{
		s.style.display = 'block';
		btnclick.innerHTML = 'HIDE';
	}
}
/*Function to show the text if hidden*/
function button1Action()
{
	var s = document.getElementById('spn');
	var dis = s.style.display;
	var btnclick = document.getElementById('btn');
	if(dis == 'block')
	{
		s.style.display = 'none';
		btnclick.innerHTML = 'SHOW';
	}
}