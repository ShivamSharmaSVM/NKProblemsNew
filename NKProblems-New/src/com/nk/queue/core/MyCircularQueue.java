package com.nk.queue.core;

import com.nk.exception.InvalidOperationException;

public class MyCircularQueue
{
	int[] queue;
	int front;
	int rear;
	
	public MyCircularQueue()
	{
		queue = new int[5];
		front = -1;
		rear = -1;
	}
	
	public void enQueue(int data)
	{
		if(!isFullQueue())
			rear = (rear+1)%queue.length;
	}
	
	public int deQueue() throws InvalidOperationException
	{
		if(isEmptyQueue())
			throw new InvalidOperationException("Queue is already empty");
		
		int rearValue = queue[rear];
		
		if(front == rear)
		{
			front=rear=-1;
			return rearValue;
		}
		rear = (rear+queue.length-1)%queue.length;
		return rearValue;
	}
	
	public boolean isFullQueue()
	{
		if(front!=-1 && rear!=-1 && (rear+1)%queue.length == front)
			return true;
		return false;
	}
	
	public boolean isEmptyQueue()
	{
		if(front == -1 && rear == -1)
			return true;
		return false;
	}
	
	private void printAll()
	{
		if(front==-1)
		{
			System.out.println("Queue is Empty");
			return;
		}
		
		System.out.print("[");
		for (int i = front; i != rear; i=((i+1)%queue.length))
		{
			System.out.println(queue[i]+" ");
		}
		System.out.println("]");
	}
}
