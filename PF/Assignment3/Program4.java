import java.util.Scanner;

//Program to implement Linear Search recursively
public class Program4 
{
	public static void main(String args[]) //main class definition
	{
	int result,number,pos=0;
	int arr[]= {2,5,8,9,10,77,55};
	Program4 object = new Program4();     //Object of class program3
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the number to be searched");
	number=scan.nextInt();
	result=object.linearSearch(number,pos,arr); //Calling function linearSearch
	result=result+1;
	if(result>0)
		System.out.println("Position is "+ result);
	else
		System.out.println("Number not found");
	}

//Function that takes arguments as number to be searched, position of start of array and array
	int linearSearch(int x,int y,int arr[]) 
	{
		while(y<arr.length)	
		{
			if(x==arr[y])
			{
				System.out.println("Number Found");
				return y;        //Returning position of number found
			}
			else
			{
				y++;
				return(linearSearch(x,y,arr));  //Recursive function calling	
			}
		}
		return -1;
	}
}
