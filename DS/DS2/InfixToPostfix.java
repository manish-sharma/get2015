import java.util.Scanner;
//class to define stack properties
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
class Stack {
	char listInformationInChar;
	Stack addressOfNextNode,top;
	public Stack() {
		top=null;
	}
	public void pushAnItem(char listInformationInChar) {
		Stack node=new Stack();
		node.listInformationInChar=listInformationInChar;
		if(top==null) {
			top=node;
			node.addressOfNextNode=null;
		}
		else {
			node.addressOfNextNode=top;
			top=node;
		}
	}
	public Stack popAnItem() {
		Stack topItem=null;
		if(top==null) {
			System.out.println("Stack is Empty");
		}
		else if(top.addressOfNextNode==null) {
			topItem= top;
			top=null;
		}
		else {
			topItem=top;
			top=top.addressOfNextNode;
		}
		return topItem;
	}
	public void display() {
		if(top==null) {
			System.out.println("Stack is empty");
		}
		else {
			Stack traversingNode=top;
			while(traversingNode!=null) {
				System.out.println(traversingNode.listInformationInChar);
				traversingNode=traversingNode.addressOfNextNode;
			}
		}
	}
}
class Precedence {
	//method to return precedence of operands
	public int getPrcedence(char operand) {
		int precendendeNumber=0;
		switch(operand) {
		case '+':precendendeNumber=1;
			break;
		case '-':precendendeNumber=1;
			break;
		case '*':precendendeNumber=2;
			break;
		case '/':precendendeNumber=2;
			break;
		case '%':precendendeNumber=3;
			break;
		case ')':precendendeNumber=4;
			break;
		case '(':precendendeNumber=4;
		break;
		}
		return precendendeNumber;
	}
}
//class to convert infix to postfix
public class InfixToPostfix extends StackUsingLinkedList{
	public static void main(String args[]) {
		Stack stack=new Stack();
		Precedence precedenceObject=new Precedence();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Infix String");
		String infixString=sc.next();
		int sizeOfInfixString=infixString.length();
		int precendenceOfInfixElement,precendenceOfTopElement,counter=0;
		char currrentInfixStringCharacter,topOfStack;
		sizeOfInfixString=infixString.length();
		String postFixString="";
		while(sizeOfInfixString!=0) {
			currrentInfixStringCharacter=infixString.charAt(counter);
			counter++;
			sizeOfInfixString--;
			if((currrentInfixStringCharacter=='+'||currrentInfixStringCharacter=='-'||currrentInfixStringCharacter=='*'||currrentInfixStringCharacter=='/'||currrentInfixStringCharacter=='%') && stack.top==null) {
				stack.pushAnItem(currrentInfixStringCharacter);
			}
			else if(currrentInfixStringCharacter=='+'||currrentInfixStringCharacter=='-'||currrentInfixStringCharacter=='*'||currrentInfixStringCharacter=='/'||currrentInfixStringCharacter=='%') {
				precendenceOfInfixElement=precedenceObject.getPrcedence(currrentInfixStringCharacter);
				topOfStack=stack.top.listInformationInChar;
				precendenceOfTopElement=precedenceObject.getPrcedence(topOfStack);
				while(stack.top!=null && precendenceOfTopElement>=precendenceOfInfixElement) {
					postFixString=postFixString+stack.top.listInformationInChar;
					stack.popAnItem();
				}
				stack.pushAnItem(currrentInfixStringCharacter);
			}
			else
				postFixString=postFixString+" "+currrentInfixStringCharacter;
		}
		if(stack.top!=null) {
			while(stack.top!=null) {
				postFixString=postFixString+" "+stack.popAnItem().listInformationInChar;
			}
	}
		System.out.println(postFixString);
	}
}
