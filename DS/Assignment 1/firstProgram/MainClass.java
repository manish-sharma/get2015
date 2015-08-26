package firstProgram;
import java.util.Scanner;


public class MainClass {

	 public static void main(String a[]){
		 Scanner sc=new Scanner(System.in);
		 int y=1;
		do
		{
		 MenuList menuList=new MenuList();
		 System.out.println("Press 1 to continue");
		 y=sc.nextInt();
		}while(y==1);
	 }
}
