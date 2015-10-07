import java.util.Scanner;


public class pyramid_pattern_1 {
	static int t;
	static int count_space_col,count_number_col;
	
	 
	public static void main(String args[])
	{
		
		       int t;//t total no. of rows
			 Scanner scan;
			 int row;
			System.out.println("Enter total no. of rows in pyramid");
			
			scan = new Scanner(System.in);
			t = Integer.parseInt(scan.nextLine());
			pyramid_pattern_1 obj=new pyramid_pattern_1();
			
			
			
				obj.pyramid(t);// call whole pyramid fn
			
	}

	

	public String[] pyramid(int n) {
		// TODO Auto-generated method stub
		
		      //n total no. of rows
		  int i,row;
		 String[] space_string_array, numbers_string_array;
		 
		     space_string_array=new String[100];
	        numbers_string_array=new String[100];
			
		pyramid_pattern_1 obj=new pyramid_pattern_1();
		int e;//total no. of distinct elements
		 Scanner scan;
		 
		System.out.println("Enter total no. of distinct elements in pyramid");
		
		scan = new Scanner(System.in);
		e = Integer.parseInt(scan.nextLine());
		for(row=1;row<=(n/2)+1;row++)
		{
			
			space_string_array[row]=obj.space(row,e);//to find space string array
			
			numbers_string_array[row]=obj.numbers(row,n);//to find no. string array
		} 
		
		String pyramid_arr[]=new String[200];
		System.out.println("Pyramid Is :");
		//to print whole pyramid
		for(row=1;row<=(n/2)+1;row++)
		{
			 i=row;
			
			//System.out.println("Pyramid Is :");
			System.out.println(space_string_array[row] + numbers_string_array[row]);
			pyramid_arr[i]=space_string_array[row]+numbers_string_array[row];
			
		}
		int row1=row;
		i=row;
		for(row=row1-2;row>=1;row--)
		{
			
			System.out.println(space_string_array[row]  + numbers_string_array[row]);//it will print whole pyramid
			
			pyramid_arr[i]=space_string_array[row]  + numbers_string_array[row];
			i++;
		}
		return pyramid_arr;
	}

	public String numbers(int row, int e) {
		// TODO Auto-generated method stub
		int i,j;
	  //e total no. of distinct elements
		//row is sequence no. of row
		
		String s2=new String();
		s2="";
		i=1;
		while(i<=row)
		{ 
			String p;
			p=Integer.toString(i);
			
			s2=s2+ p;//number string of i th row
			i++;
			
		}
		
		for(j=i-2;j>0;j--)
		{
			
			
			String p;
			p=Integer.toString(j);
			s2=s2+ p;//number string of i th row
			
			i++;
		}
		
		return s2;
	}

	public String space(int row, int n) {
		// TODO Auto-generated method stub
		   //n is total no. of rows
		//row is sequence no. of row
		String s1=new String();
		s1="";
		int i;
		
		for(i=1;i<=(n-row);i++)
		{    
			s1=s1 +" ";//space string of i th row
		}
		return s1;
	}

}
