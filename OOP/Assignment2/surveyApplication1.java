import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

class singleSelectQues1
{	
	String singleSelectAnswers[] = new String[3] ;
	void setAns( String ans[] )
	{
		singleSelectAnswers = new String[ans.length];
		singleSelectAnswers = ans;
	}
	String [] getAns()
	{
		return singleSelectAnswers;
	}
}


class multipleSelectQues1
{
	String multipleSelectAnswers[];
	void setAns( String ans[])
	{
		multipleSelectAnswers = new String[ans.length];
		multipleSelectAnswers = ans;
	}
	String [] getAns()
	{
		return multipleSelectAnswers;
	}
}

class textQues1
{
	String textAnswer[];
	void setAns( String ans[])
	{
		textAnswer = new String[ans.length];
		textAnswer = ans;
	}
	String [] getAns()
	{
		return textAnswer;
	}
}

public class surveyApplication1 
{
	String ansOption1 = "", ansOption2 = "", ansOption3 = "", ansOption4 = "";
	
	public static void main(String[] args) 
	{
		int index1, index2 = -1, index3 = -1, index4 = -1, numOfSingleSelectQues = 10, numOfMultipleSelectQues = 10, numOfTextQues = 10;
		Scanner sc = null;
		String filePath = "C://Users/Kajal/workspace/Assignment6/src/";
		String quesType[] = { "Single Select", "Multiple Select", "Text"};
		sc = new Scanner(System.in);
		
		String singleSelectAns[] = new String[numOfSingleSelectQues];       // Collects answers of all single select Questions
		String multipleSelectAns[] = new String[numOfMultipleSelectQues];     // Collects answers of all multiple select Questions
		String textAns[] = new String[numOfTextQues];               // Collects answers of all text Questions
        
		System.out.println("Enter the number of students");
		int numOfStudents = sc.nextInt();
		
		singleSelectQues1 [] objSingleSelectQues = new singleSelectQues1[numOfStudents];   // for single select questions of all participants 
		multipleSelectQues1 [] objMultipleSelectQues = new multipleSelectQues1[numOfStudents];   // for multiple select questions of all participants 
		textQues1 [] objTextQues = new textQues1[numOfStudents];   // for text questions of all participants 
		
		/* sets answers for each participant */
		for (index1 = 0; index1 < numOfStudents; index1++)
		{
			InputStream in = null;
			BufferedReader reader = null;
			String line;
			try
			{	
				System.out.println("\n\nParticipant "+(index1+1)+"\n");
				in = new FileInputStream ( new File(filePath+"Questions.txt"));  
				reader = new BufferedReader (new InputStreamReader(in));
				
				while((line = reader.readLine())!= null)
				{
					if(line.indexOf(quesType[0])!= -1)               // takes answers of all single select questions for 1 participant
		        	{  
		        		System.out.println(line);
		        		index2++;
		        		singleSelectAns [index2] = sc.next();
		        	}
					else if(line.indexOf(quesType[1])!= -1)        // takes answers of all multiple select questions for 1 participant    
		        	{  
		        		index3++;
		        		System.out.println(line);
		        		multipleSelectAns [index3] = sc.next();
		        	}
					else if(line.indexOf(quesType[2])!= -1)                   // takes answers of all text questions for 1 participant
		        	{  
		        		index4++;
		        		System.out.println(line);
		        		textAns [index4] = sc.next();	
		        	}	        	
		        }
			}
			catch( Exception ex )
			{
				ex.printStackTrace();
			}
			
			
			objSingleSelectQues [index1] = new singleSelectQues1();
			objSingleSelectQues [index1].setAns( singleSelectAns );      // sets answers of all single select questions for 1 participant
			
			objMultipleSelectQues [index1] = new multipleSelectQues1();
			objMultipleSelectQues [index1].setAns( multipleSelectAns );  // sets answers of all multiple select questions for 1 participant
				
			objTextQues [index1] = new textQues1();
			objTextQues [index1].setAns( textAns );                      // sets answers of all text questions for 1 participant
		}

		
		index2 = -1; 
		index3 = -1; 
		index4 = -1;
		singleSelectAns = null;
		multipleSelectAns = null;
		textAns = null;
		
		String str[] = new String [numOfStudents];
		for( index1 = 0; index1<numOfStudents; index1++ )
			str[index1] = "";
		 
		/* gets answers of all questions of each participant and displays them */
		for (index1 = 0; index1 < numOfStudents; index1++)           
		{
			singleSelectAns = objSingleSelectQues[index1].getAns();
			multipleSelectAns = objMultipleSelectQues[index1].getAns();
			textAns = objTextQues[index1].getAns();
			InputStream in = null;
			BufferedReader reader = null;
			System.out.println("\n\nParticipant : "+(index1+1)+"\n");
			try
			{	
				in = new FileInputStream( new File(filePath+"Questions.txt"));  
				reader = new BufferedReader (new InputStreamReader(in));
				String line;
				while((line = reader.readLine())!= null)
				{
		        	if(line.indexOf(quesType[0])!= -1)            
		        	{  
		        		index2++;
		        		System.out.println(line);
		        		System.out.println(singleSelectAns[index2]);
		        		str[index1]  =  str[index1].concat(singleSelectAns[index2]);
		        	}
		        	if(line.indexOf(quesType[1])!= -1)            
		        	{  
		        		index3++;
		        		System.out.println(line);
		        		System.out.println(multipleSelectAns[index3]);		        		
		        	}
		        	else if(line.indexOf(quesType[2])!= -1)            
		        	{  
			        	index4++;
		        		System.out.println(line);
		        		System.out.println(textAns[index4]);		        		
		        	}		        	
		        }
			}
			catch( Exception ex )
			{
				ex.printStackTrace();
			}	
		}

		
		/* calculates percentage of option chosen by user */
		String ques[] = new String [3];
		for( index1 = 0; index1<numOfStudents; index1++ )
			ques[index1] = "";
		for( index1 = 0; index1 < numOfStudents; index1++ )
		{
			for( index2 = 0; index2<3; index2++ )
			{
				ques[index2] = ques[index2] + str[index1].charAt(index2);
			}
		}
		
		for( index1 = 0; index1<3; index1++ )
		{
			char arr[] = ques[index1].toCharArray();
			int count = 0, sumA = 0, sumB = 0, sumC = 0;
			while( count < arr.length )
			{
				if(arr[count]=='1')
					sumA = sumA + 1;
				else if(arr[count]=='2')
					sumB = sumB + 1;
				else if(arr[count]=='3')
					sumC = sumC + 1;
				count++;
			}
			System.out.println("\nQuestion "+(index1+1)+":\n1). "+((sumA*100)/numOfStudents)+" %\n2). "+(sumB*100)/numOfStudents+" %\n3). "+(sumC*100)/numOfStudents+" %");	
		}
	}
}































