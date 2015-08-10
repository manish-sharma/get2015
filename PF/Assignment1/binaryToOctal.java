package assignment;

public class binaryToOctal {
	// class to convert binary number into octal
		 
	    public int DecimalFromBinary(int binary)//method that converts binary into decimal
	    {
	         //initial values
	        int decimal = 0;
	        int power = 0;
	        while(true)
	        {
	            if(binary == 0)
	            {
	                break;
	            } else 
	            {
	            	// loop to convert into decimal
	                int tmp = binary%10;
	                decimal += tmp*Math.pow(2, power);
	                binary = binary/10;
	                power++;
	            }
	        }
	        return decimal;
	        //return decimal value
	    }
	    public int octalFromBinary(int decimalNumber)//method that converts  decimal into octal
	    {
	    	//initial  values
		       int count=1;
		       int octalNumber=0;
		       while(decimalNumber!=0)
		           {
		    	   //loop to convert into octal
		    	     octalNumber+=(decimalNumber%8)*count;
		    	     decimalNumber/=8;
		    	     count*=10;
		    	     
		           }
		    return octalNumber;
		    //return octal
	      }
	public int convertBinarytoOctal(int n)//main method that convert binary to octal
	{
	int decimal=DecimalFromBinary(n);//calling decimalfrombinary method
	int binary=octalFromBinary(decimal);//calling octalfrombinary method
	return(binary);//return binary value
	}
	
	public static void main(String args[])
	{ 
		 binaryToOctal bo=new binaryToOctal();//object of class
		int octalNumber=bo.convertBinarytoOctal(110111);//method calling
		 System.out.print(octalNumber);
		 //print octal number
	}
	}



