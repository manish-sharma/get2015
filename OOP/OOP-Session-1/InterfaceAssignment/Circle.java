 class Circle implements Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }  
    
    /*
     * Parameterized constructor constructor 
     * @param radius is the radius of circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /// This method return the area of circle 
    public double area() {
        // Area of circle = 2 X Radius X Radius 
        return pi * Math.pow(radius, 2);
    }

    // This method return the perimeter of circle 
    public double perimeter() {
    	// Perimeter of circle is given by 2 X pi X Radius  
        return 2 * pi * radius;
    }
}