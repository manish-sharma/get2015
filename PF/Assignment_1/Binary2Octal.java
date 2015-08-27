import java.io.*;
import java.util.Scanner;

public class Binary2Octal {

	public int inputBinaryNumber()
	{     
		 int input_binaryNumber;
		 Scanner inputObject;
		 inputObject=new Scanner(System.in);
		 input_binaryNumber=Integer.parseInt(inputObject.nextLine());
		 return input_binaryNumber;
	}

public int binary2Decimal(int binaryNumber)
   {
	 int decimalNumber=0;
	 int count=0;
	     while(binaryNumber!=0)
	         {
		       decimalNumber+=(binaryNumber%10)*Math.pow(2, count);
		       count++;
		       binaryNumber/=10;
	         }
	  
	 return decimalNumber; 
  }
	
 public int decimal2Octal(int decimalNumber)
     {
	       int count=1;
	       int octalNumber=0;
	       while(decimalNumber!=0)
	           {
	    	     octalNumber+=(decimalNumber%8)*count;
	    	     decimalNumber/=8;
	    	     count*=10;
	    	     
	           }
	    return octalNumber;
      }

  public int binary2Octal(int user_binaryNumber)
  {
	   
	   int converted_decimalNumber=binary2Decimal(user_binaryNumber);
	   int result_octalNumber=decimal2Octal(converted_decimalNumber);
	   return result_octalNumber;
  }
public static void main(String args[])
      {
	     Binary2Octal binary_to_octal=new Binary2Octal();
	     int result=binary_to_octal.binary2Octal(110101);
	     System.out.print(result);
      }

}


