
public class CandidateAllotedCollege {
	 Candidate candidate;
     College college;
     
     public CandidateAllotedCollege(Candidate candidate,College college) 
     {
    	 this.candidate = candidate;
    	 this.college = college;
     }
     
     public Candidate getCandidate()
     {
    	 return this.candidate;
     }
     
     public College getCollege()
     {
    	 return this.college;
     }

}
