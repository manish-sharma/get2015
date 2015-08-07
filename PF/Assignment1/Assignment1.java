import java.util.Scanner;
public class Assignment1 
{
	/**convertBinaryToOctal is function which convert a binary number to octal number.
	 * 
	 * @param n is an integer value.It is the binary no. which you have to pass while calling the function.
	 * @return This function return a integer which is the octal form of binary number.
	 */
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
		Scanner sc=new Scanner(System.in);
		try{
		System.out.println("Enter binary number");  
		int binaryNo=sc.nextInt();
		int binarycheck1=binaryNo;
		int binarychech2=0;
		if(binaryNo<0)
		{
			System.out.println("negative binary number is not allowed. kindly enter a positive value next time");
			return;
		}
		while(binarycheck1!=0)
		{
			
			binarychech2=binarycheck1%10;
			if(binarychech2>1)
			{
				System.out.println("please enter the correct number in the form of 0's and 1's next time");
				return;
			}
			binarycheck1=binarycheck1/10;
		}
		
		
		int octal=obj.convertBinaryToOctal(binaryNo);
		System.out.println(octal);
		}
		finally
		{
			sc.close();
		}
	}

}
