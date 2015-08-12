/****************************************************************************************
Name            : TowerOfHanoi
Revision Log    : 2015-08-12: Babalu patidar : created.
                : 
                : 
Use             : This class is used to solve towerofhanoi problem.
                :
****************************************************************************************/

import java.util.Scanner;


public class TowerOfHanoi {
	
	//toewrofhanoi method take input source,destination,temp and numberofdisk
	//@param: Integer source:specify that disks are moving from source
	//@param: Integer destination:specify that disks are moving to destination
	//@param: Integer temp:Specify that disl are moving with the help of temp
	//@param: Integer noofdisk:specify nooftotaldisk
	public String towerofhanoi(String source,String temp,String destination,int numberofdisk)
	{
		if(numberofdisk==1)
		{
			return  "Move disk "+numberofdisk+" From "+source+" To "+destination+"\n";
		}
		else
		{
			return towerofhanoi(source,destination,temp,numberofdisk-1)+"Move disk "+numberofdisk+" From "+source+" To "+destination+"\n"+towerofhanoi(temp,source,destination,numberofdisk-1);
		}
	}
	//End of towerofhanoi method
	
	//Start of main method
	//@param : int noofdisk is total no. of disk
	public static void main(String arg[]){
		int noofdisk;
		String output;
		TowerOfHanoi object=new TowerOfHanoi();
		Scanner scan= new Scanner(System.in);
	    System.out.println("Enter no. of disk");
	    try
	    {
	    	noofdisk=scan.nextInt();
	    	output=object.towerofhanoi("A", "B", "C", noofdisk);
	    	System.out.print("\nAll disks move are as follows:\n\n"+output);
	    }
	    catch(Exception e)
	    {
	    	System.out.print("Plese enter number");
	    }
		
		scan.close();
	}
	//End of main method

}
//End of class
