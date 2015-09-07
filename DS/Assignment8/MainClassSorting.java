import java.util.Scanner;


public class MainClassSorting
{
	public static void main(String args[])
	{
		Sorting sorting = null;
		Scanner scanner = new Scanner(System.in);
		int numberOfElements, choice;
         do
         {
             System.out.println("Enter Number of Elements to be sorted");
             do 
             {
                 System.out.println("Enter positive integer only");
                 while(!scanner.hasNextInt()) 
                 {
                     System.out.println("Enter Numebr Only");
                     scanner.next();
                 }
                 numberOfElements = scanner.nextInt();
             }while(numberOfElements <= 0);
             
             int inputArray[] = new int[numberOfElements];
             
             for(int index = 0; index < numberOfElements; index++) 
             {
                 System.out.println("Enter Number "+(index+1));
                 do 
                 {
                     System.out.println("(Enter positive integer only)");
                     while(!scanner.hasNextInt())
                     {
                         System.out.println("Enter Number Only");
                         scanner.next();
                     }
                     inputArray[index] = scanner.nextInt();
                 } while(inputArray[index] < 0);
             }
            
             System.out.println("Enter choice: ");
             System.out.println("1. Comparision Sorting");
             System.out.println("2. Linear Sorting");
             System.out.println("3. Exit");
             do 
             {
                 System.out.println("(Enter positive integer only)");
                 while(!scanner.hasNextInt()) 
                 {
                     System.out.println("Enter Number Only");
                     scanner.next();
                 }
                 choice = scanner.nextInt();
             } while(choice <= 0 || choice >= 4);
             
             switch(choice) 
             {
              
                 case 1:
                	 	sorting = new ComparisonSorting();
                 		sorting.readData(inputArray);
                	 	sorting.performSorting();
                	 	break;
                     
                 case 2:
                	 	sorting = new LinearSorting();
                	 	sorting.readData(inputArray);
                	 	sorting.performSorting();
                     	break;
                     
                 case 3:
                     	System.out.println("System Closed");
                     	scanner.close();
                     	System.exit(0);
                     	break;
                 
                 default:
                     	System.out.println("Enter Correct Choice");
             }
             System.out.println("Sorted array is: ");
             sorting.display();
             
         } while(true);
       
    }
 
}
	
	
