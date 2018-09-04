package com.nk.linkedlist.core;

public class Node<T>
{
	public T data;
	public Node<T> next;
	public Node<T> prev;
	
	public Node()
	{
		next = null;
		prev = null;
	}
	
	public Node(T data)
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
	
	public Node<T> next()
	{
		return next; 
	}
	
	public Node<T> prev()
	{
		return prev; 
	}
	
	public void setNext(Node<T> next) 
	{
		this.next =  next; 
	}
	
	public void setPrev(Node<T> prev) 
	{
		this.prev =  prev; 
	}
	
	public T getData()
	{
		return data;
	}
}