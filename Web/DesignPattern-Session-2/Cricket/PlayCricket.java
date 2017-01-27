/**
 * This is class for playing cricket
 * @author Banwari
 *
 */
public class PlayCricket {
	public static void main(String [] arg)
	{
			 Cricket cricket;
			 System.out.println("\t\tWELCOME TO CRICKET");
			 System.out.println("Enter choice: ");
			 System.out.println("\t1 for One Day Cricket\n\t2 for Twenty20 Cricket\n\t3 for Test Cricket");
			 int choice = new java.util.Scanner(System.in).nextInt();
			 switch(choice)
			 {
				 case 1: {
					    cricket = new OneDayCricket();
					    cricket.play();
					    break;
				   }
				 case 2: {
					    cricket = new T20Cricket();
					    cricket.play();
					    break;
				   }
				 case 3: {
					    cricket = new TestCricket();
					    cricket.play();
					    break;
				   }
				 default: {
					 System.err.println("Wrong Choice");
				 }
			  
			 }
    }
}