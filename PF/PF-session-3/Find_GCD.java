/*this program is for finding 
 * gcd of 2 numbers
 */
import java.util.Scanner;


public class Find_GCD {
	public static void main(String args[])
	{
		Scanner scan;
		
		int n1,n2;
		System.out.println("Enter number 1");
		scan=new Scanner(System.in);
		n1=Integer.parseInt(scan.nextLine());
		System.out.println("Enter number 2");
		n2=Integer.parseInt(scan.nextLine());
		Find_GCD obj=new Find_GCD();
		int res=obj.gcd(n1,n2);//call gcd fn
		
		System.out.println("Output Is :"+res);
	}

	//this fn will give gcd of 2 numbers
	public int gcd(int n1, int n2) {
		// TODO Auto-generated method stub
       int res =n1;
		if(res!=n2)
        {
        	if(res>n2)
        	{
        	  res=gcd((res-n2),n2);
        	}
        	
        	else
        	{
        		res=gcd(res,(n2-res));
        	}
        }
		
      
    	
    	return res;
	}
	
}
