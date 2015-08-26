/*Here we implement Interface Concept. Shape is interface and there are two classes Circle and Square which implement this interface.
 * These two class also override functions of this interface.
 .
* @author  Neha Bansal
* @version 1.0
* @since   2015-08-14
*/
package assignmentOOP_1;

public interface Shape {
	void draw();
	double getArea();

}


class Circle implements Shape
{
	private int radius;
	private double area;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	/* (non-Javadoc)
	 * @see assignmentOOP_1.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}

	/* (non-Javadoc)
	 * @see assignmentOOP_1.Shape#getArea()
	 */
	@Override
	public double getArea() {
		area=radius*radius*Math.PI;
		return area;
	}
	

}
 class Square implements Shape
{
	private double side;
	private double area;
	
	
	public Square(double side) {
		super();
		this.side = side;
		
	}
	/* (non-Javadoc)
	 * @see assignmentOOP_1.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Drawing Square");
		
	}
	/* (non-Javadoc)
	 * @see assignmentOOP_1.Shape#getArea()
	 */
	@Override
	public double getArea() {
		area=side*side;
				return area;
	}
	

}
