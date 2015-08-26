import java.util.Scanner;


public class ThirdHigestElement {

	
	int thirdHeigestElement(int arrray[]){
		
		int first=-1;
		int second=-1;
		int third=-1;
		int len=arrray.length;
		for(int i=0;i<len;i++)
		{
			if(arrray[i]>first){
				third=second;
				second=first;
				first=arrray[i];
			}
			else if(arrray[i] > second) {
		        third = second;
		        second=arrray[i];
			}
			else if(arrray[i] > third){
				third=arrray[i];
			}
		}
		return third;	
	}
	
	public static void main(String[] args){
		int numberOfElement;
		int inputArray[]=null;
		System.out.print("Enter Number of elements ");
		Scanner scan=new Scanner(System.in);
		try{
			numberOfElement=scan.nextInt();
			inputArray=new int[numberOfElement];
			System.out.println("Enter all Elements ");
			for(int i=0;i<numberOfElement;i++)
			{
				inputArray[i]=scan.nextInt();
				
			}
		}
		catch(Exception e){
			System.out.println("Please Enter Integer Value ..");
			main(null);
		}
		
		int output=new ThirdHigestElement().thirdHeigestElement(inputArray);
		if(output==-1){
			System.out.println("Third Higest is not in InputArray");	
		}
		else{
			System.out.print("Third Higest = : "+output);
		}
		scan.close();
		
	}
}
