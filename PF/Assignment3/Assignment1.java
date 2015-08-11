/* this class contains three functions 1.to find Remainder of two numbers
                                      2.to find Greatest common divisor of two integer
                                      3.to find greatest digit in a given number
                                        
                                                                                               */
public class Assignment1 {
	
	int rem(int x, int y) {    // function for returning remainder 
	      
		if( x<0 || y<=0) return -1;     //   check for integer is whether positive or negative
		
	      
		if( x < y ) {
			
			return x;
		}
		
		else {
			return rem( x - y, y) ;
		}
		
	}
	
	
	
	
	
	int gcd(  int x, int y) {           // function for calculate  Greatest Common Divisor of two numbers
		
		if( x<0 || y<0) return -1;      //   check for integer is whether positive or negative
		
	  
		if( x < y ) {
		                                // swapping of two numbers without using another variables
			x = x + y ;
			y = x - y ;
			x = x - y ;
	    }
		
		if ( y == 0 ){                   //Base condition
			
			return x;
		}
		
		else {
			
			int temp ;
			
			temp = y  ;
			y = x % y ;
			x = temp ;
			return gcd( x , y );
		}
	}
	
	
	
	
	
	int largestdigit (int x) {                       // function for calculate greatest digit in a given number
		
		  if (x<0)  return -1;
		
		if ( x%10 != 0) {
			int unit_digit = x%10 ;
			
			return Math.max( unit_digit , largestdigit(x/10) );
		}
		
		else return x;
	}
	 
  
	
	
	public static void main(String [] jg) {
	  
	  Assignment1 obj= new Assignment1();
	    
	  System.out.println(obj.largestdigit(1191));
	  
	  System.out.println(obj.rem(0,7));
	  
	  System.out.println(obj.rem(0,7));
	  
  }
	
}





