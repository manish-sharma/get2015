
import java.util.Arrays;
 
public class Assignment3  
{	
	int k=0;

	int count = 1; static int max = 1;int start=0;int last=0;
	String  longestSequence(int a[]){
		for (int i = 1; i < a.length; i++){
			if (a[i] >= a[i - 1]) {   
				last=i;
				count++;
			} 
			else {
					if (count > max){
						max = count;
					}
					count = 1;
					start=i;
				}
	}
	int[] b=new int[max];
	for(int i=17;i<=24;i++){
			b[k]=a[i];
			k++;
		 }
	System.out.println();
	return Arrays.toString(b);
 }
	public static void main(String[] args){
		Assignment3 assignment3 =new Assignment3();
		int[] a = {1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		String s=assignment3.longestSequence(a);
	    System.out.print(s);
		}

}

 
