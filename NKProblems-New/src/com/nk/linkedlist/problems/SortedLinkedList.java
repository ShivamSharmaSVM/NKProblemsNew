/*
 * Problem 15 : Insert a node in a sorted linked list. 
 */

package com.nk.linkedlist.problems;

import com.nk.linkedlist.core.MyLinkedList;
import com.nk.linkedlist.core.Node;

class SortedLinkedList extends MyLinkedList<Integer>
{
	public static void main(String args[])
	{
		SortedLinkedList list = new SortedLinkedList();

		list.insertInSortedWay(30);
		list.insertInSortedWay(10);
		list.insertInSortedWay(40);
		list.insertInSortedWay(20);
		list.insertInSortedWay(60);
		list.printAll();
	}
	
	public void insertInSortedWay(Integer data)
	{
		Node<Integer> newNode = new Node<Integer>(data);
		if (head == null)
		{
			head = newNode;
			return;
		}

		Node<Integer> current = head;
		Node<Integer> tempNode = head;
		while (current != null && current.data < data)
		{
			tempNode = current;
			current = current.next;
		}

		
		if (current == head)
		{
			newNode.next = head;
			head = newNode;
			return;
		}
		else if(current == null)
		{
			tempNode.next = newNode;
			return;
		}
		
		newNode.next = tempNode.next;
		tempNode.next = newNode;
	}
}