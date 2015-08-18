package survey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Name: surveyConsole
 * @author anurag
 * Since: 14 August,2015
 * Description: It takes the input
 **/
public class surveyConsole extends userInput
{   
  /**
   * Name: main 
   * @param args: Console input
   * @return:
   * Description: Takes the input from user
   **/
   	public static void main(String args[])
   	{
   		// For printing the result
   		List <String> questionPrint=new ArrayList();
   		Scanner Sc= new Scanner(System.in);
   		// For printing the quetion
   		List<String> Question1=new ArrayList();
   		// Enter the users
   		System.out.println("Enter the no of user ");
   		int noofUsers= Sc.nextInt();
   		// Average of the input
   		int [] average= new int[noofUsers];
   		// AreaOfImprovements input
   		String[] areaOfImprovement=new String[noofUsers];
   		// Feedback input
   		String[] feedback=new String[noofUsers];
   		String COMMA_DELIMITER = ",";
   		int[] percentagePrint=new int[6];
   		// Printing the Result
   		int[] percentageResult=new int[]{0,0,0,0,0,0};
   		// For Counting the value
   		int zero=0,one=0,two=0,three=0,four=0,five=0,total=0;
   		// Calling the function to print
		Question1=answer(noofUsers);
		/*for(int i=0;i<Question1.size();i++)
		{
			System.out.println(Question1.get(i));
		}*/
		for (int i = 0; i < Question1.size(); i++) 
		{
			String[] tokens = Question1.get(i).split(COMMA_DELIMITER);// intializing the value to the string array
			if (tokens.length > 0) 
			{
				average[i] = Integer.parseInt(tokens[0]);
				areaOfImprovement[i] = tokens[1];
				feedback[i]=tokens[2];
			}
		}
		// For counting the values
		for(int i=0;i<noofUsers;i++)
		{
			if(average[i]==1)
			{
				one++;
				total++;
				percentageResult[1]=(one*100);
			}
			else if(average[i]==2)
			{
				two++;
				total++;
				percentageResult[2]=(two*100);
			}
			else if(average[i]==3)
			{
				three++;
				total++;
				percentageResult[3]=(three*100);
			}
			else if(average[i]==4)
			{
				four++;
				total++;
				percentageResult[4]=(four*100);
			}
			else if(average[i]==5)
			{
				five++;
				total++;
				percentageResult[5]=(five/100);
			}
				   }
		
   	     // printing the percentage
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+": "+percentageResult[i]/total+"%");
		}
		surveyQuestion obj=new surveyQuestion();
		 try {
			questionPrint=obj.readCsvFile();
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 // Printing the Result
		for (int i = 0; i < Question1.size(); i++)
		{
			System.out.println("participant "+ i+1+":");
			for(int count=0;count<3;count++)
	   		{
				System.out.println(questionPrint.get(count));
	   			if(count==0)
	   			{
	   				System.out.println("Answer"+average[i]);
	   			}
	   			else if(count==1)
	   			{
	   				System.out.println("Answer"+areaOfImprovement[i]);
	   			}
	   			else if(count==2)
	   			{
	   				System.out.println("Answer"+feedback[i]);
	   			}
	   		}
			System.out.println("\n");
		}
   	}

}
