import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question {

	 FileReader Fin;
	 BufferedReader bufferReader;
	Scanner sc= new Scanner(System.in );
	//method single select question return string having answer of single select question throws IOException
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
		 String answer=new String();
	        while(flag==0)
	        {
	          answer=sc.nextLine();
	        
	         for( int i=1;i<6;i++)
	         {
	             if(questionArray[i].equals(answer))
	         {flag=1;
	        break;
	         }
	         }
	         if(flag==0)
	         {
	            System.out.println("Enter Valid ans");
	      
	         }
	        }
	         return answer;
	 }
// method for multiple select question return array list having response of multiselect question throws IOException
			public   ArrayList<String> mulipleSelect() throws IOException{
			int count=0;
			String line=null;
			Fin= new FileReader("Survey.txt");
			  bufferReader=new BufferedReader(Fin);
			  while(count!=6)
				  { line = bufferReader.readLine();
				 count++;
				  }
			 ArrayList<String> answer=new ArrayList<String>();
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
                 answer=new ArrayList<String>();
            for(int p=0;p<3;p++)
               
            { Ans=sc.nextLine();
              answer.add(Ans);
            }
            for(int c=0;c<answer.size();c++)
            {
                if(answer.get(c).equals("1"))
                answer.set(c,"1.Service Quality" );
                else if(answer.get(c).equals("2"))
                    answer.set(c,"2.Communication");
                else if(answer.get(c).equals("3"))
                    answer.set(c,"3.Delivery Process");
            }
            int p=0;
            for( int i=0;i<3;i++)
            {
                if(questionArray[1].equals(answer.get(i))||(questionArray[2].equals(answer.get(i)))||(questionArray[3].equals(answer.get(i)))||(answer.get(i).equals("")))// to check validation
            { flag++;
            
                if((answer.get(i).equals(""))) p++;
                }
            }
            if(p==3||flag<3)
           	 {
           	 System.out.println("Enter valid answer");
           	 
            flag=0;
           	 }
			}
			  return answer;
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


