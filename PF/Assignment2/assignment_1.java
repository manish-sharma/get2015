public class assignment_1 
{
public static void main(String args[])
   {
	assignment_1 as1=new assignment_1();
	int row=9,n=5;
	String pyramid[]=new String[row];
	pyramid=as1.printPyramid(row, n);
	for(int i=0;i<row;i++)
	{
		System.out.print(pyramid[i]);
	    System.out.println();
	}
	
   }
String spaces(int row,int n)
    {
	  int k=row+1;
	  String space="";
	  if(k<=4)
	  {
	  for(int i=0;i<5-k;i++)
		  space=space+" ";
	  }
	  else
	  {
		  for(int i=0;i<k-5;i++)			
		  {
			  space=space+" ";
		  }
	  }
	  return space;
	}
String numbers(int row,int n)
    {
	 int k=row;
	 int l=row;
	 String num="";
	 if(k<5)
	 {
	   for(int i=0;i<k+1;i++)
		num=num+(i+1);
	   for(int i=0;i<k;i++)
		   num=num+l--;
	 }
	 else
	 { 
		 k=2*n-k;
		 for(int i=0;i<k-1;i++)
			 num=num+(i+1);
		 for(int i=0;i<9-l-1;i++)
			 num=num+((k--)-2);
	 }
	 return num;
	}
String[] printPyramid(int row,int n)
    {
	 String pyramid[]=new String[9];
	 for(int i=0;i<9;i++)
	 {
		 String space="";
		 space=spaces(i,n);
		 String num="";
		 num=numbers(i,n);
	     
		 pyramid[i]=space+num;
	 }
	 return pyramid;
	}

}

