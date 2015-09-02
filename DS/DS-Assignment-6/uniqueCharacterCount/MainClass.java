package uniqueCharacterCount;

import java.util.Scanner;

public class MainClass {

	private static Scanner scanner;

	public static void main(String[] args) {
		UniqueCharacter  uniqueCharacter=new UniqueCharacter();
		scanner = new Scanner(System.in);
		while (true) {
            //input by user
			System.out.print("Enter a string  ");
			String string=scanner.next();
			//unique string method call
			String uniqueString=uniqueCharacter.uniqueCharacterCounting(string);
			System.out.println("Unique character in String '"+string+"' =  "+uniqueString);
		}
	}

}
