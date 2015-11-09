
public class PF_assignment2_Q1 {
	public String pyramid(int n)
	{
		int i=0;
		String finalString="";
		String str1="",str2="";
		for(i=1;i<=n;i++)
		{
			str1=spaces(i,n);
			str2=numbers(i,n);
			
			finalString+=str1+str2+"\n";
		}
		for(i=n-1;i>0;i--)
		{
			str1=spaces(i,n);
			str2=numbers(i,n);
			
			finalString+=str1+str2;
			if(i!=1)
				finalString+="\n";
		}
		
		return finalString;
		
	}
	public String spaces(int row,int n)
	{
		String str="";
		int i=0;
		for(i=row;i<n;i++)
			str+=" ";
		return str;	
		
	}
	public String numbers(int row,int n)
	{
		String str="";
		int i=0;
		for(i=1;i<=row;i++)
			str+=i;
		for(i=row-1;i>0;i--)
			str+=i;
		return str;		
	}

    
    public static void main(String[] args)
    {
    	PF_assignment2_Q1 pf=new PF_assignment2_Q1();
    	String str=pf.pyramid(3);
    	System.out.println(str);
    	
    }
}
