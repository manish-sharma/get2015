function submitAll() {
		var content = "";

		content = content + "Ans 1:";
		$("input[name=Q1]:checked").each(function() {
			content = content + $(this).val() + "  ";
		}

		);
		content = content + "<br>";

		content = content + "Ans 2:";
		$("input[name=Q2]:checked").each(function() {
			content = content + $(this).val() + "  ";
		}

		);
		content = content + "<br>";

		content = content + "Ans 3:";
		$("input[name=Q3]:checked").each(function() {
			content = content + $(this).val() + "  ";
		}

		);
		content = content + "<br>";

		content = content + "Ans 4:";
		$("input[name=Q4]:checked").each(function() {
			content = content + $(this).val() + "  ";
		}

		);
		content = content + "<br>";

		content = content + "Ans 5:";
		$("input[name=Q5]:checked").each(function() {
			content = content + $(this).val() + "  ";
		}

		);
		content = content + "<br>";

		$('#content').html(content);

	}

	function resetAll() {
		$("input:checked").each(function() {

			location.reload();
		});

	}