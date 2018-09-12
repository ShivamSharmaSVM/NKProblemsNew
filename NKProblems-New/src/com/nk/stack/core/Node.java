package com.nk.stack.core;

public class Node
{
	public int data;
	public Node next;
	public Node prev;
	
	public Node()
	{
		next = null;
		prev = null;
	}
	
	public Node(int data)
	{
		this.data = data;
		next = null;
		prev = null;
	}
	
	@Override
	public String toString()
	{
		return "["+data+"]";
	}
	
	public Node next()
	{
		return next; 
	}
	
	public Node prev()
	{
		return prev; 
	}
	
	public void setNext(Node next) 
	{
		this.next =  next; 
	}
	
	public void setPrev(Node prev) 
	{
		this.prev =  prev; 
	}
	
	public int getData()
	{
		return data;
	}
}