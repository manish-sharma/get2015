package assignment;

public class binaryToOctal {
	
		 
	    public int DecimalFromBinary(int binary)
	    {
	         
	        int decimal = 0;
	        int power = 0;
	        while(true){
	            if(binary == 0){
	                break;
	            } else {
	                int tmp = binary%10;
	                decimal += tmp*Math.pow(2, power);
	                binary = binary/10;
	                power++;
	            }
	        }
	        return decimal;
	    }
	    public int octalFromBinary(int decimalNumber)
	     {
		       int count=1;
		       int octalNumber=0;
		       while(decimalNumber!=0)
		           {
		    	     octalNumber+=(decimalNumber%8)*count;
		    	     decimalNumber/=8;
		    	     count*=10;
		    	     
		           }
		    return octalNumber;
	      }
	public int convertBinarytoOctal(int n)
	{
	int m=DecimalFromBinary(n);
	int s=octalFromBinary(m);
	return(s);
	}
	
	public static void main(String args[])
	{ 
		 binaryToOctal bo=new binaryToOctal();
		int a=bo.convertBinarytoOctal(110100);
		 System.out.print(a);
		 
	}
	}



