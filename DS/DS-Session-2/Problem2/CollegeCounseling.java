import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * This class perform the counseling  of colleges
 */
public class CollegeCounseling  {
	
	Scanner sc = new Scanner(System.in);
	
	final String CANDIDATE_FILE="C://Users/Banwari/workspace/DS-Session-2/src/Candidates.txt";
	final String COLLEGE_FILE="C://Users/Banwari/workspace/DS-Session-2/src/Colleges.txt";
	//This method create a candidate queue and return queue
	public Queue readCandidatesListSortedByRank()
	{
		Queue candidateQueue = new Queue();
		try
		{   //Reading of candidates file
			FileReader fileReader = new FileReader(CANDIDATE_FILE);
			BufferedReader br = new BufferedReader(fileReader);
			//This line contains information of students 
			String currentLine;
			while( (currentLine = br.readLine()) != null )
			{   //splits the line and get tokens of information
			    String [] tokens = currentLine.split("\\s+");
			    //Create candidate
		        Candidate candidate = new Candidate(tokens[1] , tokens[0], Integer.parseInt(tokens[2]) );
		        //Put in queue
		        candidateQueue.enqueue(candidate);
			}   
		}
		 catch(IOException e) 
		{
			 e.printStackTrace();
		}
		return candidateQueue;
	}
	
	
	    //This method Create a college list and return reference of list
		public  List<College> readCollegeList()
		{    
			 List<College> collegeList = new ArrayList<College>();
			try
			{   //Reading of colleges file
				FileReader fileReader = new FileReader(COLLEGE_FILE);
				BufferedReader br = new BufferedReader(fileReader);
				//This line contains information about college
				String currentLine;
				while( (currentLine = br.readLine()) != null )
				{   //splits the line and get tokens of information
				    String [] tokens = currentLine.split("\\s+");
				    //Create college object
			        College college = new College(tokens[0], Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]) );
			        //Add object of college to list
			        collegeList.add(college);
				}   
			}
			 catch(IOException e) 
			{
				 e.printStackTrace();
			}
			return collegeList;
		}
		
		/*
		 * This method Display the colleges and corresponding details
		 * @param collegeList is the list of college
		 */
		private void displayCollege(List<College> collegeList) {
			Iterator<College> iterator= collegeList.iterator();
			System.out.println("Name of College     Rank    avaialable seats");
			while(iterator.hasNext())
			{
				College college = iterator.next();
				System.out.println(college.getName()+"\t\t     "+college.getRank()+"\t\t  "
				                   +college.getAvialableSeats());				
			}
		}
		
		/*
		 * This method will Decrease the seat of a college of given rank
		 * @param list of college
		 * @param rank is the rank of college whose seat will have to decrease by 1
		 */
		private College decreaseCollegeSeat(List<College> collegeList, int rank)
		{
			Iterator<College> iterator = collegeList.iterator();
			College college=null;
			boolean collegeFound = false;
			while(iterator.hasNext())
			{  //Search college of given rank
				if(rank == (college=iterator.next()).getRank() )
				{   //if college found then decrease seat by one and then return college reference 
					if(college.getAvialableSeats()>0)
					{		
					    college.setAvialableSeats(college.getAvialableSeats()-1);
					    collegeFound = true;
					}
					break;
				}
			}	
			//if college available of this rank then college otherwise return null 
			if(collegeFound)
			{ return college;  }
			else 
			{	return null;   }
		}
		
		/*
		 * This method do counseling
		 * @param candidateQueue is the queue of candidates arranged by rank
		 * @param collegeList is the list of colleges participated in counseling process
		 */
		public  List<CandidateAllotedCollege> doCounseling(Queue candidateQueue , List<College> collegeList ) 
		{   
			List<CandidateAllotedCollege> candidateAllotedCollegeList = new ArrayList<CandidateAllotedCollege>();
			System.out.print("\tWELCOME TO COLLEGE COUNSELING\n\n");
			//Call Candidate until queue is empty
			while(!candidateQueue.isEmpty()) 
			{   //Remove candidate from queue
				Candidate candidate = (Candidate) candidateQueue.dequeue();
				
				System.out.println("\t\tWelcome "+candidate.getName()+"\n");
				//Display Colleges list and availability of seats
				displayCollege(collegeList);
				//choose college according list
				System.out.print("\nChoose college very carefully because you have only one chance and then \nEnter rank of that college: ");
				int rankOfSelectedCollege = sc.nextInt();
				College college = decreaseCollegeSeat(collegeList, rankOfSelectedCollege);
				//if college available
				if(college != null)
				{	//Create allotment 
				    CandidateAllotedCollege candidateAllotedCollege  = new CandidateAllotedCollege(candidate,college);
				    //add allotment to  list
				    candidateAllotedCollegeList.add(candidateAllotedCollege);
				    System.out.println("You have alloted to "+college.getName()+ "\n\n ");
				}
				else 
				{
					 System.out.println("College or Seats is not available according  your choice\n");
				}
				System.out.print("Press 1 for Stop Counseling or\nANY charecter for next candidate: \n");
				String choice;
				if(  (choice=sc.next()).equals("1"))
				{
					break;
				}
				
			}
				return candidateAllotedCollegeList;
			
		}	
	
	public static void main(String [] arg) 
	{
	     CollegeCounseling collegeCounseling = new	CollegeCounseling();
	     Queue candidateQueue =collegeCounseling.readCandidatesListSortedByRank();
	     List<College> collegeList = collegeCounseling.readCollegeList();
	     List<CandidateAllotedCollege> candidateAllotedCollegeList= collegeCounseling.doCounseling(candidateQueue, collegeList);
	     
	     Iterator<CandidateAllotedCollege> iterator = candidateAllotedCollegeList.iterator();
	     System.out.println("\n\n\n\n\n\n\t\tCounseling RESULT");
	     System.out.println("Candidate Name \t\t  Alloted College");
	     while(iterator.hasNext()) {
	    	CandidateAllotedCollege temp=iterator.next();
	    	 System.out.println( (temp.getCandidate().getName()) +
	    			                    "\t\t<------> \t"+temp.getCollege().getName());
	     }
	    
	}

}
