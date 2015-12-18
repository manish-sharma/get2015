import java.util.*;
public class Binary2Octal
{
	static int binary_octal(String bin)  
	{
		int dec=Integer.parseInt(bin,2);
		String octal=Integer.toOctalString(dec);
	    return Integer.parseInt(octal);
	}

	public static void main(String[] args)
    {
		String bin="11011";
	
		int octal=binary_octal(bin);
		
		System.out.print(octal);
		

	}

}
