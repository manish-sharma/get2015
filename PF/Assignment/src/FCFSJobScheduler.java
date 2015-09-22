
public class FCFSJobScheduler {

	 public int[][] FCFS(int arrival_time[],int job_size[])
     {
		   int start_time[],finish_time[],wait_time[],output[][];
		   start_time=new int[arrival_time.length];
		   finish_time=new int[arrival_time.length];
		   wait_time=new int[arrival_time.length];
		   output=new int[arrival_time.length][arrival_time.length];   
			  for(int i=0;i<arrival_time.length;i++)
			     
				 {
				    if(i==0)
					  { 
					  wait_time[i]=0;
					  start_time[i]=arrival_time[i];
				      finish_time[i]=start_time[i]+job_size[i]-1;
					  }
				     
					 else if (finish_time[i-1]<arrival_time[i])
					 {
					 start_time[i]=arrival_time[i];
					 wait_time[i]=0;
					 finish_time[i]=start_time[i]+job_size[i]-1;
					 }
				 
				     else 
				     {
						  start_time[i]=finish_time[i-1]+1;
						  wait_time[i]=start_time[i]-arrival_time[i];
						  finish_time[i]=start_time[i]+job_size[i]-1;
					 }
				 }
			
			 
			 for(int i=0;i<arrival_time.length;i++)
			 {
				  output[i][0]=arrival_time[i];
				  output[i][1]=wait_time[i];
				  output[i][2]=start_time[i];
				  //output[i][3]=finish_time[i];
			 }
         return output;
     }
	 

public static void main(String args[])
  { 
	  int arrival_time[]={1,5,7};
	  int job_size[]={7,2,9};
	  int schedule[][];
	  FCFSJobScheduler jobScheduler=new FCFSJobScheduler();
	  schedule=jobScheduler.FCFS(arrival_time,job_size);
	  for(int i=0;i<arrival_time.length;i++)
	  {
		  for(int j=0;j<arrival_time.length;j++)
		  {
			   System.out.println(schedule[i][j]);
		  }
	  }
  } 
}
