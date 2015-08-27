/*
 * this program is to implementing an array list using array.
 */
package assignmentDS_1;
import java.util.Arrays;


public class MyArrayList<E> 
{
	private E[] mainArray;
	private int size;
	private int currentIndex;
	
	/*
	 * This constructor is used to initialize value of class level variable
	 */
	@SuppressWarnings("unchecked")
	public MyArrayList() {
		super();
		currentIndex=0;
		this.mainArray =(E[]) new Object[10] ;
		size=10;
	}
	
	/*
	 * This function is adding an item into array list and check if list is full, then resizing that arraylist.
	 * @param ab:element that we want to add in list
	 */

	public void addElement(E ab)
	{
		if(currentIndex==size)
		{
			increaseSize();
		}
		mainArray[currentIndex]=ab;
		currentIndex++;
	}
	
	
	/*
	 * This function is adding an item into array list at specified position and check if list is full, then resizing that arraylist.
	 * @param index:location where element is to be inserting
	 * @param ab:element that have to be inserting
	 */
	
	public void addElementAt(int index,E ab)
	{
		int i=0;
		if(currentIndex==size)
		{
			increaseSize();
		}
		for(i=currentIndex;i>=index;i--)
			mainArray[i+1]=mainArray[i];
		i++;
		mainArray[i]=ab;
		currentIndex++;
	}
	
	/*
	 * This function is use to retrieve element of arraylist at specified Position
	 * @param index:location whose element is to retrieve 
	 * @return element at index position
	 */
	
	public E get(int index)
	{
		if(index<currentIndex)
			return mainArray[index];
		else throw new ArrayIndexOutOfBoundsException();
			
	}
	
	
	
	/*
	 * This function is use to retrieving the first occurrence of an item based on its given location.
	 * @param location: index after that searching will start
	 * @param item:element whose location is to find
	 * @return index of given element 
	 */
	public int RetrieveFirstOccurence(int location,E item)
	{
		int i;
		boolean temp=false;
		for(i=location;i<currentIndex;i++)
		{
			if(mainArray[i]==item)
			{
				temp=true;
				break;
			}
		}
		if(temp)
			return i;
		return -1;
		
	}
	
	/*
	 * this function is use to retrieving the first index of particular item in the arraylist.
	 * @param item:element whose first index is retrieve
	 * @return index of given element
	 */
	
	public int RetrieveFirstIndex(E item)
	{
		int i=0;
		boolean temp=false;
		for(i=0;i<currentIndex;i++)
		{
			if(mainArray[i]==item)
			{
				temp=true;
				break;
			}
		}
		if(temp)
			return i;
		return -1;
		
		
	}
	
	/*
	 * This function is use to removing an item based on particular location
	 * @param location:index whose element is to retrieve

	 */
	
	public void RemoveByLocation(int location)
	{
	
		for(int i=location;i<currentIndex-1;i++)
		{
			mainArray[i]=mainArray[i+1];
		}
		currentIndex--;
		
	}
	
	
	/*
	 * This function is use to remove all occurrence of given particular item from the arraylist  
	 * @param ab:element whose all occurrence is to remove
	 */
	
	public void RemoveByValue(E ab)
	{
		for(int i=0;i<currentIndex;i++)
		{
			if(mainArray[i]==ab)
			{
				for(int j=i;j<currentIndex-1;j++)
				{
					mainArray[j]=mainArray[j+1];
				}
				currentIndex--;
				i--;
			}
		}
	}
	
	
	/* 
	 * This function is used to clear the list
	 */
	public void clearlist()
	{
		currentIndex=0;
	}
	
	/*
	 * This function is use to retrieve size of arraylist
	 */
	
	public int size()
	{
		return currentIndex;
	}
	
	/*
	 * this function is use to reversing the arraylist.
	 */
	public void reverse()
	{
		int i,j;
		for(i=0,j=currentIndex-1;i<j;i++,j--)
		{
			E temp=mainArray[i];
			mainArray[i]=mainArray[j];
			mainArray[j]=temp;
		}
	}
	
	/* 
	 * This function is use to show elements of arraylist.
	 */
	
	public void showElement()
	{
		for(int i=0;i<currentIndex;i++)
		  System.out.println(mainArray[i]);
	}
	
	/*
	 * This function is use to  add another list anotherList to the first list. So the resultant list must contain now all the
       elements of its own list and in addition to the elements contained in anotherList.
       @param anotherList:this is the list which is to add in current list

	 */

	public void addList(MyArrayList<E> anotherList)
	{
		for(int i=0;i<anotherList.size();i++)
		{
			if(currentIndex==size)
			{
				increaseSize();
			}
			mainArray[currentIndex]=anotherList.get(i);
			currentIndex++;
			
		}
		
	}
	/*
	 * this function is use to increase size of arraylist by 5 when the list become full.
	 */
	
	public void  increaseSize()
	{
		E[] arr2 = Arrays.copyOf(mainArray, mainArray.length+5);
		mainArray= arr2;
		size=mainArray.length;
		
	}
	
	
	public static void main(String args[])
	{
		
		MyArrayList <Integer>myArrayList=new MyArrayList<>();
		
		myArrayList.addElement(2);myArrayList.addElement(3);myArrayList.addElement(4);myArrayList.addElement(5);myArrayList.addElement(6);
		myArrayList.addElement(7);myArrayList.addElement(8);myArrayList.addElement(9);myArrayList.addElement(10);myArrayList.addElement(11);
		
		myArrayList.addElementAt(6, 8);
		
	    int j=myArrayList.RetrieveFirstIndex(3);
	    System.out.println("First index of 3 is "+j);
	    
		j=myArrayList.RetrieveFirstOccurence(3, 5);
		System.out.println("index of 5 after location 3 is "+j);
		
		myArrayList.RemoveByValue(8);
		myArrayList.showElement();
		
		myArrayList.reverse();
		myArrayList.showElement();
		
	
	
		MyArrayList <Integer>newList=new MyArrayList<>();
		newList.addElement(98);newList.addElement(97);newList.addElement(96);newList.addElement(95);
		
		myArrayList.addList(newList);
		myArrayList.showElement();
		
		
		
		
	}

}

