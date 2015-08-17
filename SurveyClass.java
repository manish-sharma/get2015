import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 * used to do survey
 * @author Ravika
 *
 */
// class for survey to take question
 class Survey {
	 int count;
	 FileReader Fin;
	 BufferedReader bufferReader;
	Scanner sc= new Scanner(System.in );
	//method for question Single select 
	/**
	 * to answer single select question
	 * @return answer
	 * @throws IOException
	 */
	 public String singleSelect() throws IOException{
		 count = 0;
		 Fin = new FileReader("C:/Users/Ravika/Desktop/Survey.txt");// to read form text file
		 bufferReader = new BufferedReader(Fin);
		 String[] questionArray = new String[6];
		 
		 while(count!= 6) {
			 String line = bufferReader.readLine();
			 System.out.println(line);
			 questionArray[count] = line;			 
			 count++;
		 }
		 int flag = 0;		
		 String ans = sc.nextLine();
		
		 for( int i = 1; i < 6; i++) {
			 if(questionArray[i].equals(ans)) {
				flag = 1;
				break;
			 }
		 }
		 if(flag == 0) {
			System.out.println("Enter Valid ans");
			new Survey().singleSelect();
		}
		
		 return ans;
	 }
	 /**
	  * to answer multiple select question
	  * @return answer
	  * @throws IOException
	  */
	 //method for multiple select question
	public ArrayList<String> multipleSelect() throws IOException {
			count=6;
		ArrayList<String> ans = new ArrayList<String>();
		ArrayList<String> ans1 = new ArrayList<String>();
		String[] questionArray = new String[4];
		while(count != 10) {
			String line = bufferReader.readLine();
			System.out.println(line);
			questionArray[count - 6] = line;
			count++;
		}
		int flag = 0;
		int reply=0;
		for(int count2 = 0; count2 < 3; count2++) {
			String a;
			try{
			if(!(a = sc.nextLine()).equals(""))
			reply = Integer.parseInt(a);
			} catch(NumberFormatException e) {
				System.out.println("please enter 1/2/3 :");
				new SurveyClass().main(null);
				
			}
			ans.add(reply + "");
			switch (reply) {
			case 1:
				ans1.add("Service Quality");
				break;
			case 2:
				ans1.add("Communation");
				break;
			case 3:
				ans1.add("Delivery Process");
				break;
			default:
				ans1.add("");
			}
		}
		 
		for( int i = 0; i <= 2; i++) {
			if((ans.get(i)).equals("1") || (ans.get(i).equals("null")) || (ans.get(i)).equals("2") || (ans.get(i)).equals("3")) {				// to check validation
			flag = 1;
			break;
			}
		}
		int j = 0;
		for( int i = 0; i < 3; i++) {
			if((ans.get(i).equals(""))) {
				j++;
			}
		}
			 if(flag == 0 || j == 3) {					// warning message
				System.out.println("Enter Valid ans.Reset");

				if(j == 3) {
					System.out.println("You should enter at least one Option.Reset");
				}
				
				new SurveyClass().main(null);
		}
			 
		return ans1;
	}
		/**
		 * for feedback
		 * @return answer
		 * @throws IOException
		 */
	public String text() throws IOException{
		String ans = null;
		while(count != 11) {
			String line = bufferReader.readLine();
			System.out.println(line);
			count++;
		}
				 
		ans = sc.nextLine();
		return ans;  
	}
			  
 }
 /**
  * foe participation
  * have participant info
  * @author Ravika
  *
  */
  class Participant extends Survey {
	 Scanner sc = new Scanner(System.in );
	 
	 public String  getParticipantDetail(int i){
		String name;
		System.out.println("Enter the Name");
	 	name = sc.nextLine();
     		return name;
	 }
	 
 }
  // class main and menu;
 public class SurveyClass extends Participant {
	 /**
	  * to calculate the percentage
	  * @param ans1
	  * @return array of percentage of rating
	  */
	 public int[] OutputReportPercentage( ArrayList ans1 ){
		 Survey survey = new Survey();
		 int[]out = new int[5];
		 for(int i = 0; i < ans1.size(); i++)
		 {    
			if(ans1.get(i).equals("1")) {
				out[0]++;
			}	
			if(ans1.get(i).equals("2")) {
				out[1]++;
			}	
			if(ans1.get(i).equals("3")) {
				out[2]++;
			}			
			if(ans1.get(i).equals("4")) {
				out[3]++;
			}		
			if(ans1.get(i).equals("5")) {
				out[4]++;
			}	
		
		}
		
		int sum = out[0] + out[1] + out[2] + out[3] + out[4];
		try{
			for(int j = 0; j < 5; j++) {
				out[j] = ( out[j] * 100) / sum;
			}	
		}catch(ArithmeticException Ae)	{
			System.out.println("please Enter Some Data ");
			return out;
		}

		for(int j = 0; j < 5; j++) {
			System.out.print(j + 1 + ":");
			System.out.println( out[j] + "%");
		}
		return out;
	 }

	 // method for report printing
	 public void  OutputReport(ArrayList name, ArrayList ans1, ArrayList ans2, ArrayList ans3) { 
		 Participant p = new Participant();
		 for(int i = 0; i < name.size(); i++) { 
			 System.out.println("participant:"+(i+1));
			 System.out.println (name.get(i));
			 System.out.println("Q1:Overall Rating?");
			 System.out.println(ans1.get(i));
			 System.out.println("Q2:Area of improvement?");
			 for(int j = 0; j < 3; j++) {
				 System.out.println(((ArrayList<String>) ans2.get(i)).get(j));
			 }
			 System.out.println("Q3:Feedback?");
			 System.out.println(ans3.get(i));
		 }
	 }
	 // main method
	 public static void main(String args[]) throws IOException {
		 Scanner sc = new Scanner(System.in );
		 Participant par=new Participant();
		 Survey S = new Survey();
		 SurveyClass surveyClass = new SurveyClass();
		 ArrayList<String> name = new ArrayList<String>();
		 ArrayList<String> ans1 = new ArrayList<String>();
		 ArrayList<ArrayList<String>> ans2 = new ArrayList<ArrayList<String>>();
		 ArrayList<String> ans3 = new ArrayList<String>();
		 int i = 0;
		 int n = 0;
		 do
		 {
			System.out.println("Enter 1 for login \n 2 for participant in survey \n 3 for Output Report \n 4 for Output Data in percentage \n 5 for exit");
			n = sc.nextInt();
			if(n == 2) {
				 i++;
			}
			 switch (n) {
			 	case 1:
			 		par.getParticipantDetail(0);
			 		break;
			 	case 2:
			 		name.add(par.getParticipantDetail(i));
			 		ans1.add(S.singleSelect());
			 		ans2.add(S.multipleSelect());
			 		ans3.add(S.text());
			 		break;
			 	case 3: 
			 		surveyClass.OutputReport(name,ans1,ans2,ans3);
			 		break;
		
			 	case 4:
			 		surveyClass.OutputReportPercentage(ans1);
			 		break;
			 	case 5:
			 		System.exit(0);
			 }
		 }while(n != 5);
		 
		 sc.close();
	 }
 }
 
 
 
