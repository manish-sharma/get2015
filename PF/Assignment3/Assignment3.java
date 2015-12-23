// This class contains a method of quick sort
public class Assignment3 {

	 int [] quicksort(int [] list, int low, int high){
		 
		 int i,j,pivot,tmp;
		 if(low<high) {
		   pivot= low;           // let pivot element is first element
		   i = low;
		   j = high;
		  
		   while(i<j) {
		     
			   while( list[i]<=list[pivot] && i<high ) {   i++;  }   //It search for the element greater than pivot
			   
			   while( list[j]>list[pivot] )  { j--; }                //It search for the element smaller than pivot
		    
			   if(i<j)  {
		         
				   tmp = list[i] ;   
		           list[i] = list[j] ;
		           list[j] = tmp ; 
		     }
		   }
		    
		    tmp = list[pivot] ;
		    list[pivot] = list[j] ;
		    list[j ]= tmp ;
		    quicksort( list,low,j-1 ) ;
		    quicksort( list,j+1,high ) ;
		 }
		
		     return list;
		 
	 }
	 
	 public static void main(String[] dggh) {
		 
		 Assignment3 obj= new Assignment3();
		 int[] list ={3,7,48,34,68,63,865,8,76};
		 
		 System.out.println("List before sorting:");
		 
		 for(int i:list) {
			 System.out.print(i+" ");
		 }
		 
		 list=obj.quicksort(list,0,8);
		 
         System.out.println("\n\nList after applying  quick sort:");
		 
		 for(int i:list) {
			 System.out.print(i+" ");
		 }
	 }

}
