import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Survey 
{
	static int reportPercant(int participant,int ans)
	{
		//System.out.println("participant : "+participant); 
		
		int _percent=((ans*100)/participant);
		//System.out.println("Percent : "+_percent);
		return _percent;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
       Scanner sc=new Scanner(System.in);
		
		ArrayList<Question> que=new ArrayList<Question>();  //Defining array list of Question type which is fix in a service center
		
		/*que.add(new Question(1, "You are \n1)Student\n2)Working Professional\n3)House Wife\n4)Other\n","Single Select"));
		que.add(new Question(2, "Your Age group\n1) Up to 18\n2) Between 18 to 30\n3) Between 18 to 30\n4) Over 50\n ","Single Select"));
		que.add(new Question(3, "Please Mention the income group you belong to (Student mention their Pocket money)\n1) Below Rs.5000\n2) Rs.5000 to 10000\n3) Rs.10000 to 25000\n4) Above Rs.250000\n",  "Single Select"));
		que.add(new Question(4, "How much you spend on daily fast food?\n1) Rs.10-15\n2) Rs.26-50\n3) Rs.51-75\n4) More than Rs.75\n", "Single Select"));
		que.add(new Question(5, "I spend Most of above Quoted Money for(You can select Multiple Answer)\n Breakfast/ Afternoon Snacks and coffe/ Lunch/ Other\n", "Multiple Select"));
		que.add(new Question(6, "I usully prefer(You can select Multiple Answer)\n Pizza / Burger/ French fries/ Other\n","Multiple Select"));
		que.add(new Question(7, "What’s your favourite food?","Text"));
		que.add(new Question(8, "which type of food You like?","Text"));*/
		
		
		BufferedReader br = null;     //input BY file

		try {

			StringTokenizer stringTokenizer;

			FileInputStream fin = new FileInputStream(new File("C:\\Users\\Suman\\workspace\\OOP-session-2\\src\\testing.txt"));

			DataInputStream in = new DataInputStream(fin);

			br = new BufferedReader(new InputStreamReader(in));

			String survaydata="";
			int i=1;

			String QueNo="",Question="",QueType="";

			while ((survaydata = br.readLine()) != null) 
			{

			stringTokenizer = new StringTokenizer(survaydata,","); 
			i=1;
			
			
			while (stringTokenizer.hasMoreTokens()) 
			{  
			        if(i==1)
			        {  
			        QueNo=stringTokenizer.nextToken();
			        }

			        else if(i==2)
			        {
			        Question=stringTokenizer.nextToken();
			        }
			        else if(i==3)
			        {
			        QueType=stringTokenizer.nextToken();
			        }
			        
			       	i++; 
			    }
			int Qno=Integer.parseInt(QueNo); 

			que.add(new Question(Qno,Question,QueType));
			}

		  } catch (IOException e)
		{
			  e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				if (br != null)br.close();
			} catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}

		
		
		ArrayList<Participant>  par=new ArrayList<Participant>();
		ArrayList<Answer>  ans=new ArrayList<Answer>();
		
		int i=1,j=1,flag=1,chosen1=0,chosen2=0,chosen3=0,chosen4=0,pid,age;                  //variables used to count no of cars
		String name,gender,answer;
		
		
		try
		{
		while(flag==1)                  //loop for next user input of participants feedback
		{
			System.out.println("Enter Detail for participant: "+i);
			
			System.out.println("Participant Id: ");
			pid=sc.nextInt();
			
			System.out.println("Participant name: ");
			name=sc.next();
			
			System.out.println("Participant age: ");
			age=sc.nextInt();
			
			System.out.println("Participant gender: ");
			gender=sc.next();
			
			Participant  ref=new Participant(pid,name,age, gender);
			par.add(ref);	
			
			java.util.Iterator<Question> itr11=que.iterator();
			
			while(itr11.hasNext())                       //loop to check weather question available or not
			  {
				Question qs=itr11.next();
				
				System.out.println(qs._question);
				answer=sc.next();
				
				ans.add(new Answer(qs._queNo,answer,qs._queType,pid));
				
				if(qs._queType.equalsIgnoreCase("Single Select"))
				{
					//System.out.println("hiii"+qs.Question);
				switch (answer)                                                       //for count no of option chosen  participant 
				  {
				    case "1": chosen1++;
				            //  System.out.print("ch1 : "+choosen1);
					          break;
					     
				    case "2": chosen2++;
		                    // System.out.print("ch2 : "+choosen2);
			                  break;
			             
				    case "3": chosen3++;
		                    // System.out.print("ch3 : "+choosen3);
			                  break;
			             
				    case "4": chosen4++;
		                     // System.out.print("ch4 : "+choosen4);
			                  break;

				    default:  System.out.print("Please Select Option from 1 to 4 Only");
					break;
				   }
		         }
			  }	 	
		    System.out.println("Enter 1 if you want to continue otherwise 0: ");
		    flag=sc.nextInt();
		    
		    if(flag==0)
		    {
		    	break;
		    }
		    i++;
		 }

		int totalParticipant=4*i;
		
		/*System.out.println("totalParticipant: "+totalParticipant);
		System.out.println("ch1 : "+choosen1);
		System.out.println("ch2 : "+choosen2);
		System.out.println("ch3 : "+choosen3);
		System.out.println("ch4 : "+choosen4);*/
		
		// Report rp=new Report();
		 
		int chosen1_percent=reportPercant(totalParticipant,chosen1);
		int chosen2_percent=reportPercant(totalParticipant,chosen2);
		int chosen3_percent=reportPercant(totalParticipant,chosen3);
		int chosen4_percent=reportPercant(totalParticipant,chosen4);
		
		System.out.println("Choosen 1 : "+chosen1_percent+"%  Participant\nChoosen 2 : "+chosen2_percent+"%  Participant");
		System.out.println("Choosen 3 : "+chosen3_percent+"%  Participant\nChoosen 4 : "+chosen4_percent+"%  Participant\n");
		
		
		
		java.util.Iterator<Participant> par1=par.iterator();
		
		while(par1.hasNext())                       //loop to check weather Participant available or not
		  {
			
			Participant  p=par1.next();
			
		    System.out.println("\nSurvey Report of Participant: "+j+"\n\n");
		    
		    java.util.Iterator<Question> itr12=que.iterator();
		    java.util.Iterator<Answer> itr21=ans.iterator();
			
		    while(itr12.hasNext())                       //loop to check weather Question available or not
		   {
			 
			Question qs=itr12.next();
			Answer as=itr21.next();
			
			System.out.println("Q "+qs._queNo+": "+qs._question);
			System.out.println("Answer Given:"+as._answer+"\n");
			  		
		    }
		    	j++;
          }
		 	 
	  }
	  catch(Exception e)
	  {
		   System.out.print(e);
	  }
     sc.close();
	}

}

