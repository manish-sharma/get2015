package Triangle;

public class Triangle {
	
	public static void main(String args[])
	{
		Triangle obj=new Triangle();
		String wholeTriangle[] =obj.getTriangle(5);
		for(int row=0;row<wholeTriangle.length;row++)
		{
				System.out.println(wholeTriangle[row]);
		}
	}
	String getSpace(int row ,int n)
	{
		String spaceString="";
		for(int space=0;space<row;space++)
		{
			
			spaceString+=" ";
		}
		return spaceString;
	}
	String getNo(int row, int n)
	{
		int p=n-row;
		String noArray="";
		for(int no=0;no<p;no++)
		{
			noArray+=no+1;
			
		}
		return noArray;
		
	}
	String[] getTriangle(int n)
	{
		String wholeTriangle[]=new String[n];
		for(int row=0;row<n;row++)
		{
			String Space=getSpace(row, n);
			String no=getNo(row, n);
			wholeTriangle[row]=Space+no;
			
		}
		
		return wholeTriangle;
	}

}
