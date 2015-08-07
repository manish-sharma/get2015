
public class BinaryToOctal {

	
	
public static int binaryToOctal(int n)
{
	int lastDigit,counter=-1;
	int octal=0,sumSlot=0;
	while(n!=0)
	{
		int innerCounter=0;
		while(n!=0 && innerCounter<3)
		{
			 lastDigit=n%10;
			sumSlot=sumSlot+(int)Math.pow(2, innerCounter)*lastDigit;
			n=n/10;
			innerCounter++;
					
		}
		
		counter++;
	octal=octal+sumSlot*(int)Math.pow(10, counter);
		
		sumSlot=0;

		
	}
	
	return octal;	

}
	
public static void main(String args[])
{
	
BinaryToOctal binarytooctal=new BinaryToOctal();

int octal=binarytooctal.binaryToOctal(11111);
System.out.println(""+octal);

}


}
