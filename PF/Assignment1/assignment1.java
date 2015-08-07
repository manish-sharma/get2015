package programing_fundamental;
import java.util.*;

public class Assignment1 {
	
	public int convertBinaryToOctal(int n)
	{
		int countDigits=0;
		int m;
		int decNumber=0;
		m=n;
		while(n!=0)
		{
			n=n/10;
			countDigits++;
		}
		for(int i=0;i<countDigits;i++)
		{
			decNumber=decNumber+(m%10)*power(2,i);
			m=m/10;
		}
		int i=1;
		int octalNumber=0;
		while(decNumber!=0)
		{
			octalNumber=octalNumber+(decNumber%8)*i;
			decNumber=decNumber/8;
			
			i=i*10;
		}
		return octalNumber;
	}
	public int power(int x, int n)
	{
		int pow=1;
		for(int i=1;i<=n;i++)
		{
			pow=pow*x;
		}
		return pow;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 a1=new Assignment1();
		Scanner sc=new Scanner(System.in);
		int binaryNumber;
		System.out.println("Enter a Binary Number");
		binaryNumber=sc.nextInt();
		int octal=a1.convertBinaryToOctal(binaryNumber);
		System.out.println(octal);

	}
	
	

}
