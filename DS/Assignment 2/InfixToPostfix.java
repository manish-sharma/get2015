/****************************************************************************************
Name            : InfixToPostfix
Revision Log    : 2015-08-27: Babalu patidar : created.
                : 
                : 
Use             : This class is used to perform infix to postfix.
                :
****************************************************************************************/
import java.util.Scanner;

public class InfixToPostfix extends StackUsingLinkList {
	
	
	
	@SuppressWarnings("static-access")
	
	//Main method is used to convert infix to postfix.
	public static void main(String ad[]){
		
		StackUsingLinkList stack=new StackUsingLinkList(); 
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter proper infix string");
		String infix=scan.next();
		String postfix ="";
		InfixToPostfix ob=new InfixToPostfix();
		
		int len=infix.length();
		
		//For loop is used to read entire infix string and evaluate that
		for(int i=0 ; i<len ;i++)
		{
			char ch=infix.charAt(i);
			if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
				postfix+=',';
				if( stack.top==null){
					//Push in to the stack
					stack.push(ch);
					
				}
				else if(ob.precedence(ch)>ob.precedence((char)  stack.top.object)){
					stack.push(ch);
					
					
				}
				else {
					while(stack.top!=null&&ob.precedence(ch)<ob.precedence((char)  stack.top.object)){
							postfix+=","+stack.top.object;
							//pop from stack
							stack.pop();
							
					}
					stack.push(ch);
				}	
			}
			else if(ch=='('){
				stack.push(ch);
			}
			
			else if(ch==')'){
				while((char) stack.top.object!='('){
					postfix+=","+stack.top.object;
					stack.pop();
					
				}
				stack.pop();
				
			}
			else {
				postfix+=ch;
			}
		}
		//End of for loop
		
		//While loop is used for pop remaining stack
		while(stack.top!=null){
			

		postfix+=","+stack.top.object;
		stack.pop();
		}
		
		System.out.print("Postfix Expression is : "+postfix);
	
		scan.close();
		
	}
	//End of main
	
	//precedence method is used for define precedence of operator
	public int precedence(char ch){
		int output=0;
		if(ch=='+'||ch=='-'){
			output= 1;
		}
		else if(ch=='*'||ch=='/'){
			output= 2;
		}
		return output;
	}

}
//End of class
