import java.util.Arrays;

/*
 * this class 
 */
public class ArrayList_2 {
	public static int defaultSize = 10;
	public static int size=0;
	public static Object newData[] = new Object[defaultSize];
	int index = 0;

	/**
	 * this method is to add elements in list
	 * @param value... user input value
	 */
	public static void add(Object value){
		
		if(size == newData.length ){
			increaseCapacity();
		}
		
		newData[size] = value;
		
		size++;
	}
	/**
	 * this method is  to increase the size of the list
	 */
	
	public static void increaseCapacity(){
		int newsize = newData.length * 2;
		newData = Arrays.copyOf(newData, newsize);
	}
	
	/**
	 * returns the size of the list
	 * @return
	 */
	public int size() {
		
		return size;
		
	}
	
}
