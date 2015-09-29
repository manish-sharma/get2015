package com.ds1.arraylist;

import java.util.Arrays;

/**
 *  ArrayList1 class is used to make different different operations in list 2
 * @default size default size of list1
 * @size initializes with zero
 * @newData generic data to make array list
 * @index holds index value
 * @author Shishir Pareek
 *Date 25 August 2015
 *
 */
public class ArrayList2 {
	public static int defaultSize = 10;
	public static int size=0;
	public static Object newData[] = new Object[defaultSize];
	int index = 0;

	/**
	 * this method is used to add elements in list2
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
	 * this method is used to increase the size of the list2
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
