public class Fcfs {
	 int[][] FCFS( int at [], int job_size[] ,int n)
	 {
		 int i;
		 int []jobST=new int[n];
		 int []jobwt=new int[n];
		 int []jobft=new int[n];
		 jobST[0]=1;
		 jobwt[0]=0;
		 jobft[0]=job_size[0];
		 for(i=1;i<n;i++)
		 {
			 if(at[i]<jobft[i-1])
			 {
			 jobST[i]=jobft[i-1]+1;
			 jobwt[i]=jobST[i]-at[i];
			 jobft[i]=jobST[i]+job_size[i]-1;
			 }
			 else
			 {
				 jobwt[i]=0;
				 jobST[i]=at[i];
				 jobft[i]=jobST[i]+job_size[i]-1;
				 
			 }
			 
		 }
		 int [][]job=new int[n][5];
		 for(i=0;i<n;i++)
		 {
			 
			
				 job[i][0]=i+1;
				 job[i][1]=at[i];
				 job[i][2]=jobwt[i];
				 job[i][3]=jobST[i];
				 job[i][4]=jobft[i];
			 
			 
		 }
		 
		 System.out.println(" job  arrival Time  Waiting Time  Start Time Finished Time");
		 for(i=0;i<n;i++)
		 {
		 for(int j=0;j<5;j++)
			 {
			 System.out.print(""+ job[i][j]+"	");
			 }
		 System.out.println();
		 }
		 return job;
	 }
	

}