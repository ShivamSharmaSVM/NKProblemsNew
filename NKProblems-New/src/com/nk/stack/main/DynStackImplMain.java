package com.nk.stack.main;

import com.nk.stack.core.DynStackImpl;

public class DynStackImplMain
{
	public static void main(String args[])
	{
		DynStackImpl stack = new DynStackImpl();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.printAll();
		
		System.out.println("Size : "+stack.size());
		
		stack.push(60);
		stack.push(70);
		
		stack.printAll();
		System.out.println("Size : "+stack.size());
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println(stack.size());
		stack.pop();
		
		stack.printAll();
	}
}
