package oops_asignment_1;

/**This class implements the Shape interface for circle  
 * @author ankur gupta
 * Since: 14 August,2015
 */
public class Circle implements Shape {
	
    private int radius;
    /*Constructor*/
	public Circle(int radius){
		this.radius = radius;
	}
	
	/*Function to display message on Console*/
	public void draw(){ 
    System.out.println("Function To Draw Circle");
	}
	
	/*Function needed to calculate Area of Shape*/
	public double getArea(){
		double area;
		int pie = (22/7);
		area = pie*(radius*radius);
		return area;
	}
	
	/*Function to Print calculated area*/
	void printShape(Shape shape){
		System.out.println(shape.getArea());
		}
	
}