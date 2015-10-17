/**
 * @author Girdhari
 * program to find largest digit from a number
 * class Largestdigit will encapsulate the logic to find the number
 * largestdigit function will implement the logic to find largest number
 * int largestdigit(int x) where x >= 0,  to find out the largest digit in the number x
 */
package largestdigit;

/*Starting of Largestdigit class*/
public class Largestdigit {
	
/*Starting of main function*/
	public static void main(String args[]){
		
	}
/*Ending of main function*/

/*starting of largestdigit function*/
	int largestdigit(int num) {
		if(num == 0 )			//if num is zero then zero is the largest one
			return num;
		else					//otherwise check if by using ternary operator
			return ( num % 10) > largestdigit( num / 10 ) ? (num % 10): largestdigit( num / 10 ) ;
			//check if num % 10 is greater or returned value of largestdigit function is greater and 
			//perform actions accordingly
		 
	 }
/*ending of largestdigit function*/
}
/*Ending of Largestdigit class*/
