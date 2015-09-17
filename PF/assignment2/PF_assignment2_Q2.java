
 
public class PF_assignment2_Q2 {
	public String pyramid(int n)
	{
		int i=0;
		String str1="",str2="",finalString="";
		for(i=1;i<=n;i++)
		{
			str1=spaces(i,n);
			str2=numbers(i,n);
			finalString+=str1+str2+"\n";
			//System.out.println(str1+str2);
		}
		return finalString;
	}
	public String spaces(int row,int n)
	{
		String str="";
		int i=0;
		for(i=1;i<row;i++)
			str+=" ";
		return str;	
		
	}
	public String numbers(int row,int n)
	{
		String str="";
		int i=0;
		for(i=1;i<=n-row+1;i++)
			str+=i;
		return str;		
	}
    
    public static void main(String[] args) 
    {
    	PF_assignment2_Q2 pf=new PF_assignment2_Q2();
    	String str=pf.pyramid(3);
    	System.out.println(str);
    }
}