/////////////////////////////////////////////////////////////////////////////////////////////////////
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.*;
//
//class singleSelectQues1
//{	
//	String singleSelectAnswers[] = new String[3] ;
//	void setAns( String ans[] )
//	{
//		singleSelectAnswers = new String[ans.length];
//		singleSelectAnswers = ans;
//	}
//	String [] getAns()
//	{
//		return singleSelectAnswers;
//	}
//}
//
//
//class multipleSelectQues1
//{
//	String multipleSelectAnswers[];
//	void setAns( String ans[])
//	{
//		multipleSelectAnswers = new String[ans.length];
//		multipleSelectAnswers = ans;
//	}
//	String [] getAns()
//	{
//		return multipleSelectAnswers;
//	}
//}
//
//class textQues1
//{
//	String textAnswer[];
//	void setAns( String ans[])
//	{
//		textAnswer = new String[ans.length];
//		textAnswer = ans;
//	}
//	String [] getAns()
//	{
//		return textAnswer;
//	}
//}
//
//public class surveyApplication1 
//{
//	String ansOption1 = "", ansOption2 = "", ansOption3 = "", ansOption4 = "";
//	
//	public static void main(String[] args) 
//	{
//		int index1, index2 = -1, index3 = -1, index4 = -1, numOfSingleSelectQues = 10, numOfMultipleSelectQues = 10, numOfTextQues = 10;
//		Scanner sc = null;
//		String filePath = "C://Users/Kajal/workspace/Assignment6/src/";
//		//String quesType[] = { "Single Select", "Multiple Select", "Text"};
//		sc = new Scanner(System.in);
//		
//		String singleSelectAns[] = new String[numOfSingleSelectQues];       // Collects answers of all single select Questions
//		String multipleSelectAns[] = new String[numOfMultipleSelectQues];     // Collects answers of all multiple select Questions
//		String textAns[] = new String[numOfTextQues];               // Collects answers of all text Questions
//        
//		System.out.println("Enter the number of students");
//		int numOfStudents = sc.nextInt();
//		
//		singleSelectQues1 [] objSingleSelectQues = new singleSelectQues1[numOfStudents];   // for single select questions of all participants 
//		multipleSelectQues1 [] objMultipleSelectQues = new multipleSelectQues1[numOfStudents];   // for multiple select questions of all participants 
//		textQues1 [] objTextQues = new textQues1[numOfStudents];   // for text questions of all participants 
//		
//		/* sets answers for each participant */
//		for (index1 = 0; index1 < numOfStudents; index1++)
//		{
//			InputStream in = null;
//			BufferedReader reader = null;
//			String line;
//			try
//			{	
//				System.out.println("\n\nParticipant "+(index1+1)+"\n");
//				in = new FileInputStream ( new File(filePath+"Questions.txt"));  
//				reader = new BufferedReader (new InputStreamReader(in));
//				
//				while((line = reader.readLine())!= null)
//				{
//					if(line.indexOf("Single Select")!= -1)               // takes answers of all single select questions for 1 participant
//		        	{  
//		        		System.out.println(line);
//		        		index2++;
//		        		singleSelectAns [index2] = sc.next();
//		        	}
//					else if(line.indexOf("Multiple Select")!= -1)        // takes answers of all multiple select questions for 1 participant    
//		        	{  
//		        		index3++;
//		        		System.out.println(line);
//		        		multipleSelectAns [index3] = sc.next();
//		        	}
//					else if(line.indexOf("Text")!= -1)                   // takes answers of all text questions for 1 participant
//		        	{  
//		        		index4++;
//		        		System.out.println(line);
//		        		textAns [index4] = sc.next();	
//		        	}	        	
//		        }
//			}
//			catch( Exception ex )
//			{
//				ex.printStackTrace();
//			}
//			
//			
//			objSingleSelectQues [index1] = new singleSelectQues1();
//			objSingleSelectQues [index1].setAns( singleSelectAns );      // sets answers of all single select questions for 1 participant
//			
//			objMultipleSelectQues [index1] = new multipleSelectQues1();
//			objMultipleSelectQues [index1].setAns( multipleSelectAns );  // sets answers of all multiple select questions for 1 participant
//				
//			objTextQues [index1] = new textQues1();
//			objTextQues [index1].setAns( textAns );                      // sets answers of all text questions for 1 participant
//		}
//
//		
//		index2 = -1; 
//		index3 = -1; 
//		index4 = -1;
//		singleSelectAns = null;
//		multipleSelectAns = null;
//		textAns = null;
//		
//		String str[] = new String [numOfStudents];
//		for( index1 = 0; index1<numOfStudents; index1++ )
//			str[index1] = "";
//		 
//		/* gets answers of all questions of each participant and displays them */
//		for (index1 = 0; index1 < numOfStudents; index1++)           
//		{
//			singleSelectAns = objSingleSelectQues[index1].getAns();
//			multipleSelectAns = objMultipleSelectQues[index1].getAns();
//			textAns = objTextQues[index1].getAns();
//			InputStream in = null;
//			BufferedReader reader = null;
//			System.out.println("\n\nParticipant : "+(index1+1)+"\n");
//			try
//			{	
//				in = new FileInputStream( new File(filePath+"Questions.txt"));  
//				reader = new BufferedReader (new InputStreamReader(in));
//				String line;
//				while((line = reader.readLine())!= null)
//				{
//		        	if(line.indexOf("Single Select")!= -1)            
//		        	{  
//		        		index2++;
//		        		System.out.println(line);
//		        		System.out.println(singleSelectAns[index2]);
//		        		str[index1]  =  str[index1].concat(singleSelectAns[index2]);
//		        	}
//		        	if(line.indexOf("Multiple Select")!= -1)            
//		        	{  
//		        		index3++;
//		        		System.out.println(line);
//		        		System.out.println(multipleSelectAns[index3]);		        		
//		        	}
//		        	else if(line.indexOf("Text")!= -1)            
//		        	{  
//			        	index4++;
//		        		System.out.println(line);
//		        		System.out.println(textAns[index4]);		        		
//		        	}		        	
//		        }
//			}
//			catch( Exception ex )
//			{
//				ex.printStackTrace();
//			}	
//		}
//
//		
//		/* calculates percentage of option chosen by user */
//		String ques[] = new String [3];
//		for( index1 = 0; index1<numOfStudents; index1++ )
//			ques[index1] = "";
//		for( index1 = 0; index1 < numOfStudents; index1++ )
//		{
//			for( index2 = 0; index2<3; index2++ )
//			{
//				ques[index2] = ques[index2] + str[index1].charAt(index2);
//			}
//		}
//		
//		for( index1 = 0; index1<3; index1++ )
//		{
//			char arr[] = ques[index1].toCharArray();
//			int count = 0, sumA = 0, sumB = 0, sumC = 0;
//			while( count < arr.length )
//			{
//				if(arr[count]=='1')
//					sumA = sumA + 1;
//				else if(arr[count]=='2')
//					sumB = sumB + 1;
//				else if(arr[count]=='3')
//					sumC = sumC + 1;
//				count++;
//			}
//			System.out.println("\nQuestion "+(index1+1)+":\n1). "+((sumA*100)/numOfStudents)+" %\n2). "+(sumB*100)/numOfStudents+" %\n3). "+(sumC*100)/numOfStudents+" %");	
//		}
//	}
//}
