import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Questions 
{
	private int questionNo;
	private String question;
	private String questionType;
	private String options;
	private static List<Questions> questionsList = new ArrayList<Questions>();//question list of type Question object
	private static final String COMMA_SEPERATER=",";
	private static final String QUESTIONS_DATA_FILE = new File("src/question.csv").getAbsolutePath();
	public Questions(int questionNo,String question ,String questionType,String options)
	{
		this.questionNo=questionNo;
		this.questionType=questionType;
		this.question=question;
		if(questionType.equals("Text"))
			this.options="";
		else
			this.options=options;
	}
	public int getQuesttionNo()
	{
		return questionNo;
	}
	public String getQuestion()
	{
		return question;
	}
	public String getQuestionType()
	{
		return questionType;
	}
	public String getOptions()
	{
		return options;
	}
	public static List<Questions> readQuestionsFromFile()//Reading File and then put question into List of question type
	{
		BufferedReader br=null;
		try
		{
			br = new BufferedReader(new FileReader(QUESTIONS_DATA_FILE));
			try
			{
				String sCurrentLine="";
				int questionNo=0;
				while ((sCurrentLine = br.readLine()) != null)
				{
					String[] quesDetailStrings = sCurrentLine.split(COMMA_SEPERATER);// Reading line by line
				
						if(quesDetailStrings.length==3)
						{
							String str= quesDetailStrings[2].trim();
							int start=str.indexOf('(');
							int end=str.indexOf(')');
							String newStr=str.substring(start+1, end);				
							
							questionsList.add(new Questions(++questionNo, quesDetailStrings[0].trim(), quesDetailStrings[1].trim(), newStr));
						}
						else if(quesDetailStrings.length==2)
						{
							String blankString="";
							questionsList.add(new Questions(++questionNo, quesDetailStrings[0].trim(), quesDetailStrings[1].trim(),blankString));
						}
						
				}
				
					br.close();
				
			}
			catch (IOException e)
			{
				System.out.println("IO Exception occured");
				System.exit(1);
				
			}
		}
		catch (FileNotFoundException e1)
		{
			System.out.println("File not Found");
			System.exit(1);
		}
		return questionsList;  //return the all question list 
	}
	

	
	
}
