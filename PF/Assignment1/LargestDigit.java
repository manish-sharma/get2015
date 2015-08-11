/*Program title : find the largest digit in the given number.
 *Date : 08/10/2015
 *Made by : Gaurav Saini
 **/

import java.util.Scanner;

public class LargestDigit {
	
	int max = 0;					//max holds the value of the largest digit in  the number.
	
	//main method
	public static void main(String[] args) {
		LargestDigit obj1 = new LargestDigit();
		Scanner sc = new Scanner(System.in);
		int num, result;							//num holds the input value by the user
		System.out.println("enter a number. ");
		num = sc.nextInt();
		result = obj1.largestDigit(num);			//result holds the largest digit of num returned from largestDigit method
		System.out.println("the larget digit in the entered number is : " + result);
		sc.close();
	}
	
	//method for finding the largest digit in the input value
	int largestDigit(int x){
		if (x == 0)									//x holds the input number after each recursion
			return max;
		else if (x > 0 && x % 10 > max){
			max = x % 10;
			x /= 10;
			return largestDigit(x);
		}
		else if (x > 0 && x % 10 < max){
			x /= 10;
			return largestDigit(x);
		}
		else if (x < 0)
			return -1;
		return max;
	}
}
