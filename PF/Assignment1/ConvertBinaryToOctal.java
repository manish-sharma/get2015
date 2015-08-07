package OctalToBinary;

public class ConvertBinaryToOctal {


	
		
		int convertBinaryToOctal(int n){
			
			int newOctal=0,unitDigit=0;
			int flag=0;
			int threeDigit=0,octal=0;
			while(n!=0)
			{
				threeDigit=n%1000;
				n=n/1000;
				switch(threeDigit)
				{
						case 0 :	octal=octal*10+0;
									break;
						case 1 :	octal=octal*10+1;
									break;
						case 10:	octal=octal*10+2;
									break;
						case 11 :  	octal=octal*10+3;
									break;
						case 100:	octal=octal*10+4;
									break;
						case 101:	octal=octal*10+5;
									break;
						case 110:   octal=octal*10+6;
									break;
						case 111:	octal=octal*10+7;
									break;
						default : 	flag=1;
									break;
				}
				if(flag==1)
				{
					
					System.out.println("no is not in binary");
					return -1;
					
				}
			}
				while(octal!=0)
				{ 
					unitDigit=octal%10;
					newOctal=newOctal*10+unitDigit;
					octal/=10;
				}
			return newOctal;	
		
		}
		public static void main(String args[])
		{
			
		}
			

	}


