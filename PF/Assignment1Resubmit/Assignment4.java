import java.util.Scanner;


public class Assignment4 
{
	/**FCFS is a function which calculates the wait time, start time, and finished time of the jobs.
	 * 
	 * @param arrival_time is the array of the arrival time of all the jobs.
	 * @param job_size is the array of job size of all the jobs.
	 * @param n is the number of jobs.
	 * @return This function return a 2D array which consist of jobNo, arrival time, wait time, start time and 
	 *         finished time of all the jobs respectively.
	 */
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
		Assignment4 obj=new Assignment4();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of jobs");
		int n=sc.nextInt();
		int arrival[]=new int[n];
		System.out.println("enter the arrival time of jobs");
		for(int count=0;count<n;count++)
		{
			arrival[count]=sc.nextInt();
		}
		int size[]=new int[n];
		System.out.println("enter the size of jobs");
		for(int count=0;count<n;count++)
		{
			size[count]=sc.nextInt();
		}
		int out[][]=obj.FCFS(arrival,size,n);
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