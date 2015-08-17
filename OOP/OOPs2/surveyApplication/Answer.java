package surveyApplication;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class Answer {
	
	
	int SingleChoice;
	String MultipleChoice;
	String Feedback;
	
	
	public static int number;
	public static String answer1;
	public static String answer2="";
	public static String answer3="";
	public static HashMap<Integer,String> input=new HashMap<Integer,String>();
	public static int index=0;
	public static String token[]=new String[5];
	public static String result="";

	public Answer()
	{
	}
	public Answer(int SingleChoice, String MultipleChoice,String Feedback)
	{
		this.SingleChoice=SingleChoice;
		this.MultipleChoice=MultipleChoice;
		this.Feedback=Feedback;
		
		
	}
	

	
}


