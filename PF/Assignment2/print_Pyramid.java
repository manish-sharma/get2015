
public class print_Pyramid 
{
	public static void main(String[] args) 
	{
		int row,n=5;
		print_Pyramid object=new print_Pyramid();
		for(row=0;row<=8;row++)
		{
			// printng each row of pattern 
			String output_array[]=object.pyramid(row,n);
			System.out.println(output_array[row]);
		}
	}
	
	String spaces(int row,int n)
	{
		   //define space string
		   String string_spaces=new String();
		   for(int index=row;index<n;index++)
		   {
			   string_spaces=string_spaces.concat(" ");
		   }
		   return string_spaces;
		
	}
	
	String numbers(int row,int n)
	{		
		// define number string   
			  String string_numbers=new String();
			    for(int index=1;index<=row;index++)
			    {
			    	string_numbers=string_numbers+index;	
			    }
				for(int index=row-1;index>=1;index--)
				{
					string_numbers=string_numbers+index;
				}
				return string_numbers;
		   
	}
	String[] pyramid(int row,int n)
	{
		//addition of spaces string and number string
	          int index1,index2=0;
	          
	          String array_spaces_number[]= new String[2*n+1];
	          for(index1=1;index1<=n;index1++)
	          {
	        	  String string_numbers=numbers(index1,n);
	        	  String string_spaces=spaces(index1,n);
	        	  array_spaces_number[index2]=string_spaces+string_numbers;
	        	  index2++;
	          }
	          
	          for(index1=n-1;index1>=1;index1--)
	          {
	        	  String string_spaces=spaces(index1,n);
	        	  String string_numbers=numbers(index1,n);
	        	  array_spaces_number[index2]=string_spaces+string_numbers;
	        	  index2++;
	          }
	          return array_spaces_number;
	}
}