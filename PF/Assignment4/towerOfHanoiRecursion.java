// program to create tower of hanoi

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class towerOfHanoiRecursion 
{	
	public static void main(String[] args) 
	{
		int numOfDisk = 0;
		towerOfHanoiRecursion objTowerOfHanoi = new towerOfHanoiRecursion();
		List<String> stringArray ;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("enter the numOfDisk of disc");
			numOfDisk=sc.nextInt();
			String source="A",destination="B",temp="C";
			stringArray =  objTowerOfHanoi.towerOfHanoi(source,destination,temp,numOfDisk) ;
			System.out.println("Implementation of Tower of Hanoi for "+numOfDisk+" disc");
			for(String str : stringArray)   // for each loop for printing all moves which are stored in list
			{
				System.out.println(str);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(sc!=null)
				sc = null;
			if(objTowerOfHanoi!=null)
				objTowerOfHanoi = null;
		}
	}
	
	
	// generates moves for given number of discs
	List<String> towerOfHanoi(String source, String destination, String temp, int numOfDisk)
	{	
		List<String> strArray = new ArrayList<String>();
		if(numOfDisk==1)    // base case
		{
			strArray.add("Move "+numOfDisk+" disc "+source+" -> "+destination);
		}
		else if(numOfDisk>1)
		{
			strArray.addAll(towerOfHanoi(source,temp,destination,numOfDisk-1)); // decrease num of discs & calls func again 
			strArray.add("Move "+numOfDisk+" disc "+source+" -> "+destination);
			strArray.addAll(towerOfHanoi(temp,destination,source,numOfDisk-1)); 
		}
		return strArray;	
	}

}
