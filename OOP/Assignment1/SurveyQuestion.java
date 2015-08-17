/**Implementing all Questions
 * 
 * @author Gaurav Saini
 *
 */
public class SurveyQuestion implements Question {
	/*
	 * @see Question#singleSelect() Returning Questions which have only one
	 * value to select
	 */
	public String singleSelect() {
		String question1 = "Overall rating of student: Single select(1/2/3/4)";
		return question1;
	}

	/*
	 * @see Question#multipleSelect() Returning Questions which have more than
	 * one value to select
	 */
	public String multipleSelect() {
		String question1 = "Area of improvement: multi select(1. Service quality, 2. communication, 3. delivery process)\nenter # to stop";
		return question1;
	}

	/*
	 * @see Question#text() To store feedback
	 */
	public String text() {
		String question1 = "Feedback";
		return question1;
	}
}
