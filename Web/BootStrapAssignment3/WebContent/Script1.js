$(document).ready(function() {

	$("#submit").click(function() {
		var content = "";

		content += "Ans 1:";
		$("input[name=Q1]:checked").each(function() {
			content += $(this).val() + "  ";
		}

		);
		content += "<br>";

		content += "Ans 2:";
		$("input[name=Q2]:checked").each(function() {
			content += $(this).val() + "  ";
		}

		);
		content += "<br>";

		content  += "Ans 3:";
		$("input[name=Q3]:checked").each(function() {
			content += $(this).val() + "  ";
		}

		);
		content += "<br>";

		content = content + "Ans 4:";
		$("input[name=Q4]:checked").each(function() {
			content += $(this).val() + "  ";
		}

		);
		content += "<br>";

		content += "Ans 5:";
		$("input[name=Q5]:checked").each(function() {
			content += $(this).val() + "  ";
		}

		);
		
		content += "<br>";

		$('#content').html(content);

	});

	$("#reset").click(function() {

		$("input:checked").each(function() {

			location.reload();
		});

	});
});