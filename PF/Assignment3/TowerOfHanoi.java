package pf_assignment_4;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
/*
 * Tower of hanoi is a simple program that used to move the discs from source to destination under certain conditions
 * It takes input as number of discs used and print the moves to move the discs from source to destination
 * **@author Ankur Gupta
 * ** @since 12-08-2015*/
public class TowerOfHanoi 
{
	static List<String> Result=new ArrayList<String>();
	 List<String> towerOfHanoi(int noOfDiscs,String source, String temp, String destination) 
	 {
		/*towerofhanoi method is used to return the moves of discs from tower to tower
		 * @noOfDics total discs to move from source to destination
		 * @temp temporary tower between source to destination
		 * @destination destination tower
		 * @return returns the total list of moves*/
		    if (noOfDiscs == 1)
		    {
		      Result.add("Disk "+ noOfDiscs+" from " + source + " to " + destination);//add moves in list if no of discs is equal to 1
		    }
		    else 
		    {
		    	Result=towerOfHanoi( noOfDiscs-1,source,destination, temp);//recursive calling function
		     Result.add("Disk " + noOfDiscs + " from " + source + " to " + destination);//add moves in list
		     Result=towerOfHanoi(noOfDiscs-1,temp, source,destination);//rercursive calling function
		    }
		    return Result;//return all moves
		 }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*main method to print all moves*/
		Scanner sc=new Scanner(System.in);//scanner class object
		TowerOfHanoi towerOfHanoi=new TowerOfHanoi();//class object
		System.out.println("Enter the number of discs:");
		int nDisks = sc.nextInt();//scan number of discs
		String source="A";
		String destination="C";
		String temp="B";
		if(nDisks>0)
		{
			Result=towerOfHanoi.towerOfHanoi(nDisks,source,temp,destination);//method calling to move disc from source to destination
			Iterator<String> itr=Result.iterator();//getting Iterator from arraylist to traverse elements  
			while(itr.hasNext())
			{  
				System.out.println(itr.next());  
			}
		}
		Result.removeAll(Result);
	}

}
