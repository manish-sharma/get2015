package assignmentDS_2;

public class mainForStack {
	public static void main(String args[])
	{
		InfixToPostfix infixToPostfix=new InfixToPostfix();
		String postFix=infixToPostfix.infix2Postfix("(a+b)*v/(c-n)f^g");
		System.out.println("Postfix is "+postFix);
	
		
		
	}

}
