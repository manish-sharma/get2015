
public class Assignment1 
{
	public int convertBinaryToOctal(int n)
	{
		int octal=0, decimal=0, count=0;
		    while(n!=0)
		    {
		        decimal+=(n%10)*Math.pow(2,count);
		        ++count;
		        n/=10;
		    }

		/*At this point, the decimal variable contains corresponding decimal value of binary number. */

		    count=1;
		    while (decimal!=0)
		    {
		        octal+=(decimal%8)*count;
		        decimal/=8;
		        count*=10;
		    }
		    return octal;
		
	}
	
	public static void main(String args[])
	{
		Assignment1 obj=new Assignment1();
		int octal=obj.convertBinaryToOctal(110101);
		System.out.println(octal);
	}

}
