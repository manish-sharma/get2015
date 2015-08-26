/*This program is the solution of
 * Tower Of Hanoi problem
 * in which we have to find all movements that should be done 
 * for placing all disks from source to destination
 */
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class TowerOfHanoi {
	
	static double totalDisk;
	
	
	static ArrayList<String> list;
	public static void main(String args[]) 
	{
		Scanner scan;
		scan=new Scanner(System.in);
		String source1="source1";
        String destination3="destination3";
        String auxiliary2="auxiliary2";
        int n;
        System.out.println("Enter total no. of disk");
        n=Integer.parseInt(scan.nextLine());
       
        TowerOfHanoi obj=new TowerOfHanoi();
        list=new ArrayList<String>();
      
        ArrayList<String> movementsList=new ArrayList<String>();
        movementsList=obj.movementsInToh(n,source1,auxiliary2,destination3);//call movementsInToh() fn
        		
        /*Output of all movements will be print by
         * the following loop  
         */
        int i;
      
        System.out.println("Output Of Movents Is :");
        for(i=0;i<movementsList.size();i++)
        {
        	System.out.println(movementsList.get(i));
        }
        
	}
	
	/*this fn will return all movements that should be 
	 * done to place all disks from source to destination
	 */
	public ArrayList<String> movementsInToh(int n,String source1, String auxiliary2,
			String destination3) {
		if(list==null)
		{
			  list=new ArrayList<String>();
		}
		if(n==1)
		{
			list.add(source1+"->"+destination3);
			
		
		}
		
		else
		{
			
	        		list=movementsInToh(n-1,source1,destination3,auxiliary2);
	        		
	        		
	        		list.add(source1+"->"+destination3);
	   			
	        		
	        		
	        		list= movementsInToh(n-1,auxiliary2,source1,destination3);
	        		

	        
	        }
	       
		
		return list;
	}
}

