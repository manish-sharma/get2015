package com;

public class Node <T>{
	public T nodeValue;
	public Node <T> left;
	public Node<T> right;
	public Node() {
	nodeValue= null;
	left = null;
	right =null;
	}
	public Node( T item) {
		nodeValue= item;
		left = null;
		right =null;
		}
}
