/*
 * Problem-24 : Largest area under the histogram.
 */
package com.nk.stack.main;

import java.util.Stack;

public class LargestAreaCalc
{
	static int[] input = { 6, 2, 5, 4, 5, 1, 6 };

	public static void main(String args[])
	{
		int max = calcLargestArea();
		System.out.println("Largest Area is: " + max);
	}

	public static int calcLargestArea()
	{
		int maxArea = -1;

		Stack<Integer> stack = new Stack<>();
		stack.push(0); // Note:-** We are pushing the indices not the value of input array

		for (int i = 1; i < input.length; i++)
		{
			int current_area = -1;
			
			if(stack.isEmpty())
			{
				stack.push(i);
				continue;
			}
			
			if(input[i] >= input[stack.peek()])
				stack.push(i);
			else
			{
				while (!stack.isEmpty() && input[stack.peek()] > input[i])
				{
					int top = stack.pop();
					if(stack.isEmpty())
						current_area = input[top]*i;
					else
						current_area = input[top]*(i-stack.peek()-1);
					
					if(current_area > maxArea)
						maxArea = current_area;
				}
				stack.push(i);
			}

		}

		return maxArea;
	}
}
