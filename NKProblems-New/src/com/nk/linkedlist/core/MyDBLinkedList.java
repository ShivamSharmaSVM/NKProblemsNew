package com.nk.linkedlist.core;

import com.nk.exception.InvalidOperationException;

public class MyDBLinkedList<T> extends MyList<T>
{
	public int length;
	
	public void addAtTop(T data)
	{
		Node<T> newNode = new Node<T>(data);
		if(head != null)
		{
			head.prev=newNode;
			newNode.next = head;
		}
		
		newNode.prev = head;
		head = newNode;
		length++;
	}
	
	public void addAtLast(T data)
	{
		if(head == null)
		{
			addAtTop(data);
			return;
		}
		
		Node<T> tempNode = head;
		Node<T> newNode = new Node<T>(data);
		
		while(tempNode.next != null)
		{
			tempNode = tempNode.next;
		}
		
		newNode.prev = tempNode;
		tempNode.next = newNode;
		
		length++;
	}
	
	public void addAt(T data, int pos) throws InvalidOperationException
	{
		if(pos<1 || pos>length+1)
			throw new InvalidOperationException("Invalid position");
		
		Node<T> newNode = new Node<T>(data);
		int cursor = 1;
		if(head == null)
		{
			if(pos == 1)
			{
				newNode.prev = head;
				head = newNode;
				length++;
				return;
			}
			
			throw new InvalidOperationException("Linked list too small to add at given position.");
		}
		
		Node<T> tempNode = head;
		while(cursor < pos-1)
		{
			cursor++;
			tempNode = tempNode.next;
		}
		
		newNode.next = tempNode.next;
		newNode.prev = tempNode;
		
		if(tempNode.next != null)
			tempNode.next.prev = newNode;
		
		tempNode.next = newNode;
		length++;
	}
	
	public void printAll()
	{
		Node<T> tempNode = head;
		System.out.print("HEAD<==>");
		while(tempNode != null)
		{
			System.out.print(tempNode+"<==>");
			tempNode = tempNode.next;
		}
		System.out.println("NULL");
	}
	
	public void deleteAtTop() throws InvalidOperationException
	{
		if(length == 0 )
			throw new InvalidOperationException("List is already empty");
		
		head = head.next;
		if(head != null)
			head.prev = null;
		
		length--;
	}
	
	public void deleteAtLast() throws InvalidOperationException
	{
		if(length == 0 )
			throw new InvalidOperationException("List is already empty");
		
		Node<T> tempNode = head;
		while(tempNode.next != null && tempNode.next.next != null)
		{
			tempNode = tempNode.next;
		}
		
		tempNode.next = null;
		
		length--;
	}
	
	public void deleteAt(int pos) throws InvalidOperationException
	{
		if(length==0)
			throw new InvalidOperationException("List is already empty");
		if(pos<=0 || pos > length)
			throw new InvalidOperationException("Invaild position to delete");
		
		if(pos == 1)
		{
			head = head.next;
			if(head != null)
				head.prev = null;
			length--;
			return;
		}
		
		Node<T> tempNode = head;
		int cursor = 1;
		while(cursor < pos-1)
		{
			tempNode = tempNode.next;
		}
		
		tempNode.next = null;
		
		length--;
	}
	
	public Node<T> getHead()
	{
		return head;
	}
}
