//program to convert Binary To Octal

import java.util.Scanner;
import java.lang.Math;
public class BinaryToOctal 
{
	int convertBinaryToOctal(int binaryNum)
	{	
		int mod, octalNum=0, decimalNum=0, index=0;
		while(binaryNum!=0)          // converts binary to decimal
		{
			mod = binaryNum % 10; 
			decimalNum = decimalNum + mod*(int)Math.pow(2,index);
			binaryNum = binaryNum/10;
			index++;
		}
		
		index=0;
		while(decimalNum!=0)         // converts decimal to octal
		{
		  	mod = decimalNum%8;
		  	octalNum = octalNum + mod*(int)Math.pow(10,index);
		   	decimalNum = decimalNum/8;
		   	index++;
		}
		return octalNum;             // returns octal number
	}
	
	
	public static void main(String[] args) 
	{
		int binaryNum, octalNum;
		Scanner sc = new Scanner(System.in);
		BinaryToOctal obj = null;
		try
		{		
			System.out.println("Enter the binary number :");
			binaryNum = Integer.parseInt(sc.nextLine());			
			obj = new BinaryToOctal();
			octalNum = obj.convertBinaryToOctal(binaryNum);
			System.out.println("Octal no: "+octalNum);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(sc!=null)
				sc = null;
			if(obj!=null)
				obj = null;
		}
	}
}
