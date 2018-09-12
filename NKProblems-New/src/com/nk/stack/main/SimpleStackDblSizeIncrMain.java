package com.nk.stack.main;
import com.nk.exception.StackUnderflowException;
import com.nk.stack.core.SimpleStack;
import com.nk.stack.core.SimpleStackDblSizeIncr;

public class SimpleStackDblSizeIncrMain
{
	public static void main(String args[]) throws StackUnderflowException
	{
		SimpleStackDblSizeIncr stack = new SimpleStackDblSizeIncr();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.printAll();
		
		System.out.println("capacity : "+stack.capacity());
		
		stack.push(60);
		stack.push(70);
		
		stack.printAll();
		System.out.println("capacity : "+stack.capacity());
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println(stack.length());
		
		stack.printAll();
	}
}
