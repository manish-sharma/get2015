
public class BinaryToOctal {
	
	public int convertBinaryToOctal(int n)
	{
		
		int a,b=0,c=0,i=0;
		while(n>0)
		{
			a=n%10;
			double d=a*Math.pow(2, i);
			i++;
			n=n/10;
			c+=d;
		}
		while(c>0)
		{
			a=c%8;
			c=c/8;
			b=b*10+a;
		}
		while(b>0)
		{
			a=b%10;
			b=b/10;
			c=c*10+a;
		}
		
		
		System.out.print(c);
		return c;
		
		
		
	}
	


}
