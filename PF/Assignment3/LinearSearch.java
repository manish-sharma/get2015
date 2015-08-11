/****************************************************************************************
Name            : LinearSearch
Revision Log    : 2015-08-11: Babalu patidar : created.
                : 
                : 
Use             : This class is used to search an element by linearsearch.
                :
****************************************************************************************/

//starting of class Linearsearch
public class LinearSearch {
	
	//linearsearch method take an array,index,element that find
	//@param: Integer numbersarray:Specify input array
	//@param: Integer index:Specify address of first element
	//@param: Integer element:Specify element that is to find in array
	//@param: Integer len:Specify length of array
	int linearsearch(int numbersarray[],int index,int element)
	{
		int len=numbersarray.length;
		
		if(index==len){
			index=-1;
		}
		else if(numbersarray[index]==element)
		{
			return index;
		}
		else
		{
			//recusive calling of method linearsearch
			return(linearsearch(numbersarray,++index,element));
		}
		return index;
		
	}
	
	//start of main
	//@param: Integer inputarray:Specify second value as input
	//@param: Integer output:Specify output return by linearsearch method
	//@param: Integer element:Specify element that is to find in array
	public static void main(String arg[])
	{
		int inputarray[]={1,2,3,4,5};
		int element=6;
		int output;
		LinearSearch object=new LinearSearch();
		output=object.linearsearch(inputarray,0,element);
		
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
