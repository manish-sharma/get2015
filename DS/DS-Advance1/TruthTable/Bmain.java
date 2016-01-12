
public class Bmain {

	public static void main(String[] args) {
		
		System.out.println("Enter a String");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input = sc.next();
		input = input.toLowerCase();
		if(Validation.isExpression(input))
		{
			TruthTableGenerator truthTableObj = new TruthTableGenerator();
			truthTableObj.truthTableGenerator(input);
		}
		else 
		{
			System.out.println("Enter Valid Expression");
		}
		sc.close();
	}
}
