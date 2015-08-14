//Class to store single select, multiple select and text
public class Answer 
{
	int single[]=new int[10];
	String multiple[]= new String[10];
	String text[]= new String[10];
	//to set single select answer
	void singleAnsSet(int number,int count)
	{
		single[count]=number;
	}
	//to set multiple select answer
	void multipleAnsSet(String answer, int count)
	{
		multiple[count]=answer;
	}
	//to set text answer
	void textSet(String answer,int count)
	{
		text[count]=answer;
	}
	//return answers
	int singleAnsGet(int count)
	{
	return single[count];
	}
	String multipleAnsGet(int count)
	{
	return multiple[count];
	}
	String textAnsGet(int count)
	{
	return text[count];
	}

}