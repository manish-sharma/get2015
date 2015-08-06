import java.util.Scanner;
public class F_C_F_S {

	public static void main(String[] args) {
		int i,j,size;
		   Scanner sc= new Scanner(System.in);	
		   System.out.println("Enter the size of job :");
		   size = Integer.parseInt(sc.nextLine());
		   System.out.println("Enter the arrival time :");
		   int arrival_Time[]=new int[size];
		   int job_Size[]=new int[size];
		  
		   for(i=0;i<size;i++)
			   arrival_Time[i]=Integer.parseInt(sc.next());
		   System.out.println("Enter the job size :");
		   Scanner sc1= new Scanner(System.in);	
		   for(i=0;i<size;i++)
			   job_Size[i]=Integer.parseInt(sc1.next());
		int op[][]= new int[size+1][size+1];
		   F_C_F_S fcfs=new F_C_F_S();
		   op=fcfs.jobSchedule(arrival_Time,job_Size,size);
		   for(i=0;i<size;i++)
		   {
			   System.out.println();   
			   for(j=0;j<size+1;j++)  
			    System.out.print(op[i][j]+"\t");
		   }
	}
	int[][] jobSchedule(int arrival_time[],int job_size[],int size)
	{
		int arr[][]= new int[size][size+1];
		int i,j;
		j=0;
		int wait_time=0,start_time=1;
		for(i=0;i<size;i++)
		{
			
			if(i==0)
				{
					arr[i][0]=i+1;
					arr[i][1]=arrival_time[i];
					arr[i][2]=wait_time;
					arr[i][3]=start_time;
					arr[i][4]=job_size[i];
					}
			else
			{
				arr[i][0]=i+1;
				arr[i][1]=arrival_time[i];
				if(arr[i][1]>arr[i-1][4])
					arr[i][2]=0;
				else
				arr[i][2]=arr[i-1][4]-arr[i][1]+1;	
				arr[i][3]=arr[i][1]+arr[i][2];
				arr[i][4]=arr[i][3]+job_size[i]-1;
							   
			   }
		}
			  return arr;

	}

}
