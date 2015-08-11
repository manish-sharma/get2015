/****************************************************************************************
Name            : BinarySearch
Revision Log    : 2015-08-11: Babalu patidar : created.
                : 
                : 
Use             : This class is used to search an element by binarysearch.
                :
****************************************************************************************/
//Starting ofBinarySearch class
public class BinarySearch {
	
	//binarysearch method take an inputarray,first,last,element that find
	//@param: Integer inputarray:Specify input array
	//@param: Integer first:Specify address of first element
	//@param: Integer last:Specify address of last element
	//@param: Integer element:Specify element that is to find in array
	//@param: Integer middle:Specify length of array
	int binarysearch(int inputArray[],int first,int last,int element)
	{
		int middle;
		if(first<=last)
		{
			middle=(first+last)/2;
			if(inputArray[middle]==element)
			{
				return middle;
			}
			else if(inputArray[middle]>element)
				{
					//recusive calling of first half
					return(binarysearch(inputArray,first,middle-1,element));
				}
				else
				{
					//recusive calling of second half
					return(binarysearch(inputArray,middle+1,last,element));
				}
			
		}
		else{
			return -1;	
		}
	}
	//End of binarysearch method
	
	
	//start of main
	//@param: Integer inputarray:Specify second value as input
	//@param: Integer output:Specify output return by linearsearch method
	//@param: Integer element:Specify element that is to find in array
	public static void main(String arg[])
	{
		int inputarray[]={1,2,3,4,5,7,8};
		int element=7;
		int output;
		BinarySearch object=new BinarySearch();
		output=object.binarysearch(inputarray,0,inputarray.length-1,element);
		if(output==-1){
			System.out.println("Element not found");
		}
		else{
			System.out.print("Index Value of element is ="+output);
		}	
	}
	//End of main

}
//End of class
