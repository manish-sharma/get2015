
public class Assignment1 {
	
	  public int convertBiToOct()
	  {   int rem,dec=0,j=1,binum=110101,oct=0;
		  while(binum!=0){
		         rem=binum%10;
		        dec=dec+rem*j;
		        j=j*2;
		        binum=binum/10;
		    }
		  j=1;
		   while(dec!=0)
		   {
			   rem=dec%8;
		        dec/=8;
		        oct+=rem*j;
		        j*=10;   
		   }
		  
		  return oct;
	  }
  public static void main(String[] arg)
    {
      
	  
	  Assignment1 obj=new Assignment1();
		int res=obj.convertBiToOct();
		System.out.println("convertion of octal value is:  "+res);
	  
    }
}