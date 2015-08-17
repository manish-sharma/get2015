package oop1;

	public class Circle implements Shape{
    private double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	public void draw(){ 
	//Circle drawing logic
		System.out.println("circle is drawn with radius: "+radius);
	}
    public double getArea(){
	// Circle area calculation
    	double area=3.14*radius*radius;
    	return area;
	}
}

