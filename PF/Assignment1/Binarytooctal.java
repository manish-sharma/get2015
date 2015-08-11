/***********************************************************
* @author Girdhari
* -> Module to convert binary number into octal number     *
* -> convertBinaryToOctal function will convert the binary *
*    number into octal									   *
***********************************************************/

import java.util.Scanner;
class Binarytooctal{
	
	/*Beginning of main function*/
	public static void main(String args[])
	{
		int binary, octal=0;

		System.out.print("Enter any binary number (Should contain 0 or 1): ");
		Scanner scanning = new Scanner(System.in);
		binary = scanning.nextInt();

		Binarytooctal objNumberSystem = new Binarytooctal();

		octal = objNumberSystem.convertBinaryToOctal(binary);
		System.out.println("The octal number is "+octal);
	}
	/*Ending of main function*/
	
	/* Beginning of convertBinaryToOctal function */
	public int convertBinaryToOctal(int n) //function to convert binary number into octal number
	{ 
		int flag=0,digit,octal=0;

		while(n != 0)
		{
			digit = n % 1000; //obtains the number in the group of three
			n /= 1000;

			switch(digit)
			{
				case 00:
					octal = octal * 10 + 0;
					break;
				case 01: 
					octal = octal * 10 + 1;	
					break;
				case 10: 
					octal = octal * 10 + 2;	
					break;
				case 11: 
					octal = octal * 10 + 3;	
					break;
				case 100: 
					octal = octal * 10 + 4;	
					break;
				case 101: 
					octal = octal * 10 + 5;	
					break;
				case 110: 
					octal = octal * 10 + 6;	
					break;
				case 111: 
					octal = octal * 10 + 7;	
					break;
				default:
					flag++;
			}
			if(flag != 0)
			{
				System.out.println("The received number is not in binary");
				break;
			}
		}
		digit = octal;
		octal=0;
		/*Loop to reverse the output e.g. 64 -> 46*/
		while(digit!=0)
		{
			octal = octal * 10 + (digit % 10);
			digit /= 10;
		}	
		return octal;
	}
	/*Ending of convertBinaryToOctal function*/
}

	
