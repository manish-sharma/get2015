import java.util.*;
public class BinaryToOctal {

	public static void main(String[] args) {
		BinaryToOctal Ob1=new BinaryToOctal();
		Scanner sc=new Scanner(System.in);
		int binary;
		System.out.println("Enter a Binary Number");
		binary=sc.nextInt();
		int octal=Ob1.convertBinaryToOctal(binary);
		System.out.println("Octal Conversio is : " + octal);

	}
	
	public int convertBinaryToOctal(int n)
	{
		int count=0;
		int m;
		int decimal=0;
		m=n;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		for(int i=0;i<count;i++)
		{
			decimal=decimal+(m%10)*power(2,i);
			m=m/10;
		}
		int i=1;
		int octal=0;
		while(decimal!=0)
		{
			octal+=(decimal%8)*i;
			decimal=decimal/8;
			i*=10;
		}
		return octal;
	}
	public int power(int x, int n)
	{
		int p=1;
		for(int i=1;i<=n;i++)
		{
			p*=x;
		}
		return p;
	}

}