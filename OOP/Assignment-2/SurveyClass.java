import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 * Purpose: used to do survey
 * @author Sanjay Nainani
 * 
 */
// class for survey to take question
class Survey {
	int count;
	FileReader Fin;
	BufferedReader bufferReader;
	Scanner sc= new Scanner(System.in );

	/**
	 * to answer single select question
	 * @return answer
	 * @throws IOException
	 */
	 public String singleSelect() throws IOException{
		 count = 0;
		// to read form text file
		 Fin = new FileReader("C:/Users/Sanjay/Desktop/Survey.txt");
		 bufferReader = new BufferedReader(Fin);
		 String[] questionArray = new String[6];
		 
		 while(count!= 6) {
			 String line = bufferReader.readLine();
			 System.out.println(line);
			 questionArray[count] = line;			 
			 count++;
		 }
		 boolean flag = true;
		 String ans="";
		 while(flag) {
			 Scanner sc= new Scanner(System.in );
			 int reply=0;
			 ans = sc.nextLine() + "";
			try{
				reply = Integer.parseInt(ans);
				} catch(NumberFormatException ae) {
					 System.out.println("Enter Valid ans");
					 continue;
				}
			
				if(reply > 5 || reply<1) {
					flag = true;
					
				} else {
					flag = false;
				}
			 if(flag) {
				 System.out.println("Enter Valid ans");
				 continue;
			}
		 }
		
		 return ans;
	 }
	 
	 
	 /**
	  * to answer multi select question
	  * @return answer
	  * @throws IOException
	  */
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
		boolean flag = true;
		int reply=0;
		int count=0;
		while(flag) {
			if(count!=0) {
				ans.removeAll(ans);
			}
			for(int count2 = 0; count2 < 3; count2++) {
				reply = 0;
				String a;
				try{
					if(!(a = (sc.nextLine()) + "").equals("")) {
						reply = Integer.parseInt(a);
						if(reply<1 || reply>3 ) {				// to check validation
							if(reply == 13) {
								flag = false;
							} else {
								flag = true;
								System.out.println("Enter Valid ans.Reset");
								break;
							}
						} else {
							flag = false;
						}						
					}
				} catch(NumberFormatException e) {
					System.out.println("please enter 1/2/3 :");
					flag = true;
					break;
				}
				ans.add(reply + "");
				count++;
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
			if(flag) {
				continue;
			}
			int j = 0;
			for( int i = 0; i < ans.size(); i++) {
				if((ans.get(i).equals(""))) {
					j++;
				}
			}
			if( j == 3) {					
				System.out.println("You should enter at least one Option.Reset");
			}
			
		}
			 
		return ans1;
	}
	
	
	/** Method to do feedback 
	 * @return answer = feedback text
	 * @throws IOException
	 */
	public String text() throws IOException{
		count =10;
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
  * for participant information
  * @author Sanjay Nainani
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

 /**
  * to calculate the percentage
  * @param list of single select inputs
  * @return array of percentage of rating
  */
 public class SurveyClass extends Participant {
	
	 public int[] OutputReportPercentage( ArrayList<String> ans1 ){
		 int[] out = new int[5];
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

	 /**
	  * Method to print report
	  * @param name = name of participant
	  * @param ans1 = answer of single select question
	  * @param ans2 = answer of multi select question
	  * @param ans3 = answer of feedback question
	  */
	 public void  OutputReport(ArrayList<String> name, ArrayList<String> ans1, ArrayList<ArrayList<String>> ans2, ArrayList<String> ans3) { 
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
			System.out.println("Enter 1 for participant in survey \n 2 for Output Report \n 3 for Output Data in percentage \n 4 for exit");
			n = sc.nextInt();
			if(n == 2) {
				 i++;
			}
			 switch (n) {
			 	
			 	case 1:
			 		name.add(par.getParticipantDetail(i));
			 		ans1.add(S.singleSelect());
			 		ans2.add(S.multipleSelect());
			 		ans3.add(S.text());
			 		break;
			 	case 2: 
			 		surveyClass.OutputReport(name,ans1,ans2,ans3);
			 		break;
		
			 	case 3:
			 		surveyClass.OutputReportPercentage(ans1);
			 		break;
			 	case 4:
			 		System.exit(0);
			 }
		 }while(n != 4);
		 
		 sc.close();
	 }
 }