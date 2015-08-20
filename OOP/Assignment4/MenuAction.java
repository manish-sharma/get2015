/****************************************************************************************
Name            : MenuAction
Revision Log    : 2015-08-20: Babalu patidar : created.
                : 
                : 
Use             : This class is used to implement Matrix method
                :
****************************************************************************************/
import java.util.Arrays;
import java.util.Scanner;

//@param matrix Specify matrix
//@param noofrow specify total number of row
//@param noofcol specify total number of colomn
//@param flag specify matrix has add element or not.
//@param tranposeMatrix Specify Transpose of matrix. 
public class MenuAction {
	
	int matrix[][];
	int noofrow;
	int noofcol;
	int flag=0;
	int transposeMatrix[][];
	
	//Start of displayMenu method
	public void displayMenu(){
		System.out.println("Enter your choice\n 1. AddElements in matrix\n 2. DisplayMatrix \n 3. DisplayTranspose\n 4. Exit");
		
	}
	//End of displaymenu method
	
	//Start of addElementsInMatrix method
	void addElementsInMatrix(Scanner scan){
		
		try{
			
		System.out.println("Enter No Of Row");
		noofrow=Integer.parseInt(scan.next());
		System.out.println("Enter No Of Colomn");
		noofcol=Integer.parseInt(scan.next());
		matrix=new int[noofrow][noofcol];
		transposeMatrix=new int[noofcol][noofrow];
		
		System.out.println("Enter All Elements..");
		for(int i=0;i<noofrow;i++)
		{
			for(int j=0;j<noofcol;j++)
			{
				matrix[i][j]= Integer.parseInt(scan.next());;
			}
		}
		flag=1;
		}
		catch(Exception e)
		{
			System.out.println("Enter integer numbers only ");
			addElementsInMatrix(scan);
		}
		
	}
	//End of addElementsInMatrix method
	
	// start of displayMatrix method
	void  displayMatrix(){
		
		if(flag==1){
			System.out.println(" Matrix : ");
			for(int i=0;i<noofrow;i++)
			{
				System.out.println(Arrays.toString(matrix[i])+" ");
			}
		}
		else {
			System.out.println("First Add Elements in matrix");
		}
	}
	
	//End of displayMatrix method
	
	//Start of displayTransposeMatrix method
	void displayTransposeMatrix(){
		
		if(flag==1){
			System.out.println("  Transpose Matrix ");	
			for(int i=0;i<this.noofcol;i++)
			{
				for(int j=0;j<this.noofrow;j++)
				{
					transposeMatrix[i][j]=this.matrix[j][i];
				}
			}
			for(int i=0;i<noofcol;i++)
			{
				System.out.println(Arrays.toString(transposeMatrix[i])+" ");
			}
		}
		else {
			System.out.println("First Add Elements in matrix");
		}	
	}	
	//End of displayTransposeMatrix method

}
//End of class MenuAction