
public class Assignment1 {
	public int convertBinaryToOctal(int n)
	{
		int octal=0, decimal=0, i=0;
		    while(n!=0)
		    {
		        decimal+=(n%10)*Math.pow(2,i);
		        ++i;
		        n/=10;
		    }

		i=1;
		    while (decimal!=0)
		    {
		        octal+=(decimal%8)*i;
		        decimal/=8;
		        i*=10;
		    }
		    return octal;
		
	}
	public static void main(String args[])
	{
	
	}

}
