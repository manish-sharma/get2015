/* Rectangle class which inherits abstract class Shape */
class Rectangle implements Shape {
	//sides of rectangle 
    private final double width, length;
    public Rectangle() {
        this(1,1);
    }
    
    // Parameterized constructor constructor 
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public double area() {
        // Area of rectangle = width X Length 
        return width * length;
    }


    public double perimeter() {
    	// Area of rectangle = 2(width + Length) 
        return 2 * (width + length);
    }

}