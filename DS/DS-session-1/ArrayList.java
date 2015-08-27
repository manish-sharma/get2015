/**array list class with definitions of all the array list functions
 * 
 * @author Gaurav
 * Date : 25/08/2015
 */

import java.util.Arrays;

public class ArrayList {
	
	public static int defaultSize = 10;									//default size of array
	public static int size=0;											//initial size
	public static Object data[] = new Object[defaultSize];				//creating objects type array
	public static int index;

	//method to add elements at the start of the list
	public  void addElements(Object value) {
		if(size == data.length )
			increaseCapacity();
		data[size++] = value;
	}
	
	//method to merge the two lists
	public void mergeList() {
		if((SecondArrayList.size + size) >= data.length )
			increaseCapacity();
		for(int i = 0; i < SecondArrayList.size; i++)
			addElements(SecondArrayList.newData[i]) ;	
		System.out.println("both lists merged");
	}
	
	//method to increase the capacity of the list if the limit exceeds
	public static void increaseCapacity() {
		int newsize = data.length * 2;
		data = Arrays.copyOf(data, newsize);
	}

	//method to find element at a given index
	public Object get(int i) {
		if(index==-1)
			return 0;
		else
			return data[i];	
	}
	
	//method to reverse the list
	public static void reverse() {
		if(data == null || data.length <= 1)
	        System.out.println("list is empty or contains only one element");
		int start = 0, end = size - 1;
		Object temp;
		while(start <= end) {
			temp = data[start];
			data[start] = data[end];
			data[end] = temp;
			start++;
			end--;
		}
		System.out.print("reversed list is : ");
		show();
	}

	//method to sort the array list
	public static void sort() {
		for(int index = 0; index < size; index++) {
			int min = (int)data[index];
			for(int index2=index+1;index2<size;index2++) {
				if (min>(int)data[index2]) {
					int temp=min;
					min=(int)data[index2];
					data[index2]=temp;
				}
			}
		data[index]=min;
		}
	}
	
	//method to add an element at given position
	public static void addElementPosition(int position, Object value) {
		int flag = 0;	
		size++;
		if(position < size)
			flag = 1;
		if(flag == 1) {
			int index1 = -1;
			Object myStore1[] = new Object[data.length - position];
			
			if(size < defaultSize) {
				for(int j=position;j<size;j++) {
					index1++;
					myStore1[index1] = data[j];
				}				
				data[position]=value;

				for(int k=0;k<index1;k++) {
					position++;
					data[position] = myStore1[k];
				}
				index++;
			}
			else {
				for(int j = position; j < size; j++) {
					index1++;
					myStore1[index1] = data[j];
				}
				increaseCapacity();	
				data[position] = value;
				for(int k = 0; k < index1; k++) {
					position++;
					data[position]=myStore1[k];
				}
				index++;
			}
		}
		else {
			System.out.println("Array index out of bound");
			size--;
		}
	}	 
	
	//method to find the first occurrence of a given element after a given index
	public static int retrieveFirstOccuerence(int position, Object value) {
		int index1 = 0, flag = -1;
		position++;
		for (int i = position; i < size; i++) {
		    if (data[i]==value) {
		    	flag = 0;
		    	index1 = i;
		    	break;
		    }
		}

		if (flag == 0)
			return index1;
		else
			return flag;
	}

	//method to find the first occurrence of a given element
	public static int retrieveFirstIndexOfParticularItem(Object value) {
		int index2 = 0, flag = -1;
		for(int i = 0; i < size; i++) {
			if(data[i] == value) {
				flag = 1;
				index2 = i;
				break;
			}
		}
		
		if(flag==1)
			return index2;
		else
			return flag;
	}	 

	//method to remove an element at a given position
	public static void removePosition(int position) {
		if(position >= size)
			System.out.println("Array index out of bound");
		else {
	        for(int i = position + 1; i < size; i++)
	        	data[i-1] = data[i];
	        size--;
	        index--;
	        System.out.println("Item deleted from index "+ position);
		}
	}

	//method to remove a given element from the list
	public static void removeValue(Object value) {
		int flag = 0;
		int index2 = 0;
		for(int i = 0; i < size; i++)
			if(data[i]==value) {
				flag=1;
				index2=i;
				break;
			}

		if(flag == 1) {
			for(int i = index2+1; i < size; i++) 
			    data[i-1] = data[i];
			size--;
			index--;
			System.out.println(value+" deleted");
		}
		else
			System.out.println(value+" not exist in list");
	}

	//method to empty the list
	public static void removeAll() {
		int flag = 0;
		if (size > 0)
			 flag=1;

		if(flag==1) {
			size=0;
			index=-1;
			System.out.println("All elements are removed from list");
		}
		else
			System.out.println("list is already empty");
	}

	//method to print the array list
	public static void show() {
		for(int i = 0; i < size; i++)
			System.out.print(data[i] + " ");
	}
}
