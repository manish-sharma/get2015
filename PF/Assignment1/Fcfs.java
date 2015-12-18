import java.util.Scanner;


public class Fcfs
{
	
	static int[][] jobSchedule(int arrival_time[],int job_size[],int size)
	{
		int sheduled[][]= new int[size][size+1];
		int i,j;
		j=0;
		int wait_time=0,start_time=1;
		for(i=0;i<size;i++)
		{
			
			if(i==0)
				{
				sheduled[i][0]=i+1;
				sheduled[i][1]=arrival_time[i];
				sheduled[i][2]=wait_time;
				sheduled[i][3]=start_time;
				sheduled[i][4]=job_size[i];
					}
			else
			{
	
			
				sheduled[i][0]=i+1;
				sheduled[i][1]=arrival_time[i];
				if(sheduled[i][1]>sheduled[i-1][4])
					sheduled[i][2]=0;
				else
					sheduled[i][2]=sheduled[i-1][4]-sheduled[i][1]+1;
				
				sheduled[i][3]=sheduled[i][1]+sheduled[i][2];
				sheduled[i][4]=sheduled[i][3]+job_size[i]-1;
				
			
				   
			   }
		}
			  return sheduled;
		
	}
	


		public static void main(String[] args)
		{
			int i,j,job;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of Jobs");
			job=sc.nextInt();
			   
		    int arrival_Time[]={1, 5, 9, 25};
		    int job_Size[]={12,7,2,5};
			
			int op[][]= new int[job+1][job+1];
			   
			   op=jobSchedule(arrival_Time,job_Size,job);
			   
			   System.out.print("Job\tarrived time \twait time\t Start time\t finished time");
			   
			   for(i=0;i<job;i++)
			   {
				   System.out.println();   
				   for(j=0;j<job+1;j++)  
				    System.out.print(op[i][j]+"\t\t");
			   }
		}
		
}
