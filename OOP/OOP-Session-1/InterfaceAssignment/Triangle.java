/*
 * Triangle class which inherits abstract class Shape 
 */
 class Triangle implements Shape {
	    private final double a, b, c; // sides
        
	    public Triangle() {
	        this(1,1,1);
	    }
	    
	    /*
	     * Parameterized constructor constructor 
	     * @param a,b,c are the sides of triangle
	     */
	    public Triangle(double a, double b, double c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }

	    //  This will return the area of triangle using heron,s formula 
	    public double area() {
	        /*
	           *  Heron's formula:
	           *  A = SquareRoot(s * (s - a) * (s - b) * (s - c)) 
	           *  where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle 
	        */
	        double s = (a + b + c) / 2;
	        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	    }

	    // This method return the perimeter of circle 
	    public double perimeter() {
	       // perimeter is total sum of all sides of triangle 
	        return a + b + c;
	    }
	}