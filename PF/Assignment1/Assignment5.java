
public class Assignment5 {

	
	
	
	public int typeOfArray(int arr[]){
		
		int flag=0;
		if(arr[0]>arr[1]){
		for(int i=0;i<arr.length-1;i++)
		{     
			if(arr[i]>=arr[i+1]){
				
				
			  flag=1;
			  
			}
			else{
				flag=0;
			}
			
		} }
		else{
			for(int j=0;j<arr.length-1;j++)
			{   
				
				if(arr[j]<=arr[j+1]){
					
					
					  flag=2;
					  
					}
			       else{
			          	flag=0;
				
				
			           }
			
				
				
				
			}
		}		
			if(flag==1){
				return 2;
			}
			if(flag==2)
			{
				return 1;
			}
			if(flag==0){
				return 3;
			}
			
			return -1;
			
	}	
	
		
		
	
	
	public static void main(String args[]){
		
		
		int[] input={2,4,7,9};
		Assignment5 a=new Assignment5();
		int out=a.typeOfArray(input);
		
		if(out==1){
			System.out.print("Asendending type of array");
		}
		
		if(out==2){
			System.out.print("Decending type of array");
		}
		
		if(out==3){
			System.out.print(" neither Asendending nor Decending type of array");
		}
		
		
	}
	
	
	
	
}
