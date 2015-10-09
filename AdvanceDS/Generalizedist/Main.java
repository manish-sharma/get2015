
public class Main {
	public static void main(String args[]) {
		//AdvanceList list = new	AdvanceList();
			try {
				AdvanceList list = new	AdvanceList("(11,12,(7,(34,54)))");
				System.out.println("Maximum value is "+list.getMax());
				System.out.println("Sum is "+list.getSum());
				System.out.println(list.find(7));
			} catch (MyException e) {
			}
	}
}
