
public class FCFS {
	public int[] fCFS(int arrival_time[],int job_size[])
	{
		int n=job_size.length,i=0;
		int wait_time[]=new int[n];
		int job_start_time=0;
		int job_end_time=0;
		for(i=0;i<n;i++)
		{
			
			job_start_time=job_end_time+1;
			if(job_start_time<arrival_time[i])
			{
				job_start_time=arrival_time[i];
			}
			wait_time[i]=job_start_time-arrival_time[i];
			job_end_time=job_start_time+job_size[i]-1;
			System.out.println(i+1+"\t"+arrival_time[i]+"   "+wait_time[i]+"   "+job_start_time+"   "+job_end_time);
			
		}
		
		return wait_time;
		
	}
	/*public static void main(String args[])
	{
		
		int op[],i=0;
		int arr1[]=new int[]{1, 5, 9, 25};
		int arr2[]=new int[]{12,7,2,5};
		FCFS rm=new FCFS();
		op=rm.fCFS(arr1, arr2);
		for(i=0;i<op.length;i++)
			System.out.println(op[i]);
	  
		
	}*/
	

}
