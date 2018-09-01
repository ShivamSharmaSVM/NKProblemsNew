package com.nk.linkedlist.core;

public class MyList<T>
{
	protected Node head;
	
	class Node
	{
		T data;
		Node next;
		Node prev;
		
		Node(T data)
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
}
