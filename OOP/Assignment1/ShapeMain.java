/**This class test functionality of Shape Interface and its implementation
 * @author Gaurav Saini
 * Date 13th August 2015
 */

public class ShapeMain {
	/*static method to print area of Shape*/ 
	static void printShape(Shape shape)
	{
		System.out.println(shape.getArea());
	}
	public static void main(String args[])
	{
		Shape shape=new Circle(5);
		 shape.draw();
		 shape.getArea();
		 printShape(shape);
		 Shape squareobj= new Square(2);
		 squareobj.draw();
		 squareobj.getArea();
		 printShape(squareobj);
    }
}
