import java.util.Scanner;


public class removeduplicates {

	public static void main(String[] args) {
		                             
		              int size,index1;
		              removeduplicates object=new removeduplicates();
		              Scanner sc=new Scanner(System.in);
		              System.out.println("Enter the length of  array :");
		              size = Integer.parseInt(sc.nextLine());
		              int input[]=new int[size];
		              Scanner sc1= new Scanner(System.in);
		              System.out.println("Enter the  array :");
		              for(index1=0;index1<size;index1++)
		              {
		            	  input[index1]=Integer.parseInt(sc1.next());
		              }
		              
		              removeduplicates duplicateElement=new removeduplicates();
		              int[] output_array=duplicateElement.removeDuplicateElement(input);
		              System.out.print("Array after removing Duplivates \n");
		              for(index1=0;index1<output_array.length;index1++)
		              {
		            	  System.out.print(output_array[index1]+"\t");
		              }
		              
	}
	
					   int[] removeDuplicateElement(int input[])
					   {  
						   int count=0;
	  		               for(int index1=0;index1<input.length;index1++)
	  		               {
	  		            	   for(int index2=index1+1;index2<input.length;index2++)
	  		            	   {
	  		            		   if(input[index2]==input[index1] && input[index1]!=' ')
	  		            		   {
	  		            			   input[index2]=' ';
	  		            			   count=count+1;
	  		            		   }
	  		            	   }
	  		               }
	  		             
	  		               int index2=0;
	  		               int newLength=input.length-count;
	  		               int outputArray[]=new int[newLength];
	  		               for(int index1=0;index1<input.length;index1++)
	  		               {
				
	  		            	   if(input[index1]!=' ')
	  		            	   {
	  		            		 
	  		            		   outputArray[index2]=input[index1];
	  		            		 index2=index2+1;
	  		            	   }
			
	  		               }
	  		            
	  		               return outputArray;
					   }
					   
}