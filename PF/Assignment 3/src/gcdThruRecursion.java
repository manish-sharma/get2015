import java.util.Scanner;
/*This class implements logic to find the gcd of two numbers through recursion approach*/ 
public class gcdThruRecursion {
	/*function to find gcd where x and y are the numbers 
    of which gcd we need to find*/
	public int gcd(int x,int y)  
	{	
		/*if one of the number is zero then return the other number as gcd*/
	    if(y==0)                
			return x;
		/*both the numbers are non zero*/
	    else 
			return gcd(y,x%y);
		
	}
	
	/*main functions from where execution of program starts*/
    public static void main(String args[])
    {   
    	 /*variable to hold the value for result*/
	    int gcd;
	    /*variable to hold input number by user*/
	    int inputValue1; 
	    /*variable to hold input number by user*/
	    int inputValue2;         
	    gcdThruRecursion gcdObject=new gcdThruRecursion();   //object of class
	    Scanner input=new Scanner(System.in);
	    try {
	        do{
	    System.out.println("Enter the value for number 1");    
	    /*input from user*/
	    inputValue1=input.nextInt();
	    /*condition to make sure no negative input value can be entered*/
	    if(inputValue1<0)
	      {
	        System.out.println("Neagtive value not allowed!!! Please enter correct input");
	        //System.exit(0);   //force exit from program
          }
	        }while(inputValue1<0);
         do
         {
	    System.out.println("Enter the value for number 2");   
	    /*input from user*/
	    inputValue2=input.nextInt();
	    /*condition to make sure no negative input value can be entered*/
	    if(inputValue2<0)
	      {
	        System.out.println("Neagtive value not allowed!!! Please enter correct input");
	        System.exit(0);   //force exit from program
          }
         }while(inputValue2<0);
	    gcd=gcdObject.gcd(inputValue1, inputValue2); //function call
	    System.out.println("Greatest common divisor of " + inputValue1+ " & " +inputValue2 +" is " + gcd);
    }
  catch(Exception e)
	    {
	      System.out.println("Invalid input!!!! Please enter correct value");
	    }
    }
}
