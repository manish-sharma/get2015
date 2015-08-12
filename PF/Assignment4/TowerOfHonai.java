import java.util.*;

/**
 * @author Sumitra
 * This program is create tower of honai using recursion approach.
 *
 */
public class TowerOfHonai {
	static List<String> result;
	int size;
public static void main(String arg[])
{
	Scanner scan=new Scanner(System.in);
	result=new ArrayList<String>();
	TowerOfHonai tower=new TowerOfHonai();
	System.out.println("enter the number of disc");
	tower.size=scan.nextInt();
	//Enter the Number of disc you want in the problem.
	 result=tower.honai("A","B","C",1);
	 /**
	  * A if Source
	  * B is Destination
	  * C is Temprary tower
	  */
	Iterator<String> itr=result.iterator();
	//used to print List of string.
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	scan.close();
}
/**
 * 
 * @param source from where we have to shift disc
 * @param Destination where we have to store them
 * @param temp used for temprary storage
 * @param n starting from 1 pointing to first disc
 * @return will return the list of all the moves.
 */
List<String> honai(String source,String Destination, String temp,int n)
{
	if(n==size)
		//if n is equal to number of disc than move that disc to destination
	{
		result.add("Move Disk "+n+" from "+source+" to "+Destination);
	}
	else
		//else move to temprary
	{
		honai(source,temp,Destination,n+1);
		result.add("Move Disk "+n+" from "+source+" to "+Destination);
		honai(temp,Destination,source,n+1);
	}
	return result;
}
}
