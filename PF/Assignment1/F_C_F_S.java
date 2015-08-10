import java.util.Scanner;
public class F_C_F_S {

	public static void main(String[] args) {
		
	            	int index1,index2,size;
	            	Scanner sc= new Scanner(System.in);	
	            	System.out.println("Enter the number of job :");
	            	size = Integer.parseInt(sc.nextLine());
	            	System.out.println("Enter the arrival time(in second) :");
	            	int arrival_Time[]=new int[size];
	            	int job_Size[]=new int[size];
		  
	            	for(index1=0;index1<size;index1++)
	            	{
	            		arrival_Time[index1]=Integer.parseInt(sc.next());
	            	}
	            	
	            	System.out.println("Enter the job size :");
	            		
	            	for(index1=0;index1<size;index1++)
	            	{
	            		job_Size[index1]=Integer.parseInt(sc.next());
	            	}
	            	
	            	int output_job_schedule[][]= new int[size+1][size+1];
	            	F_C_F_S object=new F_C_F_S();
	            	output_job_schedule=object.jobSchedule(arrival_Time,job_Size,size);
	            	System.out.print("Job ArrivalTime WaitTime Start At Finish At");
	            	for(index1=0;index1<size;index1++)
	            	{
	            		// print job schedule
	            		System.out.println();   
	            		for(index2=0;index2<size+1;index2++)  
	            		System.out.print(output_job_schedule[index1][index2]+"\t ");
	            	}
		}
		
		int[][] jobSchedule(int arrival_time[],int job_size[],int size)
		{
		            int array[][]= new int[size][size+1];
		            int index1,index2;
		            index2=0;
		            int wait_time=0,start_time=1;
		            for(index1=0;index1<size;index1++)
		            {
			
		            	if(index1==0)
		            	{
		            		array[index1][0]=index1+1;
		            		array[index1][1]=arrival_time[index1];
		            		array[index1][2]=wait_time;
		            		array[index1][3]=arrival_time[index1];
		            		array[index1][4]=job_size[index1]+arrival_time[index1]-1;
		            	}
		            	else
		            	{
		            		array[index1][0]=index1+1;
		            		array[index1][1]=arrival_time[index1];
		            		if(array[index1][1]>array[index1-1][4])
		            		{
		            			// if no job is processing
		            			array[index1][2]=0;
		            		}
		            		else
		            		{
		            			array[index1][2]=array[index1-1][4]-array[index1][1]+1;	
		            		}
		            			array[index1][3]=array[index1][1]+array[index1][2];
		            			array[index1][4]=array[index1][3]+job_size[index1]-1;
		            		 
		            	}
		            }
		            
		            return array;
		}

	}

