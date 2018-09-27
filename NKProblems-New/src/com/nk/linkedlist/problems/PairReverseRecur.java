/*
 * Problem 32 - Reverse the linked list in pairs.
 */
package com.nk.linkedlist.problems;

import com.nk.linkedlist.core.MyLinkedList;
import com.nk.linkedlist.core.Node;

public class PairReverseRecur
{
	public static void main(String args[])
	{
		MyLinkedList<Integer> list = new MyLinkedList<>();
		
		list.addAtLast(10);
		list.addAtLast(20);
		list.addAtLast(30);
		list.addAtLast(40);
		list.addAtLast(50);
		list.addAtLast(60);
		
		list.printAll();
		
		Node<Integer> start  = reverseList(list.getHead());
		MyLinkedList.printAll(start); 
	}
	
	public static Node<Integer> reverseList(Node<Integer> head)
	{
		if(head.next == null  && head.next ==null)
			return head;
		
		Node<Integer> temp = head;
		head = head.next;
		head.next = temp;
		temp.next = reverseList(temp.next);
		
		return temp;
	}
}
