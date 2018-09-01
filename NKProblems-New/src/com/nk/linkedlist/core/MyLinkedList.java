package com.nk.linkedlist.core;

import com.nk.linkedlist.core.MyList.Node;
import com.nk.linkedlist.exceptions.InvalidOperationException;

public class MyLinkedList<T> extends MyList<T>
{
	protected Node head=null;
	
	protected class Node
	{
		public T data;
		public Node next;
		
		public Node(T data)
		{
			this.data = data;
			next = null;
		}
		
		@Override
		public String toString()
		{
			return "["+data+"]";
		}
	}
	
	public void addAtTop(T data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void addAtLast(T data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		

		Node tempNode = head;
		while(tempNode.next != null)
		{
			tempNode = tempNode.next;
		}
		tempNode.next = newNode;
	}
	
	public void addAt(T data, int pos) throws InvalidOperationException
	{
		if(pos<1)
			throw new InvalidOperationException("Invalid position");
		
		Node tempHead = head;
		Node newNode = new Node(data);
		int cursor = 1;
		
		if(head == null)
		{
			if(pos == 1)
			{
				head = newNode;
				return;
			}
			
			throw new InvalidOperationException("Linked list too small to add at given position.");
		}
			
		while(cursor<pos-1 && tempHead.next != null)
		{
			cursor++;
			tempHead = tempHead.next;			
		}
		
		if(cursor == pos-1)
		{
			newNode.next = tempHead.next;
			tempHead.next = newNode;
			return;
		}
		else
		  throw new InvalidOperationException("Invalid position");
	}
	
	public void deleteAtTop()
	{
		if(head == null)
		{
			System.out.println("List is already empty");
			return;
		}
		System.out.println("Deleting node "+head);
		head = head.next;
	}
	
	public void deleteAtLast()
	{
		if(head == null)
		{
			System.out.println("List is already empty");
			return;
		}
		
		Node tempNode = head;
		while(tempNode.next.next != null)
		{
			tempNode = tempNode.next;
		}
		System.out.println("Deleting node "+tempNode);
		tempNode.next = null;
	}
	
	public void deleteAt(int pos) throws InvalidOperationException
	{
		if(head == null)
		{
			System.out.println("List is already empty");
			return;
		}		

		if(pos<1)
			throw new InvalidOperationException("Invalid position");
		else if(pos == 1)
		{
			System.out.println("Deleting node "+head);
			head = head.next;
			return;
		}
		
		Node tempHead = head;
		int cursor = 1;
			
		while(cursor<pos-1 && tempHead.next != null)
		{
			cursor++;
			tempHead = tempHead.next;			
		}
		
		System.out.println("Deleting node "+tempHead.next);
		
		if(cursor == pos-1)
		{
			tempHead = tempHead.next;
			return;
		}
		else
		  throw new InvalidOperationException("Invalid position");
	}
	
	public void printAll()
	{
		Node tempNode = head;
		System.out.print("HEAD==>");
		while(tempNode != null)
		{
			System.out.print(tempNode+"==>");
			tempNode = tempNode.next;
		}
		System.out.println("NULL");
	}
}
