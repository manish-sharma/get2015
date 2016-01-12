/**
 * This class create chain  
 * @author Banwari Kevat
 *
 */
public class ChainOfApprovement {
   private Authority mentor,seniorMentor,hrManager;
   //Constructor configure the chain of approval
   public ChainOfApprovement()
   {
	  mentor = new Mentor();
	  seniorMentor = new SeniorMentor();
	  hrManager  = new HrManager();
	  mentor.setNextAuthority(seniorMentor);
	  seniorMentor.setNextAuthority(hrManager);
   }
   //this method start processing leave
   public void approve(int dayOfleave)
   {
	  mentor.process(dayOfleave);	 
   }
}
