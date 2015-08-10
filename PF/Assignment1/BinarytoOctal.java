import java.io.*;
import java.util.*;
public class binaryToOctal {

	public static void main(String[] args) 
	    {
		// TODO Auto-generated method stub

	            int number,output;
	            Scanner sc=new Scanner(System.in);
	            System.out.println("Enter Binay Number");
	            number=Integer.parseInt(sc.nextLine());
	            binaryToOctal object=new binaryToOctal();
	            output=object.convert_binay_tooctal(number);
	            System.out.println("Octal of Given Binary Number is");
	            System.out.println(output);
	
	    }
	
		int convert_binay_tooctal(int number)
		{
			int decimal=0,octal=0,remainder1=0,remainder2=0;
			int index =0;
			while(number!=0)
			{
				// converting binary number into decimal number
				
				remainder1=number%10;
				decimal=decimal+((remainder1)*(int)Math.pow(2,index));
				index++;
				number/=10;
			}
			index=1;
			while(decimal!=0)
			{
				// converting decimal number into octal number
				
				remainder2=decimal%8;
				octal=octal+((remainder2)*index);
				decimal/=8;
				index=index*10; 
			}
			return octal;
		}	
	}

