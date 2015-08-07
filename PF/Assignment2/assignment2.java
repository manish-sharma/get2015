
public class assignment2 {
	      public static void main(String args[])
			   {
				assignment2 as2=new assignment2();
		        int row=5,n=5;
				String pyramid[]=as2.printPyramid(row,n);
				for(int i=0;i<5;i++)
				{
					System.out.print(pyramid[i]);
				    System.out.println();
				}
				}
				
			String spaces(int row,int n)
			{
				int k=row;
				String s="";
				for(int i=0;i<k;i++)
				s=s+" ";
				return s;
					
			}
			String numbers(int row,int n)
			{
				int k=row;
				String num="";
				for(int i=1;i<=5-k;i++)
				num=num+i;
				return num;
			}
			String[] printPyramid(int row,int n)
			{
				String combine[]=new String[5];
				for(int i=0;i<5;i++)
				{
				String space="";
			    space=spaces(i,n);
				String number="";
			    number=numbers(i, n);
			    combine[i]=space+number;
				}
				return combine;
				   
			}

		}


