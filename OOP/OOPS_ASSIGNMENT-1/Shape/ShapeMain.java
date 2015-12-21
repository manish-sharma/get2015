package Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeMain
{
	static void printShape(Shape shape)
	{
		System.out.println("Area: "+shape.getArea());
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int radius,side;
		try
		{
		
		List<Shape> shape = new ArrayList<Shape>();
		
		System.out.print("Enter any value:\n1.Circle\n2.Square\n3.Exit\n");
		int n=sc.nextInt();
		
		
		switch (n)
		{
		case 1:  System.out.print("Enter radius of circle: ");
		         radius=sc.nextInt();
		         
		         Shape circleShape =new Circle(radius);
		         printShape(circleShape); 
		         shape.add(circleShape);
		         circleShape.draw();
			
			     break;
			    
        case 2: System.out.print("Enter side of square: ");
                side=sc.nextInt();
         
                Shape squareShape = new Square(side);
		        printShape(squareShape);
		        shape.add(squareShape);
		        squareShape.draw();
		        
			    break;
			    
       case 3:  sc.close();
    	        return;
			
		default: System.out.print("Please Enter a valid value");
			     break;
		
		  }
          sc.close();
		}catch(Exception e)
		{
			System.out.print(e);
			
		}
		
	}

}
