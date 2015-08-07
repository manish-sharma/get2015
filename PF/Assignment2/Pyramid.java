package Pyramid;

public class Pyramid {
	

	
		public static void main(String args[])
		{
			
			Pyramid obj=new Pyramid();
			String wholePyramid[]=obj.createPattern(5);
			for(int row=0;row<wholePyramid.length;row++)
			{
				System.out.println(wholePyramid[row]);
				
			}
			
		}
		String getSpace(int row,int n)
		{
			String spaceString="";
			int p;
			if(row<n)
				p=n-row-1;
			else
				p=row-n+1;
			for(int space=0;space<p;space++)
					spaceString+=" ";
			
			return spaceString;
			
		}
		String getNo(int row,int n )
		{
			int num,p;
			String noArray="";
			if(row<n)
					p=2*row+1;
			else
					p=2*(2*n-row)-3;	
				
				num=1;
				for(int no=0;no<p;no++)
				{		
					noArray+=num;
					if(no<p/2)
						num++;
					else
						num--;
				
				}
					
			
			return noArray;
		
		}
		
		String[] createPattern(int n)
		{
			int size=2*n-1;
			String wholePyramid[]=new String[size];
			for(int row=0;row<size;row++)
			{
				String space=getSpace(row, n);
				String no=getNo(row,n);
				wholePyramid[row]=space+no;
			}
			return wholePyramid;
		}
}
		


	


