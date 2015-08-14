//program to strore answer of user and increment customer number

public class Answer {
	int single[] = new int[10]; // for single select type
	String multiple[] = new String[10]; // for multiple select type
	String text[] = new String[10]; // for text type

	void singleAnsSet(int number, int count) // function to set single select
												// answer
	{
		single[count] = number;
	}

	void multipleAnsSet(String answer, int count) // function to set multiple
													// select answer
	{
		multiple[count] = answer;
	}

	void textSet(String answer, int count) // function to set text answer
	{
		text[count] = answer;
	}

	int singleAnsGet(int count) // function to get single select answer
	{
		return single[count];
	}

	String multipleAnsGet(int count) // function to get multiple select answer
	{
		return multiple[count];
	}

	String textAnsGet(int count) // function to get text answer
	{
		return text[count];
	}

}
