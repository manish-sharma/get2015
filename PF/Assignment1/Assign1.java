
public class Assign1 {
	public int convertBinaryToOctal(int number)
	{
		int octal=0, decimal=0, power=0;
		    while(number!=0)
		    {
		        decimal+=(number%10)*Math.pow(2,power);
		        ++power;
		        number/=10;
		    }

		/*At this point, the decimal variable contains corresponding decimal value of binary number. */

		    power=1;
		    while (decimal!=0)
		    {
		        octal+=(decimal%8)*power;
		        decimal/=8;
		        power*=10;
		    }
		    return octal;
		
	}
	public static void main(String args[])
	{
		Assign1 check=new Assign1();
		int octal=check.convertBinaryToOctal(110101);
		System.out.println(octal);
	}
}
