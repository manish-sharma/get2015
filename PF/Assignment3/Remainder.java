/**
 * @author Girdhari
 * Program to find the remainder after dividing one number by another
 * function rem is the function which will implement the logic of remainder by recursion
 * Signature of function rem is int rem(int x, int y), where x >=0 and y > 0
 * 
 * 
 */
package recursion;

/* stating of Remainder class */
public class Remainder {

	/*starting of main function*/
	public static void main(String args[])
	{
		
	}
	/* ending of main function */
	
	
	/*Starting of rem function*/
	int rem(int num1, int num2)  //for the sake of naming convention x is changed to num1 and y is changed to num2
	{
			if(num2 == 0)
				return -1;
			else{
				if(num1 < num2 )
					return num1;
				else
					return rem(num1 - num2 , num2);	//In logic value of num2 will be subtracted from num1 till num1 is greater than num2
			}
	/*Ending of rem function*/
	}
}
/* End of Remainder class */
