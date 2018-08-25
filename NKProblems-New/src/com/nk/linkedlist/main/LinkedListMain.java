package com.nk.linkedlist.main;

import com.nk.linkedlist.core.MyLinkedList;

public class LinkedListMain
{
	public static void main(String args[])
	{
		MyLinkedList list  = new MyLinkedList();
		
//		insertOpAtTop(list);
		insertOpAtLast(list);
		list.printAll();
		
	}
	
	public static void insertOpAtTop(MyLinkedList list)
	{
		list.addAtTop(20);
		list.addAtTop(30);
		list.addAtTop(50);
		list.addAtTop(60);
	}
	
	public static void insertOpAtLast(MyLinkedList list)
	{
		list.addAtLast(20);
		list.addAtLast(30);
		list.addAtLast(50);
		list.addAtLast(60);
	}
}
