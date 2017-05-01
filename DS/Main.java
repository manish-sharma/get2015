/**
 * main class for truth table generation
 * @author Ravika
 *@since 10/5/2015
 */
public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc = null;
		TruthTableGenerator truthTableObj = null;
		try {
			String choice;
			do {
				System.out.println("Enter a String");
				sc = new java.util.Scanner(System.in);
				String input = sc.next();
				input = input.toLowerCase();
				
				if(Validation.isExpression(input)) {
					
					truthTableObj = new TruthTableGenerator();
					truthTableObj.truthTableGenerator(input);
				}
				else {
					System.out.println("Enter Valid Expression");
				}
				System.out.println("Press Y ot y to continue and any other key to exit");
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
