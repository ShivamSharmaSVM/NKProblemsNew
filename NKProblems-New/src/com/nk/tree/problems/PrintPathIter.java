/*
 * Problem-20 : Given a binary tree, print out all of its root-to-leaf paths.(Iterative)
 */

package com.nk.tree.problems;

import java.util.Stack;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class PrintPathIter
{
	public static void main(String[] args)
	{
		printPath(MyBinaryTree.getComplexBinaryTree());
	}
	
	public static void printPath(MyBinaryTree tree)
	{
		Node current = tree.getRoot();
		Stack<Node> stack = new Stack<>();
		while(current!=null || !stack.isEmpty())
		{
			if(current!=null)
			{
				stack.push(current);
				current = current.getLeftNode();
			}
			else if(stack.peek().hasRightNode())
			{
				current = stack.peek().getRightNode();
			}
			else
			{
				System.out.println(stack);
				Node temp = stack.pop();
				while(!stack.isEmpty() && stack.peek().getRightNode() == temp)
				{
					temp = stack.pop();
				}
			}
		}
	}
}
