//To solve the puzzle of Tower of Hanoi using recursion
import java.util.Scanner;
public class Program1 
{
	String result="";
	public static void main(String args[])
	{
		int number;
		String result;
		Scanner scan = new Scanner(System.in);
		Program1 object= new Program1();
		System.out.println("Enter the number of discs");
		number= scan.nextInt();
		result=object.towerOfHanoi(number,"A","B","C");
		System.out.println("Move disk from "+result);
		scan.close();
	}
	
	
	String towerOfHanoi(int number, String start, String auxillary, String end)
	{
		if(number==0)
		{
		return " ";
		}
		if(number>0)
        {
        towerOfHanoi(number - 1, start, end, auxillary);
        }
		result=result+number+"->"+start+"->"+end;
    	towerOfHanoi(number - 1, auxillary, start, end);
		return result;
	}
}
