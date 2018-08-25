package com.nk.linkedlist.core;

import com.nk.linkedlist.exceptions.InvalidOperationException;

public class MyLinkedList
{
	Node head=null;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
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
	
	public void addAtTop(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void addAtLast(int data)
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
	
	public void addAt(int data, int pos) throws InvalidOperationException
	{
		if(pos<1)
			throw new InvalidOperationException("Invalid position");
		
		Node tempHead = head;
		Node newNode = new Node(data);
		int cursor = 1;
		
		if(tempHead == null)
		{
			if(pos == 1)
			{
				tempHead = newNode;
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
