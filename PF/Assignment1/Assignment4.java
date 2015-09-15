
import java.util.*;

public class Assignment4 {
	public int [][]FCFS( int arrival_time [], int job_size[])
	{
		int i,j;
		int job[]={0,0,0,0,0};
		int c[][]=new int[arrival_time.length][5];
		for(i=0;i<arrival_time.length;i++)
		{
			job[0]=i+1;
			job[1]=arrival_time[i];
			job[2]=job[4]-arrival_time[i]+1;
			if(job[2]<0)
				job[2]=0;
			job[3]=job[1]+job[2];
			job[4]=job[3]+job_size[i]-1;
			for(j=0;j<5;j++)
				c[i][j]=job[j];
				
			
		}
		return c;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		int b[]=new int[4];
		int i,j;
		System.out.print("\n Enter arrival times : ");
		for(i=0;i<4;i++)
			a[i]=sc.nextInt();
		System.out.print("\n Enter job sizes : ");
		for(i=0;i<4;i++)
			b[i]=sc.nextInt();
		Assignment4 a4=new Assignment4();
		int c[][]=a4.FCFS(a, b);
		System.out.println("Job    arrived time    job wait time    job start at    job finished at");
		for(i=0;i<4;i++)
		{
			for(j=0;j<5;j++)
				System.out.print(c[i][j]+"    ");
			System.out.print("\n");
		}
	}

}
