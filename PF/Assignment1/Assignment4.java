
public class Assignment4
{ 
	int [][]FCFS( int arrival_time [], int job_size[] ,int  n)
	{ int count=1;
	  int jobFinishedAt[]=new int [n];
	  int  jobWaitTime[]=new int [n];
	  int  jobStartAt[]=new int [n];
	 
		int output[][]=new int[n][5];
		for(int i=0;i<n-1;i++)
		{
			jobFinishedAt[i]=jobStartAt[i]+job_size[i]-1;
			if(arrival_time[i+1]<jobFinishedAt[i])
			{
				jobWaitTime[i+1]=jobFinishedAt[i]-arrival_time[i+1]+1;
				jobStartAt[i+1]=jobFinishedAt[i]+1;
			}
			else
			{
				jobWaitTime[i+1]=0;
				jobStartAt[i+1]=arrival_time[count+1];
			}
			
		}
		
		for(int i=0;i<n;i++)
		{ output[i][0]=i+1;
		  output[i][1]=arrival_time[i];
		  output[i][2]=jobWaitTime[i];
		  output[i][3]=jobStartAt[i];		  
		  output[i][4]=jobFinishedAt[i];	  
		  
			
			
			
		}
		
		return output;
		
	}
	
	
	
	 public static void main(String[] args) {
		 Assignment4 assignment4=new Assignment4();
		 int arrival_time[]={1,5,9,25};
		 int job_size[]={12,7,2,5};
		 int n=4;
		 int output[][]=assignment4.FCFS(arrival_time, job_size, n);
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<arrival_time.length;j++)
			 {
				 System.out.print(output[i][j]);
				 
				 
			 }
				  
			 
			 
		 }
		 
		 
	 }
}
