package priyamvada;

/*To calculate waiting time according to FCFS scheduling*/
public class Program6 {
		 int[][] FCFS( int arrival_time [], int job_size[] ,int n)
		 {
			 int i;
			 int []jobStartTime=new int[n];
			 int []jobWaitTime=new int[n];
			 int []jobFinishTime=new int[n];
			 jobStartTime[0]=1;
			 jobWaitTime[0]=0;
			 jobFinishTime[0]=job_size[0];
			 for(i=1;i<n;i++)
			 {
				 if(arrival_time[i]<jobFinishTime[i-1])
				 {
				 jobStartTime[i]=jobFinishTime[i-1]+1;
				 jobWaitTime[i]=jobStartTime[i]-arrival_time[i];
				 jobFinishTime[i]=jobStartTime[i]+job_size[i]-1;
				 }
				 else
				 {
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
		 }
		 public static void main(String arg[])
		 {
			 int []Arrival_time ={1, 5, 9, 25};
			               int[] Job_size={12,7,2,5};
			               int n=Job_size.length;
			 Program6 assign=new Program6();
			 System.out.println(" job job arrival Time Job Waiting Time Job Start Time Job Finish Time");
			 for(int i=0;i<n;i++)
				 {
				 for(int j=0;j<5;j++)
					 {
					 System.out.print(assign.FCFS(Arrival_time,Job_size,n).clone()[i][j]+" ");
					 }
				 System.out.println();
				 }
		 }

	}

