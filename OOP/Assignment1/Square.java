package oop1;

public class Square implements Shape{
	private double side;
	public Square(double side){
		this.side = side;
	}
	public void draw(){
		// Square drawing logic
		System.out.println("Square is drawn with side: "+side);
	}
	public double getArea(){// Square area calculation
		double area=side*side;
    	return area;
	}
}

