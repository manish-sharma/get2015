import java.util.Scanner;
import java.lang.Math;
public class BinaryToOctal 
{
	int getVal(int binNo)
	{	
		int r,R=0,decNo=0,j=1,i=0;
		while(binNo!=0)
		{
			r=binNo%10;
			decNo=decNo+r*(int)Math.pow(2,i);
			binNo=binNo/10;
			i++;
		}
		
		i=0;
		while(decNo!=0)
		{
		  	r=decNo%8;
		   	R=R+r*(int)Math.pow(10,i);
		   	decNo=decNo/8;
		   	i++;
		}
		return R;
	}
	
	public static void main(String[] args) 
	{
		int binNo,octNo;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the binary number :");
		binNo = Integer.parseInt(sc.nextLine());
		
		BinaryToOctal obj = new BinaryToOctal();
		octNo=obj.getVal(binNo);
		System.out.println("Octal no: "+octNo);
	}
}
