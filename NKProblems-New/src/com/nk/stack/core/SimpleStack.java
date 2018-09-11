package com.nk.stack.core;

import com.nk.exception.StackUnderflowException;

public class SimpleStack
{
	private int top;
	private int length;
	private int[] stackArray;
	
	public SimpleStack()
	{
		top = -1;
		length = 0;
		stackArray = new int[5];
	}
	
	public SimpleStack(int size)
	{
		top = 0;
		length = 0;
		stackArray = new int[size];
	}
	
	public int getTop()
	{
		return stackArray[top];
	}
	
	public int length()
	{
		return length;
	}
	
	public boolean isEmptyStack()
	{
		return (top == -1);
	}
	
	public boolean isFullStack()
	{
		return (top == stackArray.length-1);
	}
	
	public void printAll()
	{
		System.out.print("[");
		for(int i=0; i<=top; i++)
		{
			System.out.print(stackArray[i]);
			if(i!=top)
				System.out.print(",");
		}
		System.out.print("]\n");
	}
	
	private void createNewStack()
	{
		int temp[] = new int[stackArray.length+1];
		
		for(int i=0; i<stackArray.length; i++)
		{
			temp[i] = stackArray[i];
		}
		
		stackArray = temp;
	}
	
	public boolean push(int data)
	{
		if(isFullStack())
			createNewStack();
		
		stackArray[++top] = data;
		length++;
		
		return true;
	}
	
	public int pop() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException("Stack is empty");
		
		length--;
		return stackArray[top--];
	}
}
