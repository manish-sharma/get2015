package oops_asignment_1;

/**This class implements the Shape interface for Square 
 * @author ankur gupta
 * Since: 14 August,2015
 */

public class Square implements Shape{
    private int side;
    /*Constructor*/
	public Square(int side){
		this.side = side;
	}
	/*Function to display message on Console*/
	public void draw(){
		System.out.println("Function To Draw Square");
	}
	/*Function needed to calculate Area of Shape*/
	public double getArea(){
		return (side*side);
				
	}
			
} 


