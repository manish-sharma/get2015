
public class StackOperation<T> {
	
	public StackNode<T> pushData(StackNode<T> Top ,T data)
	{
		StackNode<T> newNode = new StackNode<T>(data);
		if(isEmpty(Top))
			Top=newNode;
		
		else			
		{	
			newNode.setNextNode(Top);
			Top=newNode;
		}
		StackNode.setSize(StackNode.getSize()+1);
		System.out.println();
		return Top;
	}
	
	public StackNode<T> popData(StackNode<T> Top)
	{
		if(isEmpty(Top))
		{
			System.out.println("Stack is empty");
			return null;
		}
		StackNode<T> temp=Top.getNextNode();
		StackNode.setSize(StackNode.getSize()-1);
		Top=temp;
		return Top;
	}
	
	public void display(StackNode<T> Top)
	{
		if (StackNode.getSize() == 0) 
		{
			System.out.println("Stack is Empty");
			return;
		}
		StackNode<T> head = Top;
		while (head != null) 
		{
			System.out.print(head.getData() + " ");
			head = head.getNextNode();
		}
		System.out.println();
		System.out.println("size is "+StackNode.getSize());
	}
	
	public boolean isEmpty(StackNode<T> node)
	{
		return node==null;
	}
	
	
}
