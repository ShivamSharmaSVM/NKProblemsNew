/*
 * Problem-22 : Finding Spans.
 */
package com.nk.stack.main;

import java.util.Stack;

public class SpanCalc
{
	static int[] stocks = {100, 80, 60, 70, 60, 75, 85};
//	static int[] stocks = {10, 4, 5, 90, 120, 80};
	
	public static void main(String args[])
	{
		int[] spanArray = clacSpan();
		System.out.print("{");
		for (int i = 0; i < spanArray.length; i++)
		{
			System.out.print(spanArray[i]+" ");
		}
		System.out.println("}");
	}
	
	public static int[] clacSpan()
	{
		int[] span = new int[stocks.length];
		
		Stack<Integer> stack = new Stack<>();
		
		span[0] = 1;
		stack.push(0);
		
		for (int i = 1; i < stocks.length; i++)
		{
			int temp = stocks[i];
						
			while(!stack.isEmpty() && stocks[stack.peek()] <= temp)
			{
				stack.pop();
			}
			
			if(stack.isEmpty())
				span[i] = i+1;
			else
				span[i] = i-stack.peek();
			
			stack.push(i);
		}
		
		return span;
	}
}
