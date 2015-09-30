import java.util.Scanner;

public class Assignment1
   {
      public static String hanoi(int nDisks, String fromPole,String midPole, String toPole) //Function implementing Tower of hanoi problem using Recursion
      {
   	
   	 String Sol1, Sol2, Move,Solution;   // Contains moves
    
   	 if ( nDisks == 1 )                      // Base Condition
	 {
   	    return fromPole + "->" + toPole + "\n";
	 }
   	 else         
   	  {                                             //Recursive logic for Tower of hanoi problem
   	    
   	    Sol1 = hanoi(nDisks-1, fromPole, midPole,toPole);     
                                                         
   	    Move = fromPole + "->" + toPole + "\n";    
                                                         
   	    Sol2 = hanoi(nDisks-1, midPole, toPole,fromPole);      

   	    Solution = Sol1 + Move + Sol2;     
    
   	    return Solution;                      //Variable solution contain the moves of Tower of hanoi problem
   	  }
   }



      public static void main (String[] args)
      {
   	 int noDisk;//fromPole,toPole;
   	 
   	 Scanner sc=new Scanner(System.in);
   	 
   	 System.out.print("Enter number Of disk: ");     //User input
   	 noDisk=sc.nextInt();
   	 
   	 if(noDisk>20)                              //Exception or heap storage problem handled
   	 {
   		System.out.print("Exception:Memmory Space Problem.....\nYou can move maximaum 20 disk at a time......");
   		sc.close(); 
   		return;
   	 }
   	 
   	// System.out.print("Enter Pole number from you want to Move: ");
   	// fromPole=sc.nextInt();
  	/// 
  	// System.out.print("Enter Pole number at you want to Move: ");
  	// toPole=sc.nextInt();
    
   	 String MovesTaken;
    
   	 MovesTaken = hanoi(noDisk,"A","B","C");
    
   	 System.out.println(MovesTaken);        //output printing
   	 
   	sc.close(); 
   	 
      }

   }
