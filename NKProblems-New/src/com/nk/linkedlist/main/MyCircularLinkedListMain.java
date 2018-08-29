package com.nk.linkedlist.main;

import com.nk.linkedlist.core.MyCircularLinkedList;
import com.nk.linkedlist.exceptions.InvalidOperationException;

public class MyCircularLinkedListMain
{
	public static void main(String args[]) throws InvalidOperationException
	{
		MyCircularLinkedList<Integer> list  = new MyCircularLinkedList<Integer>();
		
		insertOpAtTop(list);
//		insertOpAtLast(list);
//		System.out.println(list.length);
//		insertOpAt(list);	
		list.printAll();
		delete(list);
		list.printAll();
//		delete(list);
		
	}
	
	public static void insertOpAtTop(MyCircularLinkedList<Integer> list)
	{
		list.addAtTop(20);
		list.addAtTop(30);
		list.addAtTop(50);
		list.addAtTop(60);
	}
	
	public static void insertOpAtLast(MyCircularLinkedList<Integer> list)
	{
		list.addAtLast(20);
		list.addAtLast(30);
		list.addAtLast(50);
		list.addAtLast(60);
	}
	
	public static void insertOpAt(MyCircularLinkedList<Integer> list) throws InvalidOperationException
	{
		list.addAt(20,1);
		list.addAt(30,2);
		list.addAt(50,2);
		list.addAt(60,4);
	}
	
	public static void delete(MyCircularLinkedList<Integer> list) throws InvalidOperationException
	{
		list.deleteAt(1);
		list.deleteAtLast();
		list.deleteAtTop();
		list.deleteAt(1);
	}
}
