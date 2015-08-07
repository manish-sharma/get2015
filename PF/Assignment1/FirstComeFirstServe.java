package FirstComeFirstServe;

public class FirstComeFirstServe{
	 int[][] FCFS( int arrivalTime [], int jobSize[] ,int n)
	 {
		 int i;
		 int jobStartTime[]=new int[n];
		 int jobWaitTime[]=new int[n];
		 int jobFinishTime[]=new int[n];
		 jobStartTime[0]=1;
		 jobWaitTime[0]=0;
		 jobFinishTime[0]=jobSize[0];
		 for(i=1;i<n;i++)
		 {
			 if(arrivalTime[i]<jobFinishTime[i-1])
			 {
			 jobStartTime[i]=jobFinishTime[i-1]+1;
			 jobWaitTime[i]=jobStartTime[i]-arrivalTime[i];
			 jobFinishTime[i]=jobStartTime[i]+jobSize[i]-1;
			 }
			 else
			 {
				 jobWaitTime[i]=0;
				 jobStartTime[i]=arrivalTime[i];
				 jobFinishTime[i]=jobStartTime[i]+jobSize[i]-1;
				 
			 }
			 
		 }
		 int output[][]=new int[n][5];
		 for(i=0;i<n;i++)
		 {
			 
			
				 output[i][0]=i+1;
				 output[i][1]=arrivalTime[i];
				 output[i][2]=jobWaitTime[i];
				 output[i][3]=jobStartTime[i];
				 output[i][4]=jobFinishTime[i];
			 
			 
		 }
		 return output;
	 }
	 public static void main(String arg[])
	 {
	 }

}
