
public class Assignment2 {
	
	String spaces(int row, int n)
	{
		String sp="";int i;
		
		for(i=1;i<row;i++)
		   { sp=sp+" ";}
		return sp;		
	}
	
	String numbers(int row, int n)
	{
		String num="";int j=1;
		
		for(int i=row;i<=n;i++)
		   { num=num+j;j++;}
		return num;		
	}
	
	 void printTriangle()
	 { int n=5;
		int i=1;
		 while(i<=n)
		 {
			 String sp=spaces(i,n);
			 String num=numbers(i,n);
			 System.out.println(sp+num);
			 i++;
		 } 
	 }
	
	 String[] wholeTriangle(int n)
	 {
		 String[] res= new String[5];
		 
		 for(int i=0;i<n;i++)
		 {
			 String sp=spaces(i+1,n);
			 String num=numbers(i+1,n);	
			 res[i]=sp+num;
		 }
		return res; 
	 }
	 
	public static void main(String [] arg)
	{
		Assignment2 obj= new Assignment2();
		//obj.printTriangle();
		String[] res=obj.wholeTriangle(5);
		for(int i=0;i<5;i++)
		{
			System.out.println(res[i]);			
		}
	}

}
