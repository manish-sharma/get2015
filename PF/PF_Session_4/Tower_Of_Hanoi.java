import java.util.*;
public class Tower_Of_Hanoi 
{
	String towerOfHanoi(String fromPeg,String toPeg,String temp,int numOfDisk)
	{
		
		if(numOfDisk==1)
			return ("Move Disk "+numOfDisk+" from "+fromPeg+" to "+toPeg);
		else
		{
			String sol1,sol2,myStep,mySol;
			sol1=towerOfHanoi(fromPeg,temp,toPeg,numOfDisk-1);
			towerOfHanoi(fromPeg,toPeg,temp,1);
			myStep="Move Disk "+numOfDisk+" from "+fromPeg+" to "+toPeg;
			sol2=towerOfHanoi(temp,toPeg,fromPeg,numOfDisk-1);
			mySol=sol1+"\n"+myStep+"\n"+sol2;
			return mySol;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int numOfDisk;
		System.out.println("Enter number of disc");
		numOfDisk=sc.nextInt();
		Tower_Of_Hanoi TOH=new Tower_Of_Hanoi();
		String fromPeg="A";
		String toPeg="C";
		String temp="B";
		String result=TOH.towerOfHanoi(fromPeg,toPeg,temp,numOfDisk);
		System.out.println(result);
	}

}

