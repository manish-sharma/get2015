import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*This class implements the tower of hanoi problem using recursion
 * @author Shishir Pareek
 * Date 11th August 2015*/
public class towerOfHanoiRecursion {
/* This function implemets the tower of hanoi problem for n discs through recursion.It takes number 
 * of discs,peg A,B,C as argument*/
  public List<String> towerOfHanoi(String source,String temp,String destination,int numOfDisk)
  {
	  /*List of type String to hold the values of movements done*/
	  List<String> movementsOfDiscs=new ArrayList<String>();
	  /*all the discs have moved to the destination peg*/
	  if(numOfDisk==0)
		 return movementsOfDiscs; 
	  /*recursive call to function*/
	  movementsOfDiscs.addAll(towerOfHanoi(source,destination,temp,numOfDisk-1));
	  /*add the movement of disc as string in the List object*/
	  movementsOfDiscs.add("Move Disk " +  numOfDisk + " from " + source + " to " + destination);
	  /*recursive call to function*/
	  movementsOfDiscs.addAll(towerOfHanoi(temp,source,destination,numOfDisk-1));
	  return movementsOfDiscs;
  }
  /*main function starts here*/
  public static void main(String args[])
  {   
	  /*variable to hold user input value*/
	  int numberOfDisk=1;
	  /*source peg*/
	  String source="A";
	  /*destination peg*/
	  String destination="C";
	  /*destination auxillary peg*/
      String temp="B";
      /*input from user*/
      Scanner input=new Scanner(System.in);
      /*try block start*/
      try 
      {
         do 
         {
        	  System.out.println("Enter the number of discs");
        	  numberOfDisk=input.nextInt();
        	  /*condition to check that the value so entered is positive*/
        	  if(numberOfDisk<0)
        	  System.out.println("Negative Values not allowed!!! Please Enter positive value");
         }while(numberOfDisk<0);
      }
      catch(Exception e)
      {
    	  System.out.println("Invalid Value!!! System exits");
      }
      /*object to hold the value of returned string list*/
      List<String> outputList=new ArrayList<String>();
	  towerOfHanoiRecursion object=new towerOfHanoiRecursion();
	  /*function call*/
	  outputList=object.towerOfHanoi(source, temp, destination, numberOfDisk);
	  for(int index=0; index < outputList.size(); index++)
	  {
		  System.out.println(outputList.get(index));
	  }
  }
}