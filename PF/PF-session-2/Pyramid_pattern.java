
public class Pyramid_pattern {

	
	public static String spaces(int row, int n){    //function for creating space string row wise 
	
	String space_string="";
	
	for(int i = n;i > n-row; i--){
		space_string=space_string+" ";
		
	}

	return space_string;    //return  space string
}

public static String numbers(int row,int n){  //function for creating number string row wise
	String number_string="";
	int counter=0;
	
	for(int i=0 ;i<n-row; i++){
		number_string=number_string+(++counter);
		
	}
	 
	
	 return number_string;            //return number string
}
 public String[] fullPattern(int n){    //function for printing whole pattern
     int row=0;
     
     String[] output_string =new String[n];
     
	 for(int i = 0;i < n; i++){
		 
		 output_string[i]=Pyramid_pattern.spaces(row, n)+Pyramid_pattern.numbers(row, n); //String array containing spaces and number Row-wise  
		 row++; 
	 }
	 
	 return output_string;
	 
	 
	 
 }



public static void main(String args[]){
	
	Pyramid_pattern a=new Pyramid_pattern();
	
	String[] result_string_array=a.fullPattern(5);     // Pattern for N=5 ,Value can be other also          
	
	for(int i=0; i<result_string_array.length; i++){                 
		
		System.out.println(result_string_array[i]);
		
	}
	
}

}




