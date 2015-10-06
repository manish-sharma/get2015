/**class for allotting colleges to students in counseling process
 * 
 * @author Gaurav Saini
 * Date : 26/08/2015
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class CollegeCounseling {
		
	static String candidateFileName = "E:/CandidateDetails.txt";
	static String collegeFileName = "E:/collegeDetails.txt";
	
	static List<String> candidateInfo = new ArrayList<String>();			//list to store students information
	static List<String> collegeInfo = new ArrayList<String>();				//list to store college information
	static List<String> finalInfo = new ArrayList<String>();				//list to store final allotment information
	
	//main method
	public static void main(String []args) throws IOException {
		StudentAndCollegeInfo ob = new StudentAndCollegeInfo();
		QueueClass object = new QueueClass();
		candidateInfo = ob.readInfo(candidateFileName);
		collegeInfo = ob.readInfo(collegeFileName);
	
		Iterator itr = candidateInfo.iterator(); 
	
		while(itr.hasNext()) {
			String[] userTemp = ((String)itr.next()).split(",");			//reading file information
			object.enQueue(userTemp[0]);
		}
	
		Iterator itr2 = candidateInfo.iterator(); 
	
		while(itr2.hasNext()) {
			String[] userTemp = ((String)itr2.next()).split(",");			//array for temporarily storing allotment info
			int flag=0;
			for(int i = 0; i < collegeInfo.size(); i++){
				String[] collegeTemp = new String[2];
				String str = collegeInfo.get(i);
				int count = 0;
				StringTokenizer stringTokenizer = new StringTokenizer(str,",");
				while(stringTokenizer.hasMoreTokens()){
					collegeTemp[count] = stringTokenizer.nextToken();
					count++;
				}
			
		if(userTemp[1].equalsIgnoreCase(collegeTemp[0])){
			if(!collegeTemp[1].equals("0")){
				finalInfo.add(userTemp[0] + " is alloted seat in " + userTemp[1]);			//allotting college to student if seat is empty in the college
				int temp = Integer.parseInt(collegeTemp[1]) - 1;
				collegeInfo.set(i, collegeTemp[0] + "," + temp);
				object.deQueue();
				flag = 1;
				break;
			}
			else {
				finalInfo.add("seat not alloted to " + userTemp[0] + " in " + userTemp[1]);		//printing message if seat is not empty
				object.deQueue();
				flag = 1;
				break;
			}
		}
		}
		if(flag == 0)
		{
			finalInfo.add(userTemp[1] + " college is not available");				//printing message if college is not available
			object.deQueue();
		}
		
	}
		for (String str : finalInfo)
			System.out.println(str);
	}

}

