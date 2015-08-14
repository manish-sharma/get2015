//program to print question

public class PrintQuestion implements Question { // function to print single
													// select question
	public String singleSelect() {
		String question1 = "Overall rating of student: Single select(1/2/3/4)";
		return question1;
	}

	public String multipleSelect() { // function to print multiple select
										// question
		String question1 = "Area of improvement: multi select(Enter 1 for Service quality,2 for communication,3 for delivery process, # to go to next question)";
		return question1;
	}

	public String text() { // function to print text question
		String question1 = "Feedback";
		return question1;
	}
}
