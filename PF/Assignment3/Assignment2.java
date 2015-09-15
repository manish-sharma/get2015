/* this class contain to functions 1.to perform linear search
                                   2.to perform binary search
                                                                  */
public class Assignment2 {
	
	int linearsearch(int[] list,int l, int u, int item){   //function for linear search
			
		if( l>u ) {                                        //searching is completed but item  not found       
			return -1;
		}
		
		if( list[l]==item ) {                      // here item is found 
			return 1;
		}
		else {
			return linearsearch(list , l+1 , u,item);      //recursive call for next element comparison
		}
		
		
	}
	
	int binarysearch (int[] list,int low, int high, int item)        // function for binary search
	{
		  int mid;
	      if( low <= high){
	    	  mid = ( low + high ) / 2;
	      }
	      
	      else {
	    	  return -1;               //searching is completed but item  not found   
	      }
	      
		if ( item == list[mid] ) {      // // here item is found 
			 return 1;
		}
		else if(item < list[mid] ) {
			return binarysearch(list, low, mid-1, item);  //recursive call for first half list
		}
		
		else{
			return binarysearch(list, mid+1, high, item);       //recursive call for IInd half list
		}
		
	}
	
	
	public static void main(String [] cv) {
		
		Assignment2 obj = new Assignment2();
		
		int[] list1= {3,44,75,9,62,98,765,624,35,48,8};
		int[] list2= {1,5,15,27,38,59,67,69,70,90,96,100};
		System.out.println( obj.linearsearch(list1,0,10,62)==1 ?"62 is found in list1":"62 is not found in list1");
		System.out.println( obj.linearsearch(list1,0,10,100)==1 ?"100 is found in list1":"100 is not found in list1");
		
		System.out.println( obj.binarysearch(list2,0,11,62)==1 ?"62 is found in list2":"62 is not found in list2");
		System.out.println( obj.binarysearch(list2,0,11,100)==1 ?"100 is found in list2":"100 is not found in list2");
		
	}
	
}
