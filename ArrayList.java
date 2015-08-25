import java.util.Arrays;

/**
 * ArrayList1 class is used to make different operations in list
 * @default size default size of list1
 * @author Sumitra
 */
public class ArrayList {
	
	public static int defaultSize = 10;
	public static int size=0;
	public static Object data[] = new Object[defaultSize];
	
	public static int index;
	
	/**
	 * this method is  add elements in the list
	 * @param value... user input value
	 */
	public  void add(Object value){
		if(size == data.length ){
			increaseCapacity();
		}
		data[size++] = value;
	
		
	}
	/**
	 * this method is used to merge the list1 and list2
	 */
	public void merge(){
		if((ArrayList_2.size + size) >= data.length ){
			increaseCapacity();
		}
		for(int i = 0; i < ArrayList_2.size;i++)
		add(ArrayList_2.newData[i]) ;
		//size++;
		System.out.println("both list merged");
		
	}
	public static void increaseCapacity(){
		int newsize = data.length * 2;
		data = Arrays.copyOf(data, newsize);
	}
	
	/**this method is used to retrieve the element at particular position
	 */
	public Object get(int i) {
		if(index==-1){
			return 0;
		}
		else
		return data[i];
		
	}
	/**
	 * this method print the reverse of the list
	 */
	public  static void reverse() {
		  if(data == null || data.length <= 1){
	            System.out.println("either list is empty or have one element");
	        }       
	        
	        for (int i = 0; i < data.length / 2; i++) {
	            Object temp = data[i]; // swap numbers
	            data[i] = data[data.length - 1 - i];
	            data[data.length - 1 - i] = temp;
	        }
	        System.out.println("Array is reversed  " );
	        
	}
	/**
	 * this method is to add element at given index
	 * @param position index value
	 * @param value input value
	 */
	 public static void add(int position, Object value) {
			// TODO Auto-generated method stub
		 int flag=0;	
		 size++;
		if(position < size){
			flag=1;
		}
		if(flag==1){
		int index1=-1;
			Object myStore1[]=new Object[data.length-position];
			
		if(size<defaultSize){
			for(int j=position;j<size;j++){
				index1++;
				myStore1[index1]=data[j];	
			}
				
			data[position]=value;
			for(int k=0;k<index1;k++){
				 position++;
				data[position]=myStore1[k];
			}
			index++;
			}
		else{
			for(int j=position;j<size;j++){
				index1++;
				myStore1[index1]=data[j];	
			}
			increaseCapacity();
				
			data[position]=value;
			for(int k=0;k<index1;k++){
				position++;
				data[position]=myStore1[k];
			}
			index++;
			}
			}
		else{
			System.out.println("Array index out of bound");
			size--;
			}
	 }
	 
	 /**
	  * this method is retrieve the first occurrence of the value at the given position
	  * @param position from where the occurrence is to be find
	  * @param value 
	  * @return returns the index value
	  */
	 public static int retrieveFirstOccuerence(int position,Object value)
	 {
		 int index1 = 0,flag=-1;
		  position++;
		 for(int i=position; i < size; i++){
		    	if(data[i]==value){
		    		flag=0;
		    		index1=i;
		    		break;
		    	}
		  }
		 if(flag==0){
			return index1;
		 }
		 else{
			return flag;
		 }
	 }
/**
 * this method is used to retrieve the first coming index in the array list
 * @param value scan value from user whom occurrence is to be find
 * @return return the index of value at first occurrence 
 */
	 public static int retrieveFirstIndexOfParticularItem(Object value) {
			// TODO Auto-generated method stub
			int index2 = 0,flag = -1;
			for(int i = 0; i < size; i++){
				if(data[i]==value){
					flag=1;
					index2=i;
					break;
				}
			}
			if(flag==1){
				return index2;
				
			}
			else{
				return flag;
			}
		}
	 
	 /**
	  * this method is  to remove element at given position
	  * @param position  element is to removed
	  */
	 public static void remove(int position) {
			// TODO Auto-generated method stub
			if(position >= size){
				System.out.println("Array index out of bound");
			}
			else{
	        for(int i = position+1; i < size; i++)
	        {
	        	data[i-1] = data[i];
	        	
	        }
	        size--;
	        index--;
	        System.out.println("Item deleted from index "+ position);
			}
		}
	 /**
	  * this method removes the user input value
	  * @param value value given by user
	  */
	 
	 public static void removeValue(Object value) {
			// TODO Auto-generated method stub
			int flag = 0;
			int index2 = 0;
			for(int i = 0; i < size;i++){
				if(data[i]==value){
					flag=1;
					index2=i;
					break;
				}
			}
			if(flag == 1){
				 for(int i = index2+1; i < size; i++) {
			        	data[i-1] = data[i];
			        }
			     size--;
			     index--;
			     System.out.println(value+" deleted");
			}
			else{
				System.out.println(value+" not exist in list");
			}
		}
	 /**
	  * this method removes the whole list
	  */
	 public static void removeAll() {
			int flag=0;
			if(size>0){
			 flag=1;
			 
			}
			if(flag==1){
				size=0;
				index=-1;
				System.out.println("All elewments are removed from list");
			}
			else
			  System.out.println("list is already empty");
		}
	 public static void show(){
		 for(int i = 0; i < size; i++){
			 System.out.println(data[i]);
		 }
	 }

}
