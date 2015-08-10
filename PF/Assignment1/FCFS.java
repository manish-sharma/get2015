public class FCFS 
{
	public  int[][] FCFS( int arrival_time [], int job_size[] ,int n)
	{
		int[] job_wait_time= new int[n];
		int[] job_start_at= new int[n];
		int[] job_finished_at= new int[n];
		int[][] result=new int[n][5];
		job_wait_time[0]=0;
		job_start_at[0]=arrival_time[0];                                                            
		for(int count=0;count<n-1;count++)
		{
			job_finished_at[count]=job_start_at[count]+job_size[count]-1;
			if(arrival_time[count+1]<job_finished_at[count])
			{
				job_wait_time[count+1]=job_finished_at[count]-arrival_time[count+1]+1;
				job_start_at[count+1]=job_finished_at[count]+1;
			}
			else
			{
				job_wait_time[count+1]=0;
				job_start_at[count+1]=arrival_time[count+1];
			}
			
		}
		job_finished_at[n-1]=job_start_at[n-1]+job_size[n-1]-1;
		for(int count=0;count<n;count++)
		{
			result[count][0]=count+1;
			result[count][1]=arrival_time[count];
			result[count][2]=job_wait_time[count];
			result[count][3]=job_start_at[count];
			result[count][4]=job_finished_at[count];
		}
		
		return result;
	}
	
	public static void main(String args[])
	{
		FCFS obj=new FCFS();
		int a[]={1,5,9,25};
		int s[]={12,7,2,5};
		int n=4;
		int out[][]=obj.FCFS(a,s,n);
		System.out.println("job\t"+"job arrived time "+" job waited time "+" job start at "+" job finished a");
		for(int count=0;count<n;count++)
		{
			System.out.println("\n");
			for(int count1=0;count1<5;count1++)
			{
				System.out.print(out[count][count1]+"\t\t");
			}
		}
	}
}