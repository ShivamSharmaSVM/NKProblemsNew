package com.nk.stack.core;

public class DynStackImpl extends DynStack
{
	public Node head=null;
	
	private int size;
	
	public void push(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public int size()
	{
		return size;
	}
	
	public Node top()
	{
		return head;
	}
	
	public void pop()
	{
		if(head == null)
		{
			System.out.println("List is already empty");
			return;
		}
		System.out.println("Deleting node "+head);
		head = head.next;
		size--;
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
	
	public static void printAll(Node head)
	{
		System.out.print("HEAD==>");
		while(head != null)
		{
			System.out.print(head+"==>");
			head = head.next;
		}
		System.out.println("NULL");
	}
	
	public Node getHead()
	{
		return head;
	}
	
	public void setHead(Node head)
	{
		this.head = head;
	}
}
