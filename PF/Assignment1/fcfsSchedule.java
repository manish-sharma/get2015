package assignment1;

public class fcfsSchedule {
	public int [][]FCFS(int arrival_time[],int job_size[],int n)
	{
		int wait_time[]=new int[n];
		int start_time[]=new int[n];
		int finish_time[]=new int[n];
		int i,j,jobNo=1;
		int wait[][]=new int[n][5];
		for(i=1;i<n;i++)
		{
			wait_time[i]=0;
			for(j=0;j<i;j++)
			{
				wait_time[i]+=job_size[j];
			}
			wait_time[i]=wait_time[i]-arrival_time[i]+1;
			if(wait_time[i]<0)
			{
				wait_time[i]=0;
			}
		}
		for(i=0;i<n;i++)
		{
			start_time[i]=wait_time[i]+arrival_time[i];
			finish_time[i]=start_time[i]+job_size[i]-1;
		}
		
		for(i=0;i<n;i++)
		{
			wait[i][0]=jobNo++;
			wait[i][1]=arrival_time[i];
			wait[i][2]=wait_time[i];
			wait[i][3]=start_time[i];
			wait[i][4]=finish_time[i];
		}
		return wait;
	}
	public static void main(String args[])
	{
		int arrival_time[]={1,5,9,25};
		int job_size[]={12,7,2,5};
		int n=arrival_time.length;
		int i,j;
		int wait[][]=new int[n][2];
		fcfsSchedule ob=new fcfsSchedule();
		wait=ob.FCFS(arrival_time,job_size,n);
		System.out.println("Job\tArr\tWait\tStart\tFinish");
		for(i=0;i<n;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(wait[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}	
	}
}
