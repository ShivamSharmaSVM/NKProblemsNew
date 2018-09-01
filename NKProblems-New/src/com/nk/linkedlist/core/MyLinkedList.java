package com.nk.linkedlist.core;

import com.nk.linkedlist.exceptions.InvalidOperationException;

public class MyLinkedList<T> extends MyList<T>
{
	protected Node<T> head=null;
	
	public void addAtTop(T data)
	{
		Node<T> newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void addAtLast(T data)
	{
		Node<T> newNode = new Node<T>(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		

		Node<T> tempNode = head;
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
		
		Node<T> tempHead = head;
		Node<T> newNode = new Node<T>(data);
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
		
		Node<T> tempNode = head;
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
		
		Node<T> tempHead = head;
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
		Node<T> tempNode = head;
		System.out.print("HEAD==>");
		while(tempNode != null)
		{
			System.out.print(tempNode+"==>");
			tempNode = tempNode.next;
		}
		System.out.println("NULL");
	}
	
	public Node<T> getHead()
	{
		return head;
	}
	
	public void attach(MyList<T> list2)
	{
		Node<T> current = this.getHead();
		if(current == null)
		{ 
			head = list2.getHead();
			return;
		}
		
		while(current.next != null)
		{
			current = current.next;
		}
		
		current.next = list2.getHead();
	}
}
