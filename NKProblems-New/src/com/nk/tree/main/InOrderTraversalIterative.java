package com.nk.tree.main;

import java.util.Stack;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class InOrderTraversalIterative
{
	public static void main(String args[])
	{
		MyBinaryTree tree = MyBinaryTree.getComplexBinaryTree();
		inOrderTraversal(tree);
	}
	
	public static void inOrderTraversal(MyBinaryTree tree)
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
				Node temp = stack.pop();
				System.out.print(temp+" ");
//				if(temp.getRightNode() != null)
					current = temp.getRightNode();
				
			}
		}
	}
}
