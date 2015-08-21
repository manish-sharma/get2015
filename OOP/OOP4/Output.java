import java.util.ArrayList;
public class Output {
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
	 }
		 System.out.println("Q1.Overall Rating?(1/2/3/4/5)");
		 for(int j=0;j<5;j++)
		 {
			 
			 System.out.println(j+1+":"+out[j]+"%");
		
	 }}
		catch(ArithmeticException Ae)
		{
		 System.out.println("please Enter Some Data ");
		}
		
		 return out;
	 }
	 //name name of participant ans1 response list of participants of single select ans2 response list of 
	 //participants of multiple select ans3 response list of participants of feedback 
	 public void  OutputReport(ArrayList<String> name,ArrayList<String> ans1,ArrayList<ArrayList<String>> ans2,ArrayList<String> ans3)
	 { 
		
		 for(int i=0;i<name.size();i++)
	 { System.out.println("participant:"+(i+1));
	   System.out.println (name.get(i));
	   System.out.println("Q1:Overall Rating?(1/2/3/4/5)");
	   System.out.println(ans1.get(i));
	   System.out.println("Q2:Area of improvement?(1.Service Quality/2.Communication/3.Delivery Process");
	   for(int j=0;j<3;j++)
	   System.out.println(((ArrayList<String>) ans2.get(i)).get(j));
	   System.out.println("Q3:Feedback?");
	   System.out.println(ans3.get(i));
	 }
	 }

}
