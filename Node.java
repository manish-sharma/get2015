package com;

	public class Node<T> {
        public T data ;
        public Node<T> next = null;
        
        
public Node(){
	  		data=null;
	  		next=null;
	  		}
public  Node (T item){
	  		data = item;
	  		next = null;
	}

}
