/***
 * @author Girdhari
 * program to search for an element in an array using recursion
 * class Linear search will encapsulate the logic and functions
 * function linearSearch will implement the logic
 */

package linearsearch;

/*Starting Linearsearch class*/
public class Linearsearch {

	/*starting of main function*/
	public static void main(String args[]){
		
	}
	/*ending of main function*/
	
	/*starting of search function*/
	int search(int []array, int index, int number){
		if(index == array.length)
			return -1;
		else if(array[index] == number)
			return index;
		else
			return search(array, ++index , number);
	
	}
	/*ending of search function*/
}

/*Ending of Linearsearch class*/
