import java.util.Scanner;
public class Assignment1 {
	

	 
	public static int BinaryToOctal(String num)
	{

	     int dec = Integer.parseInt(num,2);
	    String oct = Integer.toOctalString(dec);
	    return Integer.parseInt(oct);
	}
	  public static void main(String[] args) 
	  {    
	    String num ;
	    System.out.println("enter any binary no.");
	    Scanner sc=new Scanner(System.in);
	     num=sc.nextLine();
	   
	     
	    System.out.println("Binary " + num + " in Octal radix is "+ BinaryToOctal(num) );
	     
	  }
	}


