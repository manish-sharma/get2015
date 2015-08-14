//Class that stores questions
public class SurveyQuestion implements Question
{
public String singleSelect()
{
	String question1="Overall rating of student: Single select(1/2/3/4)";
	return question1;
}
public String multipleSelect()
{
	String question1="Area of improvement: multi select(1.Service quality,2.communication,3.delivery process 4.#(to exit))";
	return question1;
}
public String text()
{
	String question1="Feedback";
	return question1;
}
}
