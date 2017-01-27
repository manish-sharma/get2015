
public class Assignment1 {
	
	 String spaces(int row, int n)
	   {
		String spc="";
		int count;
		count=n-row;
		if(count<0) count=count*(-1);
		for(int i=0;i<count;i++)
		{
			spc=spc+" ";
		}
		return spc;
		
	  }

	 String numbers(int row, int n)
	   {
		 String nums="";
			int count;
			count=2*row-1;
			if(row>n)
			  {row=2*n-row; count=2*row-1;}
		
			int k=1;
			
			for(int i=1;i<=count;i++)
			{
				
				
		     if(i<row)
				{nums=nums+k;k++;}
				
				else
				{nums=nums+k;k--; }
				
				
			}
			
	     	return nums;
	  }
	 void printPyramid(int n)
	 {
		 int row=2*n-1;int i=1;
		 while(i<=row)
		 {
			 String sp=spaces(i,n);
			 String num=numbers(i,n);
			 System.out.println(sp+num);
			 i++;
		 } 
	 }
	 
	 String[] wholePyramid(int n)
	 {   String[] res=new String[2*n-1];
		 int row=2*n-1;int i=0;
		 while(i<row)
		 {
			 String sp=spaces(i+1,n);
			 String num=numbers(i+1,n);
			 res[i]=sp+num;
			 i++;
		 } 
		 return res;
	 }
	public static void main(String arg[])
	{
		
		Assignment1 obj= new Assignment1();
		
		//String res= obj.numbers(8,5);
		//obj.printPyramid(5);
		String[] res=obj.wholePyramid(5);
		for(int i=0;i<9;i++)
		{
			System.out.println(res[i]);			
		}
		
	}

}
