
public class Assignment1 {
	
	/**
	 * @param value of x
	 * @param value of y 
	 * @return remainder of two numbers
	 */
	int rem(int x,int y){
		if(x<0)
			return x+y;

		else if(x==0)
				return 0;
			else if(y == 0)
					return 0;
			 	else
				return rem(x-y,y);

	}

	/**
	 * @param input value of x
	 * @param input value of y
	 * @return GCD of two numbers
	 */
	int gcd(int x,int y){
		if(x>0 && y>0)
			return gcd(y,x%y);
		else
			return x;

	}

	/**
	 * @param input value of x
	 * @return Largest digit in a number
	 */
	int largestDigit(int x){
		if(x<=0)
			return 0;
		int max=x%10;
		x=largestDigit(x/10);
		if(x>max)
			max=x;
		return max;
	}
}
