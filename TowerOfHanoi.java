import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class TowerOfHanoi {
	static String nParity;
	static double totalDisk;
	static int movementsArrayIndex=0;
	static long sizeOfMovementsArray;
	static ArrayList<String> list=new ArrayList<String>();;
	public static void main(String args[]) 
	{
		Scanner scan;
		scan=new Scanner(System.in);
		String source1="A";
        String destination3="C";
        String auxiliary2="B";
        int n;
        System.out.println("Enter total no. of disk");
        n=Integer.parseInt(scan.nextLine());
        totalDisk=n;
        TowerOfHanoi obj=new TowerOfHanoi();
        list=new ArrayList<String>();
      
        ArrayList<String> movementsList=new ArrayList<String>();
        movementsList=obj.movementsInToh(n,source1,auxiliary2,destination3);
        		
        
        int i;
      
        System.out.println("Output Of Movents Is :");
        for(i=0;i<movementsList.size();i++)
        {
        	System.out.println(movementsList.get(i));
        }
        
	}
	public ArrayList<String> movementsInToh(int n,String source1, String auxiliary2,String destination3) {
		
		if(n==1)
		{
			list.add("Disk "+n+" from "  + source1+" to "+destination3);
			
		
		}
		
		else
		{
			
	        		list=movementsInToh(n-1,source1,destination3,auxiliary2);
	        		
	        		
	        		list.add("Disk "+n+" from "  + source1 +" to "+destination3);
	   			
	        		
	        		
	        		list= movementsInToh(n-1,auxiliary2,source1,destination3);
	        		

	        
	        }
	       
		
		return list;
	}
}
