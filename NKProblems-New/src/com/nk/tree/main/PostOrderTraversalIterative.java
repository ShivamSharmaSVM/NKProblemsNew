package com.nk.tree.main;

import java.util.Stack;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class PostOrderTraversalIterative
{
	public static void main(String args[])
	{
		MyBinaryTree tree = MyBinaryTree.getComplexBinaryTree();
		postOrderTraversal(tree);
	}
	
	public static void postOrderTraversal(MyBinaryTree tree)
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
			else
			{
				Node temp = stack.peek().getRightNode();
				if(temp == null)
				{
					temp = stack.pop();
					System.out.print(temp+" ");
					while(!stack.isEmpty() && temp == stack.peek().getRightNode())
					{
						temp = stack.pop();
						System.out.print(temp+" ");
					}
				}
				else
				{
					current = temp;	
				}
			}
		}
	}
}
