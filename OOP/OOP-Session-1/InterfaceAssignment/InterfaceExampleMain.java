import java.util.Scanner;
public class InterfaceExampleMain {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        // for rectangle 
		System.out.print("Enter the width and length of rectangle: ");
        double width = sc.nextDouble(), length = sc.nextDouble();
        
        // rectangle is object which calling parameterized constructor 
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

        //for circle 
        System.out.print("Enter the Radius of circle: ");
        double radius = sc.nextDouble();
        //circle is object which calling parameterized constructor
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.area()
            + "\nResulting Perimeter: " + circle.perimeter() + "\n");

        //  for triangle 
        System.out.print("Enter three sides of triangle: ");
        double a = sc.nextDouble(), b =sc.nextDouble(), c = sc.nextDouble();
        // triangle is object which calling parameterized constructor 
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.area()
                + "\nResulting Perimeter: " + triangle.perimeter() + "\n");
    }

}
