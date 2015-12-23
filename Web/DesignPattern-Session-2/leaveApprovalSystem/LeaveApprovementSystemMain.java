/**
 * This is the main system 
 * @author Banwari kevat
 */
public class LeaveApprovementSystemMain {
   public static void main(String [] arg)
   {
	   ChainOfApprovement chain = new ChainOfApprovement();
	   System.out.print("Enter number of days for leave: ");
	   int dayOfLeave  =  new java.util.Scanner(System.in).nextInt();
	   chain.approve(dayOfLeave);
   }
}
