/*SURVEY APPLICATION
 * which contains n no. of questions(Single select,Multi select,Text)
 * and generate 2 outpout reports
 * First will contain each participant Id,name,Questions and corresponding ans given by participant
 * Second will contain percentage of participants' choice for single select Questions
 */
import java.io.InputStreamReader;
import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner.*;
import java.util.Iterator;

/*This class will set and provide Question,
 * Question_Type,Option_List for each question
 * and set the ans for each question give by each participant
 */
class Questions{
	 String Question, Question_Type;
    String optionsList[];
    ArrayList<String> Answer;
    public Questions(String Question,String Question_Type,String[] optionsList)
   {
	  this.optionsList=new String[optionsList.length];
	  this.Question=Question;
	  this.Question_Type=Question_Type;
	  for(int i=0;i<optionsList.length;i++)
	  {
	   this.optionsList[i]=optionsList[i]; 
	  }
	  
   }
   public Questions(ArrayList<String> Answer) {
	   this.Answer=new ArrayList<String>();
	   this.Answer=Answer;
	  
	    }
   public Questions() {
	
    }
  }

/*This class will set and provide each participant Id and name
 * and provide answers for each question given by each participant
 */
 class Participant
 {
	int participant_id;
	String name;
	ArrayList<Questions> ques_ans;
	public Participant(int participant_id,String name,ArrayList<Questions> ques_ans)
	{
		this.participant_id=participant_id;
		this.name=name;
		this.ques_ans=new ArrayList<Questions>();
		this.ques_ans=ques_ans;
	}
 public Participant() {
	
	}
 }
 
 /*This is main class which reads the answer
  *  given by each participant for each question
  *  and generate 2 output reports
  */
