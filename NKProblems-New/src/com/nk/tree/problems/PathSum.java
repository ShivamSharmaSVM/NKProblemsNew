/*
 * Problem-21 : Give an algorithm for checking the existence of path with given sum. 
 */

package com.nk.tree.problems;

import java.util.Stack;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class PathSum
{
	public static void main(String[] args)
	{
		MyBinaryTree tree = MyBinaryTree.getSimpleBinaryTree();
		System.out.println("Has Path Sum: "+ hasPathSum(tree, 4));
		System.out.println("Has Path Sum: "+ hasPathSum(tree, 5));
	}
	
	public static boolean hasPathSum(MyBinaryTree tree, int sum)
	{
		Node current = tree.getRoot();
		int mySum = 0;	
		Stack<Node> stack = new Stack<>();
		
		while(current != null || !stack.isEmpty())
		{
			if(current != null)
			{
				stack.push(current);
				mySum += current.getValue();
				
				if(mySum == sum)
					return true;
				
				current = current.getLeftNode();
			}
			else
			{
				Node temp = stack.peek().getRightNode();
				if(temp==null)
				{
					temp = stack.pop();
					mySum -= temp.getValue();
					
					
					while(!stack.isEmpty() && temp == stack.peek().getRightNode())
					{
						temp = stack.pop();
						mySum -= temp.getValue();						
					}
				}
				else
				{
					current = temp;
				}
			}
		}
		
		return false;
	}
}
