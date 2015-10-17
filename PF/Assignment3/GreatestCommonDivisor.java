/***
 * @author Girdhari
 * Program to find Greatest Common Divisor (GCD)
 * class GreatestCommonDivisor will cover the logic to find GCD
 * Function gcd will implement the logic of Greatest Common Divisor
 * int gcd(int x, int y) where x > 0 and y > 0, to compute the greatest common divisor of x and y
 */

package gcd;

/*Starting of GreatestCommonDivisor class*/

public class GreatestCommonDivisior {

	/*Starting of main function*/
	public static void main(String args[]){
		
	}
	/*Ending of main function*/
	
	/*starting of gcd function*/
	int gcd(int num1, int num2)	{ //for the sake of naming x and y has been changed to num1 and num2
		
		if(num2 == 0)
			return num1;
		return gcd(num2, num1 % num2);
	}
	/*Ending of gcd function*/
}
/*Ending of GreatestCommonDivisor class*/
