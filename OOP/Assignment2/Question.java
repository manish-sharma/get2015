package oop2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Khemanshu
 *
 */
public class Question {
	//Location string stores the directory of file.
	public static String location="C:/Users/Khemanshu/workspace/Assignment/src/oop2/questions.csv";
	// question list stores the different question in it.
	public static List<String> question=new ArrayList<String>();
	// line string holds one question at a time.
	public static String line="";
	/** reads question from the csv file.
	 * @return the list of string which holds the questions.
	 */
	public static List<String> readQuestions()
	{
		try
		{
			//Reading the questions stored in the csv file
			BufferedReader br=new BufferedReader(new FileReader(location));
			while((line=br.readLine())!=null)
			{
				String[] token=line.split(",");
				//Questions are added in the list of string type
				question.add(token[0]+" "+token[1]);
			}
			br.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);

		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		return question;
	}
	/** 
	 * @return single type question from the list of question.
	 */
	public String singleTypeQuestion() {
		String singleQuestion = question.get(0);
		return singleQuestion;
	}
	/** 
	 * @return multi choice question from the list of question.
	 */
	public String multiTypeQuestion() {
		String multiQuestion = question.get(1);
		return multiQuestion;
	}
	/** 
	 * @return feedback question from the list of question.
	 */
	public String feedbackQuestion() {
		String feedbackQuestion = question.get(2);
		return feedbackQuestion;
	}
	/**
	 * @return the location of file
	 */
	public static String getLocation() {
		return location;
	}
	/** set the location of file
	 * @param location
	 */
	public static void setLocation(String location) {
		Question.location = location;
	}
	/**
	 * @return the list of question
	 */
	public static List<String> getQuestion() {
		return question;
	}
	/** set the question in list.
	 * @param question
	 */
	public static void setQuestion(List<String> question) {
		Question.question = question;
	}
	/** get the line of question
	 * @return string line of question
	 */
	public static String getLine() {
		return line;
	}
	/** set the line.
	 * @param line
	 */
	public static void setLine(String line) {
		Question.line = line;
	}
	



}