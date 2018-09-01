package com.nk.linkedlist.core;

public class Node<T>
{
	public T data;
	public Node<T> next;
	public Node<T> prev;
	
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
}