import java.util.*;
/**
 * @author Sumitra
 *This program is to calculate the waiting time start time and finish time for jobs in first come first serve.
 */
public class JobSequence {
	 public static void main(String arg[])
	 {
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("enter the number of jobs");
		 int noOfJob=scan.nextInt();
		 int []Arrival_time =new int[noOfJob];
		               int[] Job_size=new int[noOfJob];
		               int n=Job_size.length;
		 JobSequence assign=new JobSequence();
		 System.out.println(" job job arrival Time Job Waiting Time Job Start Time Job Finish Time");
		 for(int i=0;i<n;i++)
			 {
			 for(int j=0;j<5;j++)
				 {
				 System.out.print(assign.FCFS(Arrival_time,Job_size)[i][j]+" ");
				 }
			 System.out.println();
			 }
		 scan.close();
	 }
	 int[][] FCFS( int arrival_time [], int job_size[] )
	 {
		 int i;
		 int n=arrival_time.length;
		 int []jobStartTime=new int[n];
		 int []jobWaitTime=new int[n];
		 int []jobFinishTime=new int[n];
		 jobStartTime[0]=1;
		 jobWaitTime[0]=0;
		 jobFinishTime[0]=job_size[0];
		 for(i=1;i<n;i++)
		 {
			 if(arrival_time[i]<jobFinishTime[i-1])
				 /**
				  * if the arrival time of job is less than the finish time of previous job than it will execute.
				  */
			 {
			 jobStartTime[i]=jobFinishTime[i-1]+1;
			 jobWaitTime[i]=jobStartTime[i]-arrival_time[i];
			 jobFinishTime[i]=jobStartTime[i]+job_size[i]-1;
			 }
			 else
			 {
				 /**
				  * if the job is arrived but machine is free than waiting time for job will be zero and job start time will be equal to arrival time.
				  * and job finish tme will be calculated normally.
				  */
				 jobWaitTime[i]=0;
				 jobStartTime[i]=arrival_time[i];
				 jobFinishTime[i]=jobStartTime[i]+job_size[i]-1;
				 
			 }
			 
		 }
		 int [][]jobArrange=new int[n][5];
		 for(i=0;i<n;i++)
		 {
			 
			
				 jobArrange[i][0]=i+1;
				 jobArrange[i][1]=arrival_time[i];
				 jobArrange[i][2]=jobWaitTime[i];
				 jobArrange[i][3]=jobStartTime[i];
				 jobArrange[i][4]=jobFinishTime[i];
			 
			 
		 }
		 return jobArrange;
		 /**
		  * returning a 2-d array of job schedule.
		  */
	 }
	

}
