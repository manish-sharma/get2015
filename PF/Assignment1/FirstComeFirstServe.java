/**********************************************************************
*   @author Girdhari												  *
*   Program to find First Come First Serve scheduler of machine       *
*   fcfsMatrix is a 2D matrix contains all the calculated information *
*   count is a integer variable used as looping counter               *
*   first column of fcfsMatrix is job number, second column is Job    *
*	Arrival Time, third column is Job Wait Time, Fourth Column is Job *
*   Start Time, Fifth column is Job Finish Time                       *
***********************************************************************/

public class FirstComeFirstServe{
	/* beginning of FCFS function */
	
	 int[][] FCFS( int arrivalTime [], int jobSize[] ,int n)
	 {
		 int loopCounter;
		 int []jStartTime=new int[n];
		 int []jWaitTime=new int[n];
		 int []jFinishTime=new int[n];
		 
		 jStartTime[0]=1;
		 jWaitTime[0]=0;
		 jFinishTime[0]=jobSize[0];
		 
		 for(loopCounter=1;loopCounter<n;loopCounter++)
		 {
			 if(arrivalTime[loopCounter]<jFinishTime[loopCounter-1])
			 {
			 jStartTime[loopCounter]=jFinishTime[loopCounter-1]+1;
			 jWaitTime[loopCounter]=jStartTime[loopCounter]-arrivalTime[loopCounter];
			 jFinishTime[loopCounter]=jStartTime[loopCounter]+jobSize[loopCounter]-1;
			 }
			 else
			 {
				 jWaitTime[loopCounter]=0;
				 jStartTime[loopCounter]=arrivalTime[loopCounter];
				 jFinishTime[loopCounter]=jStartTime[loopCounter]+jobSize[loopCounter]-1;
				 
			 }
			 
		 }
		 
		 int [][]fcfsMatrix=new int[n][5];
		 for(loopCounter=0;loopCounter<n;loopCounter++)
		 {
			 
			
				 fcfsMatrix[loopCounter][0]=loopCounter+1;
				 fcfsMatrix[loopCounter][1]=arrivalTime[loopCounter];
				 fcfsMatrix[loopCounter][2]=jWaitTime[loopCounter];
				 fcfsMatrix[loopCounter][3]=jStartTime[loopCounter];
				 fcfsMatrix[loopCounter][4]=jFinishTime[loopCounter];
			 
			 
		 }
		 return fcfsMatrix;
	 }
	 /*ending of FCFS function*/
	 /*Beginning of main function*/
	 public static void main(String arg[])
	 {
		 
	 }
	 /*Ending of main function*/

}
