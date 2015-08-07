
public class Assign2 {
	 int[] removeDuplicates(int[] input) {

		  int end=input.length;

		    for (int i = 0; i < input.length; i++) {
		        for (int j = i + 1; j <input.length; j++) {
		            if (input[i] == input[j]) {                  
		                int shiftLeft = j;
		                for (int k = j+1; k < end; k++, shiftLeft++) {
		                    input[shiftLeft] = input[k];
		                }
		                end--;
		                j--;
		            }
		        }
		    }

		    int[] whitelist = new int[end];
		    for(int i = 0; i < end; i++){
		        whitelist[i] = input[i];
		    }
		    return whitelist;
		}
		     public static void main(String[] args) {
		        int a[]={2,2,3,3,4,4,0,5,6,7};
		        Assign2 b=new Assign2();
		       int c[]=b.removeDuplicates(a);
		         for (int i = 0; i <c.length; i++) {
		             
		               System.out.println(c[i]);
		         }
		    }
		    
}
