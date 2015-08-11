import java.util.Scanner;
/*This class implements the logic to find the largest digit out of the give number
 * It uses recusrsion approach to acieve the task so as to improve time and space complexity
 * @author Shishir Pareek*/
public class findLargestNumberThruRecursion {
	/*global variable */
	int largestNumber;
	/*function which implements logic to find largest digit out the given number 
	 * which uses recursive approach where number is supplied as argument*/
	public int largestDigit(int x)
	{
		/*variable to hold the maximum digit out of given number temporary*/
		int maxDigit;
			maxDigit=x%10;
			x=x/10;
			/*this condition will execute till the number does not equal to zero and through which we are everytime
			 * calculating the new largest digit to compare with previous maxDigit value*/
			if(x!=0)
			{
				largestNumber=largestDigit(x); //recursive function call
			}
			/*if value of maximum digit is larger then largest digit than update the largest number*/
		    if(maxDigit>largestNumber) 
		    {
		    	largestNumber=maxDigit;
		    }
		  
		return largestNumber;
	}
    public static void main(String args[])
    {   
    	/*variable to hold output*/
    	int largest_Digit;
    	/*input from user*/
    	int number;
    	/*Initializing class object*/
        findLargestNumberThruRecursion largestNumberObject=new findLargestNumberThruRecursion();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number");
        number=input.nextInt(); //input from user
        /*this condition checks that the negative value is  not allowed*/
        if(number<0)
        {
        	System.out.print("Only Positive values allowed");
        	System.exit(0);
        }
        /*value is positive*/
        else
        {
        largest_Digit=largestNumberObject.largestDigit(number); //function call
        System.out.print(largest_Digit);
        }
    }
}
