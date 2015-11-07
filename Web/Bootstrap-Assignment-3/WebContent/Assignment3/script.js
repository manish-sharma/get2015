function resetAll() {
	
	$('input[name=question1]').attr('checked',false);
	
	$('input[name=question2]').attr('checked',false);
	
	$('input[name=question3]').attr('checked',false);
	
	$('input[name=question4]').attr('checked',false);
	
	$('input[name=question5]').attr('checked',false);
	
}

var result = "Hello!!<br>";
function answers() {
	result = "Hello!!<br><br>";
	var res = document.getElementById("selectedOptions");
	
	if($('input[name=question1]:checked').val() == undefined) {
		result+="Question 1:\t"+"Not selected<br>";
	}
	else {
		result+="Question 1:\t"+$('input[name=question1]:checked').val()+"<br>";
	}
	

	if($('input[name=question2]:checked').val() == undefined) {
		result+="Question 2:\t"+"Not selected<br>";
	}
	else {
		result+="Question 2:\t"+$('input[name=question2]:checked').val()+"<br>";
	}
	

	if($('input[name=question3]:checked').val() == undefined) {
		result+="Question 3:\t"+"Not selected<br>";
	}
	else {
		result+="Question 3:\t"+$('input[name=question3]:checked').val()+"<br>";
	}
	

	if($('input[name=question4]:checked').val() == undefined) {
		result+="Question 4:\t"+"Not selected<br>";
	}
	else {
		var str="";
		$('input[name=question4]:checked').each(function() {
			str += $(this).val()+",\t";
		})
		result+="Question 4:\t"+str+"<br>";
	}
	

	if($('input[name=question5]:checked').val() == undefined) {
		result+="Question 5:\t"+"Not selected<br>";
	}
	else {
		var str="";
		$('input[name=question5]:checked').each(function() {
			str += $(this).val()+",\t";
		})
		result+="Question 5:\t"+str+"<br>";
	}
	result+="<br>Thanks for taking the Quiz...!!"
	res.innerHTML = result;
	
}
