package com.linked.list;

import java.util.Scanner;

public class MainClass {
	
		
		
		public static void main(String args[])
		{
			Node<Integer> newNode = new Node<Integer>();
			//Node<Integer> b = new Node<Integer>();
			//int result;
			
			System.out.println("How many nodes you want to create in a singly linked list");
			int n,data;
			Scanner scanner=new Scanner(System.in);
			n=scanner.nextInt();
			for(int i=0;i<n;i++){
				System.out.println("Enter new node value");
				data=scanner.nextInt();
				newNode.add(data);
			}
			
			//a.add(0);
			//a.add(7);
			newNode.display();
		    System.out.println("Enter position where you want to add the new node");
		    int pos=scanner.nextInt();
		    System.out.println("Enter new node value");
		    data=scanner.nextInt();
			newNode.addAtPostion(pos, data);
			newNode.display();
				System.out.println("Enter value which you want to delete");
			    int deleteValue=scanner.nextInt();
			if(newNode.deleteByValue(deleteValue))
			{
				System.out.println(deleteValue+" deleted from linked list");
			}
			else{
				System.out.println("no such type of number Exist");
			}
		    //System.out.println("");
			newNode.display();
			System.out.println("");
			 System.out.println("Enter index from where you want to delete an item");
			 pos=scanner.nextInt();
			 if(newNode. deleteByIndex(pos))
				{
					System.out.println("data deleted from index "+pos);
				}
			
			newNode.display();
			System.out.println("Enter pos from where you want to retrieve the data");
			pos=scanner.nextInt();
			System.out.println(newNode.getitem(pos));
			newNode.reverseLinkedList();
			System.out.println("Reversed list is :");
			newNode.display();
			newNode.sortList();
			System.out.println("Sorted list is :");
			newNode.display();
		}
}
