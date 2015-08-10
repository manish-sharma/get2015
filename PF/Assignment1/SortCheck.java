import java.util.Arrays;


public class SortCheck {
	
	public int check(int n[])
	{
		
		
		int len=n.length;
		int i=0,out=0;
		for( i=0;i<len-1;i++)
		{ int j=i+1;
			if(n[i]>n[j])
			break;	
		}
		if(i==len-1)
			out=1;
		else
		{
			for( i=0;i<len-1;i++)
			{ int j=i+1;
				if(n[i]<n[j])
				break;	
			}
			
			if(i==len-1)
				out=2;
			
			
		}
		
		
		
	
		
	return out;

}
}

