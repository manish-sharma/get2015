/*Program title : find the remainder when one number is divided by another number.
 * Date : 08/10/2015
 * Made by : Gaurav Saini
 * */

import java.util.Scanner;

public class Remainder {
	
	//main method
	public static void main(String[] args) {
		Remainder obj1 = new Remainder();
		Scanner sc = new Scanner(System.in);
		int num1, num2, remainder, testVar;				//num1 and num2 hold the values of the two input numbers by the user
		do {
		System.out.println("enter first number. ");
		num1 = sc.nextInt();
		System.out.println("enter second number. ");
		num2 = sc.nextInt();
		remainder = obj1.rem(num1, num2);		//remainder holds the value of the remainder
		if (remainder == -1)
			System.out.println("divisor cannot be zero. ");
		else
			System.out.println("the remainder of the above two numbers is : " + remainder);
		System.out.println("Do you want to continue? (1 yes/0 no)");
		testVar = sc.nextInt();
		} while (testVar != 0);							//testVar is used to execute the program until the user wants
		sc.close();
	}
	int rem(int x, int y){
		if (x < y)				//x and y are the two input numbers passed as arguments
			return x;
		else if (y == 0)
			return -1;
		else
			return rem(x-y, y);
	}
}
