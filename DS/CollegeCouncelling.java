import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
/**
 * this method is used for the councelling process
 * @author Ankur
 *@since 26-08-15
 */

public class CollegeCouncelling {
	
	
	static String candidateFileName = "E:/CandidateDetails.txt"; //candidate file name
	static String collegeFileName = "E:/collegeDetails.txt"; //college file name
	static List<String> candidateInfo = new ArrayList<String>();
	//ob.readInfo(candidateFileName);
	static List<String> collegeInfo = new ArrayList<String>();
	static List<String> finalInfo = new ArrayList<String>();
	
	/**
	 * main method for the councelling process
	 * @param args
	 * @throws IOException
	 */
	public static void main(String []args) throws IOException{
		ReadInfo readInfo = new ReadInfo();
		Queue object = new Queue();
		candidateInfo = readInfo.readInfo(candidateFileName);
		collegeInfo = readInfo.readInfo(collegeFileName);
	
		Iterator candidateIterator = candidateInfo.iterator(); 
		while(candidateIterator.hasNext()){
		String[] userTemp = ((String)candidateIterator.next()).split(","); //splitter
		object.enQueue(userTemp[0]);
		}
	
		Iterator candidateIterator2 = candidateInfo.iterator(); 
		while(candidateIterator2.hasNext()){
		String[] userTemp = ((String)candidateIterator2.next()).split(","); //splitter
		int flag = 0;
		for(int i = 0; i < collegeInfo.size(); i++){
			String[] collegeTemp = new String[2];//((String)itr2.next()).split(","); //splitter
			String str = collegeInfo.get(i);
			int count = 0;
			StringTokenizer stringTokenizer =  new StringTokenizer(str,",");
			
			while(stringTokenizer.hasMoreTokens()){
				collegeTemp[count] = stringTokenizer.nextToken();
				count++;
			}
			
			if(userTemp[1].equalsIgnoreCase(collegeTemp[0])){
				if(!collegeTemp[1].equals("0")){
					finalInfo.add(userTemp[0]+","+userTemp[1]+",seat allocated");
					int temp = Integer.parseInt(collegeTemp[1])- 1;
					collegeInfo.set(i,collegeTemp[0]+","+temp);
					object.deleteItem();
					flag = 1;
					break;
				}
				else {
					finalInfo.add(userTemp[0]+","+userTemp[1]+",seat not allocated");
					object.deleteItem();
					flag = 1;
					break;
				}
			}
			}
			if(flag == 0)
			{ 
				finalInfo.add(userTemp[0]+","+userTemp[1]+",college is not available");
				object.deleteItem();
				//break;
			}
			//index++;
		
		}
		Iterator finalList = finalInfo.iterator();
		System.out.println("Name\t\tcollege\t\tstatus");
		while(finalList.hasNext()){
			String[] Temp = ((String)finalList.next()).split(","); //splitter
			System.out.println(Temp[0]+"\t\t"+Temp[1]+"\t\t"+Temp[2]);
		}
	}

}

