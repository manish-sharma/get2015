/*Program title : find the Greatest Common Divisor(GCD) of two given numbers.
 *Date : 08/10/2015
 *Made by : Gaurav Saini
 **/

import java.util.Scanner;

public class Gcd {
	
	//main method
	public static void main(String[] args) {
		Gcd obj1 = new Gcd();
		Scanner sc = new Scanner(System.in);
		int num1, num2, result;			//num1 and num2 are two numbers whose GCD we want to calculate.
		System.out.println("enter first number. ");
		num1 = sc.nextInt();
		System.out.println("enter second number. ");
		num2 = sc.nextInt();
		result = obj1.findGCD(num1, num2);		//result stores the gcd of num1 and num2
		if (result == -1)
			System.out.println("enter valid numbers. ");
		else
			System.out.println("the GCD of the above two numbers is : " + result);
		sc.close();
	}
	
	//findGCD method accepts two numbers as arguments and returns their GCD
	int findGCD(int x, int y){				//x and y are the numbers whose GCD is being calculated
		if (x < 0 || y < 0)
			return -1;						//invalid input case
		else if (x == 0)
			return y;
		else if (y == 0)
			return x;
		else if (x > y)
			return findGCD(x-y, y);
		else if (x < y)
			return findGCD(x, y-x);
		else
			return x;
	}
}
