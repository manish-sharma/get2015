/*test for interface
 * 
 */
import java.util.Scanner;
/*it is an interface 
 * 2 methods are there which will be 
 * overrided in further class
 */
interface shape
{
	String draw();
	double getArea();
	
}
 
/*this class will set the 
 * properties of circle and 
 * claculate the area of circle 
 */
 class Circle implements shape
 {
	 int radius;
	 public Circle(int radius)
	 {
		 this.radius=radius;
	 }
	 
	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "circle";
	}
	 /*overided method
	  * it will calculate the area of circle
	  */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area=(Math.PI)*(Math.pow(radius, 2));
		return area;
	}
 }
  /*this class will set the properties of
   * square and calculate the area of square
   */
 class Square implements shape
 {
	 int side;
	 public Square(int side)
	 {
		 this.side=side;
	 }
	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "square";
	}
	/*overided method
	  * it will calculate 
	  * the area of square
	  */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area=(Math.pow(side, 2));
		return area;
	}
 }
 /* this is the main class 
  * which will show the area 
  * of both circle and square
  */
public class Test_For_Interface {
	public static void main(String args[])
	{
		int radius,side;
		String drawing;
		double area;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter radius of circle");
		radius=Integer.parseInt(scan.nextLine());
		Circle circle=new Circle(radius);
		drawing=circle.draw();
		area=circle.getArea();
		System.out.println("Drawing Is:"+drawing);
		System.out.println("Area of "+drawing+" is:"+area+"\n");
		System.out.println("enter side of square");
		side=Integer.parseInt(scan.nextLine());
		Square square=new Square(side);
		drawing=square.draw();
		area=square.getArea();
		System.out.println("Drawing Is:"+drawing);
		System.out.println("Area of "+drawing+" is:"+area);
	}
	

}
