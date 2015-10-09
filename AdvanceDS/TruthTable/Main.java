package TruthTable;
//This is Main class contains main method
public class Main {
	public static void main(String args[]) {
		TruthTable truthTable = new TruthTable();//object of TruthTable class
		System.out.println("Enter Expression");
java.util.Scanner sc = new java.util.Scanner(System.in);
		String input = sc.nextLine();
		try {
			System.out.println(truthTable.createTruthTable(input));
		} catch (MyException e) {
		}
		sc.close();
	}
}
