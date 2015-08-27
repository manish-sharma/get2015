/**
 * Class to implement college allotment process
 * @author Sanjay
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;


public class CollegeCouncelling {
	
	
	static String candidateFileName = "D:/workspace/DS-Session2/src/candidateDetails.txt";
	static String collegeFileName = "D:/workspace/DS-Session2/src/collegeDetails.txt";
	static List<String> candidateInfo = new ArrayList<String>();
	static List<String> collegeInfo = new ArrayList<String>();
	static List<String> finalInfo = new ArrayList<String>();
	
	
	public static void main(String []args) throws IOException{
		ReadInfo ob = new ReadInfo();
		Queue object = new Queue();
	candidateInfo = ob.readInfo(candidateFileName);
	collegeInfo = ob.readInfo(collegeFileName);
	
	Iterator itr = candidateInfo.iterator(); 
	
	while(itr.hasNext())
	{
		String[] userTemp = ((String)itr.next()).split(","); //splitter
		
		object.enqueue(userTemp[0]);
		
	}
	
	Iterator itr3 = candidateInfo.iterator(); 
	
	while(itr3.hasNext())
	{
		String[] userTemp = ((String)itr3.next()).split(","); //splitter
		int flag=0;
		for(int i=0;i<collegeInfo.size();i++){
		String[] collegeTemp = new String[2];//((String)itr2.next()).split(","); //splitter
			String str = collegeInfo.get(i);
			int count=0;
			StringTokenizer stringTokenizer =  new StringTokenizer(str,",");
			while(stringTokenizer.hasMoreTokens()){
				
			collegeTemp[count]=stringTokenizer.nextToken();
			count++;
			}
			
		if(userTemp[1].equalsIgnoreCase(collegeTemp[0])){
			if(!collegeTemp[1].equals("0")){
				finalInfo.add(userTemp[0]+","+userTemp[1]+",seat allocated");
				int temp = Integer.parseInt(collegeTemp[1])- 1;
				collegeInfo.set(i,collegeTemp[0]+","+temp);
				object.dequeue();
				flag=1;
				break;
			}
			else {
				finalInfo.add(userTemp[0]+","+userTemp[1]+",seat not allocated");
				object.dequeue();
				flag=1;
				break;
			}
		}
		}
		if(flag==0)
		{
			finalInfo.add(userTemp[0]+","+userTemp[1]+",college is not available");
			object.dequeue();
			
		}
		
	}
	Iterator f = finalInfo.iterator();
	while(f.hasNext()){
		String[] Temp = ((String)f.next()).split(","); 
		System.out.println(Temp[0]+"  "+Temp[1]+"  "+Temp[2]);
	}
	}

}

