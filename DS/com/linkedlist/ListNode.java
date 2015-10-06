/**
 * @author Pooja Khandelwal
 * @created date 10/06/2015
 * @name ListNode
 * @description it will create a node for a generalized list element
 */
package com.linkedlist;

public class ListNode {
	int flag;
	Object data;
	ListNode next;

	/**
	 * @name getFlag()
	 * @description it returns the flag field value of a node
	 * @param
	 * @return flag
	 */
	public int getFlag() {
		return flag;
	}

	/**
	 * @name setFlag()
	 * @description it will set the value of a flag field of a new node
	 * @param flag
	 * @return
	 */
	public void setFlag(int flag) {
		this.flag = flag;
	}

	/**
	 * @name getData()
	 * @description it returns the data field value of a node
	 * @param
	 * @return data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @name setData()
	 * @description it will set the value of a data field of a new node
	 * @param data
	 * @return
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @name getNext()
	 * @description it returns the next pointer field value of a node
	 * @param
	 * @return next
	 */
	public ListNode getNext() {
		return next;
	}

	/**
	 * @name setNext()
	 * @description it will set the value of a next pointer field of a new node
	 * @param next
	 * @return
	 */
	public void setNext(ListNode next) {
		this.next = next;
	}

	/**
	 * @name toString()
	 * @description it returns the list nodes a string
	 * @param
	 * @return string
	 */
	@Override
	public String toString() {
		return "ListNode [flag=" + flag + ", data=" + data + ", next=" + next
				+ "]";
	}
}
