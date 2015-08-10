// program to simulate FCFS i.e. first come first serve scheduler of a machine.

import java.util.Scanner;

public class F_C_F_S 
{
	public static void main(String[] args) 
	{
		int index1, index2, numOfJobs, arrivalTime[]=null, jobSize[]=null, output[][]=null ;
		Scanner sc = new Scanner(System.in);
		F_C_F_S obj = null;
		
		try
		{
			System.out.println("Enter the number of jobs :");
			numOfJobs = Integer.parseInt(sc.next());
			
			arrivalTime = new int [numOfJobs];
			jobSize = new int [numOfJobs];
			
			System.out.println("Enter the arrival time :");
	        for(index1=0; index1<numOfJobs; index1++)
	        	arrivalTime[index1] = Integer.parseInt(sc.next());
	        
			System.out.println("Enter the job size :");
			for(index1=0; index1<numOfJobs; index1++)
				jobSize[index1] = Integer.parseInt(sc.next());
			
			output = new int[numOfJobs+1][numOfJobs+1];
			obj = new F_C_F_S();
			output = obj.FCFS( arrivalTime, jobSize, numOfJobs );
	
			System.out.println("Job\tJob Arrived Time\tJob wait time\tJob Start at\tJob finished at");	   
			for(index1=0; index1<numOfJobs; index1++)
			{
				System.out.println();   
				for(index2=0; index2<numOfJobs+1; index2++)  
				System.out.print(output[index1][index2]+"\t\t");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(sc!=null)
				sc = null;
			if(obj!=null)
				obj = null;
			if(arrivalTime!=null)
				arrivalTime = null;
			if(jobSize!=null)
				jobSize = null;
		}
	}
	
	
	int[][] FCFS( int arrival_time[], int job_size[], int numOfJobs )
	{
		int arr[][] = new int[numOfJobs][numOfJobs+1] ;
		int index, jobWaitTime=0, jobStartTime=1 ;
		try
		{
			for( index=0; index<numOfJobs; index++ )
			{
				if( index==0 )                               // initializes values for first job
				{
					arr[index][0] = index+1;
					arr[index][1] = arrival_time[index];
					arr[index][2] = jobWaitTime;
					arr[index][3] = jobStartTime;
					arr[index][4] = job_size[index];
				}
				else
				{
					arr[index][0] = index+1 ;               // gives job number of a job
					arr[index][1] = arrival_time[index] ;   // gives arrival time of a job
					if( arr[index][1] > arr[index-1][4] )   // if a job arrives after its prev job finishes , its wait time=0
						arr[index][2] = 0 ;                 
					else
						arr[index][2] = arr[index-1][4] - arr[index][1] + 1 ;  // gives wait time of a job
					
					arr[index][3] = arr[index][1] + arr[index][2] ; // job start time = arrival time + wait time
					arr[index][4] = arr[index][3] + job_size[index] - 1 ;  // job finish time = start time + job size - 1
				}
			}
			return arr;	
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(arr!=null)
				arr = null;
		}
		return arr;
	}
}
