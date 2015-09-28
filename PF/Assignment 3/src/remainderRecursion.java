import java.util.Scanner;
/*This class is used to find the remainder between two numbers through using recursive approach*
 * @author Shishir Pareek*/
public class remainderRecursion 
{
	/*function which is used to find remainder it accepts divisor and divident as arguments*/
	public int rem(int x,int y) 
	{     
		/*number whose remainder we want to find*/ 
		int divisor;           
		/*number by which divisor will be divided to find remainder*/
		int divident;              
		/*remainder which user wants to find and output will be stored*/
	    int remainder = 0;          
		divisor=x;
		divident=y;
		/* condition for calling the function recusrively and if divisor is less than divient than the divisor is itself the remainder*/
	       if(divisor>=divident) 
		   {
	    	   /* calculating the remainder using modulus(%) operator*/
			   divisor=divisor%divident;                  
			   /*recursive call to function*/
			   remainder=rem(divisor%divident,divident);    
		   }
	       /*this conditions checks if divident is zero then takes action to avoid divide by zero exception*/
		  else if(divident==0)               
		   {
			  remainder=divisor/divident;  //value of divident is zero
		   }
		
	       /* if value of divisor is less than divident than their is no need to perform any operation as divisor itself is remainder*/
		  else 
		   {
		     remainder=divisor;      
		   }		
		  return remainder;
	}			 
	public static void main(String args[])
	{    
		 /*varibale to hold the value of user input divisor*/
		 int divisor;  
		 /*varible to hold the value of user input divident*/
		 int divident;  
		 /*variable to hold result*/
		 int remainder;  
		 remainderRecursion remainderRecursionObject=new remainderRecursion();
		 Scanner input=new Scanner(System.in);
         try                            //try block starts 
         {  
        	do{
		    System.out.println("Enter the Divisor");
		    
		    divisor=input.nextInt();//input from user
		    if(divisor<0)       //if divisor is less than zero or a negative value
		     {
			     System.out.print("Neagtive values not allowed");
			     // System.exit(0);     //forced exit
		     }
        	}while(divisor<0);
        	do{
		    System.out.println("Enter the Divident");
		    divident=input.nextInt();   
		    if (divident<0)        //if value of divident is less than zero or negative
		    {
		    	System.out.print("Negative Value not allowed");
		        //System.exit(0);
		    }
            /*input given by the user is valid and so remainder can be calculated*/
		    else
		    {
		       remainder=remainderRecursionObject.rem(divisor,divident);//function call
	           System.out.print("Remainder is "  +   remainder);
		    }
         }while(divident<0);
         }
		 catch(ArithmeticException e)    //to catch divide by zero exception
		 {
			  System.out.print("Divide by zero error!!! Please do not enter 0 in divident");
		 }
	    catch(Exception e)         //to catch all other types of exception
         {
	    	  System.out.print("Invalid Input!!!! Please enter correct input");
         }
	}
		 
}
