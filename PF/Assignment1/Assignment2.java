public class Assignment2 {
	 int[] removeDuplicates(int[] arr) {

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

		    int[] whitelist = new int[end];
		    for(int i = 0; i < end; i++){
		        whitelist[i] = arr[i];
		    }
		    return whitelist;
		}
		     public static void main(String[] args) {
		        int a[]={2,2,3,3,4,4,0,5,6,7};
		        Assignment2 b=new Assignment2();
		       int c[]=b.removeDuplicates(a);
		         for (int i = 0; i <c.length; i++) {
		             
		               System.out.println(c[i]);
		         }
		    }
		    
}
