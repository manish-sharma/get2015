/*
 * This class  contains the candidate and corresponding alloted college
 * @author Banwari kevat
 */
public class CandidateAllotedCollege {
	 Candidate candidate;
     College college;
     
     /*
      * parameterized constructor
      * @param candidate is the reference of candidate
      * @param college is the reference of college 
      * 
      */
     public CandidateAllotedCollege(Candidate candidate,College college) 
     {
    	 this.candidate = candidate;
    	 this.college = college;
     }
     //get candidate
     public Candidate getCandidate()
     {
    	 return this.candidate;
     }
     
     //get college
     public College getCollege()
     {
    	 return this.college;
     }

}
