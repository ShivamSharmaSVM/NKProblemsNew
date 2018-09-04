/*
 * Problem-31 : Given Two Linked Lists, how to merge them into the third list in sorted list(Recursively). 
 */
package com.nk.linkedlist.problems;

import com.nk.linkedlist.core.MyLinkedList;
import com.nk.linkedlist.core.Node;

public class SortedLinkedListMergeRecur
{
	public static void main(String args[])
	{
		MyLinkedList<Integer> list1 = new MyLinkedList<>();
		list1.addAtLast(10);
		list1.addAtLast(13);
		list1.addAtLast(15);
		list1.addAtLast(33);

		MyLinkedList<Integer> list2 = new MyLinkedList<>();
		list2.addAtLast(10);
		list2.addAtLast(20);
		list2.addAtLast(30);
		list2.addAtLast(45);
		
		list1.printAll();
		list2.printAll();
		
		Node<Integer> start = MergeList(list1.head, list2.head);
		
		MyLinkedList.printAll(start); 
	}

	public static Node<Integer> MergeList(Node<Integer> aHead, Node<Integer> bHead)
	{
		Node<Integer> result = new Node<Integer>();
		if (aHead == null)
			return bHead;

		if (bHead == null)
			return aHead;

		if (aHead.data <= bHead.data)
		{
			result.data = aHead.data;
			result.next = MergeList(aHead.next, bHead);
		} else
		{
			result.data = bHead.data;
			result.next = MergeList(aHead, bHead.next);
		}

		return result;
	}
}
