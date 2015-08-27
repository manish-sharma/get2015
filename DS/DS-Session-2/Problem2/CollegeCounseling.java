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
	//Create a candidate queue
	public Queue readCandidatesListSortedByRank()
	{
		Queue candidateQueue = new Queue();
		try
		{
			FileReader fileReader = new FileReader(CANDIDATE_FILE);
			BufferedReader br = new BufferedReader(fileReader);
			String currentLine;
			while( (currentLine = br.readLine()) != null )
			{   
			    String [] tokens = currentLine.split("\\s+");
		         Candidate candidate = new Candidate(tokens[1] , tokens[0], Integer.parseInt(tokens[2]) );
		        candidateQueue.enqueue(candidate);
			}   
		}
		 catch(IOException e) 
		{
			 e.printStackTrace();
		}
		return candidateQueue;
	}
	
	
	//Create a candidate queue
		public  List<College> readCollegeList()
		{    
			 List<College> collegeList = new ArrayList<College>();
			try
			{
				FileReader fileReader = new FileReader(COLLEGE_FILE);
				BufferedReader br = new BufferedReader(fileReader);
				String currentLine;
				while( (currentLine = br.readLine()) != null )
				{   
				    String [] tokens = currentLine.split("\\s+");
			        College college = new College(tokens[0], Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]) );
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
		 * 
		 */
		private void displayCollege(List<College> collegeList) {
			Iterator<College> iterator= collegeList.iterator();
			System.out.println("Name of College     Rank    avaialable seats");
			while(iterator.hasNext())
			{
				College college = iterator.next();
				System.out.println(college.getName()+"\t\t     "+college.getRank()+"\t\t  "+
				                             college.getAvialableSeats());				
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
			while(iterator.hasNext())
			{
				if(rank == (college=iterator.next()).getRank() )
				{
					college.setAvialableSeats(college.getAvialableSeats()-1);
					break;
				}
			}				
			return college;
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
			while(!candidateQueue.isEmpty()) 
			{
				Candidate candidate = (Candidate) candidateQueue.dequeue();
				
				System.out.println("\t\tWelcome "+candidate.getName()+"\n");
				displayCollege(collegeList);
				
				System.out.print("\nChoose college and then \nEnter rank of that college: ");
				int rankOfSelectedCollege = sc.nextInt();
				College college = decreaseCollegeSeat(collegeList, rankOfSelectedCollege);
					
				CandidateAllotedCollege candidateAllotedCollege  = new CandidateAllotedCollege(candidate,college);
				candidateAllotedCollegeList.add(candidateAllotedCollege);
				System.out.println("You have alloted to "+college.getName()+ "\n\n ");
				System.out.print("Press 1 for Stop Counseling or ANY charecter for next candidate: \n");
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
	     System.out.println("\n\n\t\t1Counseling RESULT");
	     System.out.println("Candidate Name \t\t  Alloted College");
	     while(iterator.hasNext()) {
	    	CandidateAllotedCollege temp=iterator.next();
	    	 System.out.println( (temp.getCandidate().getName()) +
	    			                    "\t\t<------> \t"+temp.getCollege().getName());
	     }
	    
	}

}
