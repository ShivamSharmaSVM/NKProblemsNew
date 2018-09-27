/*
 * Problem-11 : Reverse the stack using only stack operations.
 */
package com.nk.stack.main;

import java.util.Stack;

public class ReverseStackRecur
{
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String args[])
	{
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
	    System.out.println(stack);
	    
	    reverseStack();
	    
	    System.out.println(stack);
	}
	
	public static void reverseStack()
	{
		if(stack.isEmpty())
			return;
		
		int temp = stack.pop();
		reverseStack();
		insertAtBottom(temp);
	}
	 
	public static void insertAtBottom(int t)
	{
		if(stack.isEmpty())
		{
			stack.push(t);
			return;
		}
			
		int temp = stack.pop();
		insertAtBottom(t);
		stack.push(temp);
	}
}
