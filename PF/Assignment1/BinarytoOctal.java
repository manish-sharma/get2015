import java.io.*;
import java.util.*;
public class BinarytoOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int num,op;
	Scanner sc=new Scanner(System.in);
	num=Integer.parseInt(sc.nextLine());
	BinarytoOctal x=new BinarytoOctal();
	op=x.convertbinaytooctal(num);
	System.out.println(op);
	
	}
	
	int convertbinaytooctal(int num)
	{
		int decimal=0,octal=0;
		int i =0;
		while(num!=0)
		{
			decimal+=(num%10)*(int)Math.pow(2,i);
			i++;
			num/=10;
		}
	    i=1;
	    while(decimal!=0)
	    {
	    	octal+=(decimal%8)*i;
	        decimal/=10;
	    	i*=10;
	   
	    	
	    }
		return octal;
	}
	
	
}

