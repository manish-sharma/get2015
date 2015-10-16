package com.BinarySearch;

/**
 * this method is for tree node type t
 * @author Sumitra
 *
 * @param <T>
 */
public class Node <T>{
	public T nodeValue1;
	public String nodeValue2;
	public Node <T> left;
	public Node<T> right;
	public Node() {
	nodeValue1= null;
	nodeValue2= null;
	left = null;
	right =null;
	}
	public Node( T item1,String item2) {
		nodeValue1= item1;
		nodeValue2=  item2;
		left = null;
		right =null;
		}
}
