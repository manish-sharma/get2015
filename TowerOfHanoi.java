import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

//Tower of Hanoi using recursive method;
public class TowerOfHanoi {
	static double totalDisk;
	static ArrayList<String> list=new ArrayList<String>();;
	
	public static void main(String args[]) 
	{
		Scanner scan;
		scan=new Scanner(System.in);
		//Symbols for pegs;
		String source1="A";
        String destination3="C";
        String auxiliary2="B";
        int n;
        //no of disk from user ;
        System.out.println("Enter total no. of disk");
        n=Integer.parseInt(scan.nextLine());
        
        totalDisk=n;
        TowerOfHanoi obj=new TowerOfHanoi();
        list=new ArrayList<String>();
        ArrayList<String> movementsList=new ArrayList<String>();
        movementsList=obj.movementsInToh(n,source1,auxiliary2,destination3);
        		
        
        int i;
      // to show output
        System.out.println("Output Of Movents Is :");
        for(i=0;i<movementsList.size();i++)
        {
        	System.out.println(movementsList.get(i));
        }
        
	}
	// method for moments of disks;
	public ArrayList<String> movementsInToh(int n,String source1, String auxiliary2,String destination3) {
		
		if(n==1)//base case;
		{
			list.add("Disk "+n+" from "  + source1+" to "+destination3);
			
		
		}
		//recursive case;
		else
		{
			
	        		list=movementsInToh(n-1,source1,destination3,auxiliary2);
	        		
	        		
	        		list.add("Disk "+n+" from "  + source1 +" to "+destination3);
	   			
	        		
	        		
	        		list= movementsInToh(n-1,auxiliary2,source1,destination3);
	        		

	        
	        }
	       
		
		return list;
	}
}
