
public class Binary2octal
{
	public int convertBinaryToOctal(int n) 
	{
		int dest=0,i=0,temp=1,oct=0;
		while(n!=0)
		{
			temp=n%10;
			n=n/10;
			dest+=temp*Math.pow(2,i);
			i++;
			
		}
		temp=1;
		System.out.println("decimal is"+dest);
		while(dest!=0)
		{
			
		
			oct=temp*(dest%8)+oct;
			temp=temp*10;
			dest=dest/8;
			
		}
			
		
		
		return oct;
	}
	
	

}
