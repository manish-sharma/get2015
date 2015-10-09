/**
 * @author Girdhari
 * Program to implement tower of hanoi problem using recursion
 */

package towerofhanoi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Starting of Towerofhanoi class*/
public class Towerofhanoi
{
	int noOfDisk;
	List<String> diskMovementList;
	
	/*Start of main function*/
	public static void main(String[] args)throws IOException 
	{
		int noOfDisk = 0;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Number of Disks: ");
		noOfDisk = Integer.parseInt(input.readLine());
		
		Towerofhanoi towerOfHanoi = new Towerofhanoi(noOfDisk);
		
		List<String> diskMovementList = towerOfHanoi.towerOfHanoi( "A" , "B" , "C" , noOfDisk);
		
		for(int counter = 0 ; counter < diskMovementList.size() ; counter++)
			System.out.println( diskMovementList.get( counter ) );
	}
	/*End of main function*/
	
	/*Start of Constructor class: Towerofhanoi */
	
	public Towerofhanoi(int noOfdisks) 
	{
		this.noOfDisk = noOfdisks;
		diskMovementList = new ArrayList<String>();
	}
	/*End of Constructor class: Towerofhanoi */
	
	/*Start of towerOfHanoi function*/
	List<String> towerOfHanoi(String source , String destination , String intermediate , int noOfDisk)
	{
			int disks = this.noOfDisk - noOfDisk + 1;
			if(noOfDisk == 1)
			{
				String content = "Move Disk " + disks + " from " + source + " to " + destination;
				diskMovementList.add(content);
				
			}
			else
			{
				towerOfHanoi(source , intermediate , destination , noOfDisk - 1 );
				String content = "Move Disk " + disks + " from " + source + " to " + destination;
				diskMovementList.add(content);
				towerOfHanoi(intermediate , destination , source , noOfDisk - 1);
			}
			return diskMovementList;
		
	}
	/* End of towerOfHanoi function */
}
/*End of Towerofhanoi class*/
