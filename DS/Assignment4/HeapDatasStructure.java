import java.util.ArrayList;
import java.util.List;


public class HeapDatasStructure {
	
	public List<Integer> heapArray;
	public static  int size;
	
	
	public List<Integer> getHeapArray() {
		return heapArray;
	}
	public void setHeapArray(List<Integer> heapArray) {
		this.heapArray = heapArray;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		HeapDatasStructure.size = size;
	}
	public HeapDatasStructure() {
		
		size=0;
		heapArray=new ArrayList<Integer>();
	}
	public int getLeftChild(int parent)
	{
		if(parent < 0)
			return -1;
		int leftChild= 2*parent + 1;
		if(leftChild>=size)
			return -1;
		return leftChild;
	}
	public int getRightChild(int parent)
	{
		if(parent<0)
			return -1;
		int rightChild= 2*parent+1;
		if(rightChild>=size)
			return -1;
		return rightChild;
	}
	public void insertInHeap(int data)
	{
		
		heapArray.add(data);
		setSize(heapArray.size());
		bubbleUp(size-1);
	}
	
	public int getParent(int child)
	{
		if(child<=0)
			return -1;
		
		return (child-1)/2;
	}
	public int extractRootNode()
	{
		if(size==0)
		{
			System.out.println("List is empty");
			return -1;
		}
		int rootData=heapArray.get(0);
		heapArray.set(0,heapArray.get(size-1));
		heapArray.remove(size-1);
		setSize(heapArray.size());
		heapify(0);
		return rootData;
		
	}
	public void display()
	{
		if(size==0)
		{
			System.out.println("List is empty");
			return;
		}
		for(int index=0;index<size;index++)
			System.out.println("Jobs is "+heapArray.get(index));
		
	}
	public void bubbleUp(int child)
	{
		int parent=getParent(child);
			if(child<=0)
				return;
			else if(heapArray.get(parent)<heapArray.get(child))
			{
				int temp=heapArray.get(parent);
				heapArray.set(parent, heapArray.get(child));
				heapArray.set(child,temp);
			}
			else 
				return;
			bubbleUp(parent);
	}
	public void heapify(int parent)
	{
		int largest =parent;
		int leftChild =getLeftChild(parent);      
		int rightChild =getRightChild(parent); 
		if(leftChild==-1&&rightChild==-1)
			return ;
		if(leftChild!=-1&&heapArray.get(leftChild) > heapArray.get(largest))
						largest =leftChild;      
		if(rightChild!=-1 && heapArray.get(rightChild) > heapArray.get(largest))
		         largest=rightChild;
		
		
		if(largest!= parent)
		{
			int temp=heapArray.get(parent);
			heapArray.set(parent,heapArray.get(largest));
			heapArray.set(largest,temp);
			
		}
		else if(largest==parent)
			return;
		
		heapify(largest);  //Recursive call to adjust heap property
	}
}
