package pyramid;
import java.util.*;
/**
 * @author Girdhari
 * @since August 8,2015
 * Program to draw a pyramid  
 */

public class Pyramid 
{
	public static String space(int row,int rowNumber){
		String space = new String();
		for(int counter = rowNumber; counter > row ;counter--){
			space = space + " ";
		}
		return space;
}

 /*starting of numbers function*/
 public static String numbers(int row , int rowNumber){
	 String number = new String();
	 for(int counter = 1 ; counter <= row ; counter++){
		 number = number + counter;
	 }
	 for(int counter = row-1 ; counter >= 1 ; counter--){
		 number = number + counter;
	 }
	 return number;
 }
 /*ending of numbers function*/

 /*starting of finalTriangle function*/
  public static String[] finalTriangle(int rowNumber){ 
	
	int index=0;
    String [] finalprint= new String[(2 * rowNumber) - 1];// array for full triangle
    for(int counter=1 ; counter <= rowNumber ; counter++){
      finalprint[index] = "" + space(counter , rowNumber) + numbers(counter , rowNumber) ;// concatenate the space and the numbers
       index++ ;
    }

   for(int counter = (rowNumber-1) ; counter >= 1 ; counter--){// for second half of the triangle
	   finalprint[index] = "" + space(counter , rowNumber) + numbers(counter , rowNumber);// concatenate the space and the numbers
	   index++ ;
   }
   return finalprint;
}
  
 public static void main(String args[]) 
 {
 String[] finaltriangle = new String[20];
 Scanner sc = new Scanner(System.in);
 
 System.out.println("enter the size");
 int number = sc.nextInt();
 
 finaltriangle = finalTriangle(number);
 System.out.println("pyramid pattern");
 
	for(int counter = 0 ; counter < finaltriangle.length ; counter++)
	{
		System.out.println(finaltriangle[counter]);// printing of the triangle
	}
 }
}
