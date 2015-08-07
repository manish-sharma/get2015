package Assignments;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfElements,i,count=0;
		int duplicate[]=new int[20];
		int result[]=new int[20];
	
		System.out.println("enterno.of elements");
		Scanner sc= new Scanner(System.in);

		noOfElements=sc.nextInt();
		System.out.println("enter nos");
for(i=0;i<noOfElements;i++)
{
duplicate[i]=sc.nextInt();
	}
result=removeDuplicate(duplicate);
for(i=0;i<result.length-1;i++)
{System.out.println(""+result[i]);
	}

	}
	public static int[] removeDuplicate(int[] arr) {

	    int end = arr.length;

	    for (int i = 0; i < end; i++) {
	        for (int j = i + 1; j < end; j++) {
	            if (arr[i] == arr[j]) { 
	            
	                int shiftLeft = j;
	                for (int k = j+1; k < end; k++, shiftLeft++) {
	                    arr[shiftLeft] = arr[k];
	                }
	                end--;
	                j--;
	            }
	        }
	    }

	    int noDuplicatelist[] = new int[end];
	    for(int i = 0; i < end; i++){
	    	noDuplicatelist[i] = arr[i];
	    }
	    return noDuplicatelist;
	

}
}