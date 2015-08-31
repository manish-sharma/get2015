/**
 * 
 * @author Ravika
 *@since 8/25/2015
 */
public class ArrayList {
	private int[] array;
	private int size;
	public ArrayList() {
		// TODO Auto-generated constructor stub
		array = new int[10];
	}
	
	/**
	 * purpose : add the item in list
	 * @param item = that you want to add
	 * @return true if item is added,otherwise false
	 */
	public boolean add(int element) {
		if(array.length == size) {
			int[] arrayTemp = array;
			array = new int[size +10];
			for(int count =0 ;count < size;count++) {
				array[count] = arrayTemp[count];
			}
		}
		array[size] = element;
		size++;
		return true;
	}
	/**
	 * purpose : add the item in list at given position
	 * @param location = position where you want to add item
	 * @param item = that will be added
	 * @return true if item is added,otherwise false
	 */
	public boolean add(int index, int element) {
		if(index < 0 || index >size()) {
			System.out.println("ArrayIndexOutOfBound");
			return false;
		}
		int[] arrayTemp = new int[size()];
		if(array.length == size) {
			for(int count =0 ;count < size;count++) {
				arrayTemp[count] = array[count];
			}
			array = new int[size +10];
		} else {
			for(int count =0 ;count < size;count++) {
				arrayTemp[count] = array[count];
			}
		}
		for(int count =0; count < index; count++){
			array[count] = arrayTemp[count];
		}
		array[index] = element;
		
		for(int count = index+1; count<=size(); count++) {
			array[count] = arrayTemp[count -1];
		}
		size++;
		return true;
		
	}
	/**
	 * purpose: to get size of list
	 * @return size
	 */
	public int size() {
		return size;
	}
	/**
	 * purpose : to get the first occurrence of element
	 * @param location = from this position the checking will start
	 * @param element = it's occurrence will be checked
	 * @return index
	 */
	public int firstOccurrence(int location, int element) {
		if(location < 0 || location >size()) {
			System.out.println("ArrayIndexOutOfBound");
			return -1;
		}
		int index = -1;
		for(int count = 0 ; count <size(); count++) {
			if(array[count] == element) {
				index = count;
				break;
			}
		}
		return index;
	}
	/**
	 * purpose : to get the first occurrence of element in the list
	 * @param element = it's occurrence will be checked
	 * @return index
	 */
	
	public int firstOccurrence(int element) {
		int index = -1;
		for(int count = 0 ; count <size(); count++) {
			if(array[count] == element) {
				index = count;
				break;
			}
		}
		return index;
	}
	
	/**
	 * purpose: remove particular index 
	 * @param index = at it item will be removed
	 * @return true if item is removed,otherwise false
	 */
	public boolean removeAt(int location) {
		if(location < 0 || location >size()) {
			System.out.println("ArrayIndexOutOfBound");
			return false;
		}
		for(int count = location; count < size()-1;count++) {
			array[count] = array[count +1 ];
		}
		size--;
		return true;
	}
	
	/**
	 * purpose: remove particular item 
	 * @param item = that will be removed
	 * @return true if item is removed,otherwise false
	 */
	public boolean remove(int item) {
		int index = -1;
		for(int count = 0 ; count <size(); count++) {
			if(array[count] == item) {
				index = count;
				removeAt(count);
				count--;
				size--;
			}
		}
		if(index == -1) {
			return false;
		}
		return true;
	}
	
	public void clear() {
		array = new int[10];
		size = 0;		
	}
	
	/**
	 * purpose: reverse the list
	 * @return array
	 */
	public int[] reverse() {
		int temp =0;
		for(int count = 0; count < size()/2; count++) {
			temp = array[count];
			array[count] = array[size - count - 1];
			array[size - count - 1] = temp;
		}
		return array;
	}
	/**
	 * purpose: sort the list
	 */
	public void sort() {
		new QuickSort().quickSort(array, 0, size());
	}
	private int elementAt(int index) {
		return array[index];
	}
	public void addAll(ArrayList list2) {
		for(int count = 0; count < list2.size(); count++) {
			add(list2.elementAt(count));
		}
		
	}
	/**
	  * purpose: print the data of the list
	  */
	void printList(){
		for(int count = 0 ;count < size(); count++) {
			System.out.println(array[count]);
		}
	}
	/**
	 * purpose : to perform all the operation
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		for(int count =0;count<=12;count++) {
			arrayList.add(count);
		}
		arrayList.add(13);
		arrayList.printList();
		
		arrayList.add(3,13);
		arrayList.printList(); 
		
		arrayList.removeAt(4);
		arrayList.printList();
		
		
		arrayList.remove(13);
		arrayList.printList();

		arrayList.reverse();
		arrayList.printList();
		
		arrayList.sort();
		arrayList.printList();
		ArrayList arrayList2 = new ArrayList();
		arrayList2.add(16);
		arrayList2.add(17);
		
		arrayList.addAll(arrayList2);
		arrayList.printList();
	}
}
