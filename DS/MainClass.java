package Com.AdvanceDS.Question1;

import java.util.Scanner;

public class MainClass {
 static Scanner scan = new  Scanner(System.in);

public static void main(String[] args) {
	
	System.out.println("Enter the  list in  format as shown \n (x,y,(z,a),b,c,d,(e)) \n Note :-no space allowed");
	String input=scan.next();
	if(!List.isInputValid(input)){
		System.out.println("Enter the list in  valid format");
	
	}
	else{
		List list = new List(input);
		int choice=0;
		do{
			System.out.println("Enter 1 to display List\nEnter 2 to display max\n enter 3 to display Sum\n"
		
				+ "Enter 4 to display size\nEnter 5 to find element in list");
		while(!scan.hasNextInt()){
			System.out.println("enter integer value");
			scan.next();
		}
	     choice=scan.nextInt();
		switch(choice){
		case 1: 
		list.traverse(list.first);
		break;
		case 2:
			System.out.println("Max = " + list.max());
			break;
		case 3:
			System.out.println("Sum = " + list.sum());
			break;
		case 4:
			System.out.println("size = " + list.size());
			break;
		case 5:
			System.out.println("Enter Element to find:");
			while(!scan.hasNextInt()){
				System.out.println("enter integer value");
				scan.next();
			}
			int element =scan.nextInt();
			System.out.println(list.find(element));
		}
		}while(choice!=0);
	
}
}
}
