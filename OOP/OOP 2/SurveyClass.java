import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
// class for survey to take question
 class Survey
 {
	
	 FileReader Fin;
	 BufferedReader bufferReader;
	Scanner sc= new Scanner(System.in );
	//method for question Single select 
	 public String singleSelect() throws IOException{
		 int count=0;
		 Fin= new FileReader("Survey.txt");// to read form text file
		 
		 bufferReader=new BufferedReader(Fin);
		
		 String[] questionArray=new String[6];
		 while(count!=6) {
			
			 String line = bufferReader.readLine();
			 System.out.println(line);
			 questionArray[count]=line;
			 
			 count++;
		 }
		 int flag=0;
		 String ans=new String();
	        while(flag==0)
	        {
	          ans=sc.nextLine();
	        
	         for( int i=1;i<6;i++)
	         {
	             if(questionArray[i].equals(ans))
	         {flag=1;
	        break;
	         }
	         }
	         if(flag==0)
	         {
	            System.out.println("Enter Valid ans");
	        //    new Survey().singleSelect();
	         }
	        }
	         return ans;
	 }
		
		/* String ans=sc.next();
		
		 for( int i=1;i<6;i++)
		 {
			 if(questionArray[i].equals(ans))
		 {flag=1;
		break;
		 }
		 }
		 if(flag==0)
		 {
			System.out.println("Enter Valid ans");
			new Survey().singleSelect();
		 }
		
		 return ans;*/
	// }
	 //method for multiple select question
		public   ArrayList<String> mulipleSelect() throws IOException{
			int count=0;
			String line=null;
			Fin= new FileReader("Survey.txt");
			  bufferReader=new BufferedReader(Fin);
			  while(count!=6)
				  { line = bufferReader.readLine();
				 count++;
				  }
			 ArrayList<String> ans=new ArrayList<String>();
			 String[] questionArray=new String[4];
			 while(count!=10) {
				  line = bufferReader.readLine();
				 System.out.println(line);
				 questionArray[count-6]=line;
				 
				 count++;
			 }
			int flag=0;
			
			while(flag==0)
			{
                  String Ans=new String();
                  ans=new ArrayList<String>();
             for(int p=0;p<3;p++)
                
             { Ans=sc.nextLine();
               ans.add(Ans);
             }
             for(int c=0;c<ans.size();c++)
             {
                 if(ans.get(c).equals("1"))
                 ans.set(c,"1.Service Quality" );
                 else if(ans.get(c).equals("2"))
                     ans.set(c,"2.Communication");
                 else if(ans.get(c).equals("3"))
                     ans.set(c,"3.Delivery Process");
             }
             int p=0;
             for( int i=0;i<3;i++)
             {
                 if(questionArray[1].equals(ans.get(i))||(questionArray[2].equals(ans.get(i)))||(questionArray[3].equals(ans.get(i)))||(ans.get(i).equals("")))// to check validation
             { flag++;
             
                 if((ans.get(i).equals(""))) p++;
                 }
             }
             if(p==3||flag<3)
            	 {
            	 System.out.println("Enter valid answer");
            	 
             flag=0;
            	 }
			}
			  return ans;
		 }
		// method for text
			  public String text() throws IOException{
				  String line=null, ans=null;;
				  int count=0;
				 Fin= new FileReader("Survey.txt");
				  bufferReader=new BufferedReader(Fin);
				  while(count!=10)
					  { line = bufferReader.readLine();
					 count++;
					  }
				 while(count!=11) {
						
					  line = bufferReader.readLine();
					 System.out.println(line);
					 count++;
				 }
				 int flag=0;
					while(flag==0)
					{
			     ans=sc.nextLine();
			     if((ans.equals("")))
			     { 
			    	 System.out.println("All questions are mandatory to answer.");
			    	 
			     }
			     else flag=1;};
				return ans;  
				
		  }
 }
 
 // class for participant
  class participant extends Survey
 {
	  
	 Scanner sc= new Scanner(System.in );
	 
	 public String  getParticipantDetail(int i){
		String name;
	System.out.println("Enter the Name");
	 name=sc.nextLine();
     return name;
	 }
	 
 }
  // class main and menu;
 public class SurveyClass extends participant
 {
	 // to out put reports as percentage
	 public int[] OutputReportPercentage( ArrayList<String> ans1 ){
		
		 int[]out=new int[5];
		 for(int i=0;i<ans1.size();i++)
		 {    
			 if(ans1.get(i).equals("1")) out[0]++;
			 if(ans1.get(i).equals("2")) out[1]++;
			 if(ans1.get(i).equals("3")) out[2]++;
			 if(ans1.get(i).equals("4")) out[3]++;
			 if(ans1.get(i).equals("5")) out[4]++;
		
	 }
		 int sum=out[0]+out[1]+out[2]+out[3]+out[4];
		try{
		 for(int j=0;j<5;j++)
		 {
		 out[j]=(out[j]*100)/sum;
	 }}catch(ArithmeticException Ae)
		{
		 System.out.println("please Enter Some Data ");
		}
		 for(int j=0;j<5;j++)
		 {
			 System.out.println(j+1+":");
		System.out.println(out[j]);
	 }
		 return out;
	 }
	 // method for report printing
	 public void  OutputReport(ArrayList<String> name,ArrayList<String> ans1,ArrayList<ArrayList<String>> ans2,ArrayList<String> ans3)
	 { 
		
		 for(int i=0;i<name.size();i++)
	 { System.out.println("participant:"+(i+1));
	   System.out.println (name.get(i));
	   System.out.println("Q1:Overall Rating?");
	   System.out.println(ans1.get(i));
	   System.out.println("Q2:Area of improvement?");
	   for(int j=0;j<3;j++)
	   System.out.println(((ArrayList<String>) ans2.get(i)).get(j));
	   System.out.println("Q3:Feedback?");
	   System.out.println(ans3.get(i));
	 }
	 }
	 // main method
	 public static void main(String args[]) throws IOException
	 {
		 
		 Scanner sc= new Scanner(System.in );
		 participant par=new participant();
		 Survey S =new Survey();
		 SurveyClass SC=new SurveyClass();
		 ArrayList<String> name=new ArrayList<String>();
		 ArrayList<String> ans1=new ArrayList<String>();
		 ArrayList<ArrayList<String>> ans2=new ArrayList<ArrayList<String>>();
		 ArrayList<String> ans3=new ArrayList<String>();
		 int i=0;
		 int n=0;
		 do
		 {
			 System.out.println("Enter 1 for login \n 2 for participant in survey \n 3 for Output Report \n 4 for Output Data in percentage \n 5 for exit");
		n=sc.nextInt();
			 if(n==2)
				 i++;
			 switch (n) {
		case 1:
			par.getParticipantDetail(0);
			break;
		case 2:
		name.add(par.getParticipantDetail(i));
		 ans1.add(S.singleSelect());
		ans2.add(S.mulipleSelect());
		 ans3.add(S.text());
		
			break;
		case 3: SC.OutputReport(name,ans1,ans2,ans3);
			break;
		
		case 4:SC.OutputReportPercentage(ans1);
			break;
		case 5:
			System.exit(0);
		}
		 }while(n!=5);
		 
		 sc.close();
 }
 }
 
 
 