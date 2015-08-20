/****************************************************************************************
Name            : MatrixByMenu
Revision Log    : 2015-08-20: Babalu patidar : created.
                : 
                : 
Use             : This class is used to implement Matrix operation by menu
                :
****************************************************************************************/

import java.util.Scanner;

public class MatrixByMenu {
	//Start of main method
	//@param Int choice : Specify choice number
	public static void main(String[] args){	
		int choice = 0;
		Scanner scan=new Scanner(System.in);
		MenuAction matrix=new MenuAction();
		do{
			//Calling of displayMenu method
			matrix.displayMenu();
			try{
				choice = Integer.parseInt(scan.next());
			}
			catch(Exception e)
			{
				System.out.println("Enter Correct Choice..");
				main(null);
			}
			
			switch(choice)
			{
				case 1:
					//calling of addElementd method
					matrix.addElementsInMatrix(scan);
					break;
				case 2:
					//Calling of displayMatrix method
					matrix.displayMatrix();
					break;
				case 3:
					//Calling of displayTransposeMatrix
					matrix.displayTransposeMatrix();
					break;
				case 4:
					break;
				default :
				
					System.out.println("Enter Correct Choice..");
			}
			//End of switch
		}while(choice!=4);
		//End of do while
		scan.close();
	}
	//End of main
	
}
//End of class
