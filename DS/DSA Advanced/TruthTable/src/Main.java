
public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc = null;
		int result = -1;
		TruthTableGenerator truthTableObj = null;
		try {
			/* choice will hold choice of user */
			String choice;
			do {
				System.out.println("Enter a String");
				sc = new java.util.Scanner(System.in);
				/* input will contain infix expression */
				String input = sc.next();
				/* converting whole expression to lower case */
				input = input.toLowerCase();
				truthTableObj = new TruthTableGenerator();
				result = truthTableObj.truthTableGenerator(input);
				if(result == 1)
					System.out.println("Successfully created");
				else if(result == 0)
					System.out.println("String is empty or null");
				else if(result == -1)
					System.out.println("Invalid expression");
				else
					System.out.println("Some problem occcuy"
							+ "rred");
				System.out.println("Press Y ot y to continue and any other key to exit");
				/* taking user's choice as input */
				choice = sc.next();
				if(!(choice.charAt(0) == 'Y' || choice.charAt(0) == 'y')) {
					System.out.println("System Exit");
					System.exit(0);
				}
			} while(true);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			sc.close();
		}
	}
}
