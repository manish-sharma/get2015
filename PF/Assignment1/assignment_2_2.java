package programing_fundamental;

public class assignment_2_2 {

		public static void main(String args[])
		   {
			assignment_2_2 as2=new assignment_2_2();
	        int row=0,n=5;
			String pyramid[]=as2.pyramid(row,n);
			for(int i=0;i<5;i++)
			{
				System.out.print(pyramid[i]);
			    System.out.println();
			}
			}
			
		String spaces(int row,int n)
		{
			String s="";
			for(int i=0;i<5-n;i++)
			s=s+" ";
			return s;
				
		}
		String numbers(int row,int n)
		{
			String num="";
			for(int i=n;i>0;i--)
			num=num+i;
			return num;
		}
		String[] pyramid(int row,int n)
		{
			String combine[]=new String[5];
			for(int i=0;i<5;i++)
			{
			String space="";
		    space=spaces(row,n);
			String number="";
		    number=numbers(row, n);
		    row++;n--;
		    combine[i]=space+number;
			}
			return combine;
			   
		}

	}


