function getAnswer() {
	var q1 = $("#question1").text();
	var q2 = $("#question2").text();
	var q3 = $("#question3").text();
	var q4 = $("#question4").text();
	var q5 = $("#question5").text();
	var a1 = $("input[name=q1]:checked").val();
	var a2 = $("input[name=q2]:checked").val();
	var a3 = $("input[name=q3]:checked").val();
	var a4 = $("input[name=q4]:checked").map( function() { return this.value;}).get();
	var a5 = $("input[name=q5]:checked").map( function() { return this.value;}).get();
	$("#answer1").text(q1+" Answer is: "+a1);
	$("#answer2").text(q2+" Answer is: "+a2);
	$("#answer3").text(q3+" Answer is: "+a3);
	$("#answer4").text(q4+" Answer is: "+a4);
	$("#answer5").text(q5+" Answer is: "+a5);
}


function resetAll() {
	location.reload();
}