public class Survey_Application 
{
	 static ArrayList<Questions> ques;
	 static ArrayList<Questions> ques_ans;
	 static ArrayList<Participant> participant;
	 static ArrayList<String>  Answer;
	 public static void main(String args[])
	 {
		//try{
			Scanner scan=new Scanner(System.in);
		
		 String optionsList1[]={"1","2","3","4","5"};
 		 String optionsList2[]={"Service Quality","Communication","Delivery Process"};
 		 String optionsList3[]={"give your feedback"};
 		 Questions Q1=new Questions("Overall Rating?","single select",optionsList1);
		 Questions Q2=new Questions("Area of improvement?", "Multi Select",optionsList2);
		 Questions Q3=new Questions("Feedback?","Text",optionsList3); 
		 ques=new ArrayList<Questions>();
		 
		 /*This will add each Questions class object
		  * into ques list which is of Quuestions Type
		  */
		 ques.add(Q1 );
 		 ques.add(Q2);
 	     ques.add(Q3);
		 Participant P=new Participant();	
		 Questions Q=new Questions();
		 Questions QP=new Questions();
		 String flag ="0";
	     int particpantId=0;
	    System.out.println("****SURVEY APPLICATION****\n");
	     participant=new ArrayList<Participant>();
	    
	     /*For each Participant read each question and 
	      * store answer given by each participant
	      */
	     while (flag.equals("0"))
	     {
	    	 particpantId++;
	    	 System.out.println("Enter Participant "+particpantId+" Name");
	 	    String name = scan.next();
		    int i=1;
		   int flag1;
		   ques_ans=new ArrayList<Questions>();	
		  Iterator<Questions> iterator = ((ArrayList<Questions>) ques).iterator();
		do
		 {
			flag1=0;
			Q= iterator.next();
			System.out.println("Q"+i+". "+Q.Question);
			System.out.print("Question_Type :"+Q.Question_Type+"\n");
			for(int k=0;k<(Q.optionsList).length;k++)
			{
				System.out.println(Q.optionsList[k]);
			}
			i++;
			if(Q.Question_Type.equals("single select"))
	       {
	         Answer=new ArrayList<String>();
	    	 while(flag1==0)
	    	 {
	    		 String Ans=scan.next();	    	 
	    		 if(Ans.equalsIgnoreCase("1")||Ans.equalsIgnoreCase("2")||Ans.equalsIgnoreCase("3")
	    			 ||Ans.equalsIgnoreCase("4")||Ans.equalsIgnoreCase("5"))
	    	    {    flag1=1;
	    	     Answer.add(Ans);
	    	     ques_ans.add(new Questions(Answer));
	    	   }
	    	   else
	    	    {
	    		 System.out.println("Please Answer either 1 or 2 or 3 or 4 or 5 ");
	    		 
	    	    }
	    	  }
	       }
	     int flag2=0;
	     int totalchoice;
	     if(Q.Question_Type.equals("Multi Select"))
	     {
	    	 Answer=new ArrayList<String>();
	        System.out.println("\nHow much choices you will choose");
	        while(flag2==0)
	        {
	         totalchoice=Integer.parseInt(scan.next());
	         if(totalchoice>=1 && totalchoice<=3)
   		     {
	        	flag2=1;
	    	    System.out.println("\nGive Your answer");
	    	    String Ans=scan.nextLine();	
	    	    for(int p=1;p<=totalchoice;p++)
   			    {
   				 flag1=0;
   				 while(flag1==0)
    		      {
    			    Ans=scan.nextLine();	 
    				if(Ans.equalsIgnoreCase("Service Quality")||Ans.equalsIgnoreCase("Communication")||Ans.equalsIgnoreCase("Delivery Process"))
            	    	      {    flag1=1;
            	    	           Answer.add(Ans);
            	    	           ques_ans.add(new Questions(Answer));
            	    	      }
            	    	     else
            	    	      {
            	    		 System.out.println("Please Answer either Service Quality or Communication or Delivery Process not "+Ans);
            	    	      }
        					}
    			           }
    				      }
	                else
   			         System.out.println("Total no. of choices are only 3 , so please enter either 1 or 2 or 3 ");
	     }
	    }
	    if(Q.Question_Type.equals("Text"))
	     {
	    	 Answer=new ArrayList<String>();
	    	 flag1=0;    
	    	
	    	// Ans=scan.nextLine();
	    	 String Ans=scan.nextLine();
	    	 while(flag1==0)
	    	 {
	    		//System.out.println(Ans);
	    		 if(Ans.equalsIgnoreCase(""))
	    	   {
	    			 System.out.println("Please give your feedback");
	    			 Ans=scan.nextLine();
	    	   }
	    	  else
	    	  {
	    		 flag1=1;
	    		 Answer.add(Ans);
	    		 //System.out.println(Answer.get(0));
	    		 ques_ans.add(new Questions(Answer));
	    		 //System.out.println(ques_ans.get(0));
	    		 
	    	  }
	    		
	        }
	   }
	 }while(iterator.hasNext()); 
		 participant.add(new Participant(particpantId,name,ques_ans));
	     System.out.println("\nIf More Participants are there than press 0 \n \nExit from Application  if no more participants are there -Press Any key");
	     if (!(scan.next().equals("0"))) {
				System.out.println("\nAre You Really Want to Exit From Application ? yes/no");
				if (scan.next().equalsIgnoreCase("no")) {
					flag = "0";
				} else {
					flag = "1";
				}
	         } 
	       }
	     double count1=0;
	     double count2=0;
	     double count3=0;
	     double count4=0;
	     double count5=0;
	     double totalParticipants=0;
	     System.out.println("Answers Given By Every Participant :" );
	     System.out.println();
	     Iterator<Participant> iterator1= ((ArrayList<Participant>) participant).iterator();
	     System.out.println("\nOUTPUT REPORT 1:\n");
	     do
	     {
	    	 int j=0,i=0;
	    	 P=iterator1.next();
	    	 totalParticipants++;
	    	 System.out.println("Participant "+P.participant_id+" : "+P.name+ " :\n");
	    	 System.out.println();
	    	 Iterator<Questions> iteratorP = ((ArrayList<Questions>) P.ques_ans).iterator();
	    	 Iterator<Questions> iterator = ((ArrayList<Questions>) ques).iterator();
	 		do
	 		 {
	 	        i++;
	 			Q= iterator.next();
	 			QP=iteratorP.next();
	 			System.out.println("Q"+i+". "+Q.Question);
	 			System.out.println("Question_Type :"+Q.Question_Type+"\n");
	    		for(int r=0;r<QP.Answer.size();r++)
	 			{ System.out.println("Ans. "+QP.Answer.get(r)+"\n");
	 			
	 			}
	     	 } while(iterator.hasNext() && iteratorP.hasNext()); 
	     }while(iterator1.hasNext());
	     Iterator<Participant> iterator2= ((ArrayList<Participant>) participant).iterator();
	    do
	    {
	    	 P=iterator2.next();
	         Iterator<Questions> iterator = ((ArrayList<Questions>) ques).iterator();
	         Iterator<Questions> iteratorP = ((ArrayList<Questions>) P.ques_ans).iterator();
	         System.out.println("\nOUTPUT REPORT 2:");
	     do
	     {
	    	  Q=iterator.next();
	    	  QP=iteratorP.next();
	          if(Q.Question_Type.equals("single select"))
	    	  {
	    		 if(QP.Answer.get(0).equals("1"))
	    		 {
	    			 count1++;
	    		 }
	    		 if(QP.Answer.get(0).equals("2"))
	    		 {
	    			 count2++;
	    		 }
	    		 if(QP.Answer.get(0).equals("3"))
	    		 {
	    			 count3++;
	    		 }
	    		 if(QP.Answer.get(0).equals("4"))
	    		 {
	    			 count4++;
	    		 }
	    		 if(QP.Answer.get(0).equals("5"))
	    		 {
	    			 count5++;
	    		 }
	    	 }
	      }while(iterator.hasNext() && iteratorP.hasNext());
	    }while(iterator2.hasNext());
	     double per1=(count1/totalParticipants)*100;
	     double per2=(count2/totalParticipants)*100;
	     double per3=(count3/totalParticipants)*100;
	     double per4=(count4/totalParticipants)*100;
	     double per5=(count5/totalParticipants)*100;
	    System.out.println(); 
	    System.out.println("\nDistribution Of Participants' Choice For Single Select Question Only :\n ");
	    System.out.println("Choice 1.->"+per1+"%");
	    System.out.println("Choice 2.->"+per2+"%");
	    System.out.println("Choice 3.->"+per3+"%");
	    System.out.println("Choice 4.->"+per4+"%");
	    System.out.println("Choice 5.->"+per5+"%");
	    
		//}
		//catch (Exception ex) {
			// TODO: handle exception
		//	ex.printStackTrace();
		//}
	     }
       }	
			
	

